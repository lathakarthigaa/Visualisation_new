import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
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
	public Signal fridgeR1A1PowerSignal = new Signal();
	public Signal lightR3A10PowerSignal = new Signal();
	public Signal dishwasherR1A2PowerSignal = new Signal();
	public Signal aggregatedPowerSignal = new Signal();
	public input_Channel appliancePowerFridgeR1A1_in = new input_Channel();
	public input_Channel appliancePowerLightR3A10_in = new input_Channel();
	public input_Channel appliancePowerDishwasherR1A2_in = new input_Channel();
	private Signal receivedFridgeR1A1Powers_10;
	private Signal receivedLightR3A10Powers_10;
	private Signal receivedDishwasherR1A2Powers_10;
	private int tutu__589213525;
	private int tutu__376421855;
	private int tutu__591522018;
	private int appliancePowerFridgeR1A1Int_thread_11;
	private String appliancePowerFridgeR1A1String_thread_11;
	private int tutu__2033448991;
	private int tutu__590367772;
	private int tutu__1204935423;
	private int tutu__582288045;
	private int appliancePowerLightR3A10Int_thread_12;
	private String appliancePowerLightR3A10String_thread_12;
	private int tutu__299692258;
	private int tutu__581133798;
	private int tutu__1128205826;
	private int tutu__583442291;
	private int appliancePowerDishwasherR1A2Int_thread_13;
	private String appliancePowerDishwasherR1A2String_thread_13;
	private int tutu__528821311;
	private int fridgeR1A1Power_thread_14;
	private int lightR3A10Power_thread_14;
	private int dishwasherR1A2Power_thread_14;
	private int aggregatedPower_thread_14;
	private String aggregatedPowerString_thread_14;
	private int S924 = 1;
	private int S802 = 1;
	private int S772 = 1;
	private int S762 = 1;
	private int S846 = 1;
	private int S816 = 1;
	private int S806 = 1;
	private int S890 = 1;
	private int S860 = 1;
	private int S850 = 1;
	private int S922 = 1;
	private int S900 = 1;
	private int S893 = 1;
	private int S896 = 1;
	private int S899 = 1;
	
	private int[] ends = new int[18];
	private int[] tdone = new int[18];
		public void thread833529076(int [] tdone, int [] ends){
                if(tdone[17] != 1){
                  S899=1;
active[17]=1;
                  ends[17]=1;
tdone[17]=1;
                  }
                }
public void thread834683323(int [] tdone, int [] ends){
                if(tdone[16] != 1){
                  S896=1;
active[16]=1;
                  ends[16]=1;
tdone[16]=1;
                  }
                }
public void thread834298574(int [] tdone, int [] ends){
                if(tdone[15] != 1){
                  S893=1;
active[15]=1;
                  ends[15]=1;
tdone[15]=1;
                  }
                }
public void thread817754372(int [] tdone, int [] ends){
                if(tdone[17] != 1){
                  switch(S899){
                    case 0 : 
                    active[17]=0;
                    ends[17]=0;
tdone[17]=1;
                    break;
                    case 1 : 
                    if(receivedDishwasherR1A2Powers_10.getprestatus()){
                      S899=0;
active[17]=0;
                      ends[17]=0;
tdone[17]=1;
                      }
                    else {
                      active[17]=1;
                      ends[17]=1;
tdone[17]=1;
                      }
                    break;
                    }
                  }
                }
public void thread817369623(int [] tdone, int [] ends){
                if(tdone[16] != 1){
                  switch(S896){
                    case 0 : 
                    active[16]=0;
                    ends[16]=0;
tdone[16]=1;
                    break;
                    case 1 : 
                    if(receivedLightR3A10Powers_10.getprestatus()){
                      S896=0;
active[16]=0;
                      ends[16]=0;
tdone[16]=1;
                      }
                    else {
                      active[16]=1;
                      ends[16]=1;
tdone[16]=1;
                      }
                    break;
                    }
                  }
                }
