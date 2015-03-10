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
	private int tutu__65779068;
	private int tutu__1068808956;
	private int tutu__65394319;
	private int tutu__86675620;
	private int S3527 = 1;
	private int S3293 = 1;
	private int S3525 = 1;
	private int S3295 = 1;
	private int S3302 = 1;
	private int S3297 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread191976707(int [] tdone, int [] ends){
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
                                        tutu__1068808956 = 0;
                                        tutu__1068808956 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3302=1;
active[42]=1;
                    ends[42]=1;
tdone[42]=1;
                    }
                  else {
                    S3297=0;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                            tutu__65779068 = 0;
                                            tutu__65779068 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                            tutu__65779068++;
                                            appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__65779068);
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
                                        tutu__86675620 = 0;
                                        tutu__86675620 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3302=1;
active[42]=1;
                    ends[42]=1;
tdone[42]=1;
                    }
                  else {
                    switch(S3297){
                      case 0 : 
                      if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                tutu__65394319 = 0;
                                                tutu__65394319 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                                tutu__65394319++;
                                                appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__65394319);
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
                                        tutu__86675620 = 0;
                                        tutu__86675620 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3302=1;
active[42]=1;
                    ends[42]=1;
tdone[42]=1;
                    }
                  else {
                    S3297=0;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                            tutu__65394319 = 0;
                                            tutu__65394319 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                            tutu__65394319++;
                                            appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__65394319);
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
public void thread190822461(int [] tdone, int [] ends){
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
public void thread188513967(int [] tdone, int [] ends){
          if(tdone[42] != 1){
            S3525=1;
S3295=0;
active[42]=1;
            ends[42]=1;
tdone[42]=1;
            }
          }
public void thread173508760(int [] tdone, int [] ends){
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
          thread173508760(tdone,ends);
          thread188513967(tdone,ends);
          int biggest188898716 = 0;
          if(ends[41]>=biggest188898716){
            biggest188898716=ends[41];
}
          if(ends[42]>=biggest188898716){
            biggest188898716=ends[42];
}
          if(biggest188898716 == 1){
            active[40]=1;
            ends[40]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_40.setClear();
          thread190822461(tdone,ends);
          thread191976707(tdone,ends);
          int biggest193900452 = 0;
          if(ends[41]>=biggest193900452){
            biggest193900452=ends[41];
}
          if(ends[42]>=biggest193900452){
            biggest193900452=ends[42];
}
          if(biggest193900452 == 1){
            active[40]=1;
            ends[40]=1;
            break RUN;
            }
          //FINXME code
if(biggest193900452 == 0){
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
