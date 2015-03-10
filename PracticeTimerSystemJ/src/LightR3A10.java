import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class LightR3A10 extends ClockDomain{
	public LightR3A10(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerLightR3A10_o = new output_Channel();
	private Signal powerReceive_4;
	private int power_thread_6;
	private int tutu__942229334;
	private int tutu__1844260571;
	private int tutu__941459836;
	private int tutu__139737573;
	private int S503 = 1;
	private int S269 = 1;
	private int S501 = 1;
	private int S271 = 1;
	private int S278 = 1;
	private int S273 = 1;
	
	private int[] ends = new int[13];
	private int[] tdone = new int[13];
		public void thread901061201(int [] tdone, int [] ends){
          if(tdone[6] != 1){
            switch(S501){
              case 0 : 
              active[6]=0;
              ends[6]=0;
tdone[6]=1;
              break;
              case 1 : 
              switch(S271){
                case 0 : 
                if(powerReceive_4.getprestatus()){
                                                                        power_thread_6 = powerReceive_4.getpreval() != null ? ((Integer)(powerReceive_4.getpreval())).intValue() : 0;
                  S271=1;
S278=0;
if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__1844260571 = 0;
                                        tutu__1844260571 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S278=1;
active[6]=1;
                    ends[6]=1;
tdone[6]=1;
                    }
                  else {
                    S273=0;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                            tutu__942229334 = 0;
                                            tutu__942229334 = appliancePowerLightR3A10_o.get_w_s();
                                            tutu__942229334++;
                                            appliancePowerLightR3A10_o.set_w_s(tutu__942229334);
                                            appliancePowerLightR3A10_o.set_value(new Integer(power_thread_6));
                      S273=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[6]=2;
                                                ;
                        S271=0;
active[6]=1;
                        ends[6]=1;
tdone[6]=1;
                        }
                      else {
                        active[6]=1;
                        ends[6]=1;
tdone[6]=1;
                        }
                      }
                    else {
                      active[6]=1;
                      ends[6]=1;
tdone[6]=1;
                      }
                    }
                  }
                else {
                  active[6]=1;
                  ends[6]=1;
tdone[6]=1;
                  }
                break;
                case 1 : 
                switch(S278){
                  case 0 : 
                  if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__139737573 = 0;
                                        tutu__139737573 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S278=1;
active[6]=1;
                    ends[6]=1;
tdone[6]=1;
                    }
                  else {
                    switch(S273){
                      case 0 : 
                      if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                tutu__941459836 = 0;
                                                tutu__941459836 = appliancePowerLightR3A10_o.get_w_s();
                                                tutu__941459836++;
                                                appliancePowerLightR3A10_o.set_w_s(tutu__941459836);
                                                appliancePowerLightR3A10_o.set_value(new Integer(power_thread_6));
                        S273=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                    ends[6]=2;
                                                    ;
                          S271=0;
active[6]=1;
                          ends[6]=1;
tdone[6]=1;
                          }
                        else {
                          active[6]=1;
                          ends[6]=1;
tdone[6]=1;
                          }
                        }
                      else {
                        active[6]=1;
                        ends[6]=1;
tdone[6]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[6]=2;
                                                ;
                        S271=0;
active[6]=1;
                        ends[6]=1;
tdone[6]=1;
                        }
                      else {
                        active[6]=1;
                        ends[6]=1;
tdone[6]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S278=1;
S278=0;
if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__139737573 = 0;
                                        tutu__139737573 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S278=1;
active[6]=1;
                    ends[6]=1;
tdone[6]=1;
                    }
                  else {
                    S273=0;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                            tutu__941459836 = 0;
                                            tutu__941459836 = appliancePowerLightR3A10_o.get_w_s();
                                            tutu__941459836++;
                                            appliancePowerLightR3A10_o.set_w_s(tutu__941459836);
                                            appliancePowerLightR3A10_o.set_value(new Integer(power_thread_6));
                      S273=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[6]=2;
                                                ;
                        S271=0;
active[6]=1;
                        ends[6]=1;
tdone[6]=1;
                        }
                      else {
                        active[6]=1;
                        ends[6]=1;
tdone[6]=1;
                        }
                      }
                    else {
                      active[6]=1;
                      ends[6]=1;
tdone[6]=1;
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
public void thread905293439(int [] tdone, int [] ends){
          if(tdone[5] != 1){
            switch(S269){
              case 0 : 
              active[5]=0;
              ends[5]=0;
tdone[5]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Light ON signal received");
                                powerReceive_4.setPresent();
                currsigs.addElement(powerReceive_4);
                powerReceive_4.setValue(new Integer(15));
                System.out.println("Emitted powerReceive_4");
active[5]=1;
                ends[5]=1;
tdone[5]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Light OFF signal received");
                                    powerReceive_4.setPresent();
                  currsigs.addElement(powerReceive_4);
                  powerReceive_4.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_4");
active[5]=1;
                  ends[5]=1;
tdone[5]=1;
                  }
                else {
                  active[5]=1;
                  ends[5]=1;
tdone[5]=1;
                  }
                }
              break;
              }
            }
          }
public void thread904523941(int [] tdone, int [] ends){
          if(tdone[6] != 1){
            S501=1;
S271=0;
active[6]=1;
            ends[6]=1;
tdone[6]=1;
            }
          }
public void thread894905219(int [] tdone, int [] ends){
          if(tdone[5] != 1){
            S269=1;
if(onSignal.getprestatus()){
                            System.out.println("Light ON signal received");
                            powerReceive_4.setPresent();
              currsigs.addElement(powerReceive_4);
              powerReceive_4.setValue(new Integer(15));
              System.out.println("Emitted powerReceive_4");
active[5]=1;
              ends[5]=1;
tdone[5]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Light OFF signal received");
                                powerReceive_4.setPresent();
                currsigs.addElement(powerReceive_4);
                powerReceive_4.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_4");
active[5]=1;
                ends[5]=1;
tdone[5]=1;
                }
              else {
                active[5]=1;
                ends[5]=1;
tdone[5]=1;
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
				switch(S503){
          case 0 : 
          S503=0;
          break RUN;
                    case 1 : 
          S503=2;
          powerReceive_4.setClear();
          thread894905219(tdone,ends);
          thread904523941(tdone,ends);
          int biggest904139192 = 0;
          if(ends[5]>=biggest904139192){
            biggest904139192=ends[5];
}
          if(ends[6]>=biggest904139192){
            biggest904139192=ends[6];
}
          if(biggest904139192 == 1){
            active[4]=1;
            ends[4]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_4.setClear();
          thread905293439(tdone,ends);
          thread901061201(tdone,ends);
          int biggest901830699 = 0;
          if(ends[5]>=biggest901830699){
            biggest901830699=ends[5];
}
          if(ends[6]>=biggest901830699){
            biggest901830699=ends[6];
}
          if(biggest901830699 == 1){
            active[4]=1;
            ends[4]=1;
            break RUN;
            }
          //FINXME code
if(biggest901830699 == 0){
            S503=0;
active[4]=0;
            ends[4]=0;
S503=0;
            break RUN;
            }
                    }
        			}
		}
	public void init(){
		char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		paused = paused1;
		active = active1;
		suspended = suspended1;
		// Now instantiate all the local signals ONLY
		powerReceive_4 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[4] != 0){
		int index = 4;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[4]!=0 || suspended[4]!=0 || active[4]!=1);
			else{
				appliancePowerLightR3A10_o.update_w_r();
				if(!df){
					appliancePowerLightR3A10_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_4.setpreclear();
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
			powerReceive_4.setClear();
			appliancePowerLightR3A10_o.sethook();
			if(paused[4]!=0 || suspended[4]!=0 || active[4]!=1);
			else{
				appliancePowerLightR3A10_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[4] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
