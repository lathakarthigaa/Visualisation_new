import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class OvenR1A5 extends ClockDomain{
	public OvenR1A5(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerOvenR1A5_o = new output_Channel();
	private Signal powerReceive_13;
	private int power_thread_15;
	private int tutu__569740375;
	private int tutu__601395116;
	private int tutu__555119917;
	private int tutu__1560136042;
	private int S1259 = 1;
	private int S1025 = 1;
	private int S1257 = 1;
	private int S1027 = 1;
	private int S1034 = 1;
	private int S1029 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread81254764(int [] tdone, int [] ends){
          if(tdone[15] != 1){
            switch(S1257){
              case 0 : 
              active[15]=0;
              ends[15]=0;
tdone[15]=1;
              break;
              case 1 : 
              switch(S1027){
                case 0 : 
                if(powerReceive_13.getprestatus()){
                                                                        power_thread_15 = powerReceive_13.getpreval() != null ? ((Integer)(powerReceive_13.getpreval())).intValue() : 0;
                  S1027=1;
S1034=0;
if(appliancePowerOvenR1A5_o.get_preempted()){
                                        tutu__601395116 = 0;
                                        tutu__601395116 = appliancePowerOvenR1A5_o.get_preempted() ? appliancePowerOvenR1A5_o.refresh() : 0;
                    S1034=1;
active[15]=1;
                    ends[15]=1;
tdone[15]=1;
                    }
                  else {
                    S1029=0;
if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                            tutu__569740375 = 0;
                                            tutu__569740375 = appliancePowerOvenR1A5_o.get_w_s();
                                            tutu__569740375++;
                                            appliancePowerOvenR1A5_o.set_w_s(tutu__569740375);
                                            appliancePowerOvenR1A5_o.set_value(new Integer(power_thread_15));
                      S1029=1;
if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                                ends[15]=2;
                                                ;
                        S1027=0;
active[15]=1;
                        ends[15]=1;
tdone[15]=1;
                        }
                      else {
                        active[15]=1;
                        ends[15]=1;
tdone[15]=1;
                        }
                      }
                    else {
                      active[15]=1;
                      ends[15]=1;
tdone[15]=1;
                      }
                    }
                  }
                else {
                  active[15]=1;
                  ends[15]=1;
tdone[15]=1;
                  }
                break;
                case 1 : 
                switch(S1034){
                  case 0 : 
                  if(appliancePowerOvenR1A5_o.get_preempted()){
                                        tutu__1560136042 = 0;
                                        tutu__1560136042 = appliancePowerOvenR1A5_o.get_preempted() ? appliancePowerOvenR1A5_o.refresh() : 0;
                    S1034=1;
active[15]=1;
                    ends[15]=1;
tdone[15]=1;
                    }
                  else {
                    switch(S1029){
                      case 0 : 
                      if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                                tutu__555119917 = 0;
                                                tutu__555119917 = appliancePowerOvenR1A5_o.get_w_s();
                                                tutu__555119917++;
                                                appliancePowerOvenR1A5_o.set_w_s(tutu__555119917);
                                                appliancePowerOvenR1A5_o.set_value(new Integer(power_thread_15));
                        S1029=1;
if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                                    ends[15]=2;
                                                    ;
                          S1027=0;
active[15]=1;
                          ends[15]=1;
tdone[15]=1;
                          }
                        else {
                          active[15]=1;
                          ends[15]=1;
tdone[15]=1;
                          }
                        }
                      else {
                        active[15]=1;
                        ends[15]=1;
tdone[15]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                                ends[15]=2;
                                                ;
                        S1027=0;
active[15]=1;
                        ends[15]=1;
tdone[15]=1;
                        }
                      else {
                        active[15]=1;
                        ends[15]=1;
tdone[15]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S1034=1;
S1034=0;
if(appliancePowerOvenR1A5_o.get_preempted()){
                                        tutu__1560136042 = 0;
                                        tutu__1560136042 = appliancePowerOvenR1A5_o.get_preempted() ? appliancePowerOvenR1A5_o.refresh() : 0;
                    S1034=1;
active[15]=1;
                    ends[15]=1;
tdone[15]=1;
                    }
                  else {
                    S1029=0;
if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                            tutu__555119917 = 0;
                                            tutu__555119917 = appliancePowerOvenR1A5_o.get_w_s();
                                            tutu__555119917++;
                                            appliancePowerOvenR1A5_o.set_w_s(tutu__555119917);
                                            appliancePowerOvenR1A5_o.set_value(new Integer(power_thread_15));
                      S1029=1;
if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                                ends[15]=2;
                                                ;
                        S1027=0;
active[15]=1;
                        ends[15]=1;
tdone[15]=1;
                        }
                      else {
                        active[15]=1;
                        ends[15]=1;
tdone[15]=1;
                        }
                      }
                    else {
                      active[15]=1;
                      ends[15]=1;
tdone[15]=1;
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
public void thread96259971(int [] tdone, int [] ends){
          if(tdone[14] != 1){
            switch(S1025){
              case 0 : 
              active[14]=0;
              ends[14]=0;
tdone[14]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Microwave Oven ON signal received");
                                powerReceive_13.setPresent();
                currsigs.addElement(powerReceive_13);
                powerReceive_13.setValue(new Integer(1300));
                System.out.println("Emitted powerReceive_13");
active[14]=1;
                ends[14]=1;
tdone[14]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Microwave Oven OFF signal received");
                                    powerReceive_13.setPresent();
                  currsigs.addElement(powerReceive_13);
                  powerReceive_13.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_13");
active[14]=1;
                  ends[14]=1;
tdone[14]=1;
                  }
                else {
                  active[14]=1;
                  ends[14]=1;
tdone[14]=1;
                  }
                }
              break;
              }
            }
          }
public void thread98568464(int [] tdone, int [] ends){
          if(tdone[15] != 1){
            S1257=1;
S1027=0;
active[15]=1;
            ends[15]=1;
tdone[15]=1;
            }
          }
public void thread99722711(int [] tdone, int [] ends){
          if(tdone[14] != 1){
            S1025=1;
if(onSignal.getprestatus()){
                            System.out.println("Microwave Oven ON signal received");
                            powerReceive_13.setPresent();
              currsigs.addElement(powerReceive_13);
              powerReceive_13.setValue(new Integer(1300));
              System.out.println("Emitted powerReceive_13");
active[14]=1;
              ends[14]=1;
tdone[14]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Microwave Oven OFF signal received");
                                powerReceive_13.setPresent();
                currsigs.addElement(powerReceive_13);
                powerReceive_13.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_13");
active[14]=1;
                ends[14]=1;
tdone[14]=1;
                }
              else {
                active[14]=1;
                ends[14]=1;
tdone[14]=1;
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
				switch(S1259){
          case 0 : 
          S1259=0;
          break RUN;
                    case 1 : 
          S1259=2;
          powerReceive_13.setClear();
          thread99722711(tdone,ends);
          thread98568464(tdone,ends);
          int biggest96644720 = 0;
          if(ends[14]>=biggest96644720){
            biggest96644720=ends[14];
}
          if(ends[15]>=biggest96644720){
            biggest96644720=ends[15];
}
          if(biggest96644720 == 1){
            active[13]=1;
            ends[13]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_13.setClear();
          thread96259971(tdone,ends);
          thread81254764(tdone,ends);
          int biggest80870015 = 0;
          if(ends[14]>=biggest80870015){
            biggest80870015=ends[14];
}
          if(ends[15]>=biggest80870015){
            biggest80870015=ends[15];
}
          if(biggest80870015 == 1){
            active[13]=1;
            ends[13]=1;
            break RUN;
            }
          //FINXME code
if(biggest80870015 == 0){
            S1259=0;
active[13]=0;
            ends[13]=0;
S1259=0;
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
		powerReceive_13 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[13] != 0){
		int index = 13;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[13]!=0 || suspended[13]!=0 || active[13]!=1);
			else{
				appliancePowerOvenR1A5_o.update_w_r();
				if(!df){
					appliancePowerOvenR1A5_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_13.setpreclear();
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
			powerReceive_13.setClear();
			appliancePowerOvenR1A5_o.sethook();
			if(paused[13]!=0 || suspended[13]!=0 || active[13]!=1);
			else{
				appliancePowerOvenR1A5_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[13] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
