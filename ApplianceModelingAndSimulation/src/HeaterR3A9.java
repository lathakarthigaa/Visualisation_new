import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class HeaterR3A9 extends ClockDomain{
	public HeaterR3A9(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerHeaterR3A9_o = new output_Channel();
	private Signal powerReceive_25;
	private int power_thread_27;
	private int tutu__1124390063;
	private int tutu__360982906;
	private int tutu__1124774811;
	private int tutu__1516467482;
	private int S2267 = 1;
	private int S2033 = 1;
	private int S2265 = 1;
	private int S2035 = 1;
	private int S2042 = 1;
	private int S2037 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread987804203(int [] tdone, int [] ends){
          if(tdone[27] != 1){
            switch(S2265){
              case 0 : 
              active[27]=0;
              ends[27]=0;
tdone[27]=1;
              break;
              case 1 : 
              switch(S2035){
                case 0 : 
                if(powerReceive_25.getprestatus()){
                                                                        power_thread_27 = powerReceive_25.getpreval() != null ? ((Integer)(powerReceive_25.getpreval())).intValue() : 0;
                  S2035=1;
S2042=0;
if(appliancePowerHeaterR3A9_o.get_preempted()){
                                        tutu__360982906 = 0;
                                        tutu__360982906 = appliancePowerHeaterR3A9_o.get_preempted() ? appliancePowerHeaterR3A9_o.refresh() : 0;
                    S2042=1;
active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  else {
                    S2037=0;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                            tutu__1124390063 = 0;
                                            tutu__1124390063 = appliancePowerHeaterR3A9_o.get_w_s();
                                            tutu__1124390063++;
                                            appliancePowerHeaterR3A9_o.set_w_s(tutu__1124390063);
                                            appliancePowerHeaterR3A9_o.set_value(new Integer(power_thread_27));
                      S2037=1;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                ends[27]=2;
                                                ;
                        S2035=0;
active[27]=1;
                        ends[27]=1;
tdone[27]=1;
                        }
                      else {
                        active[27]=1;
                        ends[27]=1;
tdone[27]=1;
                        }
                      }
                    else {
                      active[27]=1;
                      ends[27]=1;
tdone[27]=1;
                      }
                    }
                  }
                else {
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                break;
                case 1 : 
                switch(S2042){
                  case 0 : 
                  if(appliancePowerHeaterR3A9_o.get_preempted()){
                                        tutu__1516467482 = 0;
                                        tutu__1516467482 = appliancePowerHeaterR3A9_o.get_preempted() ? appliancePowerHeaterR3A9_o.refresh() : 0;
                    S2042=1;
active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  else {
                    switch(S2037){
                      case 0 : 
                      if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                tutu__1124774811 = 0;
                                                tutu__1124774811 = appliancePowerHeaterR3A9_o.get_w_s();
                                                tutu__1124774811++;
                                                appliancePowerHeaterR3A9_o.set_w_s(tutu__1124774811);
                                                appliancePowerHeaterR3A9_o.set_value(new Integer(power_thread_27));
                        S2037=1;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                    ends[27]=2;
                                                    ;
                          S2035=0;
active[27]=1;
                          ends[27]=1;
tdone[27]=1;
                          }
                        else {
                          active[27]=1;
                          ends[27]=1;
tdone[27]=1;
                          }
                        }
                      else {
                        active[27]=1;
                        ends[27]=1;
tdone[27]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                ends[27]=2;
                                                ;
                        S2035=0;
active[27]=1;
                        ends[27]=1;
tdone[27]=1;
                        }
                      else {
                        active[27]=1;
                        ends[27]=1;
tdone[27]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S2042=1;
S2042=0;
if(appliancePowerHeaterR3A9_o.get_preempted()){
                                        tutu__1516467482 = 0;
                                        tutu__1516467482 = appliancePowerHeaterR3A9_o.get_preempted() ? appliancePowerHeaterR3A9_o.refresh() : 0;
                    S2042=1;
active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  else {
                    S2037=0;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                            tutu__1124774811 = 0;
                                            tutu__1124774811 = appliancePowerHeaterR3A9_o.get_w_s();
                                            tutu__1124774811++;
                                            appliancePowerHeaterR3A9_o.set_w_s(tutu__1124774811);
                                            appliancePowerHeaterR3A9_o.set_value(new Integer(power_thread_27));
                      S2037=1;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                ends[27]=2;
                                                ;
                        S2035=0;
active[27]=1;
                        ends[27]=1;
tdone[27]=1;
                        }
                      else {
                        active[27]=1;
                        ends[27]=1;
tdone[27]=1;
                        }
                      }
                    else {
                      active[27]=1;
                      ends[27]=1;
tdone[27]=1;
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
public void thread990497445(int [] tdone, int [] ends){
          if(tdone[26] != 1){
            switch(S2033){
              case 0 : 
              active[26]=0;
              ends[26]=0;
tdone[26]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Heater ON signal received");
                                powerReceive_25.setPresent();
                currsigs.addElement(powerReceive_25);
                powerReceive_25.setValue(new Integer(1500));
                System.out.println("Emitted powerReceive_25");
active[26]=1;
                ends[26]=1;
tdone[26]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Heater OFF signal received");
                                    powerReceive_25.setPresent();
                  currsigs.addElement(powerReceive_25);
                  powerReceive_25.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_25");
active[26]=1;
                  ends[26]=1;
tdone[26]=1;
                  }
                else {
                  active[26]=1;
                  ends[26]=1;
tdone[26]=1;
                  }
                }
              break;
              }
            }
          }
public void thread992805939(int [] tdone, int [] ends){
          if(tdone[27] != 1){
            S2265=1;
S2035=0;
active[27]=1;
            ends[27]=1;
tdone[27]=1;
            }
          }
public void thread925090132(int [] tdone, int [] ends){
          if(tdone[26] != 1){
            S2033=1;
if(onSignal.getprestatus()){
                            System.out.println("Heater ON signal received");
                            powerReceive_25.setPresent();
              currsigs.addElement(powerReceive_25);
              powerReceive_25.setValue(new Integer(1500));
              System.out.println("Emitted powerReceive_25");
active[26]=1;
              ends[26]=1;
tdone[26]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Heater OFF signal received");
                                powerReceive_25.setPresent();
                currsigs.addElement(powerReceive_25);
                powerReceive_25.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_25");
active[26]=1;
                ends[26]=1;
tdone[26]=1;
                }
              else {
                active[26]=1;
                ends[26]=1;
tdone[26]=1;
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
				switch(S2267){
          case 0 : 
          S2267=0;
          break RUN;
                    case 1 : 
          S2267=2;
          powerReceive_25.setClear();
          thread925090132(tdone,ends);
          thread992805939(tdone,ends);
          int biggest990882194 = 0;
          if(ends[26]>=biggest990882194){
            biggest990882194=ends[26];
}
          if(ends[27]>=biggest990882194){
            biggest990882194=ends[27];
}
          if(biggest990882194 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_25.setClear();
          thread990497445(tdone,ends);
          thread987804203(tdone,ends);
          int biggest987419454 = 0;
          if(ends[26]>=biggest987419454){
            biggest987419454=ends[26];
}
          if(ends[27]>=biggest987419454){
            biggest987419454=ends[27];
}
          if(biggest987419454 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
            }
          //FINXME code
if(biggest987419454 == 0){
            S2267=0;
active[25]=0;
            ends[25]=0;
S2267=0;
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
		powerReceive_25 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[25] != 0){
		int index = 25;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[25]!=0 || suspended[25]!=0 || active[25]!=1);
			else{
				appliancePowerHeaterR3A9_o.update_w_r();
				if(!df){
					appliancePowerHeaterR3A9_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_25.setpreclear();
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
			powerReceive_25.setClear();
			appliancePowerHeaterR3A9_o.sethook();
			if(paused[25]!=0 || suspended[25]!=0 || active[25]!=1);
			else{
				appliancePowerHeaterR3A9_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[25] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
