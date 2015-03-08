import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class WaterHeaterR4A14 extends ClockDomain{
	public WaterHeaterR4A14(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerWaterHeaterR4A14_o = new output_Channel();
	private Signal powerReceive_40;
	private int power_thread_42;
	private int tutu__786738755;
	private int tutu__1743123267;
	private int tutu__784430262;
	private int tutu__86096131;
	private int S3527 = 1;
	private int S3293 = 1;
	private int S3525 = 1;
	private int S3295 = 1;
	private int S3302 = 1;
	private int S3297 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread112034676(int [] tdone, int [] ends){
          if(tdone[42] != 1){
            switch(S3525){
              case 0 : 
              active[42]=0;
              ends[42]=0;
tdone[42]=1;
              break;
              case 1 : 
              switch(S3295){
                case 0 : 
                if(powerReceive_40.getprestatus()){
                                                                        power_thread_42 = powerReceive_40.getpreval() != null ? ((Integer)(powerReceive_40.getpreval())).intValue() : 0;
                  S3295=1;
S3302=0;
if(appliancePowerWaterHeaterR4A14_o.get_preempted()){
                                        tutu__1743123267 = 0;
                                        tutu__1743123267 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3302=1;
active[42]=1;
                    ends[42]=1;
tdone[42]=1;
                    }
                  else {
                    S3297=0;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                            tutu__786738755 = 0;
                                            tutu__786738755 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                            tutu__786738755++;
                                            appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__786738755);
                                            appliancePowerWaterHeaterR4A14_o.set_value(new Integer(power_thread_42));
                      S3297=1;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                ends[42]=2;
                                                ;
                        S3295=0;
active[42]=1;
                        ends[42]=1;
tdone[42]=1;
                        }
                      else {
                        active[42]=1;
                        ends[42]=1;
tdone[42]=1;
                        }
                      }
                    else {
                      active[42]=1;
                      ends[42]=1;
tdone[42]=1;
                      }
                    }
                  }
                else {
                  active[42]=1;
                  ends[42]=1;
tdone[42]=1;
                  }
                break;
                case 1 : 
                switch(S3302){
                  case 0 : 
                  if(appliancePowerWaterHeaterR4A14_o.get_preempted()){
                                        tutu__86096131 = 0;
                                        tutu__86096131 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3302=1;
active[42]=1;
                    ends[42]=1;
tdone[42]=1;
                    }
                  else {
                    switch(S3297){
                      case 0 : 
                      if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                tutu__784430262 = 0;
                                                tutu__784430262 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                                tutu__784430262++;
                                                appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__784430262);
                                                appliancePowerWaterHeaterR4A14_o.set_value(new Integer(power_thread_42));
                        S3297=1;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                    ends[42]=2;
                                                    ;
                          S3295=0;
active[42]=1;
                          ends[42]=1;
tdone[42]=1;
                          }
                        else {
                          active[42]=1;
                          ends[42]=1;
tdone[42]=1;
                          }
                        }
                      else {
                        active[42]=1;
                        ends[42]=1;
tdone[42]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                ends[42]=2;
                                                ;
                        S3295=0;
active[42]=1;
                        ends[42]=1;
tdone[42]=1;
                        }
                      else {
                        active[42]=1;
                        ends[42]=1;
tdone[42]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S3302=1;
S3302=0;
if(appliancePowerWaterHeaterR4A14_o.get_preempted()){
                                        tutu__86096131 = 0;
                                        tutu__86096131 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3302=1;
active[42]=1;
                    ends[42]=1;
tdone[42]=1;
                    }
                  else {
                    S3297=0;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                            tutu__784430262 = 0;
                                            tutu__784430262 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                            tutu__784430262++;
                                            appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__784430262);
                                            appliancePowerWaterHeaterR4A14_o.set_value(new Integer(power_thread_42));
                      S3297=1;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                ends[42]=2;
                                                ;
                        S3295=0;
active[42]=1;
                        ends[42]=1;
tdone[42]=1;
                        }
                      else {
                        active[42]=1;
                        ends[42]=1;
tdone[42]=1;
                        }
                      }
                    else {
                      active[42]=1;
                      ends[42]=1;
tdone[42]=1;
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
public void thread102415953(int [] tdone, int [] ends){
          if(tdone[41] != 1){
            switch(S3293){
              case 0 : 
              active[41]=0;
              ends[41]=0;
tdone[41]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Exhaust Fan ON signal received");
                                powerReceive_40.setPresent();
                currsigs.addElement(powerReceive_40);
                powerReceive_40.setValue(new Integer(2000));
                System.out.println("Emitted powerReceive_40");
active[41]=1;
                ends[41]=1;
tdone[41]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Exhaust Fan OFF signal received");
                                    powerReceive_40.setPresent();
                  currsigs.addElement(powerReceive_40);
                  powerReceive_40.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_40");
active[41]=1;
                  ends[41]=1;
tdone[41]=1;
                  }
                else {
                  active[41]=1;
                  ends[41]=1;
tdone[41]=1;
                  }
                }
              break;
              }
            }
          }
public void thread104724447(int [] tdone, int [] ends){
          if(tdone[42] != 1){
            S3525=1;
S3295=0;
active[42]=1;
            ends[42]=1;
tdone[42]=1;
            }
          }
public void thread105878693(int [] tdone, int [] ends){
          if(tdone[41] != 1){
            S3293=1;
if(onSignal.getprestatus()){
                            System.out.println("Exhaust Fan ON signal received");
                            powerReceive_40.setPresent();
              currsigs.addElement(powerReceive_40);
              powerReceive_40.setValue(new Integer(2000));
              System.out.println("Emitted powerReceive_40");
active[41]=1;
              ends[41]=1;
tdone[41]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Exhaust Fan OFF signal received");
                                powerReceive_40.setPresent();
                currsigs.addElement(powerReceive_40);
                powerReceive_40.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_40");
active[41]=1;
                ends[41]=1;
tdone[41]=1;
                }
              else {
                active[41]=1;
                ends[41]=1;
tdone[41]=1;
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
				switch(S3527){
          case 0 : 
          S3527=0;
          break RUN;
                    case 1 : 
          S3527=2;
          powerReceive_40.setClear();
          thread105878693(tdone,ends);
          thread104724447(tdone,ends);
          int biggest102800702 = 0;
          if(ends[41]>=biggest102800702){
            biggest102800702=ends[41];
}
          if(ends[42]>=biggest102800702){
            biggest102800702=ends[42];
}
          if(biggest102800702 == 1){
            active[40]=1;
            ends[40]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_40.setClear();
          thread102415953(tdone,ends);
          thread112034676(tdone,ends);
          int biggest111649927 = 0;
          if(ends[41]>=biggest111649927){
            biggest111649927=ends[41];
}
          if(ends[42]>=biggest111649927){
            biggest111649927=ends[42];
}
          if(biggest111649927 == 1){
            active[40]=1;
            ends[40]=1;
            break RUN;
            }
          //FINXME code
if(biggest111649927 == 0){
            S3527=0;
active[40]=0;
            ends[40]=0;
S3527=0;
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
		powerReceive_40 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[40] != 0){
		int index = 40;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[40]!=0 || suspended[40]!=0 || active[40]!=1);
			else{
				appliancePowerWaterHeaterR4A14_o.update_w_r();
				if(!df){
					appliancePowerWaterHeaterR4A14_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_40.setpreclear();
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
			powerReceive_40.setClear();
			appliancePowerWaterHeaterR4A14_o.sethook();
			if(paused[40]!=0 || suspended[40]!=0 || active[40]!=1);
			else{
				appliancePowerWaterHeaterR4A14_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[40] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
