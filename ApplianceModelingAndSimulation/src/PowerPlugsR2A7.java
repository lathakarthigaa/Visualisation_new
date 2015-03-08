import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class PowerPlugsR2A7 extends ClockDomain{
	public PowerPlugsR2A7(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerPowerPlugsR2A7_o = new output_Channel();
	private Signal powerReceive_19;
	private int power_thread_21;
	private int tutu__1149783490;
	private int tutu__686446409;
	private int tutu__1150168239;
	private int tutu__469038167;
	private int S1763 = 1;
	private int S1529 = 1;
	private int S1761 = 1;
	private int S1531 = 1;
	private int S1538 = 1;
	private int S1533 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread932015612(int [] tdone, int [] ends){
          if(tdone[21] != 1){
            switch(S1761){
              case 0 : 
              active[21]=0;
              ends[21]=0;
tdone[21]=1;
              break;
              case 1 : 
              switch(S1531){
                case 0 : 
                if(powerReceive_19.getprestatus()){
                                                                        power_thread_21 = powerReceive_19.getpreval() != null ? ((Integer)(powerReceive_19.getpreval())).intValue() : 0;
                  S1531=1;
S1538=0;
if(appliancePowerPowerPlugsR2A7_o.get_preempted()){
                                        tutu__686446409 = 0;
                                        tutu__686446409 = appliancePowerPowerPlugsR2A7_o.get_preempted() ? appliancePowerPowerPlugsR2A7_o.refresh() : 0;
                    S1538=1;
active[21]=1;
                    ends[21]=1;
tdone[21]=1;
                    }
                  else {
                    S1533=0;
if(appliancePowerPowerPlugsR2A7_o.get_w_s() == appliancePowerPowerPlugsR2A7_o.get_w_r()){
                                            tutu__1149783490 = 0;
                                            tutu__1149783490 = appliancePowerPowerPlugsR2A7_o.get_w_s();
                                            tutu__1149783490++;
                                            appliancePowerPowerPlugsR2A7_o.set_w_s(tutu__1149783490);
                                            appliancePowerPowerPlugsR2A7_o.set_value(new Integer(power_thread_21));
                      S1533=1;
if(appliancePowerPowerPlugsR2A7_o.get_w_s() == appliancePowerPowerPlugsR2A7_o.get_w_r()){
                                                ends[21]=2;
                                                ;
                        S1531=0;
active[21]=1;
                        ends[21]=1;
tdone[21]=1;
                        }
                      else {
                        active[21]=1;
                        ends[21]=1;
tdone[21]=1;
                        }
                      }
                    else {
                      active[21]=1;
                      ends[21]=1;
tdone[21]=1;
                      }
                    }
                  }
                else {
                  active[21]=1;
                  ends[21]=1;
tdone[21]=1;
                  }
                break;
                case 1 : 
                switch(S1538){
                  case 0 : 
                  if(appliancePowerPowerPlugsR2A7_o.get_preempted()){
                                        tutu__469038167 = 0;
                                        tutu__469038167 = appliancePowerPowerPlugsR2A7_o.get_preempted() ? appliancePowerPowerPlugsR2A7_o.refresh() : 0;
                    S1538=1;
active[21]=1;
                    ends[21]=1;
tdone[21]=1;
                    }
                  else {
                    switch(S1533){
                      case 0 : 
                      if(appliancePowerPowerPlugsR2A7_o.get_w_s() == appliancePowerPowerPlugsR2A7_o.get_w_r()){
                                                tutu__1150168239 = 0;
                                                tutu__1150168239 = appliancePowerPowerPlugsR2A7_o.get_w_s();
                                                tutu__1150168239++;
                                                appliancePowerPowerPlugsR2A7_o.set_w_s(tutu__1150168239);
                                                appliancePowerPowerPlugsR2A7_o.set_value(new Integer(power_thread_21));
                        S1533=1;
if(appliancePowerPowerPlugsR2A7_o.get_w_s() == appliancePowerPowerPlugsR2A7_o.get_w_r()){
                                                    ends[21]=2;
                                                    ;
                          S1531=0;
active[21]=1;
                          ends[21]=1;
tdone[21]=1;
                          }
                        else {
                          active[21]=1;
                          ends[21]=1;
tdone[21]=1;
                          }
                        }
                      else {
                        active[21]=1;
                        ends[21]=1;
tdone[21]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerPowerPlugsR2A7_o.get_w_s() == appliancePowerPowerPlugsR2A7_o.get_w_r()){
                                                ends[21]=2;
                                                ;
                        S1531=0;
active[21]=1;
                        ends[21]=1;
tdone[21]=1;
                        }
                      else {
                        active[21]=1;
                        ends[21]=1;
tdone[21]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S1538=1;
S1538=0;
if(appliancePowerPowerPlugsR2A7_o.get_preempted()){
                                        tutu__469038167 = 0;
                                        tutu__469038167 = appliancePowerPowerPlugsR2A7_o.get_preempted() ? appliancePowerPowerPlugsR2A7_o.refresh() : 0;
                    S1538=1;
active[21]=1;
                    ends[21]=1;
tdone[21]=1;
                    }
                  else {
                    S1533=0;
if(appliancePowerPowerPlugsR2A7_o.get_w_s() == appliancePowerPowerPlugsR2A7_o.get_w_r()){
                                            tutu__1150168239 = 0;
                                            tutu__1150168239 = appliancePowerPowerPlugsR2A7_o.get_w_s();
                                            tutu__1150168239++;
                                            appliancePowerPowerPlugsR2A7_o.set_w_s(tutu__1150168239);
                                            appliancePowerPowerPlugsR2A7_o.set_value(new Integer(power_thread_21));
                      S1533=1;
if(appliancePowerPowerPlugsR2A7_o.get_w_s() == appliancePowerPowerPlugsR2A7_o.get_w_r()){
                                                ends[21]=2;
                                                ;
                        S1531=0;
active[21]=1;
                        ends[21]=1;
tdone[21]=1;
                        }
                      else {
                        active[21]=1;
                        ends[21]=1;
tdone[21]=1;
                        }
                      }
                    else {
                      active[21]=1;
                      ends[21]=1;
tdone[21]=1;
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
public void thread936247850(int [] tdone, int [] ends){
          if(tdone[20] != 1){
            switch(S1529){
              case 0 : 
              active[20]=0;
              ends[20]=0;
tdone[20]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Power Plugs ON signal received");
                                powerReceive_19.setPresent();
                currsigs.addElement(powerReceive_19);
                powerReceive_19.setValue(new Integer(35));
                System.out.println("Emitted powerReceive_19");
active[20]=1;
                ends[20]=1;
tdone[20]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Power Plugs OFF signal received");
                                    powerReceive_19.setPresent();
                  currsigs.addElement(powerReceive_19);
                  powerReceive_19.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_19");
active[20]=1;
                  ends[20]=1;
tdone[20]=1;
                  }
                else {
                  active[20]=1;
                  ends[20]=1;
tdone[20]=1;
                  }
                }
              break;
              }
            }
          }
public void thread935478353(int [] tdone, int [] ends){
          if(tdone[21] != 1){
            S1761=1;
S1531=0;
active[21]=1;
            ends[21]=1;
tdone[21]=1;
            }
          }
public void thread925859630(int [] tdone, int [] ends){
          if(tdone[20] != 1){
            S1529=1;
if(onSignal.getprestatus()){
                            System.out.println("Power Plugs ON signal received");
                            powerReceive_19.setPresent();
              currsigs.addElement(powerReceive_19);
              powerReceive_19.setValue(new Integer(35));
              System.out.println("Emitted powerReceive_19");
active[20]=1;
              ends[20]=1;
tdone[20]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Power Plugs OFF signal received");
                                powerReceive_19.setPresent();
                currsigs.addElement(powerReceive_19);
                powerReceive_19.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_19");
active[20]=1;
                ends[20]=1;
tdone[20]=1;
                }
              else {
                active[20]=1;
                ends[20]=1;
tdone[20]=1;
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
				switch(S1763){
          case 0 : 
          S1763=0;
          break RUN;
                    case 1 : 
          S1763=2;
          powerReceive_19.setClear();
          thread925859630(tdone,ends);
          thread935478353(tdone,ends);
          int biggest935093604 = 0;
          if(ends[20]>=biggest935093604){
            biggest935093604=ends[20];
}
          if(ends[21]>=biggest935093604){
            biggest935093604=ends[21];
}
          if(biggest935093604 == 1){
            active[19]=1;
            ends[19]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_19.setClear();
          thread936247850(tdone,ends);
          thread932015612(tdone,ends);
          int biggest933169859 = 0;
          if(ends[20]>=biggest933169859){
            biggest933169859=ends[20];
}
          if(ends[21]>=biggest933169859){
            biggest933169859=ends[21];
}
          if(biggest933169859 == 1){
            active[19]=1;
            ends[19]=1;
            break RUN;
            }
          //FINXME code
if(biggest933169859 == 0){
            S1763=0;
active[19]=0;
            ends[19]=0;
S1763=0;
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
		powerReceive_19 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[19] != 0){
		int index = 19;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[19]!=0 || suspended[19]!=0 || active[19]!=1);
			else{
				appliancePowerPowerPlugsR2A7_o.update_w_r();
				if(!df){
					appliancePowerPowerPlugsR2A7_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_19.setpreclear();
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
			powerReceive_19.setClear();
			appliancePowerPowerPlugsR2A7_o.sethook();
			if(paused[19]!=0 || suspended[19]!=0 || active[19]!=1);
			else{
				appliancePowerPowerPlugsR2A7_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[19] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