public void thread815445878(int [] tdone, int [] ends){
                if(tdone[15] != 1){
                  switch(S893){
                    case 0 : 
                    active[15]=0;
                    ends[15]=0;
tdone[15]=1;
                    break;
                    case 1 : 
                    if(receivedFridgeR1A1Powers_10.getprestatus()){
                      S893=0;
active[15]=0;
                      ends[15]=0;
tdone[15]=1;
                      }
                    else {
                      active[15]=1;
                      ends[15]=1;
tdone[15]=1;
                      }
                    break;
                    }
                  }
                }
public void thread815061129(int [] tdone, int [] ends){
          if(tdone[14] != 1){
            switch(S922){
              case 0 : 
              active[14]=0;
              ends[14]=0;
tdone[14]=1;
              break;
              case 1 : 
              switch(S900){
                case 0 : 
                thread815445878(tdone,ends);
                thread817369623(tdone,ends);
                thread817754372(tdone,ends);
                int biggest816600125 = 0;
                if(ends[15]>=biggest816600125){
                  biggest816600125=ends[15];
}
                if(ends[16]>=biggest816600125){
                  biggest816600125=ends[16];
}
                if(ends[17]>=biggest816600125){
                  biggest816600125=ends[17];
}
                if(biggest816600125 == 1){
                  active[14]=1;
                  ends[14]=1;
tdone[14]=1;
                  }
                //FINXME code
if(biggest816600125 == 0){
                                    fridgeR1A1Power_thread_14 = (Integer)receivedFridgeR1A1Powers_10.getpreval();
                                    lightR3A10Power_thread_14 = (Integer)receivedLightR3A10Powers_10.getpreval();
                                    dishwasherR1A2Power_thread_14 = (Integer)receivedDishwasherR1A2Powers_10.getpreval();
                                    aggregatedPower_thread_14 = fridgeR1A1Power_thread_14 + lightR3A10Power_thread_14 + dishwasherR1A2Power_thread_14;
                                    aggregatedPowerString_thread_14 = "" + aggregatedPower_thread_14;
                                    aggregatedPowerSignal.setPresent();
                  currsigs.addElement(aggregatedPowerSignal);
                  aggregatedPowerSignal.setValue(aggregatedPowerString_thread_14);
                  System.out.println("Emitted aggregatedPowerSignal");
                  System.out.println("Emitted aggregated power:" + aggregatedPower_thread_14);
                  S900=1;
active[14]=1;
                  ends[14]=1;
tdone[14]=1;
                  }
                break;
                case 1 : 
                S900=1;
S900=0;
thread834298574(tdone,ends);
                thread834683323(tdone,ends);
                thread833529076(tdone,ends);
                int biggest833913825 = 0;
                if(ends[15]>=biggest833913825){
                  biggest833913825=ends[15];
}
                if(ends[16]>=biggest833913825){
                  biggest833913825=ends[16];
}
                if(ends[17]>=biggest833913825){
                  biggest833913825=ends[17];
}
                if(biggest833913825 == 1){
                  active[14]=1;
                  ends[14]=1;
tdone[14]=1;
                  }
                break;
                }
              break;
              }
            }
          }
