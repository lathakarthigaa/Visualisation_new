import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class Fridge extends ClockDomain{
	public Fridge(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerFridge_o = new output_Channel();
	private Signal powerReceive_1;
	private int power_thread_4;
	private int tutu__1381612097;
	private int tutu__1266921737;
	private int tutu__1386229083;
	private int tutu__286008714;
	private int S270 = 1;
	private int S18 = 1;
	private int S8 = 1;
	private int S36 = 1;
	private int S26 = 1;
	private int S268 = 1;
	private int S38 = 1;
	private int S45 = 1;
	private int S40 = 1;
	
	private int[] ends = new int[15];
	private int[] tdone = new int[15];
		public void thread1198856369(int [] tdone, int [] ends){
          if(tdone[4] != 1){
            switch(S268){
              case 0 : 
              active[4]=0;
              ends[4]=0;
tdone[4]=1;
              break;
              case 1 : 
              switch(S38){
                case 0 : 
                if(powerReceive_1.getprestatus()){
                                                                        power_thread_4 = powerReceive_1.getpreval() != null ? ((Integer)(powerReceive_1.getpreval())).intValue() : 0;
                  S38=1;
S45=0;
if(appliancePowerFridge_o.get_preempted()){
                                        tutu__1266921737 = 0;
                                        tutu__1266921737 = appliancePowerFridge_o.get_preempted() ? appliancePowerFridge_o.refresh() : 0;
                    S45=1;
active[4]=1;
                    ends[4]=1;
tdone[4]=1;
                    }
                  else {
                    S40=0;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                            tutu__1381612097 = 0;
                                            tutu__1381612097 = appliancePowerFridge_o.get_w_s();
                                            tutu__1381612097++;
                                            appliancePowerFridge_o.set_w_s(tutu__1381612097);
                                            appliancePowerFridge_o.set_value(new Integer(power_thread_4));
                      S40=1;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                ends[4]=2;
                                                ;
                        S38=0;
active[4]=1;
                        ends[4]=1;
tdone[4]=1;
                        }
                      else {
                        active[4]=1;
                        ends[4]=1;
tdone[4]=1;
                        }
                      }
                    else {
                      active[4]=1;
                      ends[4]=1;
tdone[4]=1;
                      }
                    }
                  }
                else {
                  active[4]=1;
                  ends[4]=1;
tdone[4]=1;
                  }
                break;
                case 1 : 
                switch(S45){
                  case 0 : 
                  if(appliancePowerFridge_o.get_preempted()){
                                        tutu__286008714 = 0;
                                        tutu__286008714 = appliancePowerFridge_o.get_preempted() ? appliancePowerFridge_o.refresh() : 0;
                    S45=1;
active[4]=1;
                    ends[4]=1;
tdone[4]=1;
                    }
                  else {
                    switch(S40){
                      case 0 : 
                      if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                tutu__1386229083 = 0;
                                                tutu__1386229083 = appliancePowerFridge_o.get_w_s();
                                                tutu__1386229083++;
                                                appliancePowerFridge_o.set_w_s(tutu__1386229083);
                                                appliancePowerFridge_o.set_value(new Integer(power_thread_4));
                        S40=1;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                    ends[4]=2;
                                                    ;
                          S38=0;
active[4]=1;
                          ends[4]=1;
tdone[4]=1;
                          }
                        else {
                          active[4]=1;
                          ends[4]=1;
tdone[4]=1;
                          }
                        }
                      else {
                        active[4]=1;
                        ends[4]=1;
tdone[4]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                ends[4]=2;
                                                ;
                        S38=0;
active[4]=1;
                        ends[4]=1;
tdone[4]=1;
                        }
                      else {
                        active[4]=1;
                        ends[4]=1;
tdone[4]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S45=1;
S45=0;
if(appliancePowerFridge_o.get_preempted()){
                                        tutu__286008714 = 0;
                                        tutu__286008714 = appliancePowerFridge_o.get_preempted() ? appliancePowerFridge_o.refresh() : 0;
                    S45=1;
active[4]=1;
                    ends[4]=1;
tdone[4]=1;
                    }
                  else {
                    S40=0;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                            tutu__1386229083 = 0;
                                            tutu__1386229083 = appliancePowerFridge_o.get_w_s();
                                            tutu__1386229083++;
                                            appliancePowerFridge_o.set_w_s(tutu__1386229083);
                                            appliancePowerFridge_o.set_value(new Integer(power_thread_4));
                      S40=1;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                ends[4]=2;
                                                ;
                        S38=0;
active[4]=1;
                        ends[4]=1;
tdone[4]=1;
                        }
                      else {
                        active[4]=1;
                        ends[4]=1;
tdone[4]=1;
                        }
                      }
                    else {
                      active[4]=1;
                      ends[4]=1;
tdone[4]=1;
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
public void thread1201549611(int [] tdone, int [] ends){
          if(tdone[3] != 1){
            switch(S36){
              case 0 : 
              active[3]=0;
              ends[3]=0;
tdone[3]=1;
              break;
              case 1 : 
              switch(S26){
                case 0 : 
                if(offSignal.getprestatus()){
                  S26=1;
                  System.out.println("Fridge OFF signal received");
                                    powerReceive_1.setPresent();
                  currsigs.addElement(powerReceive_1);
                  powerReceive_1.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_1");
active[3]=1;
                  ends[3]=1;
tdone[3]=1;
                  }
                else {
                  active[3]=1;
                  ends[3]=1;
tdone[3]=1;
                  }
                break;
                case 1 : 
                                System.out.println("Fridge OFF signal received");
                                powerReceive_1.setPresent();
                currsigs.addElement(powerReceive_1);
                powerReceive_1.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_1");
active[3]=1;
                ends[3]=1;
tdone[3]=1;
                break;
                }
              break;
              }
            }
          }
public void thread1192315638(int [] tdone, int [] ends){
          if(tdone[2] != 1){
            switch(S18){
              case 0 : 
              active[2]=0;
              ends[2]=0;
tdone[2]=1;
              break;
              case 1 : 
              switch(S8){
                case 0 : 
                if(onSignal.getprestatus()){
                  S8=1;
                  System.out.println("Fridge ON signal received");
                                    powerReceive_1.setPresent();
                  currsigs.addElement(powerReceive_1);
                  powerReceive_1.setValue(new Integer(300));
                  System.out.println("Emitted powerReceive_1");
active[2]=1;
                  ends[2]=1;
tdone[2]=1;
                  }
                else {
                  active[2]=1;
                  ends[2]=1;
tdone[2]=1;
                  }
                break;
                case 1 : 
                                System.out.println("Fridge ON signal received");
                                powerReceive_1.setPresent();
                currsigs.addElement(powerReceive_1);
                powerReceive_1.setValue(new Integer(300));
                System.out.println("Emitted powerReceive_1");
active[2]=1;
                ends[2]=1;
tdone[2]=1;
                break;
                }
              break;
              }
            }
          }
public void thread1194624131(int [] tdone, int [] ends){
          if(tdone[4] != 1){
            S268=1;
S38=0;
active[4]=1;
            ends[4]=1;
tdone[4]=1;
            }
          }
public void thread1195008880(int [] tdone, int [] ends){
          if(tdone[3] != 1){
            S36=1;
S26=0;
active[3]=1;
            ends[3]=1;
tdone[3]=1;
            }
          }
public void thread1193854633(int [] tdone, int [] ends){
          if(tdone[2] != 1){
            S18=1;
S8=0;
active[2]=1;
            ends[2]=1;
tdone[2]=1;
            }
          }
public void runClockDomain(){
			for(int i=0;i<ends.length;i++){
				ends[i] = 0;
				tdone[i] = 0;
				}
RUN: while(true){
				switch(S270){
          case 0 : 
          S270=0;
          break RUN;
                    case 1 : 
          S270=2;
          powerReceive_1.setClear();
          thread1193854633(tdone,ends);
          thread1195008880(tdone,ends);
          thread1194624131(tdone,ends);
          int biggest1192700387 = 0;
          if(ends[2]>=biggest1192700387){
            biggest1192700387=ends[2];
}
          if(ends[3]>=biggest1192700387){
            biggest1192700387=ends[3];
}
          if(ends[4]>=biggest1192700387){
            biggest1192700387=ends[4];
}
          if(biggest1192700387 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_1.setClear();
          thread1192315638(tdone,ends);
          thread1201549611(tdone,ends);
          thread1198856369(tdone,ends);
          int biggest1199625867 = 0;
          if(ends[2]>=biggest1199625867){
            biggest1199625867=ends[2];
}
          if(ends[3]>=biggest1199625867){
            biggest1199625867=ends[3];
}
          if(ends[4]>=biggest1199625867){
            biggest1199625867=ends[4];
}
          if(biggest1199625867 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
            }
          //FINXME code
if(biggest1199625867 == 0){
            S270=0;
active[1]=0;
            ends[1]=0;
S270=0;
            break RUN;
            }
                    }
        			}
		}
	public void init(){
		char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		paused = paused1;
		active = active1;
		suspended = suspended1;
		// Now instantiate all the local signals ONLY
		powerReceive_1 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[1] != 0){
		int index = 1;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
			else{
				appliancePowerFridge_o.update_w_r();
				if(!df){
					appliancePowerFridge_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_1.setpreclear();
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
			powerReceive_1.setClear();
			appliancePowerFridge_o.sethook();
			if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
			else{
				appliancePowerFridge_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[1] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
