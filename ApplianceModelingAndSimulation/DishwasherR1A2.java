import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class DishwasherR1A2 extends ClockDomain{
	public DishwasherR1A2(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerDishwasherR1A2_o = new output_Channel();
	private Signal powerReceive_4;
	private int power_thread_6;
	private int tutu__600520287;
	private int tutu__1643057745;
	private int tutu__611678005;
	private int tutu__792372080;
	private int S503 = 1;
	private int S269 = 1;
	private int S501 = 1;
	private int S271 = 1;
	private int S278 = 1;
	private int S273 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread403289593(int [] tdone, int [] ends){
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
if(appliancePowerDishwasherR1A2_o.get_preempted()){
                                        tutu__1643057745 = 0;
                                        tutu__1643057745 = appliancePowerDishwasherR1A2_o.get_preempted() ? appliancePowerDishwasherR1A2_o.refresh() : 0;
                    S278=1;
active[6]=1;
                    ends[6]=1;
tdone[6]=1;
                    }
                  else {
                    S273=0;
if(appliancePowerDishwasherR1A2_o.get_w_s() == appliancePowerDishwasherR1A2_o.get_w_r()){
                                            tutu__600520287 = 0;
                                            tutu__600520287 = appliancePowerDishwasherR1A2_o.get_w_s();
                                            tutu__600520287++;
                                            appliancePowerDishwasherR1A2_o.set_w_s(tutu__600520287);
                                            appliancePowerDishwasherR1A2_o.set_value(new Integer(power_thread_6));
                      S273=1;
if(appliancePowerDishwasherR1A2_o.get_w_s() == appliancePowerDishwasherR1A2_o.get_w_r()){
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
                  if(appliancePowerDishwasherR1A2_o.get_preempted()){
                                        tutu__792372080 = 0;
                                        tutu__792372080 = appliancePowerDishwasherR1A2_o.get_preempted() ? appliancePowerDishwasherR1A2_o.refresh() : 0;
                    S278=1;
active[6]=1;
                    ends[6]=1;
tdone[6]=1;
                    }
                  else {
                    switch(S273){
                      case 0 : 
                      if(appliancePowerDishwasherR1A2_o.get_w_s() == appliancePowerDishwasherR1A2_o.get_w_r()){
                                                tutu__611678005 = 0;
                                                tutu__611678005 = appliancePowerDishwasherR1A2_o.get_w_s();
                                                tutu__611678005++;
                                                appliancePowerDishwasherR1A2_o.set_w_s(tutu__611678005);
                                                appliancePowerDishwasherR1A2_o.set_value(new Integer(power_thread_6));
                        S273=1;
if(appliancePowerDishwasherR1A2_o.get_w_s() == appliancePowerDishwasherR1A2_o.get_w_r()){
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
                      if(appliancePowerDishwasherR1A2_o.get_w_s() == appliancePowerDishwasherR1A2_o.get_w_r()){
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
if(appliancePowerDishwasherR1A2_o.get_preempted()){
                                        tutu__792372080 = 0;
                                        tutu__792372080 = appliancePowerDishwasherR1A2_o.get_preempted() ? appliancePowerDishwasherR1A2_o.refresh() : 0;
                    S278=1;
active[6]=1;
                    ends[6]=1;
tdone[6]=1;
                    }
                  else {
                    S273=0;
if(appliancePowerDishwasherR1A2_o.get_w_s() == appliancePowerDishwasherR1A2_o.get_w_r()){
                                            tutu__611678005 = 0;
                                            tutu__611678005 = appliancePowerDishwasherR1A2_o.get_w_s();
                                            tutu__611678005++;
                                            appliancePowerDishwasherR1A2_o.set_w_s(tutu__611678005);
                                            appliancePowerDishwasherR1A2_o.set_value(new Integer(power_thread_6));
                      S273=1;
if(appliancePowerDishwasherR1A2_o.get_w_s() == appliancePowerDishwasherR1A2_o.get_w_r()){
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
public void thread416755804(int [] tdone, int [] ends){
          if(tdone[5] != 1){
            switch(S269){
              case 0 : 
              active[5]=0;
              ends[5]=0;
tdone[5]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Dishwasher ON signal received");
                                powerReceive_4.setPresent();
                currsigs.addElement(powerReceive_4);
                powerReceive_4.setValue(new Integer(500));
                System.out.println("Emitted powerReceive_4");
active[5]=1;
                ends[5]=1;
tdone[5]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Dishwasher OFF signal received");
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
public void thread419064298(int [] tdone, int [] ends){
          if(tdone[6] != 1){
            S501=1;
S271=0;
active[6]=1;
            ends[6]=1;
tdone[6]=1;
            }
          }
public void thread421757540(int [] tdone, int [] ends){
          if(tdone[5] != 1){
            S269=1;
if(onSignal.getprestatus()){
                            System.out.println("Dishwasher ON signal received");
                            powerReceive_4.setPresent();
              currsigs.addElement(powerReceive_4);
              powerReceive_4.setValue(new Integer(500));
              System.out.println("Emitted powerReceive_4");
active[5]=1;
              ends[5]=1;
tdone[5]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Dishwasher OFF signal received");
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
          thread421757540(tdone,ends);
          thread419064298(tdone,ends);
          int biggest418679549 = 0;
          if(ends[5]>=biggest418679549){
            biggest418679549=ends[5];
}
          if(ends[6]>=biggest418679549){
            biggest418679549=ends[6];
}
          if(biggest418679549 == 1){
            active[4]=1;
            ends[4]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_4.setClear();
          thread416755804(tdone,ends);
          thread403289593(tdone,ends);
          int biggest400981100 = 0;
          if(ends[5]>=biggest400981100){
            biggest400981100=ends[5];
}
          if(ends[6]>=biggest400981100){
            biggest400981100=ends[6];
}
          if(biggest400981100 == 1){
            active[4]=1;
            ends[4]=1;
            break RUN;
            }
          //FINXME code
if(biggest400981100 == 0){
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
		char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
				appliancePowerDishwasherR1A2_o.update_w_r();
				if(!df){
					appliancePowerDishwasherR1A2_o.gethook();
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
			appliancePowerDishwasherR1A2_o.sethook();
			if(paused[4]!=0 || suspended[4]!=0 || active[4]!=1);
			else{
				appliancePowerDishwasherR1A2_o.gethook();
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
