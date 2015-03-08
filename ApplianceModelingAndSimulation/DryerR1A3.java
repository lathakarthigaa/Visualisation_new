import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class DryerR1A3 extends ClockDomain{
	public DryerR1A3(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerDryerR1A3_o = new output_Channel();
	private Signal powerReceive_7;
	private int power_thread_9;
	private int tutu__616294992;
	private int tutu__1773285103;
	private int tutu__613601750;
	private int tutu__2020139632;
	private int S755 = 1;
	private int S521 = 1;
	private int S753 = 1;
	private int S523 = 1;
	private int S530 = 1;
	private int S525 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread405982835(int [] tdone, int [] ends){
          if(tdone[9] != 1){
            switch(S753){
              case 0 : 
              active[9]=0;
              ends[9]=0;
tdone[9]=1;
              break;
              case 1 : 
              switch(S523){
                case 0 : 
                if(powerReceive_7.getprestatus()){
                                                                        power_thread_9 = powerReceive_7.getpreval() != null ? ((Integer)(powerReceive_7.getpreval())).intValue() : 0;
                  S523=1;
S530=0;
if(appliancePowerDryerR1A3_o.get_preempted()){
                                        tutu__1773285103 = 0;
                                        tutu__1773285103 = appliancePowerDryerR1A3_o.get_preempted() ? appliancePowerDryerR1A3_o.refresh() : 0;
                    S530=1;
active[9]=1;
                    ends[9]=1;
tdone[9]=1;
                    }
                  else {
                    S525=0;
if(appliancePowerDryerR1A3_o.get_w_s() == appliancePowerDryerR1A3_o.get_w_r()){
                                            tutu__616294992 = 0;
                                            tutu__616294992 = appliancePowerDryerR1A3_o.get_w_s();
                                            tutu__616294992++;
                                            appliancePowerDryerR1A3_o.set_w_s(tutu__616294992);
                                            appliancePowerDryerR1A3_o.set_value(new Integer(power_thread_9));
                      S525=1;
if(appliancePowerDryerR1A3_o.get_w_s() == appliancePowerDryerR1A3_o.get_w_r()){
                                                ends[9]=2;
                                                ;
                        S523=0;
active[9]=1;
                        ends[9]=1;
tdone[9]=1;
                        }
                      else {
                        active[9]=1;
                        ends[9]=1;
tdone[9]=1;
                        }
                      }
                    else {
                      active[9]=1;
                      ends[9]=1;
tdone[9]=1;
                      }
                    }
                  }
                else {
                  active[9]=1;
                  ends[9]=1;
tdone[9]=1;
                  }
                break;
                case 1 : 
                switch(S530){
                  case 0 : 
                  if(appliancePowerDryerR1A3_o.get_preempted()){
                                        tutu__2020139632 = 0;
                                        tutu__2020139632 = appliancePowerDryerR1A3_o.get_preempted() ? appliancePowerDryerR1A3_o.refresh() : 0;
                    S530=1;
active[9]=1;
                    ends[9]=1;
tdone[9]=1;
                    }
                  else {
                    switch(S525){
                      case 0 : 
                      if(appliancePowerDryerR1A3_o.get_w_s() == appliancePowerDryerR1A3_o.get_w_r()){
                                                tutu__613601750 = 0;
                                                tutu__613601750 = appliancePowerDryerR1A3_o.get_w_s();
                                                tutu__613601750++;
                                                appliancePowerDryerR1A3_o.set_w_s(tutu__613601750);
                                                appliancePowerDryerR1A3_o.set_value(new Integer(power_thread_9));
                        S525=1;
if(appliancePowerDryerR1A3_o.get_w_s() == appliancePowerDryerR1A3_o.get_w_r()){
                                                    ends[9]=2;
                                                    ;
                          S523=0;
active[9]=1;
                          ends[9]=1;
tdone[9]=1;
                          }
                        else {
                          active[9]=1;
                          ends[9]=1;
tdone[9]=1;
                          }
                        }
                      else {
                        active[9]=1;
                        ends[9]=1;
tdone[9]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerDryerR1A3_o.get_w_s() == appliancePowerDryerR1A3_o.get_w_r()){
                                                ends[9]=2;
                                                ;
                        S523=0;
active[9]=1;
                        ends[9]=1;
tdone[9]=1;
                        }
                      else {
                        active[9]=1;
                        ends[9]=1;
tdone[9]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S530=1;
S530=0;
if(appliancePowerDryerR1A3_o.get_preempted()){
                                        tutu__2020139632 = 0;
                                        tutu__2020139632 = appliancePowerDryerR1A3_o.get_preempted() ? appliancePowerDryerR1A3_o.refresh() : 0;
                    S530=1;
active[9]=1;
                    ends[9]=1;
tdone[9]=1;
                    }
                  else {
                    S525=0;
if(appliancePowerDryerR1A3_o.get_w_s() == appliancePowerDryerR1A3_o.get_w_r()){
                                            tutu__613601750 = 0;
                                            tutu__613601750 = appliancePowerDryerR1A3_o.get_w_s();
                                            tutu__613601750++;
                                            appliancePowerDryerR1A3_o.set_w_s(tutu__613601750);
                                            appliancePowerDryerR1A3_o.set_value(new Integer(power_thread_9));
                      S525=1;
if(appliancePowerDryerR1A3_o.get_w_s() == appliancePowerDryerR1A3_o.get_w_r()){
                                                ends[9]=2;
                                                ;
                        S523=0;
active[9]=1;
                        ends[9]=1;
tdone[9]=1;
                        }
                      else {
                        active[9]=1;
                        ends[9]=1;
tdone[9]=1;
                        }
                      }
                    else {
                      active[9]=1;
                      ends[9]=1;
tdone[9]=1;
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
public void thread408676078(int [] tdone, int [] ends){
          if(tdone[8] != 1){
            switch(S521){
              case 0 : 
              active[8]=0;
              ends[8]=0;
tdone[8]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Dryer ON signal received");
                                powerReceive_7.setPresent();
                currsigs.addElement(powerReceive_7);
                powerReceive_7.setValue(new Integer(3000));
                System.out.println("Emitted powerReceive_7");
active[8]=1;
                ends[8]=1;
tdone[8]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Dryer OFF signal received");
                                    powerReceive_7.setPresent();
                  currsigs.addElement(powerReceive_7);
                  powerReceive_7.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_7");
active[8]=1;
                  ends[8]=1;
tdone[8]=1;
                  }
                else {
                  active[8]=1;
                  ends[8]=1;
tdone[8]=1;
                  }
                }
              break;
              }
            }
          }
public void thread398672606(int [] tdone, int [] ends){
          if(tdone[9] != 1){
            S753=1;
S523=0;
active[9]=1;
            ends[9]=1;
tdone[9]=1;
            }
          }
public void thread399826853(int [] tdone, int [] ends){
          if(tdone[8] != 1){
            S521=1;
if(onSignal.getprestatus()){
                            System.out.println("Dryer ON signal received");
                            powerReceive_7.setPresent();
              currsigs.addElement(powerReceive_7);
              powerReceive_7.setValue(new Integer(3000));
              System.out.println("Emitted powerReceive_7");
active[8]=1;
              ends[8]=1;
tdone[8]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Dryer OFF signal received");
                                powerReceive_7.setPresent();
                currsigs.addElement(powerReceive_7);
                powerReceive_7.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_7");
active[8]=1;
                ends[8]=1;
tdone[8]=1;
                }
              else {
                active[8]=1;
                ends[8]=1;
tdone[8]=1;
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
				switch(S755){
          case 0 : 
          S755=0;
          break RUN;
                    case 1 : 
          S755=2;
          powerReceive_7.setClear();
          thread399826853(tdone,ends);
          thread398672606(tdone,ends);
          int biggest409060826 = 0;
          if(ends[8]>=biggest409060826){
            biggest409060826=ends[8];
}
          if(ends[9]>=biggest409060826){
            biggest409060826=ends[9];
}
          if(biggest409060826 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_7.setClear();
          thread408676078(tdone,ends);
          thread405982835(tdone,ends);
          int biggest406752333 = 0;
          if(ends[8]>=biggest406752333){
            biggest406752333=ends[8];
}
          if(ends[9]>=biggest406752333){
            biggest406752333=ends[9];
}
          if(biggest406752333 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
            }
          //FINXME code
if(biggest406752333 == 0){
            S755=0;
active[7]=0;
            ends[7]=0;
S755=0;
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
		powerReceive_7 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[7] != 0){
		int index = 7;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
			else{
				appliancePowerDryerR1A3_o.update_w_r();
				if(!df){
					appliancePowerDryerR1A3_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_7.setpreclear();
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
			powerReceive_7.setClear();
			appliancePowerDryerR1A3_o.sethook();
			if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
			else{
				appliancePowerDryerR1A3_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[7] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
