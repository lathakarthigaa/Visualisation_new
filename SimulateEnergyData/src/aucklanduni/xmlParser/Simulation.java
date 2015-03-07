package aucklanduni.xmlParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Simulation {

	public static void main(String[] args) {
		Simulation functions = new Simulation();
		//functions.convertEnergyPatternToPowerData(2015, 2, "A1", "18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");/*jan=0, dec=11 sun=1, sat=7*/
		//functions.monthlyEnergyData(2015, 2, "A1", "18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");/*jan=0, dec=11 sun=1, sat=7*/
		//Date date = new Date(2015, 9, 23);
		//functions.findDayByDate(2014,1,1);
		//functions.splitEnergyUsagePatterns("18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");
		//functions.powerConsumptionByAnApplianceOnADay("ALL", 300);
		//functions.createTimeInterval();
		//functions.calculateMonthStartDate(2, 2014);
		//functions.powerConsumptionForWholeDay_OneAppliance(2, "A1", "18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");
		//Object[] values = functions.readApplianceEnergyPatternsFromFile("OperatingHours.txt");
		functions.EnergyDataAllAppliances(2018, "D:/output3.txt", "D:/OperatingHours.txt");
		//functions.YearlyEnergyData(2014, "A1", "18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");
		//functions.splitEnergyUsagePatterns_YearToMonth("18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");
		
	}
	
	/*
	 * Function: splitEnergyUsagePatterns()
	 * Input: Energy usage patterns of an appliance for a week
	 * Output: String array of 7 values each for each day of a week
	 */
	public String[] splitEnergyUsagePatterns(String energyUsagePatterns)
	{
		String[] splitEnergyUsePattern = new String[7];
		StringTokenizer st = new StringTokenizer(energyUsagePatterns, " "); 
		int temp = 0;
		while(st.hasMoreTokens()) 
		{ 
			splitEnergyUsePattern[temp] = st.nextToken(); 
			temp++;
		} 
		/*for(int i = 0; i < temp;i++)
		{
			System.out.println(splitEnergyUsePattern[i]);
		}*/
		return splitEnergyUsePattern;
	}

	/*
	 * Function: 
	 * Input: Time Interval (e.g. 18:00-20:30), appliance's energy rating
	 * Output: Array of power consumption for the whole day (1 minute interval)
	 */
	public int[] powerConsumptionByAnApplianceOnADay(String timeInterval, int energyRating)
	{
		int[] powerConsumed = new int[1440];
		int startHour = 0, startMinute = 0, endHour = 0, endMinute = 0;
		int startIndexPowerConsumed = 0, endIndexPowerConsumed = 0;
		if(timeInterval.equalsIgnoreCase("ALL"))
		{
			startIndexPowerConsumed = 0;
			endIndexPowerConsumed = 1439;
		}
		else
		{
			StringTokenizer st = new StringTokenizer(timeInterval, "-");
			while(st.hasMoreTokens())
			{
				String start = st.nextToken();
				StringTokenizer st1 = new StringTokenizer(start,":");
				while(st1.hasMoreTokens())
				{
					startHour = Integer.parseInt(st1.nextToken());
					startMinute = Integer.parseInt(st1.nextToken());
				}
				String end = st.nextToken();		
				StringTokenizer st2 = new StringTokenizer(end,":");
				while(st2.hasMoreTokens())
				{
					endHour = Integer.parseInt(st2.nextToken());
					endMinute = Integer.parseInt(st2.nextToken());
				}	
			}
			//System.out.println("start_hour::"+startHour+"\nEnd hour::"+endHour+"\nstart minute::"+startMinute+"\nEnd minute:::"+endMinute);
			/*Find the start index of power consumed array*/
			startIndexPowerConsumed = startHour * 60 + startMinute;
			endIndexPowerConsumed = endHour * 60 + endMinute;
		}
			/*Find the end index of power consumed array*/
		for(int temp = startIndexPowerConsumed; temp <= endIndexPowerConsumed; temp++)
		{
			powerConsumed[temp] = energyRating;
		}
		/*for(int temp=0;temp<1440;temp++)
		{
			System.out.println(temp+":"+powerConsumed[temp]);
		}*/
		return powerConsumed;
	}
	
	/*
	 * Function: CreateTimeInterval (e.g. 00:00:00, 00:15:00, 00:30:00, 00:45:00, 01:00:00, 01:15:00)
	 * Input: No arguments
	 * Output: array of 96 values as mentioned above (15 minute interval)
	 */

	public String[] createTimeInterval()
	{
		String[] timeIntervals = new String[1440];
		int index = 0;
		for(int hourIndex = 0; hourIndex < 24; hourIndex++)
		{
			for(int minuteIndex = 0; minuteIndex < 60; minuteIndex++)
			{
				if(hourIndex >= 0 && hourIndex <= 9 && minuteIndex >= 0 && minuteIndex <= 9)
				{
					timeIntervals[index++] = "0"+hourIndex+":0"+minuteIndex+":00";
				}
				else if(minuteIndex >= 0 && minuteIndex <= 9)
				{
					timeIntervals[index++] = hourIndex+":0"+minuteIndex+":00";
				}
				else if(hourIndex >= 0 && hourIndex <= 9)
				{
					timeIntervals[index++] = "0"+hourIndex+":"+minuteIndex+":00";
				}
				else
				{
					timeIntervals[index++] = hourIndex+":"+minuteIndex+":00";
				}
			}
		}
		/*for(int temp=0;temp<1440;temp++)
		{
			System.out.println(timeIntervals[temp]);
		}*/
		return timeIntervals;
	}

	/*
	 * Function: 
	 * Input: Day of month, applianceId
	 * Output: Date, Time, energy_rating for the whole day (string array)
	 */
	
	public int[] powerConsumptionForWholeDay_OneAppliance (int dayOfMonth, String applianceId, String energyUsagePatterns)
	{
		Simulation functions = new Simulation();
		int[] powerConsumed = new int[1440];
		String[] splitEnergyUsePattern = new String[7];
		splitEnergyUsePattern = functions.splitEnergyUsagePatterns(energyUsagePatterns);
		if(dayOfMonth == 1) //if 'sunday'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[0], functions.findEnergyRatingByApplianceId(applianceId));
		}
		else if(dayOfMonth == 2) //if 'monday'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[1], functions.findEnergyRatingByApplianceId(applianceId));
		}
		else if(dayOfMonth == 3) //if 'tuesday'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[2], functions.findEnergyRatingByApplianceId(applianceId));
		}
		else if(dayOfMonth == 4) //if 'wed'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[3], functions.findEnergyRatingByApplianceId(applianceId));
		}
		else if(dayOfMonth == 5) //if 'thurs'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[4], functions.findEnergyRatingByApplianceId(applianceId));
		}
		else if(dayOfMonth == 6) //if 'friday'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[5], functions.findEnergyRatingByApplianceId(applianceId));
		}
		else if(dayOfMonth == 7) //if 'sat'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[6], functions.findEnergyRatingByApplianceId(applianceId));
		}
		/*for(int temp=0;temp<1440;temp++)
		{
			System.out.println("01/01/2014"+":"+temp+":"+powerConsumed[temp]);
		}*/
		return powerConsumed;
	}

	/*
	 * Function: split energy usage patterns (from whole year's pattern to month's pattern)
	 * Input: energyusagepatterns
	 * Output: array of 12 energy usage patterns each for each month
	 */
	public String[] splitEnergyUsagePatterns_YearToMonth(String energyUsagePatterns)
	{
		String[] splitEnergyUsePattern = new String[12];
		StringTokenizer st = new StringTokenizer(energyUsagePatterns, ";"); 
		int temp = 0;
		while(st.hasMoreTokens()) 
		{ 
			splitEnergyUsePattern[temp] = st.nextToken(); 
			temp++;
		} 
		for(int i = 0; i < temp;i++)
		{
			System.out.println(splitEnergyUsePattern[i]);
		}
		return splitEnergyUsePattern;
	}
	
	/* Function: YearlyEnergyData()
	 * Input: Year, Energy usage pattern (Time of operation on all weekdays), applianceId
	 * Output: Energy Data for a complete year for a particular appliance
	 */
		
	public int[] YearlyEnergyData (int year, String applianceId, String energyUsagePatterns)
	{
		int[] yearlyPowerConsumption = null;
		Simulation functions = new Simulation();
		String[] splitEnergyUsePattern = new String[12];
		splitEnergyUsePattern = functions.splitEnergyUsagePatterns_YearToMonth(energyUsagePatterns);
		int totalYearlyEnergyData = 0, totalMonthlyEnergyData = 0;
		boolean isLeapYear = new GregorianCalendar().isLeapYear(year);
		if(isLeapYear)
		{
			totalYearlyEnergyData = 527040;
		}
		else
		{
			totalYearlyEnergyData = 525600;
		}
		int yearEnergyDataIndex = 0;
		yearlyPowerConsumption = new int[totalYearlyEnergyData];
		for(int monthIterate = 0; monthIterate <= 11; monthIterate++)/*jan=0, dec=11*/
		{
			System.out.println("MonthIterate:::"+monthIterate);
			if(isLeapYear && monthIterate == 1) //29 days (29*1440)
			{
				totalMonthlyEnergyData = 41760;
			}
			else if(!isLeapYear && monthIterate == 1)//28 days (28*1440)
			{
				totalMonthlyEnergyData = 40320;
			}
			else if(monthIterate == 0 || monthIterate == 2 || monthIterate == 4 || monthIterate == 6 || monthIterate == 7 || monthIterate == 9 || monthIterate == 11)//31 days (31*1440)
			{
				totalMonthlyEnergyData = 44640;
			}
			else if(monthIterate == 3 || monthIterate == 5 || monthIterate == 8 || monthIterate == 10 )//30 days (30*1440)
			{
				totalMonthlyEnergyData = 43200;
			}
			int temp[] = new int[totalMonthlyEnergyData];
			temp = functions.monthlyEnergyData(year, monthIterate, applianceId, splitEnergyUsePattern[monthIterate]);
			for(int index = 0; index < totalMonthlyEnergyData; index++)
			{
				yearlyPowerConsumption[yearEnergyDataIndex++] = temp[index];
			}
		}
		/*for(int tmp = 0; tmp < totalYearlyEnergyData; tmp++)
	    {
	    	System.out.println(tmp+":::"+yearlyPowerConsumption[tmp]);
	    }*/
		return yearlyPowerConsumption;
	}
	
	/* Function: monthlyEnergyData()
	 * Input: Month, Year, Energy usage pattern (Time of operation on all weekdays), applianceId
	 * Output: Energy Data for a complete month for a particular appliance
	 */
	
	public int[] monthlyEnergyData(int year, int month, String applianceId, String energyUsagePatterns)
	{
		int[] monthlyPowerConsumption = null;
		Simulation functions = new Simulation();
		int day = 0;
		int[] powerConsumed = new int[1440];
		int totalEnergyData = 0;
		boolean isLeapYear = new GregorianCalendar().isLeapYear(year);
		if(isLeapYear && month == 1) //29 days (29*1440)
		{
			totalEnergyData = 41760;
		}
		else if(!isLeapYear && month == 1)//28 days (28*1440)
		{
			totalEnergyData = 40320;
		}
		else if(month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11)//31 days (31*1440)
		{
			totalEnergyData = 44640;
		}
		else if(month == 3 || month == 5 || month == 8 || month == 10 )//30 days (30*1440)
		{
			totalEnergyData = 43200;
		}
		monthlyPowerConsumption = new int[totalEnergyData];
		Calendar start = Calendar.getInstance();
		start.setTime(calculateMonthStartDate(month+1, year));
		Calendar end = Calendar.getInstance();
		end.setTime(calculateMonthEndDate(month+1, year));
		int monthEnergyDataIndex = 0;

		for (Date date = start.getTime(); !start.after(end); start.add(Calendar.DATE, 1), date = start.getTime()) 
		{
		    day = functions.findDayByDate((date.getYear()+1900), (date.getMonth()), date.getDate());
		    powerConsumed = functions.powerConsumptionForWholeDay_OneAppliance(day, applianceId, energyUsagePatterns);
		    for(int temp = 0; temp < 1440; temp++)
		    {
			    monthlyPowerConsumption[monthEnergyDataIndex++] = powerConsumed[temp];
		    }
		}
	    /*for(int tmp = 0; tmp < totalEnergyData; tmp++)
	    {
	    	System.out.println(tmp+":::"+monthlyPowerConsumption[tmp]);
	    }*/
		return monthlyPowerConsumption;
	}
	
	/* Function: convertEnergyPatternToPowerData()
	 * Input: Month, Year, Energy usage pattern (Time of operation on all weekdays), applianceId
	 * Output: Text File with three columns (Date, Time, Appliance's power consumption for the particular month of an year)
	 */
	
	public String EnergyDataAllAppliances (int year, String outputFileName, String inputFileName)
	{
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(new FileWriter(outputFileName, true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Simulation functions = new Simulation();
		int[] powerConsumed, powerConsumed1 = null;
		int totalEnergyData = 0;
		boolean isLeapYear = new GregorianCalendar().isLeapYear(year);
		if(isLeapYear) //29 days (29*1440)
		{
			totalEnergyData = 527040;
		}
		else
		{
			totalEnergyData = 525600;
		}
		powerConsumed = new int[totalEnergyData];
		powerConsumed1 = new int[totalEnergyData];
		String[] timeInterval = new String[1440];
		timeInterval = functions.createTimeInterval();
		Calendar start = Calendar.getInstance();
		start.setTime(calculateMonthStartDate(1, year));
		Calendar end = Calendar.getInstance();
		end.setTime(calculateMonthEndDate(12, year));
		
		ApplianceEnergyPatterns applianceEnergyPatterns = functions.readApplianceEnergyPatternsFromFile(inputFileName);
		
		powerConsumed = functions.YearlyEnergyData(year, applianceEnergyPatterns.getApplianceIds()[0], applianceEnergyPatterns.getEnergyUsagePatterns()[0]);
	    powerConsumed1 = functions.YearlyEnergyData(year, applianceEnergyPatterns.getApplianceIds()[1], applianceEnergyPatterns.getEnergyUsagePatterns()[1]);
	    
		/*for (Date date = start.getTime(); !start.after(end); start.add(Calendar.DATE, 1), date = start.getTime()) 
		{
		    for(int temp=0; temp<totalEnergyData; temp++)
			{
		    	printWriter.println(date.getDate()+":"+(date.getMonth()+1)+":"+(date.getYear()+1900)+" "+timeInterval[temp%1440]+" "+powerConsumed[temp]+" "+powerConsumed1[temp]+" "+(powerConsumed[temp]+powerConsumed1[temp]));
			}
		}*/
	    Date date = start.getTime();
	    for(int temp=0; temp<totalEnergyData; temp++)
		{	    	
	    	if(temp >= 1440 && temp % 1440 == 0 && !start.after(end))
	    	{
	    		start.add(Calendar.DATE, 1);
	    		date = start.getTime();
	    	}
	    	printWriter.println(date.getDate()+":"+(date.getMonth()+1)+":"+(date.getYear()+1900)+" "+timeInterval[temp%1440]+" "+powerConsumed[temp]+" "+powerConsumed1[temp]+" "+(powerConsumed[temp]+powerConsumed1[temp]));
	    }	    
		printWriter.close();
		return outputFileName;
	}
	
	/*
	 * Function: calculate end date of a month
	 * Input: month, year
	 * Output: End Date
	 */
	public java.util.Date calculateMonthEndDate(int month, int year) /*jan=1, feb=2,...dec=12*/
	{
	    int[] daysInAMonth = { 31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; /* previous year dec 31 to dec 31 of current year*/
	    int day = daysInAMonth[month];
	    boolean isLeapYear = new GregorianCalendar().isLeapYear(year);

	    if (isLeapYear && month == 2) {
	        day++;
	    }
	    GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
	    java.util.Date monthEndDate = new java.util.Date(gc.getTime().getTime());
	    System.out.println(monthEndDate);
	    return monthEndDate;
	}
	
	/* 
	 * Function: calculate start date of a month
	 * Input: month, year
	 * Output: start Date
	 */
	public java.util.Date calculateMonthStartDate(int month, int year) /*jan=1, feb=2,...dec=12*/
	{
	    int[] daysInAMonth = {1,1,1,1,1,1,1,1,1,1,1,1,1}; /* previous year dec 31 to dec 31 of current year*/
	    int day = daysInAMonth[month];
	    GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
	    java.util.Date monthStartDate = new java.util.Date(gc.getTime().getTime());
	    System.out.println(monthStartDate);
	    return monthStartDate;
	}
	
	/*
	 * Function: 
	 * Input: Day of month, applianceId
	 * Output: Date, Time, energy_rating for the whole day (string array)
	 */

	/*
	 * Function: findDayByDate()
	 * Input: month, year, date
	 * Output: day of the given date
	 */
	public int findDayByDate(int year, int month, int date) /*sun-1, mon-2, ... sat-7*/
	{
		Calendar c = new GregorianCalendar();
		System.out.println(date);
		c.set(year, month,date);//jan-0, ... dec-11
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of week:::"+dayOfWeek);
		return dayOfWeek;
	}
	
	/* Function: findRoomIdByApplianceId()
	 * Input: applianceId
	 * Output: roomId
	 */
	public String findRoomIdByApplianceId(String applianceId)
	{
		String roomId = null;
		return roomId;
	}
	
	/*
	 * Function: findEnergyRatingByApplianceId
	 * Input: applianceId
	 * Output: energyRating
	 */
	public int findEnergyRatingByApplianceId(String applianceId)
	{
		int energyRating = 0;
		if(applianceId.equals("A1"))
			energyRating = 300;
		else if(applianceId.equals("A2"))
			energyRating = 15;
		return energyRating;
	}
	
	/*
	 * Function: Read Appliance operating hours
	 * Input: file containing appliance Id and the operating hours (energy usage patterns)
	 * Output: String energyUsagePatterns (12*7 items)
	 */
	public ApplianceEnergyPatterns readApplianceEnergyPatternsFromFile(String filename)
	{
		//filename = "OperatingHours.txt";
		String str;
		int numberOfAppliances = 0;
		String[] applianceIds = new String[30];
		String[] energyUsagePatterns = new String[30];
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filename));
			while((str = br.readLine()) != null)
			{
				StringTokenizer st = new StringTokenizer(str, " ");				
				applianceIds[numberOfAppliances] = st.nextToken();
				energyUsagePatterns[numberOfAppliances] = st.nextToken()+" ";
				while(st.hasMoreTokens())
				{
					energyUsagePatterns[numberOfAppliances] += st.nextToken()+" ";
				}
				numberOfAppliances++;
			}			
			System.out.println("Number of appliances::"+numberOfAppliances);
		} 
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int temp = 0; temp < numberOfAppliances; temp++)
		{
			System.out.println(applianceIds[temp]+":"+energyUsagePatterns[temp]);
		}
        return new ApplianceEnergyPatterns(applianceIds, energyUsagePatterns, numberOfAppliances);
	}
}