public void thread793899940(int [] tdone, int [] ends){
          if(tdone[13] != 1){
            switch(S890){
              case 0 : 
              active[13]=0;
              ends[13]=0;
tdone[13]=1;
              break;
              case 1 : 
              switch(S860){
                case 0 : 
                switch(S850){
                  case 0 : 
                  if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                        tutu__1128205826 = 0;
                                        tutu__1128205826 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S850=1;
active[13]=1;
                    ends[13]=1;
tdone[13]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__581133798 = 0;
                                            tutu__581133798 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__581133798++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__581133798);
                                            appliancePowerDishwasherR1A2_in.get_val();
                                            ends[13]=2;
                                            ;
                                            appliancePowerDishwasherR1A2Int_thread_13 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                            System.out.println("Dishwasher's power:" + appliancePowerDishwasherR1A2Int_thread_13);
                                            appliancePowerDishwasherR1A2String_thread_13 = "" + appliancePowerDishwasherR1A2Int_thread_13;
                                            dishwasherR1A2PowerSignal.setPresent();
                      currsigs.addElement(dishwasherR1A2PowerSignal);
                      dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_13);
                      System.out.println("Emitted dishwasherR1A2PowerSignal");
                      receivedDishwasherR1A2Powers_10.setPresent();
                      currsigs.addElement(receivedDishwasherR1A2Powers_10);
                      receivedDishwasherR1A2Powers_10.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_13));
                      System.out.println("Emitted receivedDishwasherR1A2Powers_10");
S860=1;
active[13]=1;
                      ends[13]=1;
tdone[13]=1;
                      }
                    else {
                      active[13]=1;
                      ends[13]=1;
tdone[13]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S850=1;
S850=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                        tutu__1128205826 = 0;
                                        tutu__1128205826 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S850=1;
active[13]=1;
                    ends[13]=1;
tdone[13]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__581133798 = 0;
                                            tutu__581133798 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__581133798++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__581133798);
                                            appliancePowerDishwasherR1A2_in.get_val();
                                            ends[13]=2;
                                            ;
                                            appliancePowerDishwasherR1A2Int_thread_13 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                            System.out.println("Dishwasher's power:" + appliancePowerDishwasherR1A2Int_thread_13);
                                            appliancePowerDishwasherR1A2String_thread_13 = "" + appliancePowerDishwasherR1A2Int_thread_13;
                                            dishwasherR1A2PowerSignal.setPresent();
                      currsigs.addElement(dishwasherR1A2PowerSignal);
                      dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_13);
                      System.out.println("Emitted dishwasherR1A2PowerSignal");
                      receivedDishwasherR1A2Powers_10.setPresent();
                      currsigs.addElement(receivedDishwasherR1A2Powers_10);
                      receivedDishwasherR1A2Powers_10.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_13));
                      System.out.println("Emitted receivedDishwasherR1A2Powers_10");
S860=1;
active[13]=1;
                      ends[13]=1;
tdone[13]=1;
                      }
                    else {
                      active[13]=1;
                      ends[13]=1;
tdone[13]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S860=1;
S860=0;
S850=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                    tutu__528821311 = 0;
                                    tutu__528821311 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                  S850=1;
active[13]=1;
                  ends[13]=1;
tdone[13]=1;
                  }
                else {
                  if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                        tutu__583442291 = 0;
                                        tutu__583442291 = appliancePowerDishwasherR1A2_in.get_r_r();
                                        tutu__583442291++;
                                        appliancePowerDishwasherR1A2_in.set_r_r(tutu__583442291);
                                        appliancePowerDishwasherR1A2_in.get_val();
                                        ends[13]=2;
                                        ;
                                        appliancePowerDishwasherR1A2Int_thread_13 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                        System.out.println("Dishwasher's power:" + appliancePowerDishwasherR1A2Int_thread_13);
                                        appliancePowerDishwasherR1A2String_thread_13 = "" + appliancePowerDishwasherR1A2Int_thread_13;
                                        dishwasherR1A2PowerSignal.setPresent();
                    currsigs.addElement(dishwasherR1A2PowerSignal);
                    dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_13);
                    System.out.println("Emitted dishwasherR1A2PowerSignal");
                    receivedDishwasherR1A2Powers_10.setPresent();
                    currsigs.addElement(receivedDishwasherR1A2Powers_10);
                    receivedDishwasherR1A2Powers_10.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_13));
                    System.out.println("Emitted receivedDishwasherR1A2Powers_10");
S860=1;
active[13]=1;
                    ends[13]=1;
