package householdAppliances;

import java.util.Timer;
import java.util.TimerTask;

class ReminderBeep extends TimerTask 
{
	    public void run() {
	       System.out.println("Hello World!"); 
	    }

	 // And From your main() method or any other method
	 

	  public static void main(String args[]) {
	    System.out.println("About to schedule task.");
	    Timer timer = new Timer();
		timer.schedule(new ReminderBeep(), 0, 1000);
	  }
}
	     
