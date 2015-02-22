import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import householdApplianceGUI.AppliancesPower;
import householdApplianceGUI.ApplianceGUI;
import javax.swing.JLabel;

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
	private int power_thread_3;
	private int tutu__1444478244;
	private int tutu__794206419;
	private int tutu__1458713954;
	private int tutu__990950069;
	private int S251 = 1;
	private int S17 = 1;
	private int S249 = 1;
	private int S19 = 1;
	private int S26 = 1;
	private int S21 = 1;
	
	private int[] ends = new int[13];
	private int[] tdone = new int[13];
		public void thread1144374102(int [] tdone, int [] ends){
          if(tdone[3] != 1){
            switch(S249){
              case 0 : 
              active[3]=0;
              ends[3]=0;
tdone[3]=1;
              break;
              case 1 : 
              switch(S19){
                case 0 : 
                if(powerReceive_1.getprestatus()){
                                                                        power_thread_3 = powerReceive_1.getpreval() != null ? ((Integer)(powerReceive_1.getpreval())).intValue() : 0;
                  S19=1;
S26=0;
if(appliancePowerFridge_o.get_preempted()){
                                        tutu__794206419 = 0;
                                        tutu__794206419 = appliancePowerFridge_o.get_preempted() ? appliancePowerFridge_o.refresh() : 0;
                    S26=1;
active[3]=1;
                    ends[3]=1;
tdone[3]=1;
                    }
                  else {
                    S21=0;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                            tutu__1444478244 = 0;
                                            tutu__1444478244 = appliancePowerFridge_o.get_w_s();
                                            tutu__1444478244++;
                                            appliancePowerFridge_o.set_w_s(tutu__1444478244);
                                            appliancePowerFridge_o.set_value(new Integer(power_thread_3));
                      S21=1;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                ends[3]=2;
                                                ;
                        S19=0;
active[3]=1;
                        ends[3]=1;
tdone[3]=1;
                        }
                      else {
                        active[3]=1;
                        ends[3]=1;
tdone[3]=1;
                        }
                      }
                    else {
                      active[3]=1;
                      ends[3]=1;
tdone[3]=1;
                      }
                    }
                  }
                else {
                  active[3]=1;
                  ends[3]=1;
tdone[3]=1;
                  }
                break;
                case 1 : 
                switch(S26){
                  case 0 : 
                  if(appliancePowerFridge_o.get_preempted()){
                                        tutu__990950069 = 0;
                                        tutu__990950069 = appliancePowerFridge_o.get_preempted() ? appliancePowerFridge_o.refresh() : 0;
                    S26=1;
active[3]=1;
                    ends[3]=1;
tdone[3]=1;
                    }
                  else {
                    switch(S21){
                      case 0 : 
                      if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                tutu__1458713954 = 0;
                                                tutu__1458713954 = appliancePowerFridge_o.get_w_s();
                                                tutu__1458713954++;
                                                appliancePowerFridge_o.set_w_s(tutu__1458713954);
                                                appliancePowerFridge_o.set_value(new Integer(power_thread_3));
                        S21=1;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                    ends[3]=2;
                                                    ;
                          S19=0;
active[3]=1;
                          ends[3]=1;
tdone[3]=1;
                          }
                        else {
                          active[3]=1;
                          ends[3]=1;
tdone[3]=1;
                          }
                        }
                      else {
                        active[3]=1;
                        ends[3]=1;
tdone[3]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                ends[3]=2;
                                                ;
                        S19=0;
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
                      }
                    }
                  break;
                  case 1 : 
                  S26=1;
S26=0;
if(appliancePowerFridge_o.get_preempted()){
                                        tutu__990950069 = 0;
                                        tutu__990950069 = appliancePowerFridge_o.get_preempted() ? appliancePowerFridge_o.refresh() : 0;
                    S26=1;
active[3]=1;
                    ends[3]=1;
tdone[3]=1;
                    }
                  else {
                    S21=0;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                            tutu__1458713954 = 0;
                                            tutu__1458713954 = appliancePowerFridge_o.get_w_s();
                                            tutu__1458713954++;
                                            appliancePowerFridge_o.set_w_s(tutu__1458713954);
                                            appliancePowerFridge_o.set_value(new Integer(power_thread_3));
                      S21=1;
if(appliancePowerFridge_o.get_w_s() == appliancePowerFridge_o.get_w_r()){
                                                ends[3]=2;
                                                ;
                        S19=0;
active[3]=1;
                        ends[3]=1;
tdone[3]=1;
                        }
                      else {
                        active[3]=1;
                        ends[3]=1;
tdone[3]=1;
                        }
                      }
                    else {
                      active[3]=1;
                      ends[3]=1;
tdone[3]=1;
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
public void thread1145528349(int [] tdone, int [] ends){
          if(tdone[2] != 1){
            switch(S17){
              case 0 : 
              active[2]=0;
              ends[2]=0;
tdone[2]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
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
                if(offSignal.getprestatus()){
                                    System.out.println("Fridge OFF signal received");
                                    powerReceive_1.setPresent();
                  currsigs.addElement(powerReceive_1);
                  powerReceive_1.setValue(new Integer(0));
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
                }
              break;
              }
            }
          }
public void thread1147836842(int [] tdone, int [] ends){
          if(tdone[3] != 1){
            S249=1;
S19=0;
active[3]=1;
            ends[3]=1;
tdone[3]=1;
            }
          }
public void thread1162842050(int [] tdone, int [] ends){
          if(tdone[2] != 1){
            S17=1;
if(onSignal.getprestatus()){
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
              if(offSignal.getprestatus()){
                                System.out.println("Fridge OFF signal received");
                                powerReceive_1.setPresent();
                currsigs.addElement(powerReceive_1);
                powerReceive_1.setValue(new Integer(0));
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
              }
            }
          }
public void runClockDomain(){
			for(int i=0;i<ends.length;i++){
				ends[i] = 0;
				tdone[i] = 0;
				}
RUN: while(true){
				switch(S251){
          case 0 : 
          S251=0;
          break RUN;
                    case 1 : 
          S251=2;
          powerReceive_1.setClear();
          thread1162842050(tdone,ends);
          thread1147836842(tdone,ends);
          int biggest1147452094 = 0;
          if(ends[2]>=biggest1147452094){
            biggest1147452094=ends[2];
}
          if(ends[3]>=biggest1147452094){
            biggest1147452094=ends[3];
}
          if(biggest1147452094 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_1.setClear();
          thread1145528349(tdone,ends);
          thread1144374102(tdone,ends);
          int biggest1154377574 = 0;
          if(ends[2]>=biggest1154377574){
            biggest1154377574=ends[2];
}
          if(ends[3]>=biggest1154377574){
            biggest1154377574=ends[3];
}
          if(biggest1154377574 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
            }
          //FINXME code
if(biggest1154377574 == 0){
            S251=0;
active[1]=0;
            ends[1]=0;
S251=0;
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
