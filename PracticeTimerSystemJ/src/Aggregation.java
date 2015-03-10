import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class Aggregation extends ClockDomain{
	public Aggregation(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal date = new Signal();
	public Signal time = new Signal();
	public Signal fridgeR1A1PowerSignal = new Signal();
	public Signal lightR3A10PowerSignal = new Signal();
	public Signal aggregatedPowerSignal = new Signal();
	public input_Channel appliancePowerFridgeR1A1_in = new input_Channel();
	public input_Channel appliancePowerLightR3A10_in = new input_Channel();
	private Signal receivedFridgeR1A1Powers_7;
	private Signal receivedLightR3A10Powers_7;
	private int tutu__931456364;
	private int tutu__161909670;
	private int tutu__929917369;
	private int appliancePowerFridgeR1A1Int_thread_8;
	private String appliancePowerFridgeR1A1String_thread_8;
	private int tutu__165061338;
	private int tutu__929532620;
	private int tutu__1320545914;
	private int tutu__927224126;
	private int appliancePowerLightR3A10Int_thread_9;
	private String appliancePowerLightR3A10String_thread_9;
	private int tutu__336481222;
	private int fridgeR1A1Power_thread_10;
	private int lightR3A10Power_thread_10;
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
		public void thread637892954(int [] tdone, int [] ends){
                if(tdone[12] != 1){
                  S599=1;
active[12]=1;
                  ends[12]=1;
tdone[12]=1;
                  }
                }
public void thread638277702(int [] tdone, int [] ends){
                if(tdone[11] != 1){
                  S596=1;
active[11]=1;
                  ends[11]=1;
tdone[11]=1;
                  }
                }
public void thread557095685(int [] tdone, int [] ends){
                if(tdone[12] != 1){
                  switch(S599){
                    case 0 : 
                    active[12]=0;
                    ends[12]=0;
tdone[12]=1;
                    break;
                    case 1 : 
                    if(receivedLightR3A10Powers_7.getprestatus()){
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
public void thread557480433(int [] tdone, int [] ends){
                if(tdone[11] != 1){
                  switch(S596){
                    case 0 : 
                    active[11]=0;
                    ends[11]=0;
tdone[11]=1;
                    break;
                    case 1 : 
                    if(receivedFridgeR1A1Powers_7.getprestatus()){
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
public void thread556326187(int [] tdone, int [] ends){
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
                thread557480433(tdone,ends);
                thread557095685(tdone,ends);
                int biggest641355694 = 0;
                if(ends[11]>=biggest641355694){
                  biggest641355694=ends[11];
}
                if(ends[12]>=biggest641355694){
                  biggest641355694=ends[12];
}
                if(biggest641355694 == 1){
                  active[10]=1;
                  ends[10]=1;
tdone[10]=1;
                  }
                //FINXME code
if(biggest641355694 == 0){
                                    fridgeR1A1Power_thread_10 = (Integer)receivedFridgeR1A1Powers_7.getpreval();
                                    lightR3A10Power_thread_10 = (Integer)receivedLightR3A10Powers_7.getpreval();
                                    aggregatedPower_thread_10 = fridgeR1A1Power_thread_10 + lightR3A10Power_thread_10;
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
thread638277702(tdone,ends);
                thread637892954(tdone,ends);
                int biggest639047200 = 0;
                if(ends[11]>=biggest639047200){
                  biggest639047200=ends[11];
}
                if(ends[12]>=biggest639047200){
                  biggest639047200=ends[12];
}
                if(biggest639047200 == 1){
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
public void thread574409385(int [] tdone, int [] ends){
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
                  if(appliancePowerLightR3A10_in.get_preempted()){
                                        tutu__1320545914 = 0;
                                        tutu__1320545914 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S553=1;
active[9]=1;
                    ends[9]=1;
tdone[9]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__929532620 = 0;
                                            tutu__929532620 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__929532620++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__929532620);
                                            appliancePowerLightR3A10_in.get_val();
                                            ends[9]=2;
                                            ;
                                            appliancePowerLightR3A10Int_thread_9 = (Integer)appliancePowerLightR3A10_in.get_value();
                                            System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_9);
                                            appliancePowerLightR3A10String_thread_9 = "" + appliancePowerLightR3A10Int_thread_9;
                                            lightR3A10PowerSignal.setPresent();
                      currsigs.addElement(lightR3A10PowerSignal);
                      lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_9);
                      System.out.println("Emitted lightR3A10PowerSignal");
                      receivedLightR3A10Powers_7.setPresent();
                      currsigs.addElement(receivedLightR3A10Powers_7);
                      receivedLightR3A10Powers_7.setValue(new Integer(appliancePowerLightR3A10Int_thread_9));
                      System.out.println("Emitted receivedLightR3A10Powers_7");
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
if(appliancePowerLightR3A10_in.get_preempted()){
                                        tutu__1320545914 = 0;
                                        tutu__1320545914 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S553=1;
active[9]=1;
                    ends[9]=1;
tdone[9]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__929532620 = 0;
                                            tutu__929532620 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__929532620++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__929532620);
                                            appliancePowerLightR3A10_in.get_val();
                                            ends[9]=2;
                                            ;
                                            appliancePowerLightR3A10Int_thread_9 = (Integer)appliancePowerLightR3A10_in.get_value();
                                            System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_9);
                                            appliancePowerLightR3A10String_thread_9 = "" + appliancePowerLightR3A10Int_thread_9;
                                            lightR3A10PowerSignal.setPresent();
                      currsigs.addElement(lightR3A10PowerSignal);
                      lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_9);
                      System.out.println("Emitted lightR3A10PowerSignal");
                      receivedLightR3A10Powers_7.setPresent();
                      currsigs.addElement(receivedLightR3A10Powers_7);
                      receivedLightR3A10Powers_7.setValue(new Integer(appliancePowerLightR3A10Int_thread_9));
                      System.out.println("Emitted receivedLightR3A10Powers_7");
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
if(appliancePowerLightR3A10_in.get_preempted()){
                                    tutu__336481222 = 0;
                                    tutu__336481222 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                  S553=1;
active[9]=1;
                  ends[9]=1;
tdone[9]=1;
                  }
                else {
                  if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                        tutu__927224126 = 0;
                                        tutu__927224126 = appliancePowerLightR3A10_in.get_r_r();
                                        tutu__927224126++;
                                        appliancePowerLightR3A10_in.set_r_r(tutu__927224126);
                                        appliancePowerLightR3A10_in.get_val();
                                        ends[9]=2;
                                        ;
                                        appliancePowerLightR3A10Int_thread_9 = (Integer)appliancePowerLightR3A10_in.get_value();
                                        System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_9);
                                        appliancePowerLightR3A10String_thread_9 = "" + appliancePowerLightR3A10Int_thread_9;
                                        lightR3A10PowerSignal.setPresent();
                    currsigs.addElement(lightR3A10PowerSignal);
                    lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_9);
                    System.out.println("Emitted lightR3A10PowerSignal");
                    receivedLightR3A10Powers_7.setPresent();
                    currsigs.addElement(receivedLightR3A10Powers_7);
                    receivedLightR3A10Powers_7.setValue(new Integer(appliancePowerLightR3A10Int_thread_9));
                    System.out.println("Emitted receivedLightR3A10Powers_7");
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
public void thread578641623(int [] tdone, int [] ends){
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
                  if(appliancePowerFridgeR1A1_in.get_preempted()){
                                        tutu__161909670 = 0;
                                        tutu__161909670 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S509=1;
active[8]=1;
                    ends[8]=1;
tdone[8]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__931456364 = 0;
                                            tutu__931456364 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__931456364++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__931456364);
                                            appliancePowerFridgeR1A1_in.get_val();
                                            ends[8]=2;
                                            ;
                                            appliancePowerFridgeR1A1Int_thread_8 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                            System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_8);
                                            appliancePowerFridgeR1A1String_thread_8 = "" + appliancePowerFridgeR1A1Int_thread_8;
                                            fridgeR1A1PowerSignal.setPresent();
                      currsigs.addElement(fridgeR1A1PowerSignal);
                      fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_8);
                      System.out.println("Emitted fridgeR1A1PowerSignal");
                      receivedFridgeR1A1Powers_7.setPresent();
                      currsigs.addElement(receivedFridgeR1A1Powers_7);
                      receivedFridgeR1A1Powers_7.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_8));
                      System.out.println("Emitted receivedFridgeR1A1Powers_7");
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
if(appliancePowerFridgeR1A1_in.get_preempted()){
                                        tutu__161909670 = 0;
                                        tutu__161909670 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S509=1;
active[8]=1;
                    ends[8]=1;
tdone[8]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__931456364 = 0;
                                            tutu__931456364 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__931456364++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__931456364);
                                            appliancePowerFridgeR1A1_in.get_val();
                                            ends[8]=2;
                                            ;
                                            appliancePowerFridgeR1A1Int_thread_8 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                            System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_8);
                                            appliancePowerFridgeR1A1String_thread_8 = "" + appliancePowerFridgeR1A1Int_thread_8;
                                            fridgeR1A1PowerSignal.setPresent();
                      currsigs.addElement(fridgeR1A1PowerSignal);
                      fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_8);
                      System.out.println("Emitted fridgeR1A1PowerSignal");
                      receivedFridgeR1A1Powers_7.setPresent();
                      currsigs.addElement(receivedFridgeR1A1Powers_7);
                      receivedFridgeR1A1Powers_7.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_8));
                      System.out.println("Emitted receivedFridgeR1A1Powers_7");
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
if(appliancePowerFridgeR1A1_in.get_preempted()){
                                    tutu__165061338 = 0;
                                    tutu__165061338 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                  S509=1;
active[8]=1;
                  ends[8]=1;
tdone[8]=1;
                  }
                else {
                  if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                        tutu__929917369 = 0;
                                        tutu__929917369 = appliancePowerFridgeR1A1_in.get_r_r();
                                        tutu__929917369++;
                                        appliancePowerFridgeR1A1_in.set_r_r(tutu__929917369);
                                        appliancePowerFridgeR1A1_in.get_val();
                                        ends[8]=2;
                                        ;
                                        appliancePowerFridgeR1A1Int_thread_8 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                        System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_8);
                                        appliancePowerFridgeR1A1String_thread_8 = "" + appliancePowerFridgeR1A1Int_thread_8;
                                        fridgeR1A1PowerSignal.setPresent();
                    currsigs.addElement(fridgeR1A1PowerSignal);
                    fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_8);
                    System.out.println("Emitted fridgeR1A1PowerSignal");
                    receivedFridgeR1A1Powers_7.setPresent();
                    currsigs.addElement(receivedFridgeR1A1Powers_7);
                    receivedFridgeR1A1Powers_7.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_8));
                    System.out.println("Emitted receivedFridgeR1A1Powers_7");
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
public void thread578256874(int [] tdone, int [] ends){
            if(tdone[12] != 1){
              S599=1;
active[12]=1;
              ends[12]=1;
tdone[12]=1;
              }
            }
