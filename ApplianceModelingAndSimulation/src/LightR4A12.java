import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class LightR4A12 extends ClockDomain{
	public LightR4A12(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerLightR4A12_o = new output_Channel();
	private Signal powerReceive_34;
	private int power_thread_36;
	private int tutu__25765183;
	private int tutu__1157497344;
	private int tutu__25380434;
	private int tutu__2012768;
	private int S3023 = 1;
	private int S2789 = 1;
	private int S3021 = 1;
	private int S2791 = 1;
	private int S2798 = 1;
	private int S2793 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread249304294(int [] tdone, int [] ends){
          if(tdone[36] != 1){
            switch(S3021){
              case 0 : 
              active[36]=0;
              ends[36]=0;
tdone[36]=1;
              break;
              case 1 : 
              switch(S2791){
                case 0 : 
                if(powerReceive_34.getprestatus()){
                                                                        power_thread_36 = powerReceive_34.getpreval() != null ? ((Integer)(powerReceive_34.getpreval())).intValue() : 0;
                  S2791=1;
S2798=0;
if(appliancePowerLightR4A12_o.get_preempted()){
                                        tutu__1157497344 = 0;
                                        tutu__1157497344 = appliancePowerLightR4A12_o.get_preempted() ? appliancePowerLightR4A12_o.refresh() : 0;
                    S2798=1;
active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  else {
                    S2793=0;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                            tutu__25765183 = 0;
                                            tutu__25765183 = appliancePowerLightR4A12_o.get_w_s();
                                            tutu__25765183++;
                                            appliancePowerLightR4A12_o.set_w_s(tutu__25765183);
                                            appliancePowerLightR4A12_o.set_value(new Integer(power_thread_36));
                      S2793=1;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                ends[36]=2;
                                                ;
                        S2791=0;
active[36]=1;
                        ends[36]=1;
tdone[36]=1;
                        }
                      else {
                        active[36]=1;
                        ends[36]=1;
tdone[36]=1;
                        }
                      }
                    else {
                      active[36]=1;
                      ends[36]=1;
tdone[36]=1;
                      }
                    }
                  }
                else {
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                break;
                case 1 : 
                switch(S2798){
                  case 0 : 
                  if(appliancePowerLightR4A12_o.get_preempted()){
                                        tutu__2012768 = 0;
                                        tutu__2012768 = appliancePowerLightR4A12_o.get_preempted() ? appliancePowerLightR4A12_o.refresh() : 0;
                    S2798=1;
active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  else {
                    switch(S2793){
                      case 0 : 
                      if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                tutu__25380434 = 0;
                                                tutu__25380434 = appliancePowerLightR4A12_o.get_w_s();
                                                tutu__25380434++;
                                                appliancePowerLightR4A12_o.set_w_s(tutu__25380434);
                                                appliancePowerLightR4A12_o.set_value(new Integer(power_thread_36));
                        S2793=1;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                    ends[36]=2;
                                                    ;
                          S2791=0;
active[36]=1;
                          ends[36]=1;
tdone[36]=1;
                          }
                        else {
                          active[36]=1;
                          ends[36]=1;
tdone[36]=1;
                          }
                        }
                      else {
                        active[36]=1;
                        ends[36]=1;
tdone[36]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                ends[36]=2;
                                                ;
                        S2791=0;
active[36]=1;
                        ends[36]=1;
tdone[36]=1;
                        }
                      else {
                        active[36]=1;
                        ends[36]=1;
tdone[36]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S2798=1;
S2798=0;
if(appliancePowerLightR4A12_o.get_preempted()){
                                        tutu__2012768 = 0;
                                        tutu__2012768 = appliancePowerLightR4A12_o.get_preempted() ? appliancePowerLightR4A12_o.refresh() : 0;
                    S2798=1;
active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  else {
                    S2793=0;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                            tutu__25380434 = 0;
                                            tutu__25380434 = appliancePowerLightR4A12_o.get_w_s();
                                            tutu__25380434++;
                                            appliancePowerLightR4A12_o.set_w_s(tutu__25380434);
                                            appliancePowerLightR4A12_o.set_value(new Integer(power_thread_36));
                      S2793=1;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                ends[36]=2;
                                                ;
                        S2791=0;
active[36]=1;
                        ends[36]=1;
tdone[36]=1;
                        }
                      else {
                        active[36]=1;
                        ends[36]=1;
tdone[36]=1;
                        }
                      }
                    else {
                      active[36]=1;
                      ends[36]=1;
tdone[36]=1;
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
public void thread246611051(int [] tdone, int [] ends){
          if(tdone[35] != 1){
            switch(S2789){
              case 0 : 
              active[35]=0;
              ends[35]=0;
tdone[35]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Light ON signal received");
                                powerReceive_34.setPresent();
                currsigs.addElement(powerReceive_34);
                powerReceive_34.setValue(new Integer(60));
                System.out.println("Emitted powerReceive_34");
active[35]=1;
                ends[35]=1;
tdone[35]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Light OFF signal received");
                                    powerReceive_34.setPresent();
                  currsigs.addElement(powerReceive_34);
                  powerReceive_34.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_34");
active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                else {
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                }
              break;
              }
            }
          }
public void thread244302558(int [] tdone, int [] ends){
          if(tdone[36] != 1){
            S3021=1;
S2791=0;
active[36]=1;
            ends[36]=1;
tdone[36]=1;
            }
          }
public void thread255460276(int [] tdone, int [] ends){
          if(tdone[35] != 1){
            S2789=1;
if(onSignal.getprestatus()){
                            System.out.println("Light ON signal received");
                            powerReceive_34.setPresent();
              currsigs.addElement(powerReceive_34);
              powerReceive_34.setValue(new Integer(60));
              System.out.println("Emitted powerReceive_34");
active[35]=1;
              ends[35]=1;
tdone[35]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Light OFF signal received");
                                powerReceive_34.setPresent();
                currsigs.addElement(powerReceive_34);
                powerReceive_34.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_34");
active[35]=1;
                ends[35]=1;
tdone[35]=1;
                }
              else {
                active[35]=1;
                ends[35]=1;
tdone[35]=1;
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
				switch(S3023){
          case 0 : 
          S3023=0;
          break RUN;
                    case 1 : 
          S3023=2;
          powerReceive_34.setClear();
          thread255460276(tdone,ends);
          thread244302558(tdone,ends);
          int biggest246226302 = 0;
          if(ends[35]>=biggest246226302){
            biggest246226302=ends[35];
}
          if(ends[36]>=biggest246226302){
            biggest246226302=ends[36];
}
          if(biggest246226302 == 1){
            active[34]=1;
            ends[34]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_34.setClear();
          thread246611051(tdone,ends);
          thread249304294(tdone,ends);
          int biggest249689042 = 0;
          if(ends[35]>=biggest249689042){
            biggest249689042=ends[35];
}
          if(ends[36]>=biggest249689042){
            biggest249689042=ends[36];
}
          if(biggest249689042 == 1){
            active[34]=1;
            ends[34]=1;
            break RUN;
            }
          //FINXME code
if(biggest249689042 == 0){
            S3023=0;
active[34]=0;
            ends[34]=0;
S3023=0;
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
		powerReceive_34 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[34] != 0){
		int index = 34;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[34]!=0 || suspended[34]!=0 || active[34]!=1);
			else{
				appliancePowerLightR4A12_o.update_w_r();
				if(!df){
					appliancePowerLightR4A12_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_34.setpreclear();
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
			powerReceive_34.setClear();
			appliancePowerLightR4A12_o.sethook();
			if(paused[34]!=0 || suspended[34]!=0 || active[34]!=1);
			else{
				appliancePowerLightR4A12_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[34] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
