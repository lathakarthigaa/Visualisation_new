/*
 * Author: Latha Karthigaa Murugesan
 * Date: 31 Aug 2014
 * Function: This class is used to insert date, time, power value into the sqlite database
 * Input for parsing: date, time, power_data retrieved from Parse_DateTimePower.java after parsing
 * Output: insert date, time, power value in sqlite table.
 * Database: C:/Users/lmur778.UOA/MySQLiteDB
 */

package aucklanduni.simulate.database;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

import aucklanduni.simulate.bean.DateTimePowerBean;

public class Database_querying 
{
	/*Insert the value of date, time, power value in database 'TEST' and table 'power_data'*/
	public void insertDateTimePowerToDatabase(String fileName)
	{
		DateTimePowerBean parse_DateTimePower = new DateTimePowerBean();
		Connection connection = null;
		Statement stmt = null;
	    try 
	    {
		      Class.forName("org.sqlite.JDBC");
		      connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/lmur778.UOA/MySQLiteDB");
		      connection.setAutoCommit(false);
		      System.out.println("Opened database successfully");
		
		      stmt = connection.createStatement();
		      
		      
		      try 
				{
					FileReader fr = new FileReader(fileName);
					BufferedReader br = new BufferedReader(fr); 
					String s; 
					try 
					{
						while((s = br.readLine()) != null) //'s' contains a single row in the energy file
						{ 
							StringTokenizer stringTokenizer = new StringTokenizer(s,";");
							String date = (String)stringTokenizer.nextElement();
							/*convert 1/1/2007 to 01/01/2007*/
							if (date.charAt(1) == '/') date = "0" + date;
					        if (date.charAt(4) == '/') date = date.substring(0,3) + "0" + date.substring(3);
					        /*convert 1/1/2007 to 01/01/2007*/
							parse_DateTimePower.setDate(date);
							parse_DateTimePower.setTime((String)stringTokenizer.nextElement());
							parse_DateTimePower.setPower(Float.parseFloat((String)stringTokenizer.nextElement()));
							PreparedStatement preparedStatement = connection.prepareStatement("insert into power_data values(?,?,?);"); 
						    preparedStatement.setString(1, parse_DateTimePower.getDate());
						    preparedStatement.setString(2, parse_DateTimePower.getTime());
						    preparedStatement.setFloat(3, parse_DateTimePower.getPower());
						    preparedStatement.execute();
						}
						fr.close();
					} 
					catch (IOException e) 
					{
						System.err.println( e.getClass().getName() + ": " + e.getMessage() );
					    System.exit(0);
					}  
					catch(SQLException e)
					{
						e.printStackTrace();
					}
				} 
				catch (FileNotFoundException e) 
				{
					System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				    System.exit(0);
				} 
		
		      stmt.close();
		      connection.commit();
		      connection.close();
	    } 
	    catch (Exception e) 
	    {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
	    }
		System.out.println("Records created successfully");
	}
	
	/*Function name: PowerConsumptionForAnHour_EveryMinute
	 * Output: Resultset
	 * Functionality: power consumption for an hour (every minute)*/
	public ResultSet PowerConsumptionForAnHour_EveryMinute(int year, String month, int day, String hours)
	{
		String new_day = null;
		if(day>=0 && day<=9)
			new_day = "0"+day;
		else
			new_day = ""+day;
		Connection connection = null;
	    Statement stmt = null;
	    ResultSet resultSet = null;
	    try 
	    {
		      Class.forName("org.sqlite.JDBC");
		      connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/lmur778.UOA/MySQLiteDB");
		      connection.setAutoCommit(false);
		      System.out.println("Opened database successfully");
	
		      stmt = connection.createStatement();
		      resultSet = stmt.executeQuery( "SELECT date, time, power_values from power_data where date='"+new_day+"/"+month+"/"+year+"' and strftime('%H', time)='"+hours+"';" );
	    } 
	    catch ( Exception e ) 
	    {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return resultSet;
	}
	
	/*Function name: EnergyConsumptionForADay_EveryHour
	 * Output: Resultset
	 * Functionality: power consumption for a day (every hour)*/
	public ResultSet EnergyConsumptionForADay_EveryHour(int year, String month, int day)
	{
		String new_day = null;
		if(day>=0 && day<=9)
			new_day = "0"+day;
		else
			new_day = ""+day;
		Connection connection = null;
	    Statement stmt = null;
	    ResultSet resultSet = null;
	    try 
	    {
		      Class.forName("org.sqlite.JDBC");
		      connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/lmur778.UOA/MySQLiteDB");
		      connection.setAutoCommit(false);
		      System.out.println("Opened database successfully");
	
		      stmt = connection.createStatement();
		      resultSet = stmt.executeQuery( "SELECT date, strftime('%H', time), sum(power_values)/60 as Energy from power_data where date='"+new_day+"/"+month+"/"+year+"' group by strftime('%H', time);" );
	    } 
	    catch ( Exception e ) 
	    {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return resultSet;
	}
	
	/*Function name: EnergyConsumptionForAMonth_EveryDay
	 * Output: Resultset
	 * Functionality: energy consumption for a month (every day)*/
	public ResultSet EnergyConsumptionForAMonth_EveryDay(int year, String month)
	{
		Connection connection = null;
	    Statement stmt = null;
	    ResultSet resultSet = null;
	    try 
	    {
		      Class.forName("org.sqlite.JDBC");
		      connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/lmur778.UOA/MySQLiteDB");
		      connection.setAutoCommit(false);
		      System.out.println("Opened database successfully");
	
		      stmt = connection.createStatement();
		      resultSet = stmt.executeQuery( "SELECT substr(date,7,4) as year, substr(date,4,2) as month,substr(date,1,2) as Day, sum(power_values)/60 as Energy from power_data where substr(date,7,4)='"+year+"' and substr(date,4,2)='"+month+"' group by substr(date,1,2);" );
	    } 
	    catch ( Exception e ) 
	    {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return resultSet;
	}
	
	public ResultSet EnergyConsumptionForAnYear_EveryMonth(int year)
	{
		Connection connection = null;
	    Statement stmt = null;
	    ResultSet resultSet = null;
	    try 
	    {
		      Class.forName("org.sqlite.JDBC");
		      connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/lmur778.UOA/MySQLiteDB");
		      connection.setAutoCommit(false);
		      System.out.println("Opened database successfully");
	
		      stmt = connection.createStatement();
		      resultSet = stmt.executeQuery( "SELECT substr(date,7,4) as year, substr(date,4,2) as month, sum(power_values)/60 as Energy from power_data where substr(date,7,4)='"+year+"' group by substr(date,4,2);" );
	    } 
	    catch ( Exception e )
	    {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return resultSet;
	}
	
	
	
	/*public ResultSet calculateEnergyValueFromDatabase()
	{
		Connection connection = null;
	    Statement stmt = null;
	    ResultSet resultSet = null;
	    try 
	    {
		      Class.forName("org.sqlite.JDBC");
		      connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/lmur778.UOA/MySQLiteDB");
		      connection.setAutoCommit(false);
		      System.out.println("Opened database successfully");
	
		      stmt = connection.createStatement();
		      resultSet = stmt.executeQuery( "SELECT date, strftime('%H', time) as Hours, sum(power_values)/60 as Energy from power_data group by strftime('%H', time);" );
	    } 
	    catch ( Exception e ) 
	    {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return resultSet;
	}*/
	
	
}
