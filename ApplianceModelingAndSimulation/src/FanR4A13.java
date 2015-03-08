import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class FanR4A13 extends ClockDomain{
	public FanR4A13(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerFanR4A13_o = new output_Channel();
	private Signal powerReceive_37;
	private int power_thread_39;
	private int tutu__1204802583;
	private int tutu__1339090706;
	private int tutu__1206726327;
	private int tutu__1473421007;
	private int S3275 = 1;
	private int S3041 = 1;
	private int S3273 = 1;
	private int S3043 = 1;
	private int S3050 = 1;
	private int S3045 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread971644749(int [] tdone, int [] ends){
          if(tdone[39] != 1){
            switch(S3273){
              case 0 : 
              active[39]=0;
              ends[39]=0;
tdone[39]=1;
              break;
              case 1 : 
              switch(S3043){
                case 0 : 
                if(powerReceive_37.getprestatus()){
                                                                        power_thread_39 = powerReceive_37.getpreval() != null ? ((Integer)(powerReceive_37.getpreval())).intValue() : 0;
                  S3043=1;
S3050=0;
if(appliancePowerFanR4A13_o.get_preempted()){
                                        tutu__1339090706 = 0;
                                        tutu__1339090706 = appliancePowerFanR4A13_o.get_preempted() ? appliancePowerFanR4A13_o.refresh() : 0;
                    S3050=1;
active[39]=1;
                    ends[39]=1;
tdone[39]=1;
                    }
                  else {
                    S3045=0;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                            tutu__1204802583 = 0;
                                            tutu__1204802583 = appliancePowerFanR4A13_o.get_w_s();
                                            tutu__1204802583++;
                                            appliancePowerFanR4A13_o.set_w_s(tutu__1204802583);
                                            appliancePowerFanR4A13_o.set_value(new Integer(power_thread_39));
                      S3045=1;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                ends[39]=2;
                                                ;
                        S3043=0;
active[39]=1;
                        ends[39]=1;
tdone[39]=1;
                        }
                      else {
                        active[39]=1;
                        ends[39]=1;
tdone[39]=1;
                        }
                      }
                    else {
                      active[39]=1;
                      ends[39]=1;
tdone[39]=1;
                      }
                    }
                  }
                else {
                  active[39]=1;
                  ends[39]=1;
tdone[39]=1;
                  }
                break;
                case 1 : 
                switch(S3050){
                  case 0 : 
                  if(appliancePowerFanR4A13_o.get_preempted()){
                                        tutu__1473421007 = 0;
                                        tutu__1473421007 = appliancePowerFanR4A13_o.get_preempted() ? appliancePowerFanR4A13_o.refresh() : 0;
                    S3050=1;
active[39]=1;
                    ends[39]=1;
tdone[39]=1;
                    }
                  else {
                    switch(S3045){
                      case 0 : 
                      if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                tutu__1206726327 = 0;
                                                tutu__1206726327 = appliancePowerFanR4A13_o.get_w_s();
                                                tutu__1206726327++;
                                                appliancePowerFanR4A13_o.set_w_s(tutu__1206726327);
                                                appliancePowerFanR4A13_o.set_value(new Integer(power_thread_39));
                        S3045=1;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                    ends[39]=2;
                                                    ;
                          S3043=0;
active[39]=1;
                          ends[39]=1;
tdone[39]=1;
                          }
                        else {
                          active[39]=1;
                          ends[39]=1;
tdone[39]=1;
                          }
                        }
                      else {
                        active[39]=1;
                        ends[39]=1;
tdone[39]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                ends[39]=2;
                                                ;
                        S3043=0;
active[39]=1;
                        ends[39]=1;
tdone[39]=1;
                        }
                      else {
                        active[39]=1;
                        ends[39]=1;
tdone[39]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S3050=1;
S3050=0;
if(appliancePowerFanR4A13_o.get_preempted()){
                                        tutu__1473421007 = 0;
                                        tutu__1473421007 = appliancePowerFanR4A13_o.get_preempted() ? appliancePowerFanR4A13_o.refresh() : 0;
                    S3050=1;
active[39]=1;
                    ends[39]=1;
tdone[39]=1;
                    }
                  else {
                    S3045=0;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                            tutu__1206726327 = 0;
                                            tutu__1206726327 = appliancePowerFanR4A13_o.get_w_s();
                                            tutu__1206726327++;
                                            appliancePowerFanR4A13_o.set_w_s(tutu__1206726327);
                                            appliancePowerFanR4A13_o.set_value(new Integer(power_thread_39));
                      S3045=1;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                ends[39]=2;
                                                ;
                        S3043=0;
active[39]=1;
                        ends[39]=1;
tdone[39]=1;
                        }
                      else {
                        active[39]=1;
                        ends[39]=1;
tdone[39]=1;
                        }
                      }
                    else {
                      active[39]=1;
                      ends[39]=1;
tdone[39]=1;
                      }
                    }
                  break;
                  }
                break;
                }
              break;
              }
            }
          }
