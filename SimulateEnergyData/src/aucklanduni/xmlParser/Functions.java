package aucklanduni.xmlParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Functions {

	public static void main(String[] args) {
		Functions functions = new Functions();
		//functions.convertEnergyPatternToPowerData(2014, 1, "A1", "18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");/*jan=0, dec=11*/
		//Date date = new Date(2015, 9, 23);
		//functions.findDayByDate(2014,9,23);
		//functions.splitEnergyUsagePatterns("18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");
		//functions.powerConsumptionByAnApplianceOnADay("18:03-22:56", 300);
		//functions.createTimeInterval();
		//functions.calculateMonthStartDate(2, 2014);
		//functions.powerConsumptionForWholeDay_OneAppliance(2, "A1", "18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");
		functions.convertEnergyPatternToPowerData_Year(2014, "A1", "18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 12:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");
		//functions.splitEnergyUsagePatterns_YearToMonth("18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00;18:00-20:30 18:00-21:00 18:00-21:00 18:00-21:00 18:00-22:00 10:00-20:00 11:00-19:00");
		//functions.readApplianceEnergyPatternsFromFile("OperatingHours.txt");
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
	
	/* Function: convertEnergyPatternToPowerData() for whole year
	 * Input: Month, Year, Energy usage pattern (Time of operation on all weekdays), applianceId
	 * Output: Text File with three columns (Date, Time, Appliance's power consumption for the particular month of an year
	 */
	
	public void convertEnergyPatternToPowerData_Year(int year, String applianceId, String energyUsagePatterns)
	{
		Functions functions = new Functions();
		String[] splitEnergyUsePattern = new String[12];
		splitEnergyUsePattern = functions.splitEnergyUsagePatterns_YearToMonth(energyUsagePatterns);
		for(int monthIterate = 0; monthIterate <= 11; monthIterate++)/*jan=0, dec=11*/
		{
			System.out.println("MonthIterate:::"+monthIterate);
			functions.convertEnergyPatternToPowerData(year, monthIterate, applianceId, splitEnergyUsePattern[monthIterate]);
		}
	}
	
	/* Function: convertEnergyPatternToPowerData()
	 * Input: Month, Year, Energy usage pattern (Time of operation on all weekdays), applianceId
	 * Output: Text File with three columns (Date, Time, Appliance's power consumption for the particular month of an year)
	 */
	
	public String convertEnergyPatternToPowerData (int year, int month, String applianceId, String energyUsagePatterns)
	{
		String filename = "output.txt";
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(new FileWriter(filename, true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Functions functions = new Functions();
		int day = 0;
		int[] powerConsumed = new int[96];
		String[] timeInterval = new String[96];
		timeInterval = functions.createTimeInterval();
		Calendar start = Calendar.getInstance();
		start.setTime(calculateMonthStartDate(month+1, year));
		Calendar end = Calendar.getInstance();
		end.setTime(calculateMonthEndDate(month+1, year));

		for (Date date = start.getTime(); !start.after(end); start.add(Calendar.DATE, 1), date = start.getTime()) 
		{
		    day = functions.findDayByDate(year, month, date.getDate());
		    powerConsumed = functions.powerConsumptionForWholeDay_OneAppliance(day, applianceId, energyUsagePatterns);
		    for(int temp=0;temp<96;temp++)
			{
		    	printWriter.println(date.getDate()+":"+(month+1)+":"+year+" "+timeInterval[temp]+" "+powerConsumed[temp]);
			}
		}
		printWriter.close();
		return filename;
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
	    System.out.println("Month end::"+monthEndDate);
	    return monthEndDate;
	}
	
	/*
	 * Function: calculate start date of a month
	 * Input: month, year
	 * Output: start Date
	 */
	public java.util.Date calculateMonthStartDate(int month, int year) /*jan=1, feb=2,...dec=12*/
	{
	    int[] daysInAMonth = { 1,1,1,1,1,1,1,1,1,1,1,1,1}; /* previous year dec 31 to dec 31 of current year*/
	    int day = daysInAMonth[month];
	    GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
	    java.util.Date monthStartDate = new java.util.Date(gc.getTime().getTime());
	    System.out.println("Month start:"+monthStartDate);
	    return monthStartDate;
	}
	
	/*
	 * Function: 
	 * Input: Day of month, applianceId
	 * Output: Date, Time, energy_rating for the whole day (string array)
	 */

	public int[] powerConsumptionForWholeDay_OneAppliance (int dayOfMonth, String applianceId, String energyUsagePatterns)
	{
		Functions functions = new Functions();
		int[] powerConsumed = new int[96];
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
		else if(dayOfMonth == 6) //if 'fri'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[5], functions.findEnergyRatingByApplianceId(applianceId));
		}
		else if(dayOfMonth == 7) //if 'sat'
		{
			powerConsumed = functions.powerConsumptionByAnApplianceOnADay(splitEnergyUsePattern[6], functions.findEnergyRatingByApplianceId(applianceId));
		}
		/*for(int temp=0;temp<96;temp++)
		{
			System.out.println("01/01/2014"+":"+temp+":"+powerConsumed[temp]);
		}*/
		return powerConsumed;
	}
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
	 * Function: 
	 * Input: Time Interval (e.g. 18:00-20:30), appliance's energy rating
	 * Output: Array of power consumption for the whole day (15 minute intervals)
	 */
	public int[] powerConsumptionByAnApplianceOnADay(String timeInterval, int energyRating)
	{
		int[] powerConsumed = new int[96];
		int startHour = 0, startMinute = 0, endHour = 0, endMinute = 0;
		int startIndexPowerConsumed = 0, endIndexPowerConsumed = 0;
		if(timeInterval.equalsIgnoreCase("ALL"))
		{
			startIndexPowerConsumed = 0;
			endIndexPowerConsumed = 95;
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
			if(startMinute == 0)
			{
				startIndexPowerConsumed = startHour * 4;
			}
			else if(startMinute > 0 && startMinute <= 15)
			{
				startIndexPowerConsumed = startHour * 4 + 1;			
			}
			else if(startMinute > 15 && startMinute <= 30)
			{
				startIndexPowerConsumed = startHour * 4 + 2;			
			}
			else if(startMinute > 30 && startMinute <= 45)
			{
				startIndexPowerConsumed = startHour * 4 + 3;			
			}
			else if(startMinute > 45 && startMinute <= 59)
			{
				startIndexPowerConsumed = startHour * 4 + 4;			
			}
			/*Find the start index of power consumed array*/
			
			/*Find the end index of power consumed array*/
			
			if(endMinute >= 0 && endMinute < 15)
			{
				endIndexPowerConsumed = endHour * 4;			
			}
			else if(endMinute >= 15 && endMinute < 30)
			{
				endIndexPowerConsumed = endHour * 4 + 1;			
			}
			else if(endMinute >= 30 && endMinute < 45)
			{
				endIndexPowerConsumed = endHour * 4 + 2;			
			}
			else if(endMinute >= 45 && endMinute < 59)
			{
				endIndexPowerConsumed = endHour * 4 + 3;			
			}
		}
			/*Find the end index of power consumed array*/
		for(int temp = startIndexPowerConsumed; temp <= endIndexPowerConsumed; temp++)
		{
			powerConsumed[temp] = energyRating;
		}
		/*for(int temp=0;temp<96;temp++)
		{
			System.out.println("01/01/2014"+":"+powerConsumed[temp]);
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
		String[] timeIntervals = new String[96];
		int hour = 0, minute = 0, second = 0;
		int index = 0;
		for(int temp = 0; temp < 24; temp++)
		{
			if(temp>=0 && temp<=9)
			{
				timeIntervals[index++] = "0"+temp+":00:00";
				timeIntervals[index++] = "0"+temp+":15:00";
				timeIntervals[index++] = "0"+temp+":30:00";
				timeIntervals[index++] = "0"+temp+":45:00";	
			}
			else
			{
				timeIntervals[index++] = temp+":00:00";
				timeIntervals[index++] = temp+":15:00";
				timeIntervals[index++] = temp+":30:00";
				timeIntervals[index++] = temp+":45:00";		
			}
		}
		/*for(int temp=0;temp<96;temp++)
		{
			System.out.println(timeIntervals[temp]);
		}*/
		return timeIntervals;
	}
	
	/*
	 * Function: findEnergyRatingByApplianceId
	 * Input: applianceId
	 * Output: energyRating
	 */
	public int findEnergyRatingByApplianceId(String applianceId)
	{
		int energyRating = 350;
		
		return energyRating;
	}
	
	/*
	 * Function: Read Appliance operating hours
	 * Input: file containing appliance Id and the operating hours (energy usage patterns)
	 * Output: String energyUsagePatterns (12*7 items)
	 */
	public Object[] readApplianceEnergyPatternsFromFile(String filename)
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
				System.out.println("Appliance ID:"+applianceIds[numberOfAppliances]);
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
        return new Object[]{applianceIds, energyUsagePatterns, numberOfAppliances};
	}
}
