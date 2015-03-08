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
	private Signal powerReceive_28;
	private int power_thread_30;
	private int tutu__838295108;
	private int tutu__1527012744;
	private int tutu__839064605;
	private int tutu__783956408;
	private int S2519 = 1;
	private int S2285 = 1;
	private int S2517 = 1;
	private int S2287 = 1;
	private int S2294 = 1;
	private int S2289 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread139736596(int [] tdone, int [] ends){
          if(tdone[30] != 1){
            switch(S2517){
              case 0 : 
              active[30]=0;
              ends[30]=0;
tdone[30]=1;
              break;
              case 1 : 
              switch(S2287){
                case 0 : 
                if(powerReceive_28.getprestatus()){
                                                                        power_thread_30 = powerReceive_28.getpreval() != null ? ((Integer)(powerReceive_28.getpreval())).intValue() : 0;
                  S2287=1;
S2294=0;
if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__1527012744 = 0;
                                        tutu__1527012744 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S2294=1;
active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  else {
                    S2289=0;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                            tutu__838295108 = 0;
                                            tutu__838295108 = appliancePowerLightR3A10_o.get_w_s();
                                            tutu__838295108++;
                                            appliancePowerLightR3A10_o.set_w_s(tutu__838295108);
                                            appliancePowerLightR3A10_o.set_value(new Integer(power_thread_30));
                      S2289=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[30]=2;
                                                ;
                        S2287=0;
active[30]=1;
                        ends[30]=1;
tdone[30]=1;
                        }
                      else {
                        active[30]=1;
                        ends[30]=1;
tdone[30]=1;
                        }
                      }
                    else {
                      active[30]=1;
                      ends[30]=1;
tdone[30]=1;
                      }
                    }
                  }
                else {
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                break;
                case 1 : 
                switch(S2294){
                  case 0 : 
                  if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__783956408 = 0;
                                        tutu__783956408 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S2294=1;
active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  else {
                    switch(S2289){
                      case 0 : 
                      if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                tutu__839064605 = 0;
                                                tutu__839064605 = appliancePowerLightR3A10_o.get_w_s();
                                                tutu__839064605++;
                                                appliancePowerLightR3A10_o.set_w_s(tutu__839064605);
                                                appliancePowerLightR3A10_o.set_value(new Integer(power_thread_30));
                        S2289=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                    ends[30]=2;
                                                    ;
                          S2287=0;
active[30]=1;
                          ends[30]=1;
tdone[30]=1;
                          }
                        else {
                          active[30]=1;
                          ends[30]=1;
tdone[30]=1;
                          }
                        }
                      else {
                        active[30]=1;
                        ends[30]=1;
tdone[30]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[30]=2;
                                                ;
                        S2287=0;
active[30]=1;
                        ends[30]=1;
tdone[30]=1;
                        }
                      else {
                        active[30]=1;
                        ends[30]=1;
tdone[30]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S2294=1;
S2294=0;
if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__783956408 = 0;
                                        tutu__783956408 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S2294=1;
active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  else {
                    S2289=0;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                            tutu__839064605 = 0;
                                            tutu__839064605 = appliancePowerLightR3A10_o.get_w_s();
                                            tutu__839064605++;
                                            appliancePowerLightR3A10_o.set_w_s(tutu__839064605);
                                            appliancePowerLightR3A10_o.set_value(new Integer(power_thread_30));
                      S2289=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[30]=2;
                                                ;
                        S2287=0;
active[30]=1;
                        ends[30]=1;
tdone[30]=1;
                        }
                      else {
                        active[30]=1;
                        ends[30]=1;
tdone[30]=1;
                        }
                      }
                    else {
                      active[30]=1;
                      ends[30]=1;
tdone[30]=1;
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
public void thread142429839(int [] tdone, int [] ends){
          if(tdone[29] != 1){
            switch(S2285){
              case 0 : 
              active[29]=0;
              ends[29]=0;
tdone[29]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Light ON signal received");
                                powerReceive_28.setPresent();
                currsigs.addElement(powerReceive_28);
                powerReceive_28.setValue(new Integer(15));
                System.out.println("Emitted powerReceive_28");
active[29]=1;
                ends[29]=1;
tdone[29]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Light OFF signal received");
                                    powerReceive_28.setPresent();
                  currsigs.addElement(powerReceive_28);
                  powerReceive_28.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_28");
active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                else {
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                }
              break;
              }
            }
          }
public void thread144738332(int [] tdone, int [] ends){
          if(tdone[30] != 1){
            S2517=1;
S2287=0;
active[30]=1;
            ends[30]=1;
tdone[30]=1;
            }
          }
public void thread59708825(int [] tdone, int [] ends){
          if(tdone[29] != 1){
            S2285=1;
if(onSignal.getprestatus()){
                            System.out.println("Light ON signal received");
                            powerReceive_28.setPresent();
              currsigs.addElement(powerReceive_28);
              powerReceive_28.setValue(new Integer(15));
              System.out.println("Emitted powerReceive_28");
active[29]=1;
              ends[29]=1;
tdone[29]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Light OFF signal received");
                                powerReceive_28.setPresent();
                currsigs.addElement(powerReceive_28);
                powerReceive_28.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_28");
active[29]=1;
                ends[29]=1;
tdone[29]=1;
                }
              else {
                active[29]=1;
                ends[29]=1;
tdone[29]=1;
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
				switch(S2519){
          case 0 : 
          S2519=0;
          break RUN;
                    case 1 : 
          S2519=2;
          powerReceive_28.setClear();
          thread59708825(tdone,ends);
          thread144738332(tdone,ends);
          int biggest142814588 = 0;
          if(ends[29]>=biggest142814588){
            biggest142814588=ends[29];
}
          if(ends[30]>=biggest142814588){
            biggest142814588=ends[30];
}
          if(biggest142814588 == 1){
            active[28]=1;
            ends[28]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_28.setClear();
          thread142429839(tdone,ends);
          thread139736596(tdone,ends);
          int biggest139351848 = 0;
          if(ends[29]>=biggest139351848){
            biggest139351848=ends[29];
}
          if(ends[30]>=biggest139351848){
            biggest139351848=ends[30];
}
          if(biggest139351848 == 1){
            active[28]=1;
            ends[28]=1;
            break RUN;
            }
          //FINXME code
if(biggest139351848 == 0){
            S2519=0;
active[28]=0;
            ends[28]=0;
S2519=0;
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
		powerReceive_28 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[28] != 0){
		int index = 28;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[28]!=0 || suspended[28]!=0 || active[28]!=1);
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
			powerReceive_28.setpreclear();
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
			powerReceive_28.setClear();
			appliancePowerLightR3A10_o.sethook();
			if(paused[28]!=0 || suspended[28]!=0 || active[28]!=1);
			else{
				appliancePowerLightR3A10_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[28] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
