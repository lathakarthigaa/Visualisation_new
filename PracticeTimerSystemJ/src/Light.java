import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class Light extends ClockDomain{
	public Light(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerLight_o = new output_Channel();
	private Signal powerReceive_5;
	private int power_thread_8;
	private int tutu__1132294809;
	private int tutu__1598349841;
	private int tutu__1134988052;
	private int tutu__1096807281;
	private int S541 = 1;
	private int S289 = 1;
	private int S279 = 1;
	private int S307 = 1;
	private int S297 = 1;
	private int S539 = 1;
	private int S309 = 1;
	private int S316 = 1;
	private int S311 = 1;
	
	private int[] ends = new int[15];
	private int[] tdone = new int[15];
		public void thread1189622395(int [] tdone, int [] ends){
          if(tdone[8] != 1){
            switch(S539){
              case 0 : 
              active[8]=0;
              ends[8]=0;
tdone[8]=1;
              break;
              case 1 : 
              switch(S309){
                case 0 : 
                if(powerReceive_5.getprestatus()){
                                                                        power_thread_8 = powerReceive_5.getpreval() != null ? ((Integer)(powerReceive_5.getpreval())).intValue() : 0;
                  S309=1;
S316=0;
if(appliancePowerLight_o.get_preempted()){
                                        tutu__1598349841 = 0;
                                        tutu__1598349841 = appliancePowerLight_o.get_preempted() ? appliancePowerLight_o.refresh() : 0;
                    S316=1;
active[8]=1;
                    ends[8]=1;
tdone[8]=1;
                    }
                  else {
                    S311=0;
if(appliancePowerLight_o.get_w_s() == appliancePowerLight_o.get_w_r()){
                                            tutu__1132294809 = 0;
                                            tutu__1132294809 = appliancePowerLight_o.get_w_s();
                                            tutu__1132294809++;
                                            appliancePowerLight_o.set_w_s(tutu__1132294809);
                                            appliancePowerLight_o.set_value(new Integer(power_thread_8));
                      S311=1;
if(appliancePowerLight_o.get_w_s() == appliancePowerLight_o.get_w_r()){
                                                ends[8]=2;
                                                ;
                        S309=0;
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
                    else {
                      active[8]=1;
                      ends[8]=1;
tdone[8]=1;
                      }
                    }
                  }
                else {
                  active[8]=1;
                  ends[8]=1;
tdone[8]=1;
                  }
                break;
                case 1 : 
                switch(S316){
                  case 0 : 
                  if(appliancePowerLight_o.get_preempted()){
                                        tutu__1096807281 = 0;
                                        tutu__1096807281 = appliancePowerLight_o.get_preempted() ? appliancePowerLight_o.refresh() : 0;
                    S316=1;
active[8]=1;
                    ends[8]=1;
tdone[8]=1;
                    }
                  else {
                    switch(S311){
                      case 0 : 
                      if(appliancePowerLight_o.get_w_s() == appliancePowerLight_o.get_w_r()){
                                                tutu__1134988052 = 0;
                                                tutu__1134988052 = appliancePowerLight_o.get_w_s();
                                                tutu__1134988052++;
                                                appliancePowerLight_o.set_w_s(tutu__1134988052);
                                                appliancePowerLight_o.set_value(new Integer(power_thread_8));
                        S311=1;
if(appliancePowerLight_o.get_w_s() == appliancePowerLight_o.get_w_r()){
                                                    ends[8]=2;
                                                    ;
                          S309=0;
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
                      else {
                        active[8]=1;
                        ends[8]=1;
tdone[8]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerLight_o.get_w_s() == appliancePowerLight_o.get_w_r()){
                                                ends[8]=2;
                                                ;
                        S309=0;
active[8]=1;
                        ends[8]=1;
tdone[8]=1;
                        }
                      else {
                        active[8]=1;
                        ends[8]=1;
tdone[8]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S316=1;
S316=0;
if(appliancePowerLight_o.get_preempted()){
                                        tutu__1096807281 = 0;
                                        tutu__1096807281 = appliancePowerLight_o.get_preempted() ? appliancePowerLight_o.refresh() : 0;
                    S316=1;
active[8]=1;
                    ends[8]=1;
tdone[8]=1;
                    }
                  else {
                    S311=0;
if(appliancePowerLight_o.get_w_s() == appliancePowerLight_o.get_w_r()){
                                            tutu__1134988052 = 0;
                                            tutu__1134988052 = appliancePowerLight_o.get_w_s();
                                            tutu__1134988052++;
                                            appliancePowerLight_o.set_w_s(tutu__1134988052);
                                            appliancePowerLight_o.set_value(new Integer(power_thread_8));
                      S311=1;
if(appliancePowerLight_o.get_w_s() == appliancePowerLight_o.get_w_r()){
                                                ends[8]=2;
                                                ;
                        S309=0;
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
                    else {
                      active[8]=1;
                      ends[8]=1;
tdone[8]=1;
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
public void thread1180003673(int [] tdone, int [] ends){
          if(tdone[7] != 1){
            switch(S307){
              case 0 : 
              active[7]=0;
              ends[7]=0;
tdone[7]=1;
              break;
              case 1 : 
              switch(S297){
                case 0 : 
                if(offSignal.getprestatus()){
                  S297=1;
                  System.out.println("Light OFF signal received");
                                    powerReceive_5.setPresent();
                  currsigs.addElement(powerReceive_5);
                  powerReceive_5.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_5");
active[7]=1;
                  ends[7]=1;
tdone[7]=1;
                  }
                else {
                  active[7]=1;
                  ends[7]=1;
tdone[7]=1;
                  }
                break;
                case 1 : 
                                System.out.println("Light OFF signal received");
                                powerReceive_5.setPresent();
                currsigs.addElement(powerReceive_5);
                powerReceive_5.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_5");
active[7]=1;
                ends[7]=1;
tdone[7]=1;
                break;
                }
              break;
              }
            }
          }
public void thread1184235911(int [] tdone, int [] ends){
          if(tdone[6] != 1){
            switch(S289){
              case 0 : 
              active[6]=0;
              ends[6]=0;
tdone[6]=1;
              break;
              case 1 : 
              switch(S279){
                case 0 : 
                if(onSignal.getprestatus()){
                  S279=1;
                  System.out.println("Light ON signal received");
                                    powerReceive_5.setPresent();
                  currsigs.addElement(powerReceive_5);
                  powerReceive_5.setValue(new Integer(15));
                  System.out.println("Emitted powerReceive_5");
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
                case 1 : 
                                System.out.println("Light ON signal received");
                                powerReceive_5.setPresent();
                currsigs.addElement(powerReceive_5);
                powerReceive_5.setValue(new Integer(15));
                System.out.println("Emitted powerReceive_5");
active[6]=1;
                ends[6]=1;
tdone[6]=1;
                break;
                }
              break;
              }
            }
          }
public void thread1183466413(int [] tdone, int [] ends){
          if(tdone[8] != 1){
            S539=1;
S309=0;
active[8]=1;
            ends[8]=1;
tdone[8]=1;
            }
          }
public void thread1197702122(int [] tdone, int [] ends){
          if(tdone[7] != 1){
            S307=1;
S297=0;
active[7]=1;
            ends[7]=1;
tdone[7]=1;
            }
          }
public void thread1198086871(int [] tdone, int [] ends){
          if(tdone[6] != 1){
            S289=1;
S279=0;
active[6]=1;
            ends[6]=1;
tdone[6]=1;
            }
          }
public void runClockDomain(){
			for(int i=0;i<ends.length;i++){
				ends[i] = 0;
				tdone[i] = 0;
				}
RUN: while(true){
				switch(S541){
          case 0 : 
          S541=0;
          break RUN;
                    case 1 : 
          S541=2;
          powerReceive_5.setClear();
          thread1198086871(tdone,ends);
          thread1197702122(tdone,ends);
          thread1183466413(tdone,ends);
          int biggest1183081664 = 0;
          if(ends[6]>=biggest1183081664){
            biggest1183081664=ends[6];
}
          if(ends[7]>=biggest1183081664){
            biggest1183081664=ends[7];
}
          if(ends[8]>=biggest1183081664){
            biggest1183081664=ends[8];
}
          if(biggest1183081664 == 1){
            active[5]=1;
            ends[5]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_5.setClear();
          thread1184235911(tdone,ends);
          thread1180003673(tdone,ends);
          thread1189622395(tdone,ends);
          int biggest1190391893 = 0;
          if(ends[6]>=biggest1190391893){
            biggest1190391893=ends[6];
}
          if(ends[7]>=biggest1190391893){
            biggest1190391893=ends[7];
}
          if(ends[8]>=biggest1190391893){
            biggest1190391893=ends[8];
}
          if(biggest1190391893 == 1){
            active[5]=1;
            ends[5]=1;
            break RUN;
            }
          //FINXME code
if(biggest1190391893 == 0){
            S541=0;
active[5]=0;
            ends[5]=0;
S541=0;
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
		powerReceive_5 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[5] != 0){
		int index = 5;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[5]!=0 || suspended[5]!=0 || active[5]!=1);
			else{
				appliancePowerLight_o.update_w_r();
				if(!df){
					appliancePowerLight_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_5.setpreclear();
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
			powerReceive_5.setClear();
			appliancePowerLight_o.sethook();
			if(paused[5]!=0 || suspended[5]!=0 || active[5]!=1);
			else{
				appliancePowerLight_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[5] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