public void thread580180619(int [] tdone, int [] ends){
            if(tdone[11] != 1){
              S596=1;
active[11]=1;
              ends[11]=1;
tdone[11]=1;
              }
            }
public void thread580565367(int [] tdone, int [] ends){
          if(tdone[10] != 1){
            S616=1;
S600=0;
thread580180619(tdone,ends);
            thread578256874(tdone,ends);
            int biggest577872125 = 0;
            if(ends[11]>=biggest577872125){
              biggest577872125=ends[11];
}
            if(ends[12]>=biggest577872125){
              biggest577872125=ends[12];
}
            if(biggest577872125 == 1){
              active[10]=1;
              ends[10]=1;
tdone[10]=1;
              }
            }
          }
public void thread598648566(int [] tdone, int [] ends){
          if(tdone[9] != 1){
            S593=1;
S563=0;
S553=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                            tutu__1320545914 = 0;
                            tutu__1320545914 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
              S553=1;
active[9]=1;
              ends[9]=1;
tdone[9]=1;
              }
            else {
              if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                tutu__929532620 = 0;
                                tutu__929532620 = appliancePowerLightR3A10_in.get_r_r();
                                tutu__929532620++;
                                appliancePowerLightR3A10_in.set_r_r(tutu__929532620);
                                appliancePowerLightR3A10_in.get_val();
                                ends[9]=2;
                                ;
                                appliancePowerLightR3A10Int_thread_9 = (Integer)appliancePowerLightR3A10_in.get_value();
                                System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_9);
                                appliancePowerLightR3A10String_thread_9 = "" + appliancePowerLightR3A10Int_thread_9;
                                lightR3A10PowerSignal.setPresent();
                currsigs.addElement(lightR3A10PowerSignal);
                lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_9);
                System.out.println("Emitted lightR3A10PowerSignal");
                receivedLightR3A10Powers_7.setPresent();
                currsigs.addElement(receivedLightR3A10Powers_7);
                receivedLightR3A10Powers_7.setValue(new Integer(appliancePowerLightR3A10Int_thread_9));
                System.out.println("Emitted receivedLightR3A10Powers_7");
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
public void thread590568839(int [] tdone, int [] ends){
          if(tdone[8] != 1){
            S549=1;
S519=0;
S509=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                            tutu__161909670 = 0;
                            tutu__161909670 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
              S509=1;
active[8]=1;
              ends[8]=1;
tdone[8]=1;
              }
            else {
              if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                tutu__931456364 = 0;
                                tutu__931456364 = appliancePowerFridgeR1A1_in.get_r_r();
                                tutu__931456364++;
                                appliancePowerFridgeR1A1_in.set_r_r(tutu__931456364);
                                appliancePowerFridgeR1A1_in.get_val();
                                ends[8]=2;
                                ;
                                appliancePowerFridgeR1A1Int_thread_8 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_8);
                                appliancePowerFridgeR1A1String_thread_8 = "" + appliancePowerFridgeR1A1Int_thread_8;
                                fridgeR1A1PowerSignal.setPresent();
                currsigs.addElement(fridgeR1A1PowerSignal);
                fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_8);
                System.out.println("Emitted fridgeR1A1PowerSignal");
                receivedFridgeR1A1Powers_7.setPresent();
                currsigs.addElement(receivedFridgeR1A1Powers_7);
                receivedFridgeR1A1Powers_7.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_8));
                System.out.println("Emitted receivedFridgeR1A1Powers_7");
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
          receivedFridgeR1A1Powers_7.setClear();
                    receivedLightR3A10Powers_7.setClear();
          thread590568839(tdone,ends);
          thread598648566(tdone,ends);
          thread580565367(tdone,ends);
          int biggest579026372 = 0;
          if(ends[8]>=biggest579026372){
            biggest579026372=ends[8];
}
          if(ends[9]>=biggest579026372){
            biggest579026372=ends[9];
}
          if(ends[10]>=biggest579026372){
            biggest579026372=ends[10];
}
          if(biggest579026372 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
            }
                    case 2 : 
                    receivedFridgeR1A1Powers_7.setClear();
                    receivedLightR3A10Powers_7.setClear();
          thread578641623(tdone,ends);
          thread574409385(tdone,ends);
          thread556326187(tdone,ends);
          int biggest638662451 = 0;
          if(ends[8]>=biggest638662451){
            biggest638662451=ends[8];
}
          if(ends[9]>=biggest638662451){
            biggest638662451=ends[9];
}
          if(ends[10]>=biggest638662451){
            biggest638662451=ends[10];
}
          if(biggest638662451 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
            }
          //FINXME code