tdone[13]=1;
                    }
                  else {
                    active[13]=1;
                    ends[13]=1;
tdone[13]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread491102555(int [] tdone, int [] ends){
          if(tdone[12] != 1){
            switch(S846){
              case 0 : 
              active[12]=0;
              ends[12]=0;
tdone[12]=1;
              break;
              case 1 : 
              switch(S816){
                case 0 : 
                switch(S806){
                  case 0 : 
                  if(appliancePowerLightR3A10_in.get_preempted()){
                                        tutu__1204935423 = 0;
                                        tutu__1204935423 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S806=1;
active[12]=1;
                    ends[12]=1;
tdone[12]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__590367772 = 0;
                                            tutu__590367772 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__590367772++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__590367772);
                                            appliancePowerLightR3A10_in.get_val();
                                            ends[12]=2;
                                            ;
                                            appliancePowerLightR3A10Int_thread_12 = (Integer)appliancePowerLightR3A10_in.get_value();
                                            System.out.println("Light's power:" + appliancePowerLightR3A10Int_thread_12);
                                            appliancePowerLightR3A10String_thread_12 = "" + appliancePowerLightR3A10Int_thread_12;
                                            lightR3A10PowerSignal.setPresent();
                      currsigs.addElement(lightR3A10PowerSignal);
                      lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_12);
                      System.out.println("Emitted lightR3A10PowerSignal");
                      receivedLightR3A10Powers_10.setPresent();
                      currsigs.addElement(receivedLightR3A10Powers_10);
                      receivedLightR3A10Powers_10.setValue(new Integer(appliancePowerLightR3A10Int_thread_12));
                      System.out.println("Emitted receivedLightR3A10Powers_10");
S816=1;
active[12]=1;
                      ends[12]=1;
tdone[12]=1;
                      }
                    else {
                      active[12]=1;
                      ends[12]=1;
tdone[12]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S806=1;
S806=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                                        tutu__1204935423 = 0;
                                        tutu__1204935423 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S806=1;
active[12]=1;
                    ends[12]=1;
tdone[12]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__590367772 = 0;
                                            tutu__590367772 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__590367772++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__590367772);
                                            appliancePowerLightR3A10_in.get_val();
                                            ends[12]=2;
                                            ;
                                            appliancePowerLightR3A10Int_thread_12 = (Integer)appliancePowerLightR3A10_in.get_value();
                                            System.out.println("Light's power:" + appliancePowerLightR3A10Int_thread_12);
                                            appliancePowerLightR3A10String_thread_12 = "" + appliancePowerLightR3A10Int_thread_12;
                                            lightR3A10PowerSignal.setPresent();
                      currsigs.addElement(lightR3A10PowerSignal);
                      lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_12);
                      System.out.println("Emitted lightR3A10PowerSignal");
                      receivedLightR3A10Powers_10.setPresent();
                      currsigs.addElement(receivedLightR3A10Powers_10);
                      receivedLightR3A10Powers_10.setValue(new Integer(appliancePowerLightR3A10Int_thread_12));
                      System.out.println("Emitted receivedLightR3A10Powers_10");
S816=1;
active[12]=1;
                      ends[12]=1;
tdone[12]=1;
                      }
                    else {
                      active[12]=1;
                      ends[12]=1;
tdone[12]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S816=1;
S816=0;
S806=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                                    tutu__299692258 = 0;
                                    tutu__299692258 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                  S806=1;
active[12]=1;
                  ends[12]=1;
tdone[12]=1;
                  }
                else {
                  if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                        tutu__582288045 = 0;
                                        tutu__582288045 = appliancePowerLightR3A10_in.get_r_r();
                                        tutu__582288045++;
                                        appliancePowerLightR3A10_in.set_r_r(tutu__582288045);
                                        appliancePowerLightR3A10_in.get_val();
                                        ends[12]=2;
                                        ;
                                        appliancePowerLightR3A10Int_thread_12 = (Integer)appliancePowerLightR3A10_in.get_value();
                                        System.out.println("Light's power:" + appliancePowerLightR3A10Int_thread_12);
                                        appliancePowerLightR3A10String_thread_12 = "" + appliancePowerLightR3A10Int_thread_12;
                                        lightR3A10PowerSignal.setPresent();
                    currsigs.addElement(lightR3A10PowerSignal);
                    lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_12);
                    System.out.println("Emitted lightR3A10PowerSignal");
                    receivedLightR3A10Powers_10.setPresent();
                    currsigs.addElement(receivedLightR3A10Powers_10);
                    receivedLightR3A10Powers_10.setValue(new Integer(appliancePowerLightR3A10Int_thread_12));
                    System.out.println("Emitted receivedLightR3A10Powers_10");
S816=1;
active[12]=1;
                    ends[12]=1;
tdone[12]=1;
                    }
                  else {
                    active[12]=1;
                    ends[12]=1;
tdone[12]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread469941366(int [] tdone, int [] ends){
          if(tdone[11] != 1){
            switch(S802){
              case 0 : 
              active[11]=0;
              ends[11]=0;
tdone[11]=1;
              break;
              case 1 : 
              switch(S772){
                case 0 : 
                switch(S762){
                  case 0 : 
                  if(appliancePowerFridgeR1A1_in.get_preempted()){
                                        tutu__376421855 = 0;
                                        tutu__376421855 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S762=1;
active[11]=1;
                    ends[11]=1;
tdone[11]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__589213525 = 0;
                                            tutu__589213525 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__589213525++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__589213525);
                                            appliancePowerFridgeR1A1_in.get_val();
                                            ends[11]=2;
                                            ;
                                            appliancePowerFridgeR1A1Int_thread_11 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                            System.out.println("Fridge's power:" + appliancePowerFridgeR1A1Int_thread_11);
                                            appliancePowerFridgeR1A1String_thread_11 = "" + appliancePowerFridgeR1A1Int_thread_11;
                                            fridgeR1A1PowerSignal.setPresent();
                      currsigs.addElement(fridgeR1A1PowerSignal);
                      fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_11);
                      System.out.println("Emitted fridgeR1A1PowerSignal");
                      receivedFridgeR1A1Powers_10.setPresent();
                      currsigs.addElement(receivedFridgeR1A1Powers_10);
                      receivedFridgeR1A1Powers_10.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_11));
                      System.out.println("Emitted receivedFridgeR1A1Powers_10");
S772=1;
active[11]=1;
                      ends[11]=1;
tdone[11]=1;
                      }
                    else {
                      active[11]=1;
                      ends[11]=1;
tdone[11]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S762=1;
S762=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                                        tutu__376421855 = 0;
                                        tutu__376421855 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S762=1;
active[11]=1;
                    ends[11]=1;
tdone[11]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__589213525 = 0;
                                            tutu__589213525 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__589213525++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__589213525);
                                            appliancePowerFridgeR1A1_in.get_val();
                                            ends[11]=2;
                                            ;
                                            appliancePowerFridgeR1A1Int_thread_11 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                            System.out.println("Fridge's power:" + appliancePowerFridgeR1A1Int_thread_11);
                                            appliancePowerFridgeR1A1String_thread_11 = "" + appliancePowerFridgeR1A1Int_thread_11;
                                            fridgeR1A1PowerSignal.setPresent();
                      currsigs.addElement(fridgeR1A1PowerSignal);
                      fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_11);
                      System.out.println("Emitted fridgeR1A1PowerSignal");
                      receivedFridgeR1A1Powers_10.setPresent();
                      currsigs.addElement(receivedFridgeR1A1Powers_10);
                      receivedFridgeR1A1Powers_10.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_11));
                      System.out.println("Emitted receivedFridgeR1A1Powers_10");
