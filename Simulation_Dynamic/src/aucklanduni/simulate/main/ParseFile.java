/*
 * Author: Latha Karthigaa Murugesan
 * Date: 31 Aug 2014
 * Function: This class is the main function to parse the energy file
 * Input for parsing: Energy file (.txt file)
 */

package aucklanduni.simulate.main;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import aucklanduni.simulate.business.Visualisation_Functions;



public class ParseFile 
{
	/*public static void main(String[] args) 
	{
		Database_querying database_querying = new Database_querying();
		database_querying.insertDateTimePowerToDatabase("D:/household_power_consumption.txt");
		*//*********************************************************************************************************************//*
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.PowerConsumptionForAnHour_EveryMinute(2007, "12", 1, "01");
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart1.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
		*//*********************************************************************************************************************//*
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.EnergyConsumptionForADay_EveryHour(2007, "01", 28);
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart2.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
		*//*********************************************************************************************************************//*
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.EnergyConsumptionForAMonth_EveryDay(2007, "02");
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart3.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
		*//*********************************************************************************************************************//*
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.EnergyConsumptionForAnYear_EveryMonth(2007);
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart4.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
		*//*********************************************************************************************************************//*
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.CompareEnergyConsumptionofTwoYears_EveryMonth(2006, 2007);
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart5.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
		*//*********************************************************************************************************************//*
	}*/
	public void PowerConsumptionForAnHour_EveryMinute(int year, String month, int day, String hours)
	{
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.PowerConsumptionForAnHour_EveryMinute(year, month, day, hours);
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart1.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
	}
}