if(biggest638662451 == 0){
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
		receivedFridgeR1A1Powers_7 = new Signal();
		receivedLightR3A10Powers_7 = new Signal();
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
				appliancePowerFridgeR1A1_in.update_r_s();
				appliancePowerLightR3A10_in.update_r_s();
				if(!df){
					appliancePowerFridgeR1A1_in.gethook();
					appliancePowerLightR3A10_in.gethook();
					df = true;
				}
				runClockDomain();
			}
			date.setpreclear();
			time.setpreclear();
			fridgeR1A1PowerSignal.setpreclear();
			lightR3A10PowerSignal.setpreclear();
			aggregatedPowerSignal.setpreclear();
			receivedFridgeR1A1Powers_7.setpreclear();
			receivedLightR3A10Powers_7.setpreclear();
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
			fridgeR1A1PowerSignal.sethook();
			fridgeR1A1PowerSignal.setClear();
			lightR3A10PowerSignal.sethook();
			lightR3A10PowerSignal.setClear();
			aggregatedPowerSignal.sethook();
			aggregatedPowerSignal.setClear();
			receivedFridgeR1A1Powers_7.setClear();
			receivedLightR3A10Powers_7.setClear();
			appliancePowerFridgeR1A1_in.sethook();
			appliancePowerLightR3A10_in.sethook();
			if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
			else{
				appliancePowerFridgeR1A1_in.gethook();
				appliancePowerLightR3A10_in.gethook();
			}
			if(active[7] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