S772=1;
active[11]=1;
                      ends[11]=1;
tdone[11]=1;
                      }
                    else {
                      active[11]=1;
                      ends[11]=1;
tdone[11]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S772=1;
S772=0;
S762=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                                    tutu__2033448991 = 0;
                                    tutu__2033448991 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                  S762=1;
active[11]=1;
                  ends[11]=1;
tdone[11]=1;
                  }
                else {
                  if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                        tutu__591522018 = 0;
                                        tutu__591522018 = appliancePowerFridgeR1A1_in.get_r_r();
                                        tutu__591522018++;
                                        appliancePowerFridgeR1A1_in.set_r_r(tutu__591522018);
                                        appliancePowerFridgeR1A1_in.get_val();
                                        ends[11]=2;
                                        ;
                                        appliancePowerFridgeR1A1Int_thread_11 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                        System.out.println("Fridge's power:" + appliancePowerFridgeR1A1Int_thread_11);
                                        appliancePowerFridgeR1A1String_thread_11 = "" + appliancePowerFridgeR1A1Int_thread_11;
                                        fridgeR1A1PowerSignal.setPresent();
                    currsigs.addElement(fridgeR1A1PowerSignal);
                    fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_11);
                    System.out.println("Emitted fridgeR1A1PowerSignal");
                    receivedFridgeR1A1Powers_10.setPresent();
                    currsigs.addElement(receivedFridgeR1A1Powers_10);
                    receivedFridgeR1A1Powers_10.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_11));
                    System.out.println("Emitted receivedFridgeR1A1Powers_10");
