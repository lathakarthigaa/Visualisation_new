package householdAppliances;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimePractice {
	public static void main(String[] args) {
		 
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:00");
		   Calendar cal = Calendar.getInstance();
		   System.out.println(dateFormat.format(cal.getTime()));
		   cal.add(Calendar.MINUTE,1);
		   System.out.println(dateFormat.format(cal.getTime()));
	  }
}
