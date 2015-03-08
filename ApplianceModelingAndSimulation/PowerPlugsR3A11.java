import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class PowerPlugsR3A11 extends ClockDomain{
	public PowerPlugsR3A11(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerPowerPlugsR3A11_o = new output_Channel();
	private Signal powerReceive_31;
	private int power_thread_33;
	private int tutu__849452826;
	private int tutu__1917268887;
	private int tutu__850222324;
	private int tutu__66729258;
	private int S2771 = 1;
	private int S2537 = 1;
	private int S2769 = 1;
	private int S2539 = 1;
	private int S2546 = 1;
	private int S2541 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread131656870(int [] tdone, int [] ends){
          if(tdone[33] != 1){
            switch(S2769){
              case 0 : 
              active[33]=0;
              ends[33]=0;
tdone[33]=1;
              break;
              case 1 : 
              switch(S2539){
                case 0 : 
                if(powerReceive_31.getprestatus()){
                                                                        power_thread_33 = powerReceive_31.getpreval() != null ? ((Integer)(powerReceive_31.getpreval())).intValue() : 0;
                  S2539=1;
S2546=0;
if(appliancePowerPowerPlugsR3A11_o.get_preempted()){
                                        tutu__1917268887 = 0;
                                        tutu__1917268887 = appliancePowerPowerPlugsR3A11_o.get_preempted() ? appliancePowerPowerPlugsR3A11_o.refresh() : 0;
                    S2546=1;
active[33]=1;
                    ends[33]=1;
tdone[33]=1;
                    }
                  else {
                    S2541=0;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                            tutu__849452826 = 0;
                                            tutu__849452826 = appliancePowerPowerPlugsR3A11_o.get_w_s();
                                            tutu__849452826++;
                                            appliancePowerPowerPlugsR3A11_o.set_w_s(tutu__849452826);
                                            appliancePowerPowerPlugsR3A11_o.set_value(new Integer(power_thread_33));
                      S2541=1;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                ends[33]=2;
                                                ;
                        S2539=0;
active[33]=1;
                        ends[33]=1;
tdone[33]=1;
                        }
                      else {
                        active[33]=1;
                        ends[33]=1;
tdone[33]=1;
                        }
                      }
                    else {
                      active[33]=1;
                      ends[33]=1;
tdone[33]=1;
                      }
                    }
                  }
                else {
                  active[33]=1;
                  ends[33]=1;
tdone[33]=1;
                  }
                break;
                case 1 : 
                switch(S2546){
                  case 0 : 
                  if(appliancePowerPowerPlugsR3A11_o.get_preempted()){
                                        tutu__66729258 = 0;
                                        tutu__66729258 = appliancePowerPowerPlugsR3A11_o.get_preempted() ? appliancePowerPowerPlugsR3A11_o.refresh() : 0;
                    S2546=1;
active[33]=1;
                    ends[33]=1;
tdone[33]=1;
                    }
                  else {
                    switch(S2541){
                      case 0 : 
                      if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                tutu__850222324 = 0;
                                                tutu__850222324 = appliancePowerPowerPlugsR3A11_o.get_w_s();
                                                tutu__850222324++;
                                                appliancePowerPowerPlugsR3A11_o.set_w_s(tutu__850222324);
                                                appliancePowerPowerPlugsR3A11_o.set_value(new Integer(power_thread_33));
                        S2541=1;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                    ends[33]=2;
                                                    ;
                          S2539=0;
active[33]=1;
                          ends[33]=1;
tdone[33]=1;
                          }
                        else {
                          active[33]=1;
                          ends[33]=1;
tdone[33]=1;
                          }
                        }
                      else {
                        active[33]=1;
                        ends[33]=1;
tdone[33]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                ends[33]=2;
                                                ;
                        S2539=0;
active[33]=1;
                        ends[33]=1;
tdone[33]=1;
                        }
                      else {
                        active[33]=1;
                        ends[33]=1;
tdone[33]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S2546=1;
S2546=0;
if(appliancePowerPowerPlugsR3A11_o.get_preempted()){
                                        tutu__66729258 = 0;
                                        tutu__66729258 = appliancePowerPowerPlugsR3A11_o.get_preempted() ? appliancePowerPowerPlugsR3A11_o.refresh() : 0;
                    S2546=1;
active[33]=1;
                    ends[33]=1;
tdone[33]=1;
                    }
                  else {
                    S2541=0;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                            tutu__850222324 = 0;
                                            tutu__850222324 = appliancePowerPowerPlugsR3A11_o.get_w_s();
                                            tutu__850222324++;
                                            appliancePowerPowerPlugsR3A11_o.set_w_s(tutu__850222324);
                                            appliancePowerPowerPlugsR3A11_o.set_value(new Integer(power_thread_33));
                      S2541=1;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                ends[33]=2;
                                                ;
                        S2539=0;
active[33]=1;
                        ends[33]=1;
tdone[33]=1;
                        }
                      else {
                        active[33]=1;
                        ends[33]=1;
tdone[33]=1;
                        }
                      }
                    else {
                      active[33]=1;
                      ends[33]=1;
tdone[33]=1;
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
public void thread148201072(int [] tdone, int [] ends){
          if(tdone[32] != 1){
            switch(S2537){
              case 0 : 
              active[32]=0;
              ends[32]=0;
tdone[32]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("PowerPlugs ON signal received");
                                powerReceive_31.setPresent();
                currsigs.addElement(powerReceive_31);
                powerReceive_31.setValue(new Integer(45));
                System.out.println("Emitted powerReceive_31");
active[32]=1;
                ends[32]=1;
tdone[32]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("PowerPlugs OFF signal received");
                                    powerReceive_31.setPresent();
                  currsigs.addElement(powerReceive_31);
                  powerReceive_31.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_31");
active[32]=1;
                  ends[32]=1;
tdone[32]=1;
                  }
                else {
                  active[32]=1;
                  ends[32]=1;
tdone[32]=1;
                  }
                }
              break;
              }
            }
          }
public void thread147431574(int [] tdone, int [] ends){
          if(tdone[33] != 1){
            S2769=1;
S2539=0;
active[33]=1;
            ends[33]=1;
tdone[33]=1;
            }
          }
public void thread150509566(int [] tdone, int [] ends){
          if(tdone[32] != 1){
            S2537=1;
if(onSignal.getprestatus()){
                            System.out.println("PowerPlugs ON signal received");
                            powerReceive_31.setPresent();
              currsigs.addElement(powerReceive_31);
              powerReceive_31.setValue(new Integer(45));
              System.out.println("Emitted powerReceive_31");
active[32]=1;
              ends[32]=1;
tdone[32]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("PowerPlugs OFF signal received");
                                powerReceive_31.setPresent();
                currsigs.addElement(powerReceive_31);
                powerReceive_31.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_31");
active[32]=1;
                ends[32]=1;
tdone[32]=1;
                }
              else {
                active[32]=1;
                ends[32]=1;
tdone[32]=1;
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
				switch(S2771){
          case 0 : 
          S2771=0;
          break RUN;
                    case 1 : 
          S2771=2;
          powerReceive_31.setClear();
          thread150509566(tdone,ends);
          thread147431574(tdone,ends);
          int biggest147046826 = 0;
          if(ends[32]>=biggest147046826){
            biggest147046826=ends[32];
}
          if(ends[33]>=biggest147046826){
            biggest147046826=ends[33];
}
          if(biggest147046826 == 1){
            active[31]=1;
            ends[31]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_31.setClear();
          thread148201072(tdone,ends);
          thread131656870(tdone,ends);
          int biggest132811116 = 0;
          if(ends[32]>=biggest132811116){
            biggest132811116=ends[32];
}
          if(ends[33]>=biggest132811116){
            biggest132811116=ends[33];
}
          if(biggest132811116 == 1){
            active[31]=1;
            ends[31]=1;
            break RUN;
            }
          //FINXME code
if(biggest132811116 == 0){
            S2771=0;
active[31]=0;
            ends[31]=0;
S2771=0;
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
		powerReceive_31 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[31] != 0){
		int index = 31;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[31]!=0 || suspended[31]!=0 || active[31]!=1);
			else{
				appliancePowerPowerPlugsR3A11_o.update_w_r();
				if(!df){
					appliancePowerPowerPlugsR3A11_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_31.setpreclear();
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
			powerReceive_31.setClear();
			appliancePowerPowerPlugsR3A11_o.sethook();
			if(paused[31]!=0 || suspended[31]!=0 || active[31]!=1);
			else{
				appliancePowerPowerPlugsR3A11_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[31] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