S772=1;
active[11]=1;
                    ends[11]=1;
tdone[11]=1;
                    }
                  else {
                    active[11]=1;
                    ends[11]=1;
tdone[11]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread467248124(int [] tdone, int [] ends){
            if(tdone[17] != 1){
              S899=1;
active[17]=1;
              ends[17]=1;
tdone[17]=1;
              }
            }
public void thread468402370(int [] tdone, int [] ends){
            if(tdone[16] != 1){
              S896=1;
active[16]=1;
              ends[16]=1;
tdone[16]=1;
              }
            }
public void thread468017621(int [] tdone, int [] ends){
            if(tdone[15] != 1){
              S893=1;
active[15]=1;
              ends[15]=1;
tdone[15]=1;
              }
            }
public void thread466093877(int [] tdone, int [] ends){
          if(tdone[14] != 1){
            S922=1;
S900=0;
thread468017621(tdone,ends);
            thread468402370(tdone,ends);
            thread467248124(tdone,ends);
            int biggest467632872 = 0;
            if(ends[15]>=biggest467632872){
              biggest467632872=ends[15];
}
            if(ends[16]>=biggest467632872){
              biggest467632872=ends[16];
}
            if(ends[17]>=biggest467632872){
              biggest467632872=ends[17];
}
            if(biggest467632872 == 1){
              active[14]=1;
              ends[14]=1;
tdone[14]=1;
              }
            }
          }
public void thread448010679(int [] tdone, int [] ends){
          if(tdone[13] != 1){
            S890=1;
S860=0;
S850=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                            tutu__1128205826 = 0;
                            tutu__1128205826 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
              S850=1;
active[13]=1;
              ends[13]=1;
tdone[13]=1;
              }
            else {
              if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                tutu__581133798 = 0;
                                tutu__581133798 = appliancePowerDishwasherR1A2_in.get_r_r();
                                tutu__581133798++;
                                appliancePowerDishwasherR1A2_in.set_r_r(tutu__581133798);
                                appliancePowerDishwasherR1A2_in.get_val();
                                ends[13]=2;
                                ;
                                appliancePowerDishwasherR1A2Int_thread_13 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                System.out.println("Dishwasher's power:" + appliancePowerDishwasherR1A2Int_thread_13);
                                appliancePowerDishwasherR1A2String_thread_13 = "" + appliancePowerDishwasherR1A2Int_thread_13;
                                dishwasherR1A2PowerSignal.setPresent();
                currsigs.addElement(dishwasherR1A2PowerSignal);
                dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_13);
                System.out.println("Emitted dishwasherR1A2PowerSignal");
                receivedDishwasherR1A2Powers_10.setPresent();
                currsigs.addElement(receivedDishwasherR1A2Powers_10);
                receivedDishwasherR1A2Powers_10.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_13));
                System.out.println("Emitted receivedDishwasherR1A2Powers_10");
