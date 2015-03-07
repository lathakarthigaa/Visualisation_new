import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import householdApplianceGUI.AppliancesPower;
import householdApplianceGUI.ApplianceGUI;
import javax.swing.JLabel;

public class Aggregation extends ClockDomain{
	public Aggregation(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal date = new Signal();
	public Signal time = new Signal();
	public Signal fridgePowerSignal = new Signal();
	public Signal lightPowerSignal = new Signal();
	public Signal aggregatedPowerSignal = new Signal();
	public input_Channel appliancePowerFridge_in = new input_Channel();
	public input_Channel appliancePowerLight_in = new input_Channel();
	private Signal receivedFridgePowers_7;
	private Signal receivedLightPowers_7;
	private int tutu__2012125621;
	private int tutu__125925539;
	private int tutu__2012510370;
	private int appliancePowerFridgeInt_thread_8;
	private String appliancePowerFridgeString_thread_8;
	private int tutu__1281410115;
	private int tutu__2010586625;
	private int tutu__201045469;
	private int tutu__2011356123;
	private int appliancePowerLightInt_thread_9;
	private String appliancePowerLightString_thread_9;
	private int tutu__2109923683;
	private int fridgePower_thread_10;
	private int lightPower_thread_10;
	private int aggregatedPower_thread_10;
	private String aggregatedPowerString_thread_10;
	private int S618 = 1;
	private int S549 = 1;
	private int S519 = 1;
	private int S509 = 1;
	private int S593 = 1;
	private int S563 = 1;
	private int S553 = 1;
	private int S616 = 1;
	private int S600 = 1;
	private int S596 = 1;
	private int S599 = 1;
	
	private int[] ends = new int[13];
	private int[] tdone = new int[13];
		public void thread2041751286(int [] tdone, int [] ends){
                if(tdone[12] != 1){
                  S599=1;
active[12]=1;
                  ends[12]=1;
tdone[12]=1;
                  }
                }
public void thread2042136035(int [] tdone, int [] ends){
                if(tdone[11] != 1){
                  S596=1;
active[11]=1;
                  ends[11]=1;
tdone[11]=1;
                  }
                }
public void thread2044059780(int [] tdone, int [] ends){
                if(tdone[12] != 1){
                  switch(S599){
                    case 0 : 
                    active[12]=0;
                    ends[12]=0;
tdone[12]=1;
                    break;
                    case 1 : 
                    if(receivedLightPowers_7.getprestatus()){
                      S599=0;
active[12]=0;
                      ends[12]=0;
tdone[12]=1;
                      }
                    else {
                      active[12]=1;
                      ends[12]=1;
tdone[12]=1;
                      }
                    break;
                    }
                  }
                }
public void thread2044444528(int [] tdone, int [] ends){
                if(tdone[11] != 1){
                  switch(S596){
                    case 0 : 
                    active[11]=0;
                    ends[11]=0;
tdone[11]=1;
                    break;
                    case 1 : 
                    if(receivedFridgePowers_7.getprestatus()){
                      S596=0;
active[11]=0;
                      ends[11]=0;
tdone[11]=1;
                      }
                    else {
                      active[11]=1;
                      ends[11]=1;
tdone[11]=1;
                      }
                    break;
                    }
                  }
                }
public void thread2046368273(int [] tdone, int [] ends){
          if(tdone[10] != 1){
            switch(S616){
              case 0 : 
              active[10]=0;
              ends[10]=0;
tdone[10]=1;
              break;
              case 1 : 
              switch(S600){
                case 0 : 
                thread2044444528(tdone,ends);
                thread2044059780(tdone,ends);
                int biggest2045214026 = 0;
                if(ends[11]>=biggest2045214026){
                  biggest2045214026=ends[11];
}
                if(ends[12]>=biggest2045214026){
                  biggest2045214026=ends[12];
}
                if(biggest2045214026 == 1){
                  active[10]=1;
                  ends[10]=1;
tdone[10]=1;
                  }
                //FINXME code
if(biggest2045214026 == 0){
                                    fridgePower_thread_10 = (Integer)receivedFridgePowers_7.getpreval();
                                    lightPower_thread_10 = (Integer)receivedLightPowers_7.getpreval();
                                    aggregatedPower_thread_10 = fridgePower_thread_10 + lightPower_thread_10;
                                    aggregatedPowerString_thread_10 = "" + aggregatedPower_thread_10;
                                    aggregatedPowerSignal.setPresent();
                  currsigs.addElement(aggregatedPowerSignal);
                  aggregatedPowerSignal.setValue(aggregatedPowerString_thread_10);
                  System.out.println("Emitted aggregatedPowerSignal");
                  System.out.println("Emitted aggregated power:" + aggregatedPower_thread_10);
                  S600=1;
active[10]=1;
                  ends[10]=1;
tdone[10]=1;
                  }
                break;
                case 1 : 
                S600=1;
S600=0;
thread2042136035(tdone,ends);
                thread2041751286(tdone,ends);
                int biggest2126011295 = 0;
                if(ends[11]>=biggest2126011295){
                  biggest2126011295=ends[11];
}
                if(ends[12]>=biggest2126011295){
                  biggest2126011295=ends[12];
}
                if(biggest2126011295 == 1){
                  active[10]=1;
                  ends[10]=1;
tdone[10]=1;
                  }
                break;
                }
              break;
              }
            }
          }
public void thread2049061515(int [] tdone, int [] ends){
          if(tdone[9] != 1){
            switch(S593){
              case 0 : 
              active[9]=0;
              ends[9]=0;
tdone[9]=1;
              break;
              case 1 : 
              switch(S563){
                case 0 : 
                switch(S553){
                  case 0 : 
                  if(appliancePowerLight_in.get_preempted()){
                                        tutu__201045469 = 0;
                                        tutu__201045469 = appliancePowerLight_in.get_preempted() ? appliancePowerLight_in.refresh() : 0;
                    S553=1;
active[9]=1;
                    ends[9]=1;
tdone[9]=1;
                    }
                  else {
                    if(appliancePowerLight_in.get_r_s() > appliancePowerLight_in.get_r_r()){
                                            tutu__2010586625 = 0;
                                            tutu__2010586625 = appliancePowerLight_in.get_r_r();
                                            tutu__2010586625++;
                                            appliancePowerLight_in.set_r_r(tutu__2010586625);
                                            appliancePowerLight_in.get_val();
                                            ends[9]=2;
                                            ;
                                            appliancePowerLightInt_thread_9 = (Integer)appliancePowerLight_in.get_value();
                                            System.out.println("Light's power:" + appliancePowerLightInt_thread_9);
                                            appliancePowerLightString_thread_9 = "" + appliancePowerLightInt_thread_9;
                                            lightPowerSignal.setPresent();
                      currsigs.addElement(lightPowerSignal);
                      lightPowerSignal.setValue(appliancePowerLightString_thread_9);
                      System.out.println("Emitted lightPowerSignal");
                      receivedLightPowers_7.setPresent();
                      currsigs.addElement(receivedLightPowers_7);
                      receivedLightPowers_7.setValue(new Integer(appliancePowerLightInt_thread_9));
                      System.out.println("Emitted receivedLightPowers_7");
S563=1;
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
                  break;
                  case 1 : 
                  S553=1;
S553=0;
if(appliancePowerLight_in.get_preempted()){
                                        tutu__201045469 = 0;
                                        tutu__201045469 = appliancePowerLight_in.get_preempted() ? appliancePowerLight_in.refresh() : 0;
                    S553=1;
active[9]=1;
                    ends[9]=1;
tdone[9]=1;
                    }
                  else {
                    if(appliancePowerLight_in.get_r_s() > appliancePowerLight_in.get_r_r()){
                                            tutu__2010586625 = 0;
                                            tutu__2010586625 = appliancePowerLight_in.get_r_r();
                                            tutu__2010586625++;
                                            appliancePowerLight_in.set_r_r(tutu__2010586625);
                                            appliancePowerLight_in.get_val();
                                            ends[9]=2;
                                            ;
                                            appliancePowerLightInt_thread_9 = (Integer)appliancePowerLight_in.get_value();
                                            System.out.println("Light's power:" + appliancePowerLightInt_thread_9);
                                            appliancePowerLightString_thread_9 = "" + appliancePowerLightInt_thread_9;
                                            lightPowerSignal.setPresent();
                      currsigs.addElement(lightPowerSignal);
                      lightPowerSignal.setValue(appliancePowerLightString_thread_9);
                      System.out.println("Emitted lightPowerSignal");
                      receivedLightPowers_7.setPresent();
                      currsigs.addElement(receivedLightPowers_7);
                      receivedLightPowers_7.setValue(new Integer(appliancePowerLightInt_thread_9));
                      System.out.println("Emitted receivedLightPowers_7");
S563=1;
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
                  break;
                  }
                break;
                case 1 : 
                S563=1;
S563=0;
S553=0;
if(appliancePowerLight_in.get_preempted()){
                                    tutu__2109923683 = 0;
                                    tutu__2109923683 = appliancePowerLight_in.get_preempted() ? appliancePowerLight_in.refresh() : 0;
                  S553=1;
active[9]=1;
                  ends[9]=1;
tdone[9]=1;
                  }
                else {
                  if(appliancePowerLight_in.get_r_s() > appliancePowerLight_in.get_r_r()){
                                        tutu__2011356123 = 0;
                                        tutu__2011356123 = appliancePowerLight_in.get_r_r();
                                        tutu__2011356123++;
                                        appliancePowerLight_in.set_r_r(tutu__2011356123);
                                        appliancePowerLight_in.get_val();
                                        ends[9]=2;
                                        ;
                                        appliancePowerLightInt_thread_9 = (Integer)appliancePowerLight_in.get_value();
                                        System.out.println("Light's power:" + appliancePowerLightInt_thread_9);
                                        appliancePowerLightString_thread_9 = "" + appliancePowerLightInt_thread_9;
                                        lightPowerSignal.setPresent();
                    currsigs.addElement(lightPowerSignal);
                    lightPowerSignal.setValue(appliancePowerLightString_thread_9);
                    System.out.println("Emitted lightPowerSignal");
                    receivedLightPowers_7.setPresent();
                    currsigs.addElement(receivedLightPowers_7);
                    receivedLightPowers_7.setValue(new Integer(appliancePowerLightInt_thread_9));
                    System.out.println("Emitted receivedLightPowers_7");
S563=1;
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
                break;
                }
              break;
              }
            }
          }
public void thread2078302432(int [] tdone, int [] ends){
          if(tdone[8] != 1){
            switch(S549){
              case 0 : 
              active[8]=0;
              ends[8]=0;
tdone[8]=1;
              break;
              case 1 : 
              switch(S519){
                case 0 : 
                switch(S509){
                  case 0 : 
                  if(appliancePowerFridge_in.get_preempted()){
                                        tutu__125925539 = 0;
                                        tutu__125925539 = appliancePowerFridge_in.get_preempted() ? appliancePowerFridge_in.refresh() : 0;
                    S509=1;
active[8]=1;
                    ends[8]=1;
tdone[8]=1;
                    }
                  else {
                    if(appliancePowerFridge_in.get_r_s() > appliancePowerFridge_in.get_r_r()){
                                            tutu__2012125621 = 0;
                                            tutu__2012125621 = appliancePowerFridge_in.get_r_r();
                                            tutu__2012125621++;
                                            appliancePowerFridge_in.set_r_r(tutu__2012125621);
                                            appliancePowerFridge_in.get_val();
                                            ends[8]=2;
                                            ;
                                            appliancePowerFridgeInt_thread_8 = (Integer)appliancePowerFridge_in.get_value();
                                            System.out.println("Fridge's power:" + appliancePowerFridgeInt_thread_8);
                                            appliancePowerFridgeString_thread_8 = "" + appliancePowerFridgeInt_thread_8;
                                            fridgePowerSignal.setPresent();
                      currsigs.addElement(fridgePowerSignal);
                      fridgePowerSignal.setValue(appliancePowerFridgeString_thread_8);
                      System.out.println("Emitted fridgePowerSignal");
                      receivedFridgePowers_7.setPresent();
                      currsigs.addElement(receivedFridgePowers_7);
                      receivedFridgePowers_7.setValue(new Integer(appliancePowerFridgeInt_thread_8));
                      System.out.println("Emitted receivedFridgePowers_7");
S519=1;
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
                  case 1 : 
                  S509=1;
S509=0;
if(appliancePowerFridge_in.get_preempted()){
                                        tutu__125925539 = 0;
                                        tutu__125925539 = appliancePowerFridge_in.get_preempted() ? appliancePowerFridge_in.refresh() : 0;
                    S509=1;
active[8]=1;
                    ends[8]=1;
tdone[8]=1;
                    }
                  else {
                    if(appliancePowerFridge_in.get_r_s() > appliancePowerFridge_in.get_r_r()){
                                            tutu__2012125621 = 0;
                                            tutu__2012125621 = appliancePowerFridge_in.get_r_r();
                                            tutu__2012125621++;
                                            appliancePowerFridge_in.set_r_r(tutu__2012125621);
                                            appliancePowerFridge_in.get_val();
                                            ends[8]=2;
                                            ;
                                            appliancePowerFridgeInt_thread_8 = (Integer)appliancePowerFridge_in.get_value();
                                            System.out.println("Fridge's power:" + appliancePowerFridgeInt_thread_8);
                                            appliancePowerFridgeString_thread_8 = "" + appliancePowerFridgeInt_thread_8;
                                            fridgePowerSignal.setPresent();
                      currsigs.addElement(fridgePowerSignal);
                      fridgePowerSignal.setValue(appliancePowerFridgeString_thread_8);
                      System.out.println("Emitted fridgePowerSignal");
                      receivedFridgePowers_7.setPresent();
                      currsigs.addElement(receivedFridgePowers_7);
                      receivedFridgePowers_7.setValue(new Integer(appliancePowerFridgeInt_thread_8));
                      System.out.println("Emitted receivedFridgePowers_7");
S519=1;
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
                break;
                case 1 : 
                S519=1;
S519=0;
S509=0;
if(appliancePowerFridge_in.get_preempted()){
                                    tutu__1281410115 = 0;
                                    tutu__1281410115 = appliancePowerFridge_in.get_preempted() ? appliancePowerFridge_in.refresh() : 0;
                  S509=1;
active[8]=1;
                  ends[8]=1;
tdone[8]=1;
                  }
                else {
                  if(appliancePowerFridge_in.get_r_s() > appliancePowerFridge_in.get_r_r()){
                                        tutu__2012510370 = 0;
                                        tutu__2012510370 = appliancePowerFridge_in.get_r_r();
                                        tutu__2012510370++;
                                        appliancePowerFridge_in.set_r_r(tutu__2012510370);
                                        appliancePowerFridge_in.get_val();
                                        ends[8]=2;
                                        ;
                                        appliancePowerFridgeInt_thread_8 = (Integer)appliancePowerFridge_in.get_value();
                                        System.out.println("Fridge's power:" + appliancePowerFridgeInt_thread_8);
                                        appliancePowerFridgeString_thread_8 = "" + appliancePowerFridgeInt_thread_8;
                                        fridgePowerSignal.setPresent();
                    currsigs.addElement(fridgePowerSignal);
                    fridgePowerSignal.setValue(appliancePowerFridgeString_thread_8);
                    System.out.println("Emitted fridgePowerSignal");
                    receivedFridgePowers_7.setPresent();
                    currsigs.addElement(receivedFridgePowers_7);
                    receivedFridgePowers_7.setValue(new Integer(appliancePowerFridgeInt_thread_8));
                    System.out.println("Emitted receivedFridgePowers_7");
S519=1;
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
              break;
              }
            }
          }
public void thread2079456678(int [] tdone, int [] ends){
            if(tdone[12] != 1){
              S599=1;
active[12]=1;
              ends[12]=1;
tdone[12]=1;
              }
            }
public void thread2079841427(int [] tdone, int [] ends){
            if(tdone[11] != 1){
              S596=1;
active[11]=1;
              ends[11]=1;
tdone[11]=1;
              }
            }
public void thread2081765172(int [] tdone, int [] ends){
          if(tdone[10] != 1){
            S616=1;
S600=0;
thread2079841427(tdone,ends);
            thread2079456678(tdone,ends);
            int biggest2080610925 = 0;
            if(ends[11]>=biggest2080610925){
              biggest2080610925=ends[11];
}
            if(ends[12]>=biggest2080610925){
              biggest2080610925=ends[12];
}
            if(biggest2080610925 == 1){
              active[10]=1;
              ends[10]=1;
tdone[10]=1;
              }
            }
          }
public void thread2073685445(int [] tdone, int [] ends){
          if(tdone[9] != 1){
            S593=1;
S563=0;
S553=0;
if(appliancePowerLight_in.get_preempted()){
                            tutu__201045469 = 0;
                            tutu__201045469 = appliancePowerLight_in.get_preempted() ? appliancePowerLight_in.refresh() : 0;
              S553=1;
active[9]=1;
              ends[9]=1;
tdone[9]=1;
              }
            else {
              if(appliancePowerLight_in.get_r_s() > appliancePowerLight_in.get_r_r()){
                                tutu__2010586625 = 0;
                                tutu__2010586625 = appliancePowerLight_in.get_r_r();
                                tutu__2010586625++;
                                appliancePowerLight_in.set_r_r(tutu__2010586625);
                                appliancePowerLight_in.get_val();
                                ends[9]=2;
                                ;
                                appliancePowerLightInt_thread_9 = (Integer)appliancePowerLight_in.get_value();
                                System.out.println("Light's power:" + appliancePowerLightInt_thread_9);
                                appliancePowerLightString_thread_9 = "" + appliancePowerLightInt_thread_9;
                                lightPowerSignal.setPresent();
                currsigs.addElement(lightPowerSignal);
                lightPowerSignal.setValue(appliancePowerLightString_thread_9);
                System.out.println("Emitted lightPowerSignal");
                receivedLightPowers_7.setPresent();
                currsigs.addElement(receivedLightPowers_7);
                receivedLightPowers_7.setValue(new Integer(appliancePowerLightInt_thread_9));
                System.out.println("Emitted receivedLightPowers_7");
S563=1;
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
            }
          }
public void thread1993272925(int [] tdone, int [] ends){
          if(tdone[8] != 1){
            S549=1;
S519=0;
S509=0;
if(appliancePowerFridge_in.get_preempted()){
                            tutu__125925539 = 0;
                            tutu__125925539 = appliancePowerFridge_in.get_preempted() ? appliancePowerFridge_in.refresh() : 0;
              S509=1;
active[8]=1;
              ends[8]=1;
tdone[8]=1;
              }
            else {
              if(appliancePowerFridge_in.get_r_s() > appliancePowerFridge_in.get_r_r()){
                                tutu__2012125621 = 0;
                                tutu__2012125621 = appliancePowerFridge_in.get_r_r();
                                tutu__2012125621++;
                                appliancePowerFridge_in.set_r_r(tutu__2012125621);
                                appliancePowerFridge_in.get_val();
                                ends[8]=2;
                                ;
                                appliancePowerFridgeInt_thread_8 = (Integer)appliancePowerFridge_in.get_value();
                                System.out.println("Fridge's power:" + appliancePowerFridgeInt_thread_8);
                                appliancePowerFridgeString_thread_8 = "" + appliancePowerFridgeInt_thread_8;
                                fridgePowerSignal.setPresent();
                currsigs.addElement(fridgePowerSignal);
                fridgePowerSignal.setValue(appliancePowerFridgeString_thread_8);
                System.out.println("Emitted fridgePowerSignal");
                receivedFridgePowers_7.setPresent();
                currsigs.addElement(receivedFridgePowers_7);
                receivedFridgePowers_7.setValue(new Integer(appliancePowerFridgeInt_thread_8));
                System.out.println("Emitted receivedFridgePowers_7");
S519=1;
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
				switch(S618){
          case 0 : 
          S618=0;
          break RUN;
                    case 1 : 
          S618=2;
          receivedFridgePowers_7.setClear();
                    receivedLightPowers_7.setClear();
          thread1993272925(tdone,ends);
          thread2073685445(tdone,ends);
          thread2081765172(tdone,ends);
          int biggest2080226176 = 0;
          if(ends[8]>=biggest2080226176){
            biggest2080226176=ends[8];
}
          if(ends[9]>=biggest2080226176){
            biggest2080226176=ends[9];
}
          if(ends[10]>=biggest2080226176){
            biggest2080226176=ends[10];
}
          if(biggest2080226176 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
            }
                    case 2 : 
                    receivedFridgePowers_7.setClear();
                    receivedLightPowers_7.setClear();
          thread2078302432(tdone,ends);
          thread2049061515(tdone,ends);
          thread2046368273(tdone,ends);
          int biggest2125626546 = 0;
          if(ends[8]>=biggest2125626546){
            biggest2125626546=ends[8];
}
          if(ends[9]>=biggest2125626546){
            biggest2125626546=ends[9];
}
          if(ends[10]>=biggest2125626546){
            biggest2125626546=ends[10];
}
          if(biggest2125626546 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
            }
          //FINXME code
if(biggest2125626546 == 0){
            S618=0;
active[7]=0;
            ends[7]=0;
S618=0;
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
		receivedFridgePowers_7 = new Signal();
		receivedLightPowers_7 = new Signal();
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
				appliancePowerFridge_in.update_r_s();
				appliancePowerLight_in.update_r_s();
				if(!df){
					appliancePowerFridge_in.gethook();
					appliancePowerLight_in.gethook();
					df = true;
				}
				runClockDomain();
			}
			date.setpreclear();
			time.setpreclear();
			fridgePowerSignal.setpreclear();
			lightPowerSignal.setpreclear();
			aggregatedPowerSignal.setpreclear();
			receivedFridgePowers_7.setpreclear();
			receivedLightPowers_7.setpreclear();
			int dummyint = 0;
			for(int qw=0;qw<currsigs.size();++qw){
				dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
				((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
			}
			currsigs.removeAllElements();
			date.sethook();
			date.setClear();
			time.sethook();
			time.setClear();
			fridgePowerSignal.sethook();
			fridgePowerSignal.setClear();
			lightPowerSignal.sethook();
			lightPowerSignal.setClear();
			aggregatedPowerSignal.sethook();
			aggregatedPowerSignal.setClear();
			receivedFridgePowers_7.setClear();
			receivedLightPowers_7.setClear();
			appliancePowerFridge_in.sethook();
			appliancePowerLight_in.sethook();
			if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
			else{
				appliancePowerFridge_in.gethook();
				appliancePowerLight_in.gethook();
			}
			if(active[7] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
