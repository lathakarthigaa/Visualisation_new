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
	private int tutu__225860598;
	private int tutu__1384828763;
	private int tutu__228553840;
	private int tutu__1886371323;
	private int S1259 = 1;
	private int S1025 = 1;
	private int S1257 = 1;
	private int S1027 = 1;
	private int S1034 = 1;
	private int S1029 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread293550417(int [] tdone, int [] ends){
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
                                        tutu__1384828763 = 0;
                                        tutu__1384828763 = appliancePowerOvenR1A5_o.get_preempted() ? appliancePowerOvenR1A5_o.refresh() : 0;
                    S1034=1;
active[15]=1;
                    ends[15]=1;
tdone[15]=1;
                    }
                  else {
                    S1029=0;
if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                            tutu__225860598 = 0;
                                            tutu__225860598 = appliancePowerOvenR1A5_o.get_w_s();
                                            tutu__225860598++;
                                            appliancePowerOvenR1A5_o.set_w_s(tutu__225860598);
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
                                        tutu__1886371323 = 0;
                                        tutu__1886371323 = appliancePowerOvenR1A5_o.get_preempted() ? appliancePowerOvenR1A5_o.refresh() : 0;
                    S1034=1;
active[15]=1;
                    ends[15]=1;
tdone[15]=1;
                    }
                  else {
                    switch(S1029){
                      case 0 : 
                      if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                                tutu__228553840 = 0;
                                                tutu__228553840 = appliancePowerOvenR1A5_o.get_w_s();
                                                tutu__228553840++;
                                                appliancePowerOvenR1A5_o.set_w_s(tutu__228553840);
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
                                        tutu__1886371323 = 0;
                                        tutu__1886371323 = appliancePowerOvenR1A5_o.get_preempted() ? appliancePowerOvenR1A5_o.refresh() : 0;
                    S1034=1;
active[15]=1;
                    ends[15]=1;
tdone[15]=1;
                    }
                  else {
                    S1029=0;
if(appliancePowerOvenR1A5_o.get_w_s() == appliancePowerOvenR1A5_o.get_w_r()){
                                            tutu__228553840 = 0;
                                            tutu__228553840 = appliancePowerOvenR1A5_o.get_w_s();
                                            tutu__228553840++;
                                            appliancePowerOvenR1A5_o.set_w_s(tutu__228553840);
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
public void thread304708135(int [] tdone, int [] ends){
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
public void thread302399642(int [] tdone, int [] ends){
          if(tdone[15] != 1){
            S1257=1;
S1027=0;
active[15]=1;
            ends[15]=1;
tdone[15]=1;
            }
          }
public void thread299321651(int [] tdone, int [] ends){
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
          thread299321651(tdone,ends);
          thread302399642(tdone,ends);
          int biggest302784391 = 0;
          if(ends[14]>=biggest302784391){
            biggest302784391=ends[14];
}
          if(ends[15]>=biggest302784391){
            biggest302784391=ends[15];
}
          if(biggest302784391 == 1){
            active[13]=1;
            ends[13]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_13.setClear();
          thread304708135(tdone,ends);
          thread293550417(tdone,ends);
          int biggest295858911 = 0;
          if(ends[14]>=biggest295858911){
            biggest295858911=ends[14];
}
          if(ends[15]>=biggest295858911){
            biggest295858911=ends[15];
}
          if(biggest295858911 == 1){
            active[13]=1;
            ends[13]=1;
            break RUN;
            }
          //FINXME code
if(biggest295858911 == 0){
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