S860=1;
active[13]=1;
                ends[13]=1;
tdone[13]=1;
                }
              else {
                active[13]=1;
                ends[13]=1;
tdone[13]=1;
                }
              }
            }
          }
public void thread453012414(int [] tdone, int [] ends){
          if(tdone[12] != 1){
            S846=1;
S816=0;
S806=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                            tutu__1204935423 = 0;
                            tutu__1204935423 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
              S806=1;
active[12]=1;
              ends[12]=1;
tdone[12]=1;
              }
            else {
              if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                tutu__590367772 = 0;
                                tutu__590367772 = appliancePowerLightR3A10_in.get_r_r();
                                tutu__590367772++;
                                appliancePowerLightR3A10_in.set_r_r(tutu__590367772);
                                appliancePowerLightR3A10_in.get_val();
                                ends[12]=2;
                                ;
                                appliancePowerLightR3A10Int_thread_12 = (Integer)appliancePowerLightR3A10_in.get_value();
                                System.out.println("Light's power:" + appliancePowerLightR3A10Int_thread_12);
                                appliancePowerLightR3A10String_thread_12 = "" + appliancePowerLightR3A10Int_thread_12;
                                lightR3A10PowerSignal.setPresent();
                currsigs.addElement(lightR3A10PowerSignal);
                lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_12);
                System.out.println("Emitted lightR3A10PowerSignal");
                receivedLightR3A10Powers_10.setPresent();
                currsigs.addElement(receivedLightR3A10Powers_10);
                receivedLightR3A10Powers_10.setValue(new Integer(appliancePowerLightR3A10Int_thread_12));
                System.out.println("Emitted receivedLightR3A10Powers_10");
S816=1;
active[12]=1;
                ends[12]=1;
tdone[12]=1;
                }
              else {
                active[12]=1;
                ends[12]=1;
tdone[12]=1;
                }
              }
            }
          }
public void thread541119912(int [] tdone, int [] ends){
          if(tdone[11] != 1){
            S802=1;
S772=0;
S762=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                            tutu__376421855 = 0;
                            tutu__376421855 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
              S762=1;
active[11]=1;
              ends[11]=1;
tdone[11]=1;
              }
            else {
              if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                tutu__589213525 = 0;
                                tutu__589213525 = appliancePowerFridgeR1A1_in.get_r_r();
                                tutu__589213525++;
                                appliancePowerFridgeR1A1_in.set_r_r(tutu__589213525);
                                appliancePowerFridgeR1A1_in.get_val();
                                ends[11]=2;
                                ;
                                appliancePowerFridgeR1A1Int_thread_11 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                System.out.println("Fridge's power:" + appliancePowerFridgeR1A1Int_thread_11);
                                appliancePowerFridgeR1A1String_thread_11 = "" + appliancePowerFridgeR1A1Int_thread_11;
                                fridgeR1A1PowerSignal.setPresent();
                currsigs.addElement(fridgeR1A1PowerSignal);
                fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_11);
                System.out.println("Emitted fridgeR1A1PowerSignal");
                receivedFridgeR1A1Powers_10.setPresent();
                currsigs.addElement(receivedFridgeR1A1Powers_10);
                receivedFridgeR1A1Powers_10.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_11));
                System.out.println("Emitted receivedFridgeR1A1Powers_10");
S772=1;
active[11]=1;
                ends[11]=1;