public void thread974337991(int [] tdone, int [] ends){
          if(tdone[38] != 1){
            switch(S3041){
              case 0 : 
              active[38]=0;
              ends[38]=0;
tdone[38]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Exhaust Fan ON signal received");
                                powerReceive_37.setPresent();
                currsigs.addElement(powerReceive_37);
                powerReceive_37.setValue(new Integer(85));
                System.out.println("Emitted powerReceive_37");
active[38]=1;
                ends[38]=1;
tdone[38]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Exhaust Fan OFF signal received");
                                    powerReceive_37.setPresent();
                  currsigs.addElement(powerReceive_37);
                  powerReceive_37.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_37");
active[38]=1;
                  ends[38]=1;
tdone[38]=1;
                  }
                else {
                  active[38]=1;
                  ends[38]=1;
tdone[38]=1;
                  }
                }
              break;
              }
            }
          }
public void thread973568494(int [] tdone, int [] ends){
          if(tdone[39] != 1){
            S3273=1;
S3043=0;
active[39]=1;
            ends[39]=1;
tdone[39]=1;
            }
          }
public void thread965488767(int [] tdone, int [] ends){
          if(tdone[38] != 1){
            S3041=1;
if(onSignal.getprestatus()){
                            System.out.println("Exhaust Fan ON signal received");
                            powerReceive_37.setPresent();
              currsigs.addElement(powerReceive_37);
              powerReceive_37.setValue(new Integer(85));
              System.out.println("Emitted powerReceive_37");
active[38]=1;
              ends[38]=1;
tdone[38]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Exhaust Fan OFF signal received");
                                powerReceive_37.setPresent();
                currsigs.addElement(powerReceive_37);
                powerReceive_37.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_37");
active[38]=1;
                ends[38]=1;
tdone[38]=1;
                }
              else {
                active[38]=1;
                ends[38]=1;
tdone[38]=1;
                }
              }
            }
          }
public void runClockDomain(){
			for(int i=0;i<ends.length;i++){
				ends[i] = 0;
				tdone[i] = 0;
				}
RUN: while(true){
				switch(S3275){
          case 0 : 
          S3275=0;
          break RUN;
                    case 1 : 
          S3275=2;
          powerReceive_37.setClear();
          thread965488767(tdone,ends);
          thread973568494(tdone,ends);
          int biggest974722740 = 0;
          if(ends[38]>=biggest974722740){
            biggest974722740=ends[38];
}
          if(ends[39]>=biggest974722740){
            biggest974722740=ends[39];
}
          if(biggest974722740 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_37.setClear();
          thread974337991(tdone,ends);
          thread971644749(tdone,ends);
          int biggest971260000 = 0;
          if(ends[38]>=biggest971260000){
            biggest971260000=ends[38];
}
          if(ends[39]>=biggest971260000){
            biggest971260000=ends[39];
}
          if(biggest971260000 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
            }
          //FINXME code
if(biggest971260000 == 0){
            S3275=0;
active[37]=0;
            ends[37]=0;
S3275=0;
            break RUN;
            }
                    }
        			}
		}
	public void init(){
		char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		paused = paused1;
		active = active1;
		suspended = suspended1;
		// Now instantiate all the local signals ONLY
		powerReceive_37 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[37] != 0){
		int index = 37;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[37]!=0 || suspended[37]!=0 || active[37]!=1);
			else{
				appliancePowerFanR4A13_o.update_w_r();
				if(!df){
					appliancePowerFanR4A13_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_37.setpreclear();
			int dummyint = 0;
			for(int qw=0;qw<currsigs.size();++qw){
				dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
				((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
			}
			currsigs.removeAllElements();
			dummyint = onSignal.getStatus() ? onSignal.setprepresent() : onSignal.setpreclear();
			onSignal.setpreval(onSignal.getValue());
			onSignal.setClear();
			dummyint = offSignal.getStatus() ? offSignal.setprepresent() : offSignal.setpreclear();
			offSignal.setpreval(offSignal.getValue());
			offSignal.setClear();
			powerReceive_37.setClear();
			appliancePowerFanR4A13_o.sethook();
			if(paused[37]!=0 || suspended[37]!=0 || active[37]!=1);
			else{
				appliancePowerFanR4A13_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[37] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
