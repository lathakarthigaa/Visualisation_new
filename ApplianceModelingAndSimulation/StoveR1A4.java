import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class StoveR1A4 extends ClockDomain{
	public StoveR1A4(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerStoveR1A4_o = new output_Channel();
	private Signal powerReceive_10;
	private int power_thread_12;
	private int tutu__541268957;
	private int tutu__207907817;
	private int tutu__540114710;
	private int tutu__620605751;
	private int S1007 = 1;
	private int S773 = 1;
	private int S1005 = 1;
	private int S775 = 1;
	private int S782 = 1;
	private int S777 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread101261706(int [] tdone, int [] ends){
          if(tdone[12] != 1){
            switch(S1005){
              case 0 : 
              active[12]=0;
              ends[12]=0;
tdone[12]=1;
              break;
              case 1 : 
              switch(S775){
                case 0 : 
                if(powerReceive_10.getprestatus()){
                                                                        power_thread_12 = powerReceive_10.getpreval() != null ? ((Integer)(powerReceive_10.getpreval())).intValue() : 0;
                  S775=1;
S782=0;
if(appliancePowerStoveR1A4_o.get_preempted()){
                                        tutu__207907817 = 0;
                                        tutu__207907817 = appliancePowerStoveR1A4_o.get_preempted() ? appliancePowerStoveR1A4_o.refresh() : 0;
                    S782=1;
active[12]=1;
                    ends[12]=1;
tdone[12]=1;
                    }
                  else {
                    S777=0;
if(appliancePowerStoveR1A4_o.get_w_s() == appliancePowerStoveR1A4_o.get_w_r()){
                                            tutu__541268957 = 0;
                                            tutu__541268957 = appliancePowerStoveR1A4_o.get_w_s();
                                            tutu__541268957++;
                                            appliancePowerStoveR1A4_o.set_w_s(tutu__541268957);
                                            appliancePowerStoveR1A4_o.set_value(new Integer(power_thread_12));
                      S777=1;
if(appliancePowerStoveR1A4_o.get_w_s() == appliancePowerStoveR1A4_o.get_w_r()){
                                                ends[12]=2;
                                                ;
                        S775=0;
active[12]=1;
                        ends[12]=1;
tdone[12]=1;
                        }
                      else {
                        active[12]=1;
                        ends[12]=1;
tdone[12]=1;
                        }
                      }
                    else {
                      active[12]=1;
                      ends[12]=1;
tdone[12]=1;
                      }
                    }
                  }
                else {
                  active[12]=1;
                  ends[12]=1;
tdone[12]=1;
                  }
                break;
                case 1 : 
                switch(S782){
                  case 0 : 
                  if(appliancePowerStoveR1A4_o.get_preempted()){
                                        tutu__620605751 = 0;
                                        tutu__620605751 = appliancePowerStoveR1A4_o.get_preempted() ? appliancePowerStoveR1A4_o.refresh() : 0;
                    S782=1;
active[12]=1;
                    ends[12]=1;
tdone[12]=1;
                    }
                  else {
                    switch(S777){
                      case 0 : 
                      if(appliancePowerStoveR1A4_o.get_w_s() == appliancePowerStoveR1A4_o.get_w_r()){
                                                tutu__540114710 = 0;
                                                tutu__540114710 = appliancePowerStoveR1A4_o.get_w_s();
                                                tutu__540114710++;
                                                appliancePowerStoveR1A4_o.set_w_s(tutu__540114710);
                                                appliancePowerStoveR1A4_o.set_value(new Integer(power_thread_12));
                        S777=1;
if(appliancePowerStoveR1A4_o.get_w_s() == appliancePowerStoveR1A4_o.get_w_r()){
                                                    ends[12]=2;
                                                    ;
                          S775=0;
active[12]=1;
                          ends[12]=1;
tdone[12]=1;
                          }
                        else {
                          active[12]=1;
                          ends[12]=1;
tdone[12]=1;
                          }
                        }
                      else {
                        active[12]=1;
                        ends[12]=1;
tdone[12]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerStoveR1A4_o.get_w_s() == appliancePowerStoveR1A4_o.get_w_r()){
                                                ends[12]=2;
                                                ;
                        S775=0;
active[12]=1;
                        ends[12]=1;
tdone[12]=1;
                        }
                      else {
                        active[12]=1;
                        ends[12]=1;
tdone[12]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S782=1;
S782=0;
if(appliancePowerStoveR1A4_o.get_preempted()){
                                        tutu__620605751 = 0;
                                        tutu__620605751 = appliancePowerStoveR1A4_o.get_preempted() ? appliancePowerStoveR1A4_o.refresh() : 0;
                    S782=1;
active[12]=1;
                    ends[12]=1;
tdone[12]=1;
                    }
                  else {
                    S777=0;
if(appliancePowerStoveR1A4_o.get_w_s() == appliancePowerStoveR1A4_o.get_w_r()){
                                            tutu__540114710 = 0;
                                            tutu__540114710 = appliancePowerStoveR1A4_o.get_w_s();
                                            tutu__540114710++;
                                            appliancePowerStoveR1A4_o.set_w_s(tutu__540114710);
                                            appliancePowerStoveR1A4_o.set_value(new Integer(power_thread_12));
                      S777=1;
if(appliancePowerStoveR1A4_o.get_w_s() == appliancePowerStoveR1A4_o.get_w_r()){
                                                ends[12]=2;
                                                ;
                        S775=0;
active[12]=1;
                        ends[12]=1;
tdone[12]=1;
                        }
                      else {
                        active[12]=1;
                        ends[12]=1;
tdone[12]=1;
                        }
                      }
                    else {
                      active[12]=1;
                      ends[12]=1;
tdone[12]=1;
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
public void thread91642984(int [] tdone, int [] ends){
          if(tdone[11] != 1){
            switch(S773){
              case 0 : 
              active[11]=0;
              ends[11]=0;
tdone[11]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Electric Stove ON signal received");
                                powerReceive_10.setPresent();
                currsigs.addElement(powerReceive_10);
                powerReceive_10.setValue(new Integer(1200));
                System.out.println("Emitted powerReceive_10");
active[11]=1;
                ends[11]=1;
tdone[11]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Electric Stove OFF signal received");
                                    powerReceive_10.setPresent();
                  currsigs.addElement(powerReceive_10);
                  powerReceive_10.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_10");
active[11]=1;
                  ends[11]=1;
tdone[11]=1;
                  }
                else {
                  active[11]=1;
                  ends[11]=1;
tdone[11]=1;
                  }
                }
              break;
              }
            }
          }
public void thread93951477(int [] tdone, int [] ends){
          if(tdone[12] != 1){
            S1005=1;
S775=0;
active[12]=1;
            ends[12]=1;
tdone[12]=1;
            }
          }
public void thread95105724(int [] tdone, int [] ends){
          if(tdone[11] != 1){
            S773=1;
if(onSignal.getprestatus()){
                            System.out.println("Electric Stove ON signal received");
                            powerReceive_10.setPresent();
              currsigs.addElement(powerReceive_10);
              powerReceive_10.setValue(new Integer(1200));
              System.out.println("Emitted powerReceive_10");
active[11]=1;
              ends[11]=1;
tdone[11]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Electric Stove OFF signal received");
                                powerReceive_10.setPresent();
                currsigs.addElement(powerReceive_10);
                powerReceive_10.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_10");
active[11]=1;
                ends[11]=1;
tdone[11]=1;
                }
              else {
                active[11]=1;
                ends[11]=1;
tdone[11]=1;
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
				switch(S1007){
          case 0 : 
          S1007=0;
          break RUN;
                    case 1 : 
          S1007=2;
          powerReceive_10.setClear();
          thread95105724(tdone,ends);
          thread93951477(tdone,ends);
          int biggest92027733 = 0;
          if(ends[11]>=biggest92027733){
            biggest92027733=ends[11];
}
          if(ends[12]>=biggest92027733){
            biggest92027733=ends[12];
}
          if(biggest92027733 == 1){
            active[10]=1;
            ends[10]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_10.setClear();
          thread91642984(tdone,ends);
          thread101261706(tdone,ends);
          int biggest100876958 = 0;
          if(ends[11]>=biggest100876958){
            biggest100876958=ends[11];
}
          if(ends[12]>=biggest100876958){
            biggest100876958=ends[12];
}
          if(biggest100876958 == 1){
            active[10]=1;
            ends[10]=1;
            break RUN;
            }
          //FINXME code
if(biggest100876958 == 0){
            S1007=0;
active[10]=0;
            ends[10]=0;
S1007=0;
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
		powerReceive_10 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[10] != 0){
		int index = 10;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[10]!=0 || suspended[10]!=0 || active[10]!=1);
			else{
				appliancePowerStoveR1A4_o.update_w_r();
				if(!df){
					appliancePowerStoveR1A4_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_10.setpreclear();
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
			powerReceive_10.setClear();
			appliancePowerStoveR1A4_o.sethook();
			if(paused[10]!=0 || suspended[10]!=0 || active[10]!=1);
			else{
				appliancePowerStoveR1A4_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[10] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
