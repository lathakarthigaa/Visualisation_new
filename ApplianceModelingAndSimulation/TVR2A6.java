import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class TVR2A6 extends ClockDomain{
	public TVR2A6(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerTVR2A6_o = new output_Channel();
	private Signal powerReceive_16;
	private int power_thread_18;
	private int tutu__568201380;
	private int tutu__928366124;
	private int tutu__565892886;
	private int tutu__728661013;
	private int S1511 = 1;
	private int S1277 = 1;
	private int S1509 = 1;
	private int S1279 = 1;
	private int S1286 = 1;
	private int S1281 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread85487001(int [] tdone, int [] ends){
          if(tdone[18] != 1){
            switch(S1509){
              case 0 : 
              active[18]=0;
              ends[18]=0;
tdone[18]=1;
              break;
              case 1 : 
              switch(S1279){
                case 0 : 
                if(powerReceive_16.getprestatus()){
                                                                        power_thread_18 = powerReceive_16.getpreval() != null ? ((Integer)(powerReceive_16.getpreval())).intValue() : 0;
                  S1279=1;
S1286=0;
if(appliancePowerTVR2A6_o.get_preempted()){
                                        tutu__928366124 = 0;
                                        tutu__928366124 = appliancePowerTVR2A6_o.get_preempted() ? appliancePowerTVR2A6_o.refresh() : 0;
                    S1286=1;
active[18]=1;
                    ends[18]=1;
tdone[18]=1;
                    }
                  else {
                    S1281=0;
if(appliancePowerTVR2A6_o.get_w_s() == appliancePowerTVR2A6_o.get_w_r()){
                                            tutu__568201380 = 0;
                                            tutu__568201380 = appliancePowerTVR2A6_o.get_w_s();
                                            tutu__568201380++;
                                            appliancePowerTVR2A6_o.set_w_s(tutu__568201380);
                                            appliancePowerTVR2A6_o.set_value(new Integer(power_thread_18));
                      S1281=1;
if(appliancePowerTVR2A6_o.get_w_s() == appliancePowerTVR2A6_o.get_w_r()){
                                                ends[18]=2;
                                                ;
                        S1279=0;
active[18]=1;
                        ends[18]=1;
tdone[18]=1;
                        }
                      else {
                        active[18]=1;
                        ends[18]=1;
tdone[18]=1;
                        }
                      }
                    else {
                      active[18]=1;
                      ends[18]=1;
tdone[18]=1;
                      }
                    }
                  }
                else {
                  active[18]=1;
                  ends[18]=1;
tdone[18]=1;
                  }
                break;
                case 1 : 
                switch(S1286){
                  case 0 : 
                  if(appliancePowerTVR2A6_o.get_preempted()){
                                        tutu__728661013 = 0;
                                        tutu__728661013 = appliancePowerTVR2A6_o.get_preempted() ? appliancePowerTVR2A6_o.refresh() : 0;
                    S1286=1;
active[18]=1;
                    ends[18]=1;
tdone[18]=1;
                    }
                  else {
                    switch(S1281){
                      case 0 : 
                      if(appliancePowerTVR2A6_o.get_w_s() == appliancePowerTVR2A6_o.get_w_r()){
                                                tutu__565892886 = 0;
                                                tutu__565892886 = appliancePowerTVR2A6_o.get_w_s();
                                                tutu__565892886++;
                                                appliancePowerTVR2A6_o.set_w_s(tutu__565892886);
                                                appliancePowerTVR2A6_o.set_value(new Integer(power_thread_18));
                        S1281=1;
if(appliancePowerTVR2A6_o.get_w_s() == appliancePowerTVR2A6_o.get_w_r()){
                                                    ends[18]=2;
                                                    ;
                          S1279=0;
active[18]=1;
                          ends[18]=1;
tdone[18]=1;
                          }
                        else {
                          active[18]=1;
                          ends[18]=1;
tdone[18]=1;
                          }
                        }
                      else {
                        active[18]=1;
                        ends[18]=1;
tdone[18]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerTVR2A6_o.get_w_s() == appliancePowerTVR2A6_o.get_w_r()){
                                                ends[18]=2;
                                                ;
                        S1279=0;
active[18]=1;
                        ends[18]=1;
tdone[18]=1;
                        }
                      else {
                        active[18]=1;
                        ends[18]=1;
tdone[18]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S1286=1;
S1286=0;
if(appliancePowerTVR2A6_o.get_preempted()){
                                        tutu__728661013 = 0;
                                        tutu__728661013 = appliancePowerTVR2A6_o.get_preempted() ? appliancePowerTVR2A6_o.refresh() : 0;
                    S1286=1;
active[18]=1;
                    ends[18]=1;
tdone[18]=1;
                    }
                  else {
                    S1281=0;
if(appliancePowerTVR2A6_o.get_w_s() == appliancePowerTVR2A6_o.get_w_r()){
                                            tutu__565892886 = 0;
                                            tutu__565892886 = appliancePowerTVR2A6_o.get_w_s();
                                            tutu__565892886++;
                                            appliancePowerTVR2A6_o.set_w_s(tutu__565892886);
                                            appliancePowerTVR2A6_o.set_value(new Integer(power_thread_18));
                      S1281=1;
if(appliancePowerTVR2A6_o.get_w_s() == appliancePowerTVR2A6_o.get_w_r()){
                                                ends[18]=2;
                                                ;
                        S1279=0;
active[18]=1;
                        ends[18]=1;
tdone[18]=1;
                        }
                      else {
                        active[18]=1;
                        ends[18]=1;
tdone[18]=1;
                        }
                      }
                    else {
                      active[18]=1;
                      ends[18]=1;
tdone[18]=1;
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
public void thread89719239(int [] tdone, int [] ends){
          if(tdone[17] != 1){
            switch(S1277){
              case 0 : 
              active[17]=0;
              ends[17]=0;
tdone[17]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("TV ON signal received");
                                powerReceive_16.setPresent();
                currsigs.addElement(powerReceive_16);
                powerReceive_16.setValue(new Integer(100));
                System.out.println("Emitted powerReceive_16");
active[17]=1;
                ends[17]=1;
tdone[17]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("TV OFF signal received");
                                    powerReceive_16.setPresent();
                  currsigs.addElement(powerReceive_16);
                  powerReceive_16.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_16");
active[17]=1;
                  ends[17]=1;
tdone[17]=1;
                  }
                else {
                  active[17]=1;
                  ends[17]=1;
tdone[17]=1;
                  }
                }
              break;
              }
            }
          }
public void thread88949742(int [] tdone, int [] ends){
          if(tdone[18] != 1){
            S1509=1;
S1279=0;
active[18]=1;
            ends[18]=1;
tdone[18]=1;
            }
          }
public void thread79331019(int [] tdone, int [] ends){
          if(tdone[17] != 1){
            S1277=1;
if(onSignal.getprestatus()){
                            System.out.println("TV ON signal received");
                            powerReceive_16.setPresent();
              currsigs.addElement(powerReceive_16);
              powerReceive_16.setValue(new Integer(100));
              System.out.println("Emitted powerReceive_16");
active[17]=1;
              ends[17]=1;
tdone[17]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("TV OFF signal received");
                                powerReceive_16.setPresent();
                currsigs.addElement(powerReceive_16);
                powerReceive_16.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_16");
active[17]=1;
                ends[17]=1;
tdone[17]=1;
                }
              else {
                active[17]=1;
                ends[17]=1;
tdone[17]=1;
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
				switch(S1511){
          case 0 : 
          S1511=0;
          break RUN;
                    case 1 : 
          S1511=2;
          powerReceive_16.setClear();
          thread79331019(tdone,ends);
          thread88949742(tdone,ends);
          int biggest88564993 = 0;
          if(ends[17]>=biggest88564993){
            biggest88564993=ends[17];
}
          if(ends[18]>=biggest88564993){
            biggest88564993=ends[18];
}
          if(biggest88564993 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_16.setClear();
          thread89719239(tdone,ends);
          thread85487001(tdone,ends);
          int biggest86641248 = 0;
          if(ends[17]>=biggest86641248){
            biggest86641248=ends[17];
}
          if(ends[18]>=biggest86641248){
            biggest86641248=ends[18];
}
          if(biggest86641248 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
            }
          //FINXME code
if(biggest86641248 == 0){
            S1511=0;
active[16]=0;
            ends[16]=0;
S1511=0;
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
		powerReceive_16 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[16] != 0){
		int index = 16;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
			else{
				appliancePowerTVR2A6_o.update_w_r();
				if(!df){
					appliancePowerTVR2A6_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_16.setpreclear();
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
			powerReceive_16.setClear();
			appliancePowerTVR2A6_o.sethook();
			if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
			else{
				appliancePowerTVR2A6_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[16] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
