package aucklanduni.simulate.main;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import aucklanduni.simulate.business.Visualisation_Functions;

public class MainFunctions 
{
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
	public void EnergyConsumptionForADay_EveryHour(int year, String month, int day)
	{
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.EnergyConsumptionForADay_EveryHour(year, month, day);
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart2.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
	}
	public void EnergyConsumptionForAMonth_EveryDay(int year, String month)
	{
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.EnergyConsumptionForAMonth_EveryDay(year, month);
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart3.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
	}
	public void EnergyConsumptionForAnYear_EveryMonth(int year)
	{
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.EnergyConsumptionForAnYear_EveryMonth(year);
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart4.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
	}
	public void CompareEnergyConsumptionofTwoYears_EveryMonth(int year1, int year2)
	{
		Visualisation_Functions visualisation_Functions = new Visualisation_Functions();
		JFreeChart chart = visualisation_Functions.CompareEnergyConsumptionofTwoYears_EveryMonth(year1, year2);
		try 
		 {
			 ChartUtilities.saveChartAsJPEG(new File("D:/chart5.jpg"), chart, 500, 300);
		 } 
		 catch (IOException e) 
		 {
			 System.err.println("Problem occurred creating chart.");
		 }
	}
}