tdone[11]=1;
                }
              else {
                active[11]=1;
                ends[11]=1;
tdone[11]=1;
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
				switch(S924){
          case 0 : 
          S924=0;
          break RUN;
                    case 1 : 
          S924=2;
          receivedFridgeR1A1Powers_10.setClear();
                    receivedLightR3A10Powers_10.setClear();
                    receivedDishwasherR1A2Powers_10.setClear();
          thread541119912(tdone,ends);
          thread453012414(tdone,ends);
          thread448010679(tdone,ends);
          thread466093877(tdone,ends);
          int biggest469556617 = 0;
          if(ends[11]>=biggest469556617){
            biggest469556617=ends[11];
}
          if(ends[12]>=biggest469556617){
            biggest469556617=ends[12];
}
          if(ends[13]>=biggest469556617){
            biggest469556617=ends[13];
}
          if(ends[14]>=biggest469556617){
            biggest469556617=ends[14];
}
          if(biggest469556617 == 1){
            active[10]=1;
            ends[10]=1;
            break RUN;
            }
                    case 2 : 
                    receivedFridgeR1A1Powers_10.setClear();
                    receivedLightR3A10Powers_10.setClear();
                    receivedDishwasherR1A2Powers_10.setClear();
          thread469941366(tdone,ends);
          thread491102555(tdone,ends);
          thread793899940(tdone,ends);
          thread815061129(tdone,ends);
          int biggest835837570 = 0;
          if(ends[11]>=biggest835837570){
            biggest835837570=ends[11];
}
          if(ends[12]>=biggest835837570){
            biggest835837570=ends[12];
}
          if(ends[13]>=biggest835837570){
            biggest835837570=ends[13];
}
          if(ends[14]>=biggest835837570){
            biggest835837570=ends[14];
}
          if(biggest835837570 == 1){
            active[10]=1;
            ends[10]=1;
            break RUN;
            }
          //FINXME code
if(biggest835837570 == 0){
            S924=0;
active[10]=0;
            ends[10]=0;
S924=0;
            break RUN;
            }
                    }
        			}
		}
	public void init(){
		char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		paused = paused1;
		active = active1;
		suspended = suspended1;
		// Now instantiate all the local signals ONLY
		receivedFridgeR1A1Powers_10 = new Signal();
		receivedLightR3A10Powers_10 = new Signal();
		receivedDishwasherR1A2Powers_10 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[10] != 0){
		int index = 10;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[10]!=0 || suspended[10]!=0 || active[10]!=1);
			else{
				appliancePowerFridgeR1A1_in.update_r_s();
				appliancePowerLightR3A10_in.update_r_s();
				appliancePowerDishwasherR1A2_in.update_r_s();
				if(!df){
					appliancePowerFridgeR1A1_in.gethook();
					appliancePowerLightR3A10_in.gethook();
					appliancePowerDishwasherR1A2_in.gethook();
					df = true;
				}
				runClockDomain();
			}
			date.setpreclear();
			time.setpreclear();
			fridgeR1A1PowerSignal.setpreclear();
			lightR3A10PowerSignal.setpreclear();
			dishwasherR1A2PowerSignal.setpreclear();
			aggregatedPowerSignal.setpreclear();
			receivedFridgeR1A1Powers_10.setpreclear();
			receivedLightR3A10Powers_10.setpreclear();
			receivedDishwasherR1A2Powers_10.setpreclear();
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
			dishwasherR1A2PowerSignal.sethook();
			dishwasherR1A2PowerSignal.setClear();
			aggregatedPowerSignal.sethook();
			aggregatedPowerSignal.setClear();
			receivedFridgeR1A1Powers_10.setClear();
			receivedLightR3A10Powers_10.setClear();
			receivedDishwasherR1A2Powers_10.setClear();
			appliancePowerFridgeR1A1_in.sethook();
			appliancePowerLightR3A10_in.sethook();
			appliancePowerDishwasherR1A2_in.sethook();
			if(paused[10]!=0 || suspended[10]!=0 || active[10]!=1);
			else{
				appliancePowerFridgeR1A1_in.gethook();
				appliancePowerLightR3A10_in.gethook();
				appliancePowerDishwasherR1A2_in.gethook();
			}
			if(active[10] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
