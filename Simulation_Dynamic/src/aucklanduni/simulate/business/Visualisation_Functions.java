package aucklanduni.simulate.business;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import aucklanduni.simulate.database.Database_querying;

public class Visualisation_Functions {
	/*Function name: PowerConsumptionForAnHour_EveryMinute
	 * Output: JFreeChart
	 * Functionality: power consumption for an hour (every minute)*/
	public JFreeChart PowerConsumptionForAnHour_EveryMinute(int year, String month, int day, String hours)
	{
		System.out.println("Visualisation_Functions.java::::Entered func PowerConsumptionForAnHour_EveryMinute");
		 XYSeries series = new XYSeries("Power Consumption of an hour (every minute)");
		 Database_querying database_querying = new Database_querying();
		 ResultSet resultSet = null;
		 resultSet = database_querying.PowerConsumptionForAnHour_EveryMinute(year, month, day, hours);
		 int i = 0;
		 try 
		 {
			while(resultSet.next())
			 {
				i = i+1;
				System.out.println(i+" "+resultSet.getFloat(3));
				 series.add(i, resultSet.getFloat(3));
			 }
			resultSet.close();
		 } 
		 catch (SQLException e1) {
			// TODO Auto-generated catch block
			 System.err.println("SQL Exception:"+e1.getClass()+" "+e1.getMessage());
		 }
		 // Add the series to your data set
		 XYSeriesCollection dataset = new XYSeriesCollection();
		 dataset.addSeries(series);
		 // Generate the graph
		 JFreeChart chart = ChartFactory.createXYLineChart(
			 "Power Consumption of an hour - "+day+":"+month+":"+year+" - "+hours+":00", // Title
			 "Minutes", // x-axis Label
			 "Power (kW)", // y-axis Label
			 dataset, // Dataset
			 PlotOrientation.VERTICAL, // Plot Orientation
			 true, // Show Legend
			 true, // Use tooltips
			 false // Configure chart to generate URLs?
		 );
		 System.out.println("Created");
		 return chart;
	}
	
	/*Function name: EnergyConsumptionForADay_EveryHour
	 * Output: JFreeChart
	 * Functionality: power consumption for a day (every hour)*/
	public JFreeChart EnergyConsumptionForADay_EveryHour(int year, String month, int day)
	{
		 DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		 Database_querying database_querying = new Database_querying();
		 ResultSet resultSet = null;
		 resultSet = database_querying.EnergyConsumptionForADay_EveryHour(year, month, day);
		 String date = null;
		 try 
		 {
			while(resultSet.next())
			 {
				date = resultSet.getString(1);
				dataset.setValue(resultSet.getFloat(3), "Energy (kWh)", resultSet.getString(2));
			 }
			resultSet.close();
		 } 
		 catch (SQLException e1) {
			// TODO Auto-generated catch block
			 System.err.println("SQL Exception:"+e1.getClass()+" "+e1.getMessage());
		 }
		 JFreeChart chart = null;
			chart = ChartFactory.createBarChart("Energy Consumption For a day: Date:"+date, 
			 "Hours", "Energy (kWh)", dataset, PlotOrientation.VERTICAL, 
			 false, true, false);
		 return chart;
	}
	
	public JFreeChart EnergyConsumptionForAMonth_EveryDay(int year, String month)
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		 Database_querying database_querying = new Database_querying();
		 ResultSet resultSet = null;
		 resultSet = database_querying.EnergyConsumptionForAMonth_EveryDay(year, month);
		 try 
		 {
			while(resultSet.next())
			 {
				dataset.setValue(resultSet.getFloat(4), "Energy (kWh)", resultSet.getString(3));
			 }
			resultSet.close();
		 } 
		 catch (SQLException e1) {
			// TODO Auto-generated catch block
			 System.err.println("SQL Exception:"+e1.getClass()+" "+e1.getMessage());
		 }
		 JFreeChart chart = null;
			chart = ChartFactory.createBarChart("Energy Consumption For a Month: Year:"+year+" Month: "+month, 
			 "Days", "Energy (kWh)", dataset, PlotOrientation.VERTICAL, 
			 false, true, false);
		 return chart;
	}	

	public JFreeChart EnergyConsumptionForAnYear_EveryMonth(int year)
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		 Database_querying database_querying = new Database_querying();
		 ResultSet resultSet = null;
		 resultSet = database_querying.EnergyConsumptionForAnYear_EveryMonth(year);
		 try 
		 {
			while(resultSet.next())
			 {
				dataset.setValue(resultSet.getFloat(3), "Energy (kWh)", resultSet.getString(2));
			 }
			resultSet.close();
		 } 
		 catch (SQLException e1) {
			// TODO Auto-generated catch block
			 System.err.println("SQL Exception:"+e1.getClass()+" "+e1.getMessage());
		 }
		 JFreeChart chart = null;
			chart = ChartFactory.createBarChart("Energy Consumption For an Year: Year:"+year, 
			 "Months", "Energy (kWh)", dataset, PlotOrientation.VERTICAL, 
			 false, true, false);
		 return chart;
	}
	
	public JFreeChart CompareEnergyConsumptionofTwoYears_EveryMonth(int year1, int year2)
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		 Database_querying database_querying = new Database_querying();
		 ResultSet resultSet1, resultSet2 = null;
		 resultSet1 = database_querying.EnergyConsumptionForAnYear_EveryMonth(year1);
		 resultSet2 = database_querying.EnergyConsumptionForAnYear_EveryMonth(year2);
		 try 
		 {
			while(resultSet1.next())
			 {
				dataset.setValue(resultSet1.getFloat(3), "Year1", resultSet1.getString(2));
			 }
			while(resultSet2.next())
			 {
				dataset.setValue(resultSet2.getFloat(3), "Year2", resultSet2.getString(2));
			 }
			resultSet1.close();
			resultSet2.close();
		 } 
		 catch (SQLException e1) {
			// TODO Auto-generated catch block
			 System.err.println("SQL Exception:"+e1.getClass()+" "+e1.getMessage());
			 e1.printStackTrace();
		 }
		 JFreeChart chart = null;
			chart = ChartFactory.createBarChart("Comparison of Energy Consumption of 2 years: Years:"+year1+","+year2, 
			 "Months", "Energy (kWh)", dataset, PlotOrientation.VERTICAL, 
			 false, true, false);
		 return chart;
	}
}
