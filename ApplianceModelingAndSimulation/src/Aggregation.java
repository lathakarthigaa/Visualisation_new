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
	public Signal dishwasherR1A2PowerSignal = new Signal();
	public Signal dryerR1A3PowerSignal = new Signal();
	public Signal stoveR1A4PowerSignal = new Signal();
	public Signal ovenR1A5PowerSignal = new Signal();
	public Signal TVR2A6PowerSignal = new Signal();
	public Signal powerplugsR2A7PowerSignal = new Signal();
	public Signal heaterR2A8PowerSignal = new Signal();
	public Signal heaterR3A9PowerSignal = new Signal();
	public Signal lightR3A10PowerSignal = new Signal();
	public Signal powerplugsR3A11PowerSignal = new Signal();
	public Signal lightR4A12PowerSignal = new Signal();
	public Signal fanR4A13PowerSignal = new Signal();
	public Signal waterHeaterR4A14PowerSignal = new Signal();
	public Signal aggregatedPowerSignal = new Signal();
	public input_Channel appliancePowerFridgeR1A1_in = new input_Channel();
	public input_Channel appliancePowerDishwasherR1A2_in = new input_Channel();
	public input_Channel appliancePowerDryerR1A3_in = new input_Channel();
	public input_Channel appliancePowerStoveR1A4_in = new input_Channel();
	public input_Channel appliancePowerOvenR1A5_in = new input_Channel();
	public input_Channel appliancePowerTVR2A6_in = new input_Channel();
	public input_Channel appliancePowerPowerPlugsR2A7_in = new input_Channel();
	public input_Channel appliancePowerHeaterR2A8_in = new input_Channel();
	public input_Channel appliancePowerHeaterR3A9_in = new input_Channel();
	public input_Channel appliancePowerLightR3A10_in = new input_Channel();
	public input_Channel appliancePowerPowerPlugsR3A11_in = new input_Channel();
	public input_Channel appliancePowerLightR4A12_in = new input_Channel();
	public input_Channel appliancePowerFanR4A13_in = new input_Channel();
	public input_Channel appliancePowerWaterHeaterR4A14_in = new input_Channel();
	private Signal receivedFridgeR1A1Powers_43;
	private Signal receivedDishwasherR1A2Powers_43;
	private Signal receivedDryerR1A3Powers_43;
	private Signal receivedStoveR1A4Powers_43;
	private Signal receivedOvenR1A5Powers_43;
	private Signal receivedTVR2A6Powers_43;
	private Signal receivedPowerPlugsR2A7Powers_43;
	private Signal receivedHeaterR2A8Powers_43;
	private Signal receivedHeaterR3A9Powers_43;
	private Signal receivedLightR3A10Powers_43;
	private Signal receivedPowerPlugsR3A11Powers_43;
	private Signal receivedLightR4A12Powers_43;
	private Signal receivedFanR4A13Powers_43;
	private Signal receivedWaterHeaterR4A14Powers_43;
	private int tutu__59623086;
	private int tutu__239075076;
	private int tutu__61931579;
	private int appliancePowerFridgeR1A1Int_thread_44;
	private String appliancePowerFridgeR1A1String_thread_44;
	private int tutu__1896102212;
	private int tutu__60777333;
	private int tutu__1067588644;
	private int tutu__63085826;
	private int appliancePowerDishwasherR1A2Int_thread_45;
	private String appliancePowerDishwasherR1A2String_thread_45;
	private int tutu__1570351516;
	private int tutu__63470575;
	private int tutu__1569131204;
	private int tutu__18096192;
	private int appliancePowerDryerR1A3Int_thread_46;
	private String appliancePowerDryerR1A3String_thread_46;
	private int tutu__1718725435;
	private int tutu__19250439;
	private int tutu__890211867;
	private int tutu__16941945;
	private int appliancePowerStoveR1A4Int_thread_47;
	private String appliancePowerStoveR1A4String_thread_47;
	private int tutu__1747728292;
	private int tutu__16557196;
	private int tutu__1391754428;
	private int tutu__17326694;
	private int appliancePowerOvenR1A5Int_thread_48;
	private String appliancePowerOvenR1A5String_thread_48;
	private int tutu__592243716;
	private int tutu__15402950;
	private int tutu__2074699300;
	private int tutu__15787699;
	private int appliancePowerTVR2A6Int_thread_49;
	private String appliancePowerTVR2A6String_thread_49;
	private int tutu__919214724;
	private int tutu__26560668;
	private int tutu__1369582331;
	private int tutu__24252174;
	private int appliancePowerPowerPlugsR2A7Int_thread_50;
	private String appliancePowerPowerPlugsR2A7String_thread_50;
	private int tutu__1268357829;
	private int tutu__25406421;
	private int tutu__2096871397;
	private int tutu__23097928;
	private int appliancePowerHeaterR2A8Int_thread_51;
	private String appliancePowerHeaterR2A8String_thread_51;
	private int tutu__439844261;
	private int tutu__22713179;
	private int tutu__1595328837;
	private int tutu__23482677;
	private int appliancePowerHeaterR3A9Int_thread_52;
	private String appliancePowerHeaterR3A9String_thread_52;
	private int tutu__715640315;
	private int tutu__21558932;
	private int tutu__766815269;
	private int tutu__22328430;
	private int appliancePowerLightR3A10Int_thread_53;
	private String appliancePowerLightR3A10String_thread_53;
	private int tutu__1544153883;
	private int tutu__8477469;
	private int tutu__1398585188;
	private int tutu__6168976;
	private int appliancePowerPowerPlugsR3A11Int_thread_54;
	private String appliancePowerPowerPlugsR3A11String_thread_54;
	private int tutu__258441949;
	private int tutu__5784227;
	private int tutu__897042627;
	private int tutu__6553725;
	private int appliancePowerLightR4A12Int_thread_55;
	private String appliancePowerLightR4A12String_thread_55;
	private int tutu__1413926525;
	private int tutu__4629980;
	private int tutu__68529059;
	private int tutu__5399478;
	private int appliancePowerFanR4A13Int_thread_56;
	private String appliancePowerFanR4A13String_thread_56;
	private int tutu__2052527203;
	private int tutu__5014729;
	private int tutu__1086955517;
	private int tutu__13479205;
	private int appliancePowerWaterHeaterR4A14Int_thread_57;
	private String appliancePowerWaterHeaterR4A14String_thread_57;
	private int tutu__737812412;
	private int fridgeR1A1Power_thread_58;
	private int dishwasherR1A2Power_thread_58;
	private int dryerR1A3Power_thread_58;
	private int stoveR1A4Power_thread_58;
	private int ovenR1A5Power_thread_58;
	private int TVR2A6_thread_58;
	private int powerplugsR2A7Power_thread_58;
	private int heaterR2A8Power_thread_58;
	private int heaterR3A9Power_thread_58;
	private int lightR3A10Power_thread_58;
	private int powerplugsR3A11Power_thread_58;
	private int lightR4A12Power_thread_58;
	private int fanR4A13Power_thread_58;
	private int waterHeaterR4A14Power_thread_58;
	private int aggregatedPower_thread_58;
	private String aggregatedPowerString_thread_58;
	private int S4290 = 1;
	private int S3585 = 1;
	private int S3555 = 1;
	private int S3545 = 1;
	private int S3629 = 1;
	private int S3599 = 1;
	private int S3589 = 1;
	private int S3673 = 1;
	private int S3643 = 1;
	private int S3633 = 1;
	private int S3717 = 1;
	private int S3687 = 1;
	private int S3677 = 1;
	private int S3761 = 1;
	private int S3731 = 1;
	private int S3721 = 1;
	private int S3805 = 1;
	private int S3775 = 1;
	private int S3765 = 1;
	private int S3849 = 1;
	private int S3819 = 1;
	private int S3809 = 1;
	private int S3893 = 1;
	private int S3863 = 1;
	private int S3853 = 1;
	private int S3937 = 1;
	private int S3907 = 1;
	private int S3897 = 1;
	private int S3981 = 1;
	private int S3951 = 1;
	private int S3941 = 1;
	private int S4025 = 1;
	private int S3995 = 1;
	private int S3985 = 1;
	private int S4069 = 1;
	private int S4039 = 1;
	private int S4029 = 1;
	private int S4113 = 1;
	private int S4083 = 1;
	private int S4073 = 1;
	private int S4157 = 1;
	private int S4127 = 1;
	private int S4117 = 1;
	private int S4288 = 1;
	private int S4200 = 1;
	private int S4160 = 1;
	private int S4163 = 1;
	private int S4166 = 1;
	private int S4169 = 1;
	private int S4172 = 1;
	private int S4175 = 1;
	private int S4178 = 1;
	private int S4181 = 1;
	private int S4184 = 1;
	private int S4187 = 1;
	private int S4190 = 1;
	private int S4193 = 1;
	private int S4196 = 1;
	private int S4199 = 1;
	
	private int[] ends = new int[73];
	private int[] tdone = new int[73];
		public void thread430120952(int [] tdone, int [] ends){
                if(tdone[72] != 1){
                  S4199=1;
active[72]=1;
                  ends[72]=1;
tdone[72]=1;
                  }
                }
public void thread429736204(int [] tdone, int [] ends){
                if(tdone[71] != 1){
                  S4196=1;
active[71]=1;
                  ends[71]=1;
tdone[71]=1;
                  }
                }
public void thread427812459(int [] tdone, int [] ends){
                if(tdone[70] != 1){
                  S4193=1;
active[70]=1;
                  ends[70]=1;
tdone[70]=1;
                  }
                }
public void thread427427710(int [] tdone, int [] ends){
                if(tdone[69] != 1){
                  S4190=1;
active[69]=1;
                  ends[69]=1;
tdone[69]=1;
                  }
                }
public void thread428581957(int [] tdone, int [] ends){
                if(tdone[68] != 1){
                  S4187=1;
active[68]=1;
                  ends[68]=1;
tdone[68]=1;
                  }
                }
public void thread428197208(int [] tdone, int [] ends){
                if(tdone[67] != 1){
                  S4184=1;
active[67]=1;
                  ends[67]=1;
tdone[67]=1;
                  }
                }
public void thread426273463(int [] tdone, int [] ends){
                if(tdone[66] != 1){
                  S4181=1;
active[66]=1;
                  ends[66]=1;
tdone[66]=1;
                  }
                }
public void thread425888715(int [] tdone, int [] ends){
                if(tdone[65] != 1){
                  S4178=1;
active[65]=1;
                  ends[65]=1;
tdone[65]=1;
                  }
                }
public void thread427042961(int [] tdone, int [] ends){
                if(tdone[64] != 1){
                  S4175=1;
active[64]=1;
                  ends[64]=1;
tdone[64]=1;
                  }
                }
public void thread426658212(int [] tdone, int [] ends){
                if(tdone[63] != 1){
                  S4172=1;
active[63]=1;
                  ends[63]=1;
tdone[63]=1;
                  }
                }
public void thread424734468(int [] tdone, int [] ends){
                if(tdone[62] != 1){
                  S4169=1;
active[62]=1;
                  ends[62]=1;
tdone[62]=1;
                  }
                }
public void thread424349719(int [] tdone, int [] ends){
                if(tdone[61] != 1){
                  S4166=1;
active[61]=1;
                  ends[61]=1;
tdone[61]=1;
                  }
                }
public void thread425503966(int [] tdone, int [] ends){
                if(tdone[60] != 1){
                  S4163=1;
active[60]=1;
                  ends[60]=1;
tdone[60]=1;
                  }
                }
public void thread425119217(int [] tdone, int [] ends){
                if(tdone[59] != 1){
                  S4160=1;
active[59]=1;
                  ends[59]=1;
tdone[59]=1;
                  }
                }
public void thread497067261(int [] tdone, int [] ends){
                if(tdone[72] != 1){
                  switch(S4199){
                    case 0 : 
                    active[72]=0;
                    ends[72]=0;
tdone[72]=1;
                    break;
                    case 1 : 
                    if(receivedWaterHeaterR4A14Powers_43.getprestatus()){
                      S4199=0;
active[72]=0;
                      ends[72]=0;
tdone[72]=1;
                      }
                    else {
                      active[72]=1;
                      ends[72]=1;
tdone[72]=1;
                      }
                    break;
                    }
                  }
                }
public void thread496682512(int [] tdone, int [] ends){
                if(tdone[71] != 1){
                  switch(S4196){
                    case 0 : 
                    active[71]=0;
                    ends[71]=0;
tdone[71]=1;
                    break;
                    case 1 : 
                    if(receivedFanR4A13Powers_43.getprestatus()){
                      S4196=0;
active[71]=0;
                      ends[71]=0;
tdone[71]=1;
                      }
                    else {
                      active[71]=1;
                      ends[71]=1;
tdone[71]=1;
                      }
                    break;
                    }
                  }
                }
public void thread497836759(int [] tdone, int [] ends){
                if(tdone[70] != 1){
                  switch(S4193){
                    case 0 : 
                    active[70]=0;
                    ends[70]=0;
tdone[70]=1;
                    break;
                    case 1 : 
                    if(receivedLightR4A12Powers_43.getprestatus()){
                      S4193=0;
active[70]=0;
                      ends[70]=0;
tdone[70]=1;
                      }
                    else {
                      active[70]=1;
                      ends[70]=1;
tdone[70]=1;
                      }
                    break;
                    }
                  }
                }
public void thread497452010(int [] tdone, int [] ends){
                if(tdone[69] != 1){
                  switch(S4190){
                    case 0 : 
                    active[69]=0;
                    ends[69]=0;
tdone[69]=1;
                    break;
                    case 1 : 
                    if(receivedPowerPlugsR3A11Powers_43.getprestatus()){
                      S4190=0;
active[69]=0;
                      ends[69]=0;
tdone[69]=1;
                      }
                    else {
                      active[69]=1;
                      ends[69]=1;
tdone[69]=1;
                      }
                    break;
                    }
                  }
                }
public void thread495528265(int [] tdone, int [] ends){
                if(tdone[68] != 1){
                  switch(S4187){
                    case 0 : 
                    active[68]=0;
                    ends[68]=0;
tdone[68]=1;
                    break;
                    case 1 : 
                    if(receivedLightR3A10Powers_43.getprestatus()){
                      S4187=0;
active[68]=0;
                      ends[68]=0;
tdone[68]=1;
                      }
                    else {
                      active[68]=1;
                      ends[68]=1;
tdone[68]=1;
                      }
                    break;
                    }
                  }
                }
public void thread495143517(int [] tdone, int [] ends){
                if(tdone[67] != 1){
                  switch(S4184){
                    case 0 : 
                    active[67]=0;
                    ends[67]=0;
tdone[67]=1;
                    break;
                    case 1 : 
                    if(receivedHeaterR3A9Powers_43.getprestatus()){
                      S4184=0;
active[67]=0;
                      ends[67]=0;
tdone[67]=1;
                      }
                    else {
                      active[67]=1;
                      ends[67]=1;
tdone[67]=1;
                      }
                    break;
                    }
                  }
                }
public void thread496297763(int [] tdone, int [] ends){
                if(tdone[66] != 1){
                  switch(S4181){
                    case 0 : 
                    active[66]=0;
                    ends[66]=0;
tdone[66]=1;
                    break;
                    case 1 : 
                    if(receivedHeaterR2A8Powers_43.getprestatus()){
                      S4181=0;
active[66]=0;
                      ends[66]=0;
tdone[66]=1;
                      }
                    else {
                      active[66]=1;
                      ends[66]=1;
tdone[66]=1;
                      }
                    break;
                    }
                  }
                }
public void thread495913014(int [] tdone, int [] ends){
                if(tdone[65] != 1){
                  switch(S4178){
                    case 0 : 
                    active[65]=0;
                    ends[65]=0;
tdone[65]=1;
                    break;
                    case 1 : 
                    if(receivedPowerPlugsR2A7Powers_43.getprestatus()){
                      S4178=0;
active[65]=0;
                      ends[65]=0;
tdone[65]=1;
                      }
                    else {
                      active[65]=1;
                      ends[65]=1;
tdone[65]=1;
                      }
                    break;
                    }
                  }
                }
public void thread493989270(int [] tdone, int [] ends){
                if(tdone[64] != 1){
                  switch(S4175){
                    case 0 : 
                    active[64]=0;
                    ends[64]=0;
tdone[64]=1;
                    break;
                    case 1 : 
                    if(receivedTVR2A6Powers_43.getprestatus()){
                      S4175=0;
active[64]=0;
                      ends[64]=0;
tdone[64]=1;
                      }
                    else {
                      active[64]=1;
                      ends[64]=1;
tdone[64]=1;
                      }
                    break;
                    }
                  }
                }
public void thread493604521(int [] tdone, int [] ends){
                if(tdone[63] != 1){
                  switch(S4172){
                    case 0 : 
                    active[63]=0;
                    ends[63]=0;
tdone[63]=1;
                    break;
                    case 1 : 
                    if(receivedOvenR1A5Powers_43.getprestatus()){
                      S4172=0;
active[63]=0;
                      ends[63]=0;
tdone[63]=1;
                      }
                    else {
                      active[63]=1;
                      ends[63]=1;
tdone[63]=1;
                      }
                    break;
                    }
                  }
                }
public void thread494758768(int [] tdone, int [] ends){
                if(tdone[62] != 1){
                  switch(S4169){
                    case 0 : 
                    active[62]=0;
                    ends[62]=0;
tdone[62]=1;
                    break;
                    case 1 : 
                    if(receivedStoveR1A4Powers_43.getprestatus()){
                      S4169=0;
active[62]=0;
                      ends[62]=0;
tdone[62]=1;
                      }
                    else {
                      active[62]=1;
                      ends[62]=1;
tdone[62]=1;
                      }
                    break;
                    }
                  }
                }
public void thread494374019(int [] tdone, int [] ends){
                if(tdone[61] != 1){
                  switch(S4166){
                    case 0 : 
                    active[61]=0;
                    ends[61]=0;
tdone[61]=1;
                    break;
                    case 1 : 
                    if(receivedDryerR1A3Powers_43.getprestatus()){
                      S4166=0;
active[61]=0;
                      ends[61]=0;
tdone[61]=1;
                      }
                    else {
                      active[61]=1;
                      ends[61]=1;
tdone[61]=1;
                      }
                    break;
                    }
                  }
                }
public void thread492450274(int [] tdone, int [] ends){
                if(tdone[60] != 1){
                  switch(S4163){
                    case 0 : 
                    active[60]=0;
                    ends[60]=0;
tdone[60]=1;
                    break;
                    case 1 : 
                    if(receivedDishwasherR1A2Powers_43.getprestatus()){
                      S4163=0;
active[60]=0;
                      ends[60]=0;
tdone[60]=1;
                      }
                    else {
                      active[60]=1;
                      ends[60]=1;
tdone[60]=1;
                      }
                    break;
                    }
                  }
                }
public void thread492065525(int [] tdone, int [] ends){
                if(tdone[59] != 1){
                  switch(S4160){
                    case 0 : 
                    active[59]=0;
                    ends[59]=0;
tdone[59]=1;
                    break;
                    case 1 : 
                    if(receivedFridgeR1A1Powers_43.getprestatus()){
                      S4160=0;
active[59]=0;
                      ends[59]=0;
tdone[59]=1;
                      }
                    else {
                      active[59]=1;
                      ends[59]=1;
tdone[59]=1;
                      }
                    break;
                    }
                  }
                }
public void thread493219772(int [] tdone, int [] ends){
          if(tdone[58] != 1){
            switch(S4288){
              case 0 : 
              active[58]=0;
              ends[58]=0;
tdone[58]=1;
              break;
              case 1 : 
              switch(S4200){
                case 0 : 
                thread492065525(tdone,ends);
                thread492450274(tdone,ends);
                thread494374019(tdone,ends);
                thread494758768(tdone,ends);
                thread493604521(tdone,ends);
                thread493989270(tdone,ends);
                thread495913014(tdone,ends);
                thread496297763(tdone,ends);
                thread495143517(tdone,ends);
                thread495528265(tdone,ends);
                thread497452010(tdone,ends);
                thread497836759(tdone,ends);
                thread496682512(tdone,ends);
                thread497067261(tdone,ends);
                int biggest412807252 = 0;
                if(ends[59]>=biggest412807252){
                  biggest412807252=ends[59];
}
                if(ends[60]>=biggest412807252){
                  biggest412807252=ends[60];
}
                if(ends[61]>=biggest412807252){
                  biggest412807252=ends[61];
}
                if(ends[62]>=biggest412807252){
                  biggest412807252=ends[62];
}
                if(ends[63]>=biggest412807252){
                  biggest412807252=ends[63];
}
                if(ends[64]>=biggest412807252){
                  biggest412807252=ends[64];
}
                if(ends[65]>=biggest412807252){
                  biggest412807252=ends[65];
}
                if(ends[66]>=biggest412807252){
                  biggest412807252=ends[66];
}
                if(ends[67]>=biggest412807252){
                  biggest412807252=ends[67];
}
                if(ends[68]>=biggest412807252){
                  biggest412807252=ends[68];
}
                if(ends[69]>=biggest412807252){
                  biggest412807252=ends[69];
}
                if(ends[70]>=biggest412807252){
                  biggest412807252=ends[70];
}
                if(ends[71]>=biggest412807252){
                  biggest412807252=ends[71];
}
                if(ends[72]>=biggest412807252){
                  biggest412807252=ends[72];
}
                if(biggest412807252 == 1){
                  active[58]=1;
                  ends[58]=1;
tdone[58]=1;
                  }
                //FINXME code
if(biggest412807252 == 0){
                                    fridgeR1A1Power_thread_58 = (Integer)receivedFridgeR1A1Powers_43.getpreval();
                                    dishwasherR1A2Power_thread_58 = (Integer)receivedDishwasherR1A2Powers_43.getpreval();
                                    dryerR1A3Power_thread_58 = (Integer)receivedDryerR1A3Powers_43.getpreval();
                                    stoveR1A4Power_thread_58 = (Integer)receivedStoveR1A4Powers_43.getpreval();
                                    ovenR1A5Power_thread_58 = (Integer)receivedOvenR1A5Powers_43.getpreval();
                                    TVR2A6_thread_58 = (Integer)receivedTVR2A6Powers_43.getpreval();
                                    powerplugsR2A7Power_thread_58 = (Integer)receivedPowerPlugsR2A7Powers_43.getpreval();
                                    heaterR2A8Power_thread_58 = (Integer)receivedHeaterR2A8Powers_43.getpreval();
                                    heaterR3A9Power_thread_58 = (Integer)receivedHeaterR3A9Powers_43.getpreval();
                                    lightR3A10Power_thread_58 = (Integer)receivedLightR3A10Powers_43.getpreval();
                                    powerplugsR3A11Power_thread_58 = (Integer)receivedPowerPlugsR3A11Powers_43.getpreval();
                                    lightR4A12Power_thread_58 = (Integer)receivedLightR4A12Powers_43.getpreval();
                                    fanR4A13Power_thread_58 = (Integer)receivedFanR4A13Powers_43.getpreval();
                                    waterHeaterR4A14Power_thread_58 = (Integer)receivedWaterHeaterR4A14Powers_43.getpreval();
                                    aggregatedPower_thread_58 = fridgeR1A1Power_thread_58 + dishwasherR1A2Power_thread_58 + dryerR1A3Power_thread_58 + stoveR1A4Power_thread_58 + ovenR1A5Power_thread_58 + TVR2A6_thread_58 + powerplugsR2A7Power_thread_58 + heaterR2A8Power_thread_58 + heaterR3A9Power_thread_58 + lightR3A10Power_thread_58 + powerplugsR3A11Power_thread_58 + lightR4A12Power_thread_58 + fanR4A13Power_thread_58 + waterHeaterR4A14Power_thread_58;
                                    aggregatedPowerString_thread_58 = "" + aggregatedPower_thread_58;
                                    aggregatedPowerSignal.setPresent();
                  currsigs.addElement(aggregatedPowerSignal);
                  aggregatedPowerSignal.setValue(aggregatedPowerString_thread_58);
                  System.out.println("Emitted aggregatedPowerSignal");
                  System.out.println("Emitted aggregated power:" + aggregatedPower_thread_58);
                  S4200=1;
active[58]=1;
                  ends[58]=1;
tdone[58]=1;
                  }
                break;
                case 1 : 
                S4200=1;
S4200=0;
thread425119217(tdone,ends);
                thread425503966(tdone,ends);
                thread424349719(tdone,ends);
                thread424734468(tdone,ends);
                thread426658212(tdone,ends);
                thread427042961(tdone,ends);
                thread425888715(tdone,ends);
                thread426273463(tdone,ends);
                thread428197208(tdone,ends);
                thread428581957(tdone,ends);
                thread427427710(tdone,ends);
                thread427812459(tdone,ends);
                thread429736204(tdone,ends);
                thread430120952(tdone,ends);
                int biggest428966706 = 0;
                if(ends[59]>=biggest428966706){
                  biggest428966706=ends[59];
}
                if(ends[60]>=biggest428966706){
                  biggest428966706=ends[60];
}
                if(ends[61]>=biggest428966706){
                  biggest428966706=ends[61];
}
                if(ends[62]>=biggest428966706){
                  biggest428966706=ends[62];
}
                if(ends[63]>=biggest428966706){
                  biggest428966706=ends[63];
}
                if(ends[64]>=biggest428966706){
                  biggest428966706=ends[64];
}
                if(ends[65]>=biggest428966706){
                  biggest428966706=ends[65];
}
                if(ends[66]>=biggest428966706){
                  biggest428966706=ends[66];
}
                if(ends[67]>=biggest428966706){
                  biggest428966706=ends[67];
}
                if(ends[68]>=biggest428966706){
                  biggest428966706=ends[68];
}
                if(ends[69]>=biggest428966706){
                  biggest428966706=ends[69];
}
                if(ends[70]>=biggest428966706){
                  biggest428966706=ends[70];
}
                if(ends[71]>=biggest428966706){
                  biggest428966706=ends[71];
}
                if(ends[72]>=biggest428966706){
                  biggest428966706=ends[72];
}
                if(biggest428966706 == 1){
                  active[58]=1;
                  ends[58]=1;
tdone[58]=1;
                  }
                break;
                }
              break;
              }
            }
          }
public void thread518228451(int [] tdone, int [] ends){
          if(tdone[57] != 1){
            switch(S4157){
              case 0 : 
              active[57]=0;
              ends[57]=0;
tdone[57]=1;
              break;
              case 1 : 
              switch(S4127){
                case 0 : 
                switch(S4117){
                  case 0 : 
                  if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                                        tutu__1086955517 = 0;
                                        tutu__1086955517 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                    S4117=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                            tutu__5014729 = 0;
                                            tutu__5014729 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                            tutu__5014729++;
                                            appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__5014729);
                                            appliancePowerWaterHeaterR4A14_in.get_val();
                                            ends[57]=2;
                                            ;
                                            appliancePowerWaterHeaterR4A14Int_thread_57 = (Integer)appliancePowerWaterHeaterR4A14_in.get_value();
                                            System.out.println("WaterHeaterR4A14's power:" + appliancePowerWaterHeaterR4A14Int_thread_57);
                                            appliancePowerWaterHeaterR4A14String_thread_57 = "" + appliancePowerWaterHeaterR4A14Int_thread_57;
                                            waterHeaterR4A14PowerSignal.setPresent();
                      currsigs.addElement(waterHeaterR4A14PowerSignal);
                      waterHeaterR4A14PowerSignal.setValue(appliancePowerWaterHeaterR4A14String_thread_57);
                      System.out.println("Emitted waterHeaterR4A14PowerSignal");
                      receivedWaterHeaterR4A14Powers_43.setPresent();
                      currsigs.addElement(receivedWaterHeaterR4A14Powers_43);
                      receivedWaterHeaterR4A14Powers_43.setValue(new Integer(appliancePowerWaterHeaterR4A14Int_thread_57));
                      System.out.println("Emitted receivedWaterHeaterR4A14Powers_43");
S4127=1;
active[57]=1;
                      ends[57]=1;
tdone[57]=1;
                      }
                    else {
                      active[57]=1;
                      ends[57]=1;
tdone[57]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4117=1;
S4117=0;
if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                                        tutu__1086955517 = 0;
                                        tutu__1086955517 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                    S4117=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                            tutu__5014729 = 0;
                                            tutu__5014729 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                            tutu__5014729++;
                                            appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__5014729);
                                            appliancePowerWaterHeaterR4A14_in.get_val();
                                            ends[57]=2;
                                            ;
                                            appliancePowerWaterHeaterR4A14Int_thread_57 = (Integer)appliancePowerWaterHeaterR4A14_in.get_value();
                                            System.out.println("WaterHeaterR4A14's power:" + appliancePowerWaterHeaterR4A14Int_thread_57);
                                            appliancePowerWaterHeaterR4A14String_thread_57 = "" + appliancePowerWaterHeaterR4A14Int_thread_57;
                                            waterHeaterR4A14PowerSignal.setPresent();
                      currsigs.addElement(waterHeaterR4A14PowerSignal);
                      waterHeaterR4A14PowerSignal.setValue(appliancePowerWaterHeaterR4A14String_thread_57);
                      System.out.println("Emitted waterHeaterR4A14PowerSignal");
                      receivedWaterHeaterR4A14Powers_43.setPresent();
                      currsigs.addElement(receivedWaterHeaterR4A14Powers_43);
                      receivedWaterHeaterR4A14Powers_43.setValue(new Integer(appliancePowerWaterHeaterR4A14Int_thread_57));
                      System.out.println("Emitted receivedWaterHeaterR4A14Powers_43");
S4127=1;
active[57]=1;
                      ends[57]=1;
tdone[57]=1;
                      }
                    else {
                      active[57]=1;
                      ends[57]=1;
tdone[57]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4127=1;
S4127=0;
S4117=0;
if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                                    tutu__737812412 = 0;
                                    tutu__737812412 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                  S4117=1;
active[57]=1;
                  ends[57]=1;
tdone[57]=1;
                  }
                else {
                  if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                        tutu__13479205 = 0;
                                        tutu__13479205 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                        tutu__13479205++;
                                        appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__13479205);
                                        appliancePowerWaterHeaterR4A14_in.get_val();
                                        ends[57]=2;
                                        ;
                                        appliancePowerWaterHeaterR4A14Int_thread_57 = (Integer)appliancePowerWaterHeaterR4A14_in.get_value();
                                        System.out.println("WaterHeaterR4A14's power:" + appliancePowerWaterHeaterR4A14Int_thread_57);
                                        appliancePowerWaterHeaterR4A14String_thread_57 = "" + appliancePowerWaterHeaterR4A14Int_thread_57;
                                        waterHeaterR4A14PowerSignal.setPresent();
                    currsigs.addElement(waterHeaterR4A14PowerSignal);
                    waterHeaterR4A14PowerSignal.setValue(appliancePowerWaterHeaterR4A14String_thread_57);
                    System.out.println("Emitted waterHeaterR4A14PowerSignal");
                    receivedWaterHeaterR4A14Powers_43.setPresent();
                    currsigs.addElement(receivedWaterHeaterR4A14Powers_43);
                    receivedWaterHeaterR4A14Powers_43.setValue(new Integer(appliancePowerWaterHeaterR4A14Int_thread_57));
                    System.out.println("Emitted receivedWaterHeaterR4A14Powers_43");
S4127=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread249288969(int [] tdone, int [] ends){
          if(tdone[56] != 1){
            switch(S4113){
              case 0 : 
              active[56]=0;
              ends[56]=0;
tdone[56]=1;
              break;
              case 1 : 
              switch(S4083){
                case 0 : 
                switch(S4073){
                  case 0 : 
                  if(appliancePowerFanR4A13_in.get_preempted()){
                                        tutu__68529059 = 0;
                                        tutu__68529059 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                    S4073=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                            tutu__4629980 = 0;
                                            tutu__4629980 = appliancePowerFanR4A13_in.get_r_r();
                                            tutu__4629980++;
                                            appliancePowerFanR4A13_in.set_r_r(tutu__4629980);
                                            appliancePowerFanR4A13_in.get_val();
                                            ends[56]=2;
                                            ;
                                            appliancePowerFanR4A13Int_thread_56 = (Integer)appliancePowerFanR4A13_in.get_value();
                                            System.out.println("FanR4A13's power:" + appliancePowerFanR4A13Int_thread_56);
                                            appliancePowerFanR4A13String_thread_56 = "" + appliancePowerFanR4A13Int_thread_56;
                                            fanR4A13PowerSignal.setPresent();
                      currsigs.addElement(fanR4A13PowerSignal);
                      fanR4A13PowerSignal.setValue(appliancePowerFanR4A13String_thread_56);
                      System.out.println("Emitted fanR4A13PowerSignal");
                      receivedFanR4A13Powers_43.setPresent();
                      currsigs.addElement(receivedFanR4A13Powers_43);
                      receivedFanR4A13Powers_43.setValue(new Integer(appliancePowerFanR4A13Int_thread_56));
                      System.out.println("Emitted receivedFanR4A13Powers_43");
S4083=1;
active[56]=1;
                      ends[56]=1;
tdone[56]=1;
                      }
                    else {
                      active[56]=1;
                      ends[56]=1;
tdone[56]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4073=1;
S4073=0;
if(appliancePowerFanR4A13_in.get_preempted()){
                                        tutu__68529059 = 0;
                                        tutu__68529059 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                    S4073=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                            tutu__4629980 = 0;
                                            tutu__4629980 = appliancePowerFanR4A13_in.get_r_r();
                                            tutu__4629980++;
                                            appliancePowerFanR4A13_in.set_r_r(tutu__4629980);
                                            appliancePowerFanR4A13_in.get_val();
                                            ends[56]=2;
                                            ;
                                            appliancePowerFanR4A13Int_thread_56 = (Integer)appliancePowerFanR4A13_in.get_value();
                                            System.out.println("FanR4A13's power:" + appliancePowerFanR4A13Int_thread_56);
                                            appliancePowerFanR4A13String_thread_56 = "" + appliancePowerFanR4A13Int_thread_56;
                                            fanR4A13PowerSignal.setPresent();
                      currsigs.addElement(fanR4A13PowerSignal);
                      fanR4A13PowerSignal.setValue(appliancePowerFanR4A13String_thread_56);
                      System.out.println("Emitted fanR4A13PowerSignal");
                      receivedFanR4A13Powers_43.setPresent();
                      currsigs.addElement(receivedFanR4A13Powers_43);
                      receivedFanR4A13Powers_43.setValue(new Integer(appliancePowerFanR4A13Int_thread_56));
                      System.out.println("Emitted receivedFanR4A13Powers_43");
S4083=1;
active[56]=1;
                      ends[56]=1;
tdone[56]=1;
                      }
                    else {
                      active[56]=1;
                      ends[56]=1;
tdone[56]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4083=1;
S4083=0;
S4073=0;
if(appliancePowerFanR4A13_in.get_preempted()){
                                    tutu__2052527203 = 0;
                                    tutu__2052527203 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                  S4073=1;
active[56]=1;
                  ends[56]=1;
tdone[56]=1;
                  }
                else {
                  if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                        tutu__5399478 = 0;
                                        tutu__5399478 = appliancePowerFanR4A13_in.get_r_r();
                                        tutu__5399478++;
                                        appliancePowerFanR4A13_in.set_r_r(tutu__5399478);
                                        appliancePowerFanR4A13_in.get_val();
                                        ends[56]=2;
                                        ;
                                        appliancePowerFanR4A13Int_thread_56 = (Integer)appliancePowerFanR4A13_in.get_value();
                                        System.out.println("FanR4A13's power:" + appliancePowerFanR4A13Int_thread_56);
                                        appliancePowerFanR4A13String_thread_56 = "" + appliancePowerFanR4A13Int_thread_56;
                                        fanR4A13PowerSignal.setPresent();
                    currsigs.addElement(fanR4A13PowerSignal);
                    fanR4A13PowerSignal.setValue(appliancePowerFanR4A13String_thread_56);
                    System.out.println("Emitted fanR4A13PowerSignal");
                    receivedFanR4A13Powers_43.setPresent();
                    currsigs.addElement(receivedFanR4A13Powers_43);
                    receivedFanR4A13Powers_43.setValue(new Integer(appliancePowerFanR4A13Int_thread_56));
                    System.out.println("Emitted receivedFanR4A13Powers_43");
S4083=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread289687604(int [] tdone, int [] ends){
          if(tdone[55] != 1){
            switch(S4069){
              case 0 : 
              active[55]=0;
              ends[55]=0;
tdone[55]=1;
              break;
              case 1 : 
              switch(S4039){
                case 0 : 
                switch(S4029){
                  case 0 : 
                  if(appliancePowerLightR4A12_in.get_preempted()){
                                        tutu__897042627 = 0;
                                        tutu__897042627 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                    S4029=1;
active[55]=1;
                    ends[55]=1;
tdone[55]=1;
                    }
                  else {
                    if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                            tutu__5784227 = 0;
                                            tutu__5784227 = appliancePowerLightR4A12_in.get_r_r();
                                            tutu__5784227++;
                                            appliancePowerLightR4A12_in.set_r_r(tutu__5784227);
                                            appliancePowerLightR4A12_in.get_val();
                                            ends[55]=2;
                                            ;
                                            appliancePowerLightR4A12Int_thread_55 = (Integer)appliancePowerLightR4A12_in.get_value();
                                            System.out.println("LightR4A12's power:" + appliancePowerLightR4A12Int_thread_55);
                                            appliancePowerLightR4A12String_thread_55 = "" + appliancePowerLightR4A12Int_thread_55;
                                            lightR4A12PowerSignal.setPresent();
                      currsigs.addElement(lightR4A12PowerSignal);
                      lightR4A12PowerSignal.setValue(appliancePowerLightR4A12String_thread_55);
                      System.out.println("Emitted lightR4A12PowerSignal");
                      receivedLightR4A12Powers_43.setPresent();
                      currsigs.addElement(receivedLightR4A12Powers_43);
                      receivedLightR4A12Powers_43.setValue(new Integer(appliancePowerLightR4A12Int_thread_55));
                      System.out.println("Emitted receivedLightR4A12Powers_43");
S4039=1;
active[55]=1;
                      ends[55]=1;
tdone[55]=1;
                      }
                    else {
                      active[55]=1;
                      ends[55]=1;
tdone[55]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4029=1;
S4029=0;
if(appliancePowerLightR4A12_in.get_preempted()){
                                        tutu__897042627 = 0;
                                        tutu__897042627 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                    S4029=1;
active[55]=1;
                    ends[55]=1;
tdone[55]=1;
                    }
                  else {
                    if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                            tutu__5784227 = 0;
                                            tutu__5784227 = appliancePowerLightR4A12_in.get_r_r();
                                            tutu__5784227++;
                                            appliancePowerLightR4A12_in.set_r_r(tutu__5784227);
                                            appliancePowerLightR4A12_in.get_val();
                                            ends[55]=2;
                                            ;
                                            appliancePowerLightR4A12Int_thread_55 = (Integer)appliancePowerLightR4A12_in.get_value();
                                            System.out.println("LightR4A12's power:" + appliancePowerLightR4A12Int_thread_55);
                                            appliancePowerLightR4A12String_thread_55 = "" + appliancePowerLightR4A12Int_thread_55;
                                            lightR4A12PowerSignal.setPresent();
                      currsigs.addElement(lightR4A12PowerSignal);
                      lightR4A12PowerSignal.setValue(appliancePowerLightR4A12String_thread_55);
                      System.out.println("Emitted lightR4A12PowerSignal");
                      receivedLightR4A12Powers_43.setPresent();
                      currsigs.addElement(receivedLightR4A12Powers_43);
                      receivedLightR4A12Powers_43.setValue(new Integer(appliancePowerLightR4A12Int_thread_55));
                      System.out.println("Emitted receivedLightR4A12Powers_43");
S4039=1;
active[55]=1;
                      ends[55]=1;
tdone[55]=1;
                      }
                    else {
                      active[55]=1;
                      ends[55]=1;
tdone[55]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4039=1;
S4039=0;
S4029=0;
if(appliancePowerLightR4A12_in.get_preempted()){
                                    tutu__1413926525 = 0;
                                    tutu__1413926525 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                  S4029=1;
active[55]=1;
                  ends[55]=1;
tdone[55]=1;
                  }
                else {
                  if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                        tutu__6553725 = 0;
                                        tutu__6553725 = appliancePowerLightR4A12_in.get_r_r();
                                        tutu__6553725++;
                                        appliancePowerLightR4A12_in.set_r_r(tutu__6553725);
                                        appliancePowerLightR4A12_in.get_val();
                                        ends[55]=2;
                                        ;
                                        appliancePowerLightR4A12Int_thread_55 = (Integer)appliancePowerLightR4A12_in.get_value();
                                        System.out.println("LightR4A12's power:" + appliancePowerLightR4A12Int_thread_55);
                                        appliancePowerLightR4A12String_thread_55 = "" + appliancePowerLightR4A12Int_thread_55;
                                        lightR4A12PowerSignal.setPresent();
                    currsigs.addElement(lightR4A12PowerSignal);
                    lightR4A12PowerSignal.setValue(appliancePowerLightR4A12String_thread_55);
                    System.out.println("Emitted lightR4A12PowerSignal");
                    receivedLightR4A12Powers_43.setPresent();
                    currsigs.addElement(receivedLightR4A12Powers_43);
                    receivedLightR4A12Powers_43.setValue(new Integer(appliancePowerLightR4A12Int_thread_55));
                    System.out.println("Emitted receivedLightR4A12Powers_43");
S4039=1;
active[55]=1;
                    ends[55]=1;
tdone[55]=1;
                    }
                  else {
                    active[55]=1;
                    ends[55]=1;
tdone[55]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread316235278(int [] tdone, int [] ends){
          if(tdone[54] != 1){
            switch(S4025){
              case 0 : 
              active[54]=0;
              ends[54]=0;
tdone[54]=1;
              break;
              case 1 : 
              switch(S3995){
                case 0 : 
                switch(S3985){
                  case 0 : 
                  if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                                        tutu__1398585188 = 0;
                                        tutu__1398585188 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                    S3985=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                            tutu__8477469 = 0;
                                            tutu__8477469 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                            tutu__8477469++;
                                            appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__8477469);
                                            appliancePowerPowerPlugsR3A11_in.get_val();
                                            ends[54]=2;
                                            ;
                                            appliancePowerPowerPlugsR3A11Int_thread_54 = (Integer)appliancePowerPowerPlugsR3A11_in.get_value();
                                            System.out.println("PowerPlugsR3A11's power:" + appliancePowerPowerPlugsR3A11Int_thread_54);
                                            appliancePowerPowerPlugsR3A11String_thread_54 = "" + appliancePowerPowerPlugsR3A11Int_thread_54;
                                            powerplugsR3A11PowerSignal.setPresent();
                      currsigs.addElement(powerplugsR3A11PowerSignal);
                      powerplugsR3A11PowerSignal.setValue(appliancePowerPowerPlugsR3A11String_thread_54);
                      System.out.println("Emitted powerplugsR3A11PowerSignal");
                      receivedPowerPlugsR3A11Powers_43.setPresent();
                      currsigs.addElement(receivedPowerPlugsR3A11Powers_43);
                      receivedPowerPlugsR3A11Powers_43.setValue(new Integer(appliancePowerPowerPlugsR3A11Int_thread_54));
                      System.out.println("Emitted receivedPowerPlugsR3A11Powers_43");
S3995=1;
active[54]=1;
                      ends[54]=1;
tdone[54]=1;
                      }
                    else {
                      active[54]=1;
                      ends[54]=1;
tdone[54]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3985=1;
S3985=0;
if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                                        tutu__1398585188 = 0;
                                        tutu__1398585188 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                    S3985=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                            tutu__8477469 = 0;
                                            tutu__8477469 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                            tutu__8477469++;
                                            appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__8477469);
                                            appliancePowerPowerPlugsR3A11_in.get_val();
                                            ends[54]=2;
                                            ;
                                            appliancePowerPowerPlugsR3A11Int_thread_54 = (Integer)appliancePowerPowerPlugsR3A11_in.get_value();
                                            System.out.println("PowerPlugsR3A11's power:" + appliancePowerPowerPlugsR3A11Int_thread_54);
                                            appliancePowerPowerPlugsR3A11String_thread_54 = "" + appliancePowerPowerPlugsR3A11Int_thread_54;
                                            powerplugsR3A11PowerSignal.setPresent();
                      currsigs.addElement(powerplugsR3A11PowerSignal);
                      powerplugsR3A11PowerSignal.setValue(appliancePowerPowerPlugsR3A11String_thread_54);
                      System.out.println("Emitted powerplugsR3A11PowerSignal");
                      receivedPowerPlugsR3A11Powers_43.setPresent();
                      currsigs.addElement(receivedPowerPlugsR3A11Powers_43);
                      receivedPowerPlugsR3A11Powers_43.setValue(new Integer(appliancePowerPowerPlugsR3A11Int_thread_54));
                      System.out.println("Emitted receivedPowerPlugsR3A11Powers_43");
S3995=1;
active[54]=1;
                      ends[54]=1;
tdone[54]=1;
                      }
                    else {
                      active[54]=1;
                      ends[54]=1;
tdone[54]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3995=1;
S3995=0;
S3985=0;
if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                                    tutu__258441949 = 0;
                                    tutu__258441949 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                  S3985=1;
active[54]=1;
                  ends[54]=1;
tdone[54]=1;
                  }
                else {
                  if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                        tutu__6168976 = 0;
                                        tutu__6168976 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                        tutu__6168976++;
                                        appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__6168976);
                                        appliancePowerPowerPlugsR3A11_in.get_val();
                                        ends[54]=2;
                                        ;
                                        appliancePowerPowerPlugsR3A11Int_thread_54 = (Integer)appliancePowerPowerPlugsR3A11_in.get_value();
                                        System.out.println("PowerPlugsR3A11's power:" + appliancePowerPowerPlugsR3A11Int_thread_54);
                                        appliancePowerPowerPlugsR3A11String_thread_54 = "" + appliancePowerPowerPlugsR3A11Int_thread_54;
                                        powerplugsR3A11PowerSignal.setPresent();
                    currsigs.addElement(powerplugsR3A11PowerSignal);
                    powerplugsR3A11PowerSignal.setValue(appliancePowerPowerPlugsR3A11String_thread_54);
                    System.out.println("Emitted powerplugsR3A11PowerSignal");
                    receivedPowerPlugsR3A11Powers_43.setPresent();
                    currsigs.addElement(receivedPowerPlugsR3A11Powers_43);
                    receivedPowerPlugsR3A11Powers_43.setValue(new Integer(appliancePowerPowerPlugsR3A11Int_thread_54));
                    System.out.println("Emitted receivedPowerPlugsR3A11Powers_43");
S3995=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread45756801(int [] tdone, int [] ends){
          if(tdone[53] != 1){
            switch(S3981){
              case 0 : 
              active[53]=0;
              ends[53]=0;
tdone[53]=1;
              break;
              case 1 : 
              switch(S3951){
                case 0 : 
                switch(S3941){
                  case 0 : 
                  if(appliancePowerLightR3A10_in.get_preempted()){
                                        tutu__766815269 = 0;
                                        tutu__766815269 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S3941=1;
active[53]=1;
                    ends[53]=1;
tdone[53]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__21558932 = 0;
                                            tutu__21558932 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__21558932++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__21558932);
                                            appliancePowerLightR3A10_in.get_val();
                                            ends[53]=2;
                                            ;
                                            appliancePowerLightR3A10Int_thread_53 = (Integer)appliancePowerLightR3A10_in.get_value();
                                            System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_53);
                                            appliancePowerLightR3A10String_thread_53 = "" + appliancePowerLightR3A10Int_thread_53;
                                            lightR3A10PowerSignal.setPresent();
                      currsigs.addElement(lightR3A10PowerSignal);
                      lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_53);
                      System.out.println("Emitted lightR3A10PowerSignal");
                      receivedLightR3A10Powers_43.setPresent();
                      currsigs.addElement(receivedLightR3A10Powers_43);
                      receivedLightR3A10Powers_43.setValue(new Integer(appliancePowerLightR3A10Int_thread_53));
                      System.out.println("Emitted receivedLightR3A10Powers_43");
S3951=1;
active[53]=1;
                      ends[53]=1;
tdone[53]=1;
                      }
                    else {
                      active[53]=1;
                      ends[53]=1;
tdone[53]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3941=1;
S3941=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                                        tutu__766815269 = 0;
                                        tutu__766815269 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S3941=1;
active[53]=1;
                    ends[53]=1;
tdone[53]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__21558932 = 0;
                                            tutu__21558932 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__21558932++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__21558932);
                                            appliancePowerLightR3A10_in.get_val();
                                            ends[53]=2;
                                            ;
                                            appliancePowerLightR3A10Int_thread_53 = (Integer)appliancePowerLightR3A10_in.get_value();
                                            System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_53);
                                            appliancePowerLightR3A10String_thread_53 = "" + appliancePowerLightR3A10Int_thread_53;
                                            lightR3A10PowerSignal.setPresent();
                      currsigs.addElement(lightR3A10PowerSignal);
                      lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_53);
                      System.out.println("Emitted lightR3A10PowerSignal");
                      receivedLightR3A10Powers_43.setPresent();
                      currsigs.addElement(receivedLightR3A10Powers_43);
                      receivedLightR3A10Powers_43.setValue(new Integer(appliancePowerLightR3A10Int_thread_53));
                      System.out.println("Emitted receivedLightR3A10Powers_43");
S3951=1;
active[53]=1;
                      ends[53]=1;
tdone[53]=1;
                      }
                    else {
                      active[53]=1;
                      ends[53]=1;
tdone[53]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3951=1;
S3951=0;
S3941=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                                    tutu__1544153883 = 0;
                                    tutu__1544153883 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                  S3941=1;
active[53]=1;
                  ends[53]=1;
tdone[53]=1;
                  }
                else {
                  if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                        tutu__22328430 = 0;
                                        tutu__22328430 = appliancePowerLightR3A10_in.get_r_r();
                                        tutu__22328430++;
                                        appliancePowerLightR3A10_in.set_r_r(tutu__22328430);
                                        appliancePowerLightR3A10_in.get_val();
                                        ends[53]=2;
                                        ;
                                        appliancePowerLightR3A10Int_thread_53 = (Integer)appliancePowerLightR3A10_in.get_value();
                                        System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_53);
                                        appliancePowerLightR3A10String_thread_53 = "" + appliancePowerLightR3A10Int_thread_53;
                                        lightR3A10PowerSignal.setPresent();
                    currsigs.addElement(lightR3A10PowerSignal);
                    lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_53);
                    System.out.println("Emitted lightR3A10PowerSignal");
                    receivedLightR3A10Powers_43.setPresent();
                    currsigs.addElement(receivedLightR3A10Powers_43);
                    receivedLightR3A10Powers_43.setValue(new Integer(appliancePowerLightR3A10Int_thread_53));
                    System.out.println("Emitted receivedLightR3A10Powers_43");
S3951=1;
active[53]=1;
                    ends[53]=1;
tdone[53]=1;
                    }
                  else {
                    active[53]=1;
                    ends[53]=1;
tdone[53]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread72304475(int [] tdone, int [] ends){
          if(tdone[52] != 1){
            switch(S3937){
              case 0 : 
              active[52]=0;
              ends[52]=0;
tdone[52]=1;
              break;
              case 1 : 
              switch(S3907){
                case 0 : 
                switch(S3897){
                  case 0 : 
                  if(appliancePowerHeaterR3A9_in.get_preempted()){
                                        tutu__1595328837 = 0;
                                        tutu__1595328837 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                    S3897=1;
active[52]=1;
                    ends[52]=1;
tdone[52]=1;
                    }
                  else {
                    if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                            tutu__22713179 = 0;
                                            tutu__22713179 = appliancePowerHeaterR3A9_in.get_r_r();
                                            tutu__22713179++;
                                            appliancePowerHeaterR3A9_in.set_r_r(tutu__22713179);
                                            appliancePowerHeaterR3A9_in.get_val();
                                            ends[52]=2;
                                            ;
                                            appliancePowerHeaterR3A9Int_thread_52 = (Integer)appliancePowerHeaterR3A9_in.get_value();
                                            System.out.println("HeaterR3A9's power:" + appliancePowerHeaterR3A9Int_thread_52);
                                            appliancePowerHeaterR3A9String_thread_52 = "" + appliancePowerHeaterR3A9Int_thread_52;
                                            heaterR3A9PowerSignal.setPresent();
                      currsigs.addElement(heaterR3A9PowerSignal);
                      heaterR3A9PowerSignal.setValue(appliancePowerHeaterR3A9String_thread_52);
                      System.out.println("Emitted heaterR3A9PowerSignal");
                      receivedHeaterR3A9Powers_43.setPresent();
                      currsigs.addElement(receivedHeaterR3A9Powers_43);
                      receivedHeaterR3A9Powers_43.setValue(new Integer(appliancePowerHeaterR3A9Int_thread_52));
                      System.out.println("Emitted receivedHeaterR3A9Powers_43");
S3907=1;
active[52]=1;
                      ends[52]=1;
tdone[52]=1;
                      }
                    else {
                      active[52]=1;
                      ends[52]=1;
tdone[52]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3897=1;
S3897=0;
if(appliancePowerHeaterR3A9_in.get_preempted()){
                                        tutu__1595328837 = 0;
                                        tutu__1595328837 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                    S3897=1;
active[52]=1;
                    ends[52]=1;
tdone[52]=1;
                    }
                  else {
                    if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                            tutu__22713179 = 0;
                                            tutu__22713179 = appliancePowerHeaterR3A9_in.get_r_r();
                                            tutu__22713179++;
                                            appliancePowerHeaterR3A9_in.set_r_r(tutu__22713179);
                                            appliancePowerHeaterR3A9_in.get_val();
                                            ends[52]=2;
                                            ;
                                            appliancePowerHeaterR3A9Int_thread_52 = (Integer)appliancePowerHeaterR3A9_in.get_value();
                                            System.out.println("HeaterR3A9's power:" + appliancePowerHeaterR3A9Int_thread_52);
                                            appliancePowerHeaterR3A9String_thread_52 = "" + appliancePowerHeaterR3A9Int_thread_52;
                                            heaterR3A9PowerSignal.setPresent();
                      currsigs.addElement(heaterR3A9PowerSignal);
                      heaterR3A9PowerSignal.setValue(appliancePowerHeaterR3A9String_thread_52);
                      System.out.println("Emitted heaterR3A9PowerSignal");
                      receivedHeaterR3A9Powers_43.setPresent();
                      currsigs.addElement(receivedHeaterR3A9Powers_43);
                      receivedHeaterR3A9Powers_43.setValue(new Integer(appliancePowerHeaterR3A9Int_thread_52));
                      System.out.println("Emitted receivedHeaterR3A9Powers_43");
S3907=1;
active[52]=1;
                      ends[52]=1;
tdone[52]=1;
                      }
                    else {
                      active[52]=1;
                      ends[52]=1;
tdone[52]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3907=1;
S3907=0;
S3897=0;
if(appliancePowerHeaterR3A9_in.get_preempted()){
                                    tutu__715640315 = 0;
                                    tutu__715640315 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                  S3897=1;
active[52]=1;
                  ends[52]=1;
tdone[52]=1;
                  }
                else {
                  if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                        tutu__23482677 = 0;
                                        tutu__23482677 = appliancePowerHeaterR3A9_in.get_r_r();
                                        tutu__23482677++;
                                        appliancePowerHeaterR3A9_in.set_r_r(tutu__23482677);
                                        appliancePowerHeaterR3A9_in.get_val();
                                        ends[52]=2;
                                        ;
                                        appliancePowerHeaterR3A9Int_thread_52 = (Integer)appliancePowerHeaterR3A9_in.get_value();
                                        System.out.println("HeaterR3A9's power:" + appliancePowerHeaterR3A9Int_thread_52);
                                        appliancePowerHeaterR3A9String_thread_52 = "" + appliancePowerHeaterR3A9Int_thread_52;
                                        heaterR3A9PowerSignal.setPresent();
                    currsigs.addElement(heaterR3A9PowerSignal);
                    heaterR3A9PowerSignal.setValue(appliancePowerHeaterR3A9String_thread_52);
                    System.out.println("Emitted heaterR3A9PowerSignal");
                    receivedHeaterR3A9Powers_43.setPresent();
                    currsigs.addElement(receivedHeaterR3A9Powers_43);
                    receivedHeaterR3A9Powers_43.setValue(new Integer(appliancePowerHeaterR3A9Int_thread_52));
                    System.out.println("Emitted receivedHeaterR3A9Powers_43");
S3907=1;
active[52]=1;
                    ends[52]=1;
tdone[52]=1;
                    }
                  else {
                    active[52]=1;
                    ends[52]=1;
tdone[52]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1368523520(int [] tdone, int [] ends){
          if(tdone[51] != 1){
            switch(S3893){
              case 0 : 
              active[51]=0;
              ends[51]=0;
tdone[51]=1;
              break;
              case 1 : 
              switch(S3863){
                case 0 : 
                switch(S3853){
                  case 0 : 
                  if(appliancePowerHeaterR2A8_in.get_preempted()){
                                        tutu__2096871397 = 0;
                                        tutu__2096871397 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                    S3853=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                            tutu__25406421 = 0;
                                            tutu__25406421 = appliancePowerHeaterR2A8_in.get_r_r();
                                            tutu__25406421++;
                                            appliancePowerHeaterR2A8_in.set_r_r(tutu__25406421);
                                            appliancePowerHeaterR2A8_in.get_val();
                                            ends[51]=2;
                                            ;
                                            appliancePowerHeaterR2A8Int_thread_51 = (Integer)appliancePowerHeaterR2A8_in.get_value();
                                            System.out.println("HeaterR2A8's power:" + appliancePowerHeaterR2A8Int_thread_51);
                                            appliancePowerHeaterR2A8String_thread_51 = "" + appliancePowerHeaterR2A8Int_thread_51;
                                            heaterR2A8PowerSignal.setPresent();
                      currsigs.addElement(heaterR2A8PowerSignal);
                      heaterR2A8PowerSignal.setValue(appliancePowerHeaterR2A8String_thread_51);
                      System.out.println("Emitted heaterR2A8PowerSignal");
                      receivedHeaterR2A8Powers_43.setPresent();
                      currsigs.addElement(receivedHeaterR2A8Powers_43);
                      receivedHeaterR2A8Powers_43.setValue(new Integer(appliancePowerHeaterR2A8Int_thread_51));
                      System.out.println("Emitted receivedHeaterR2A8Powers_43");
S3863=1;
active[51]=1;
                      ends[51]=1;
tdone[51]=1;
                      }
                    else {
                      active[51]=1;
                      ends[51]=1;
tdone[51]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3853=1;
S3853=0;
if(appliancePowerHeaterR2A8_in.get_preempted()){
                                        tutu__2096871397 = 0;
                                        tutu__2096871397 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                    S3853=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                            tutu__25406421 = 0;
                                            tutu__25406421 = appliancePowerHeaterR2A8_in.get_r_r();
                                            tutu__25406421++;
                                            appliancePowerHeaterR2A8_in.set_r_r(tutu__25406421);
                                            appliancePowerHeaterR2A8_in.get_val();
                                            ends[51]=2;
                                            ;
                                            appliancePowerHeaterR2A8Int_thread_51 = (Integer)appliancePowerHeaterR2A8_in.get_value();
                                            System.out.println("HeaterR2A8's power:" + appliancePowerHeaterR2A8Int_thread_51);
                                            appliancePowerHeaterR2A8String_thread_51 = "" + appliancePowerHeaterR2A8Int_thread_51;
                                            heaterR2A8PowerSignal.setPresent();
                      currsigs.addElement(heaterR2A8PowerSignal);
                      heaterR2A8PowerSignal.setValue(appliancePowerHeaterR2A8String_thread_51);
                      System.out.println("Emitted heaterR2A8PowerSignal");
                      receivedHeaterR2A8Powers_43.setPresent();
                      currsigs.addElement(receivedHeaterR2A8Powers_43);
                      receivedHeaterR2A8Powers_43.setValue(new Integer(appliancePowerHeaterR2A8Int_thread_51));
                      System.out.println("Emitted receivedHeaterR2A8Powers_43");
S3863=1;
active[51]=1;
                      ends[51]=1;
tdone[51]=1;
                      }
                    else {
                      active[51]=1;
                      ends[51]=1;
tdone[51]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3863=1;
S3863=0;
S3853=0;
if(appliancePowerHeaterR2A8_in.get_preempted()){
                                    tutu__439844261 = 0;
                                    tutu__439844261 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                  S3853=1;
active[51]=1;
                  ends[51]=1;
tdone[51]=1;
                  }
                else {
                  if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                        tutu__23097928 = 0;
                                        tutu__23097928 = appliancePowerHeaterR2A8_in.get_r_r();
                                        tutu__23097928++;
                                        appliancePowerHeaterR2A8_in.set_r_r(tutu__23097928);
                                        appliancePowerHeaterR2A8_in.get_val();
                                        ends[51]=2;
                                        ;
                                        appliancePowerHeaterR2A8Int_thread_51 = (Integer)appliancePowerHeaterR2A8_in.get_value();
                                        System.out.println("HeaterR2A8's power:" + appliancePowerHeaterR2A8Int_thread_51);
                                        appliancePowerHeaterR2A8String_thread_51 = "" + appliancePowerHeaterR2A8Int_thread_51;
                                        heaterR2A8PowerSignal.setPresent();
                    currsigs.addElement(heaterR2A8PowerSignal);
                    heaterR2A8PowerSignal.setValue(appliancePowerHeaterR2A8String_thread_51);
                    System.out.println("Emitted heaterR2A8PowerSignal");
                    receivedHeaterR2A8Powers_43.setPresent();
                    currsigs.addElement(receivedHeaterR2A8Powers_43);
                    receivedHeaterR2A8Powers_43.setValue(new Integer(appliancePowerHeaterR2A8Int_thread_51));
                    System.out.println("Emitted receivedHeaterR2A8Powers_43");
S3863=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1395071194(int [] tdone, int [] ends){
          if(tdone[50] != 1){
            switch(S3849){
              case 0 : 
              active[50]=0;
              ends[50]=0;
tdone[50]=1;
              break;
              case 1 : 
              switch(S3819){
                case 0 : 
                switch(S3809){
                  case 0 : 
                  if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                                        tutu__1369582331 = 0;
                                        tutu__1369582331 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                    S3809=1;
active[50]=1;
                    ends[50]=1;
tdone[50]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                            tutu__26560668 = 0;
                                            tutu__26560668 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                            tutu__26560668++;
                                            appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__26560668);
                                            appliancePowerPowerPlugsR2A7_in.get_val();
                                            ends[50]=2;
                                            ;
                                            appliancePowerPowerPlugsR2A7Int_thread_50 = (Integer)appliancePowerPowerPlugsR2A7_in.get_value();
                                            System.out.println("PowerPlugsR2A7's power:" + appliancePowerPowerPlugsR2A7Int_thread_50);
                                            appliancePowerPowerPlugsR2A7String_thread_50 = "" + appliancePowerPowerPlugsR2A7Int_thread_50;
                                            powerplugsR2A7PowerSignal.setPresent();
                      currsigs.addElement(powerplugsR2A7PowerSignal);
                      powerplugsR2A7PowerSignal.setValue(appliancePowerPowerPlugsR2A7String_thread_50);
                      System.out.println("Emitted powerplugsR2A7PowerSignal");
                      receivedPowerPlugsR2A7Powers_43.setPresent();
                      currsigs.addElement(receivedPowerPlugsR2A7Powers_43);
                      receivedPowerPlugsR2A7Powers_43.setValue(new Integer(appliancePowerPowerPlugsR2A7Int_thread_50));
                      System.out.println("Emitted receivedPowerPlugsR2A7Powers_43");
S3819=1;
active[50]=1;
                      ends[50]=1;
tdone[50]=1;
                      }
                    else {
                      active[50]=1;
                      ends[50]=1;
tdone[50]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3809=1;
S3809=0;
if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                                        tutu__1369582331 = 0;
                                        tutu__1369582331 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                    S3809=1;
active[50]=1;
                    ends[50]=1;
tdone[50]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                            tutu__26560668 = 0;
                                            tutu__26560668 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                            tutu__26560668++;
                                            appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__26560668);
                                            appliancePowerPowerPlugsR2A7_in.get_val();
                                            ends[50]=2;
                                            ;
                                            appliancePowerPowerPlugsR2A7Int_thread_50 = (Integer)appliancePowerPowerPlugsR2A7_in.get_value();
                                            System.out.println("PowerPlugsR2A7's power:" + appliancePowerPowerPlugsR2A7Int_thread_50);
                                            appliancePowerPowerPlugsR2A7String_thread_50 = "" + appliancePowerPowerPlugsR2A7Int_thread_50;
                                            powerplugsR2A7PowerSignal.setPresent();
                      currsigs.addElement(powerplugsR2A7PowerSignal);
                      powerplugsR2A7PowerSignal.setValue(appliancePowerPowerPlugsR2A7String_thread_50);
                      System.out.println("Emitted powerplugsR2A7PowerSignal");
                      receivedPowerPlugsR2A7Powers_43.setPresent();
                      currsigs.addElement(receivedPowerPlugsR2A7Powers_43);
                      receivedPowerPlugsR2A7Powers_43.setValue(new Integer(appliancePowerPowerPlugsR2A7Int_thread_50));
                      System.out.println("Emitted receivedPowerPlugsR2A7Powers_43");
S3819=1;
active[50]=1;
                      ends[50]=1;
tdone[50]=1;
                      }
                    else {
                      active[50]=1;
                      ends[50]=1;
tdone[50]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3819=1;
S3819=0;
S3809=0;
if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                                    tutu__1268357829 = 0;
                                    tutu__1268357829 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                  S3809=1;
active[50]=1;
                  ends[50]=1;
tdone[50]=1;
                  }
                else {
                  if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                        tutu__24252174 = 0;
                                        tutu__24252174 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                        tutu__24252174++;
                                        appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__24252174);
                                        appliancePowerPowerPlugsR2A7_in.get_val();
                                        ends[50]=2;
                                        ;
                                        appliancePowerPowerPlugsR2A7Int_thread_50 = (Integer)appliancePowerPowerPlugsR2A7_in.get_value();
                                        System.out.println("PowerPlugsR2A7's power:" + appliancePowerPowerPlugsR2A7Int_thread_50);
                                        appliancePowerPowerPlugsR2A7String_thread_50 = "" + appliancePowerPowerPlugsR2A7Int_thread_50;
                                        powerplugsR2A7PowerSignal.setPresent();
                    currsigs.addElement(powerplugsR2A7PowerSignal);
                    powerplugsR2A7PowerSignal.setValue(appliancePowerPowerPlugsR2A7String_thread_50);
                    System.out.println("Emitted powerplugsR2A7PowerSignal");
                    receivedPowerPlugsR2A7Powers_43.setPresent();
                    currsigs.addElement(receivedPowerPlugsR2A7Powers_43);
                    receivedPowerPlugsR2A7Powers_43.setValue(new Integer(appliancePowerPowerPlugsR2A7Int_thread_50));
                    System.out.println("Emitted receivedPowerPlugsR2A7Powers_43");
S3819=1;
active[50]=1;
                    ends[50]=1;
tdone[50]=1;
                    }
                  else {
                    active[50]=1;
                    ends[50]=1;
tdone[50]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1518575591(int [] tdone, int [] ends){
          if(tdone[49] != 1){
            switch(S3805){
              case 0 : 
              active[49]=0;
              ends[49]=0;
tdone[49]=1;
              break;
              case 1 : 
              switch(S3775){
                case 0 : 
                switch(S3765){
                  case 0 : 
                  if(appliancePowerTVR2A6_in.get_preempted()){
                                        tutu__2074699300 = 0;
                                        tutu__2074699300 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                    S3765=1;
active[49]=1;
                    ends[49]=1;
tdone[49]=1;
                    }
                  else {
                    if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                            tutu__15402950 = 0;
                                            tutu__15402950 = appliancePowerTVR2A6_in.get_r_r();
                                            tutu__15402950++;
                                            appliancePowerTVR2A6_in.set_r_r(tutu__15402950);
                                            appliancePowerTVR2A6_in.get_val();
                                            ends[49]=2;
                                            ;
                                            appliancePowerTVR2A6Int_thread_49 = (Integer)appliancePowerTVR2A6_in.get_value();
                                            System.out.println("TVR2A6's power:" + appliancePowerTVR2A6Int_thread_49);
                                            appliancePowerTVR2A6String_thread_49 = "" + appliancePowerTVR2A6Int_thread_49;
                                            TVR2A6PowerSignal.setPresent();
                      currsigs.addElement(TVR2A6PowerSignal);
                      TVR2A6PowerSignal.setValue(appliancePowerTVR2A6String_thread_49);
                      System.out.println("Emitted TVR2A6PowerSignal");
                      receivedTVR2A6Powers_43.setPresent();
                      currsigs.addElement(receivedTVR2A6Powers_43);
                      receivedTVR2A6Powers_43.setValue(new Integer(appliancePowerTVR2A6Int_thread_49));
                      System.out.println("Emitted receivedTVR2A6Powers_43");
S3775=1;
active[49]=1;
                      ends[49]=1;
tdone[49]=1;
                      }
                    else {
                      active[49]=1;
                      ends[49]=1;
tdone[49]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3765=1;
S3765=0;
if(appliancePowerTVR2A6_in.get_preempted()){
                                        tutu__2074699300 = 0;
                                        tutu__2074699300 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                    S3765=1;
active[49]=1;
                    ends[49]=1;
tdone[49]=1;
                    }
                  else {
                    if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                            tutu__15402950 = 0;
                                            tutu__15402950 = appliancePowerTVR2A6_in.get_r_r();
                                            tutu__15402950++;
                                            appliancePowerTVR2A6_in.set_r_r(tutu__15402950);
                                            appliancePowerTVR2A6_in.get_val();
                                            ends[49]=2;
                                            ;
                                            appliancePowerTVR2A6Int_thread_49 = (Integer)appliancePowerTVR2A6_in.get_value();
                                            System.out.println("TVR2A6's power:" + appliancePowerTVR2A6Int_thread_49);
                                            appliancePowerTVR2A6String_thread_49 = "" + appliancePowerTVR2A6Int_thread_49;
                                            TVR2A6PowerSignal.setPresent();
                      currsigs.addElement(TVR2A6PowerSignal);
                      TVR2A6PowerSignal.setValue(appliancePowerTVR2A6String_thread_49);
                      System.out.println("Emitted TVR2A6PowerSignal");
                      receivedTVR2A6Powers_43.setPresent();
                      currsigs.addElement(receivedTVR2A6Powers_43);
                      receivedTVR2A6Powers_43.setValue(new Integer(appliancePowerTVR2A6Int_thread_49));
                      System.out.println("Emitted receivedTVR2A6Powers_43");
S3775=1;
active[49]=1;
                      ends[49]=1;
tdone[49]=1;
                      }
                    else {
                      active[49]=1;
                      ends[49]=1;
tdone[49]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3775=1;
S3775=0;
S3765=0;
if(appliancePowerTVR2A6_in.get_preempted()){
                                    tutu__919214724 = 0;
                                    tutu__919214724 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                  S3765=1;
active[49]=1;
                  ends[49]=1;
tdone[49]=1;
                  }
                else {
                  if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                        tutu__15787699 = 0;
                                        tutu__15787699 = appliancePowerTVR2A6_in.get_r_r();
                                        tutu__15787699++;
                                        appliancePowerTVR2A6_in.set_r_r(tutu__15787699);
                                        appliancePowerTVR2A6_in.get_val();
                                        ends[49]=2;
                                        ;
                                        appliancePowerTVR2A6Int_thread_49 = (Integer)appliancePowerTVR2A6_in.get_value();
                                        System.out.println("TVR2A6's power:" + appliancePowerTVR2A6Int_thread_49);
                                        appliancePowerTVR2A6String_thread_49 = "" + appliancePowerTVR2A6Int_thread_49;
                                        TVR2A6PowerSignal.setPresent();
                    currsigs.addElement(TVR2A6PowerSignal);
                    TVR2A6PowerSignal.setValue(appliancePowerTVR2A6String_thread_49);
                    System.out.println("Emitted TVR2A6PowerSignal");
                    receivedTVR2A6Powers_43.setPresent();
                    currsigs.addElement(receivedTVR2A6Powers_43);
                    receivedTVR2A6Powers_43.setValue(new Integer(appliancePowerTVR2A6Int_thread_49));
                    System.out.println("Emitted receivedTVR2A6Powers_43");
S3775=1;
active[49]=1;
                    ends[49]=1;
tdone[49]=1;
                    }
                  else {
                    active[49]=1;
                    ends[49]=1;
tdone[49]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1163452356(int [] tdone, int [] ends){
          if(tdone[48] != 1){
            switch(S3761){
              case 0 : 
              active[48]=0;
              ends[48]=0;
tdone[48]=1;
              break;
              case 1 : 
              switch(S3731){
                case 0 : 
                switch(S3721){
                  case 0 : 
                  if(appliancePowerOvenR1A5_in.get_preempted()){
                                        tutu__1391754428 = 0;
                                        tutu__1391754428 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                    S3721=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                            tutu__16557196 = 0;
                                            tutu__16557196 = appliancePowerOvenR1A5_in.get_r_r();
                                            tutu__16557196++;
                                            appliancePowerOvenR1A5_in.set_r_r(tutu__16557196);
                                            appliancePowerOvenR1A5_in.get_val();
                                            ends[48]=2;
                                            ;
                                            appliancePowerOvenR1A5Int_thread_48 = (Integer)appliancePowerOvenR1A5_in.get_value();
                                            System.out.println("OvenR1A5's power:" + appliancePowerOvenR1A5Int_thread_48);
                                            appliancePowerOvenR1A5String_thread_48 = "" + appliancePowerOvenR1A5Int_thread_48;
                                            ovenR1A5PowerSignal.setPresent();
                      currsigs.addElement(ovenR1A5PowerSignal);
                      ovenR1A5PowerSignal.setValue(appliancePowerOvenR1A5String_thread_48);
                      System.out.println("Emitted ovenR1A5PowerSignal");
                      receivedOvenR1A5Powers_43.setPresent();
                      currsigs.addElement(receivedOvenR1A5Powers_43);
                      receivedOvenR1A5Powers_43.setValue(new Integer(appliancePowerOvenR1A5Int_thread_48));
                      System.out.println("Emitted receivedOvenR1A5Powers_43");
S3731=1;
active[48]=1;
                      ends[48]=1;
tdone[48]=1;
                      }
                    else {
                      active[48]=1;
                      ends[48]=1;
tdone[48]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3721=1;
S3721=0;
if(appliancePowerOvenR1A5_in.get_preempted()){
                                        tutu__1391754428 = 0;
                                        tutu__1391754428 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                    S3721=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                            tutu__16557196 = 0;
                                            tutu__16557196 = appliancePowerOvenR1A5_in.get_r_r();
                                            tutu__16557196++;
                                            appliancePowerOvenR1A5_in.set_r_r(tutu__16557196);
                                            appliancePowerOvenR1A5_in.get_val();
                                            ends[48]=2;
                                            ;
                                            appliancePowerOvenR1A5Int_thread_48 = (Integer)appliancePowerOvenR1A5_in.get_value();
                                            System.out.println("OvenR1A5's power:" + appliancePowerOvenR1A5Int_thread_48);
                                            appliancePowerOvenR1A5String_thread_48 = "" + appliancePowerOvenR1A5Int_thread_48;
                                            ovenR1A5PowerSignal.setPresent();
                      currsigs.addElement(ovenR1A5PowerSignal);
                      ovenR1A5PowerSignal.setValue(appliancePowerOvenR1A5String_thread_48);
                      System.out.println("Emitted ovenR1A5PowerSignal");
                      receivedOvenR1A5Powers_43.setPresent();
                      currsigs.addElement(receivedOvenR1A5Powers_43);
                      receivedOvenR1A5Powers_43.setValue(new Integer(appliancePowerOvenR1A5Int_thread_48));
                      System.out.println("Emitted receivedOvenR1A5Powers_43");
S3731=1;
active[48]=1;
                      ends[48]=1;
tdone[48]=1;
                      }
                    else {
                      active[48]=1;
                      ends[48]=1;
tdone[48]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3731=1;
S3731=0;
S3721=0;
if(appliancePowerOvenR1A5_in.get_preempted()){
                                    tutu__592243716 = 0;
                                    tutu__592243716 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                  S3721=1;
active[48]=1;
                  ends[48]=1;
tdone[48]=1;
                  }
                else {
                  if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                        tutu__17326694 = 0;
                                        tutu__17326694 = appliancePowerOvenR1A5_in.get_r_r();
                                        tutu__17326694++;
                                        appliancePowerOvenR1A5_in.set_r_r(tutu__17326694);
                                        appliancePowerOvenR1A5_in.get_val();
                                        ends[48]=2;
                                        ;
                                        appliancePowerOvenR1A5Int_thread_48 = (Integer)appliancePowerOvenR1A5_in.get_value();
                                        System.out.println("OvenR1A5's power:" + appliancePowerOvenR1A5Int_thread_48);
                                        appliancePowerOvenR1A5String_thread_48 = "" + appliancePowerOvenR1A5Int_thread_48;
                                        ovenR1A5PowerSignal.setPresent();
                    currsigs.addElement(ovenR1A5PowerSignal);
                    ovenR1A5PowerSignal.setValue(appliancePowerOvenR1A5String_thread_48);
                    System.out.println("Emitted ovenR1A5PowerSignal");
                    receivedOvenR1A5Powers_43.setPresent();
                    currsigs.addElement(receivedOvenR1A5Powers_43);
                    receivedOvenR1A5Powers_43.setValue(new Integer(appliancePowerOvenR1A5Int_thread_48));
                    System.out.println("Emitted receivedOvenR1A5Powers_43");
S3731=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1290034744(int [] tdone, int [] ends){
          if(tdone[47] != 1){
            switch(S3717){
              case 0 : 
              active[47]=0;
              ends[47]=0;
tdone[47]=1;
              break;
              case 1 : 
              switch(S3687){
                case 0 : 
                switch(S3677){
                  case 0 : 
                  if(appliancePowerStoveR1A4_in.get_preempted()){
                                        tutu__890211867 = 0;
                                        tutu__890211867 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                    S3677=1;
active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                            tutu__19250439 = 0;
                                            tutu__19250439 = appliancePowerStoveR1A4_in.get_r_r();
                                            tutu__19250439++;
                                            appliancePowerStoveR1A4_in.set_r_r(tutu__19250439);
                                            appliancePowerStoveR1A4_in.get_val();
                                            ends[47]=2;
                                            ;
                                            appliancePowerStoveR1A4Int_thread_47 = (Integer)appliancePowerStoveR1A4_in.get_value();
                                            System.out.println("StoveR1A4's power:" + appliancePowerStoveR1A4Int_thread_47);
                                            appliancePowerStoveR1A4String_thread_47 = "" + appliancePowerStoveR1A4Int_thread_47;
                                            stoveR1A4PowerSignal.setPresent();
                      currsigs.addElement(stoveR1A4PowerSignal);
                      stoveR1A4PowerSignal.setValue(appliancePowerStoveR1A4String_thread_47);
                      System.out.println("Emitted stoveR1A4PowerSignal");
                      receivedStoveR1A4Powers_43.setPresent();
                      currsigs.addElement(receivedStoveR1A4Powers_43);
                      receivedStoveR1A4Powers_43.setValue(new Integer(appliancePowerStoveR1A4Int_thread_47));
                      System.out.println("Emitted receivedStoveR1A4Powers_43");
S3687=1;
active[47]=1;
                      ends[47]=1;
tdone[47]=1;
                      }
                    else {
                      active[47]=1;
                      ends[47]=1;
tdone[47]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3677=1;
S3677=0;
if(appliancePowerStoveR1A4_in.get_preempted()){
                                        tutu__890211867 = 0;
                                        tutu__890211867 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                    S3677=1;
active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                            tutu__19250439 = 0;
                                            tutu__19250439 = appliancePowerStoveR1A4_in.get_r_r();
                                            tutu__19250439++;
                                            appliancePowerStoveR1A4_in.set_r_r(tutu__19250439);
                                            appliancePowerStoveR1A4_in.get_val();
                                            ends[47]=2;
                                            ;
                                            appliancePowerStoveR1A4Int_thread_47 = (Integer)appliancePowerStoveR1A4_in.get_value();
                                            System.out.println("StoveR1A4's power:" + appliancePowerStoveR1A4Int_thread_47);
                                            appliancePowerStoveR1A4String_thread_47 = "" + appliancePowerStoveR1A4Int_thread_47;
                                            stoveR1A4PowerSignal.setPresent();
                      currsigs.addElement(stoveR1A4PowerSignal);
                      stoveR1A4PowerSignal.setValue(appliancePowerStoveR1A4String_thread_47);
                      System.out.println("Emitted stoveR1A4PowerSignal");
                      receivedStoveR1A4Powers_43.setPresent();
                      currsigs.addElement(receivedStoveR1A4Powers_43);
                      receivedStoveR1A4Powers_43.setValue(new Integer(appliancePowerStoveR1A4Int_thread_47));
                      System.out.println("Emitted receivedStoveR1A4Powers_43");
S3687=1;
active[47]=1;
                      ends[47]=1;
tdone[47]=1;
                      }
                    else {
                      active[47]=1;
                      ends[47]=1;
tdone[47]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3687=1;
S3687=0;
S3677=0;
if(appliancePowerStoveR1A4_in.get_preempted()){
                                    tutu__1747728292 = 0;
                                    tutu__1747728292 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                  S3677=1;
active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                else {
                  if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                        tutu__16941945 = 0;
                                        tutu__16941945 = appliancePowerStoveR1A4_in.get_r_r();
                                        tutu__16941945++;
                                        appliancePowerStoveR1A4_in.set_r_r(tutu__16941945);
                                        appliancePowerStoveR1A4_in.get_val();
                                        ends[47]=2;
                                        ;
                                        appliancePowerStoveR1A4Int_thread_47 = (Integer)appliancePowerStoveR1A4_in.get_value();
                                        System.out.println("StoveR1A4's power:" + appliancePowerStoveR1A4Int_thread_47);
                                        appliancePowerStoveR1A4String_thread_47 = "" + appliancePowerStoveR1A4Int_thread_47;
                                        stoveR1A4PowerSignal.setPresent();
                    currsigs.addElement(stoveR1A4PowerSignal);
                    stoveR1A4PowerSignal.setValue(appliancePowerStoveR1A4String_thread_47);
                    System.out.println("Emitted stoveR1A4PowerSignal");
                    receivedStoveR1A4Powers_43.setPresent();
                    currsigs.addElement(receivedStoveR1A4Powers_43);
                    receivedStoveR1A4Powers_43.setValue(new Integer(appliancePowerStoveR1A4Int_thread_47));
                    System.out.println("Emitted receivedStoveR1A4Powers_43");
S3687=1;
active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1316582418(int [] tdone, int [] ends){
          if(tdone[46] != 1){
            switch(S3673){
              case 0 : 
              active[46]=0;
              ends[46]=0;
tdone[46]=1;
              break;
              case 1 : 
              switch(S3643){
                case 0 : 
                switch(S3633){
                  case 0 : 
                  if(appliancePowerDryerR1A3_in.get_preempted()){
                                        tutu__1569131204 = 0;
                                        tutu__1569131204 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                    S3633=1;
active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                            tutu__63470575 = 0;
                                            tutu__63470575 = appliancePowerDryerR1A3_in.get_r_r();
                                            tutu__63470575++;
                                            appliancePowerDryerR1A3_in.set_r_r(tutu__63470575);
                                            appliancePowerDryerR1A3_in.get_val();
                                            ends[46]=2;
                                            ;
                                            appliancePowerDryerR1A3Int_thread_46 = (Integer)appliancePowerDryerR1A3_in.get_value();
                                            System.out.println("DryerR1A3's power:" + appliancePowerDryerR1A3Int_thread_46);
                                            appliancePowerDryerR1A3String_thread_46 = "" + appliancePowerDryerR1A3Int_thread_46;
                                            dryerR1A3PowerSignal.setPresent();
                      currsigs.addElement(dryerR1A3PowerSignal);
                      dryerR1A3PowerSignal.setValue(appliancePowerDryerR1A3String_thread_46);
                      System.out.println("Emitted dryerR1A3PowerSignal");
                      receivedDryerR1A3Powers_43.setPresent();
                      currsigs.addElement(receivedDryerR1A3Powers_43);
                      receivedDryerR1A3Powers_43.setValue(new Integer(appliancePowerDryerR1A3Int_thread_46));
                      System.out.println("Emitted receivedDryerR1A3Powers_43");
S3643=1;
active[46]=1;
                      ends[46]=1;
tdone[46]=1;
                      }
                    else {
                      active[46]=1;
                      ends[46]=1;
tdone[46]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3633=1;
S3633=0;
if(appliancePowerDryerR1A3_in.get_preempted()){
                                        tutu__1569131204 = 0;
                                        tutu__1569131204 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                    S3633=1;
active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                            tutu__63470575 = 0;
                                            tutu__63470575 = appliancePowerDryerR1A3_in.get_r_r();
                                            tutu__63470575++;
                                            appliancePowerDryerR1A3_in.set_r_r(tutu__63470575);
                                            appliancePowerDryerR1A3_in.get_val();
                                            ends[46]=2;
                                            ;
                                            appliancePowerDryerR1A3Int_thread_46 = (Integer)appliancePowerDryerR1A3_in.get_value();
                                            System.out.println("DryerR1A3's power:" + appliancePowerDryerR1A3Int_thread_46);
                                            appliancePowerDryerR1A3String_thread_46 = "" + appliancePowerDryerR1A3Int_thread_46;
                                            dryerR1A3PowerSignal.setPresent();
                      currsigs.addElement(dryerR1A3PowerSignal);
                      dryerR1A3PowerSignal.setValue(appliancePowerDryerR1A3String_thread_46);
                      System.out.println("Emitted dryerR1A3PowerSignal");
                      receivedDryerR1A3Powers_43.setPresent();
                      currsigs.addElement(receivedDryerR1A3Powers_43);
                      receivedDryerR1A3Powers_43.setValue(new Integer(appliancePowerDryerR1A3Int_thread_46));
                      System.out.println("Emitted receivedDryerR1A3Powers_43");
S3643=1;
active[46]=1;
                      ends[46]=1;
tdone[46]=1;
                      }
                    else {
                      active[46]=1;
                      ends[46]=1;
tdone[46]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3643=1;
S3643=0;
S3633=0;
if(appliancePowerDryerR1A3_in.get_preempted()){
                                    tutu__1718725435 = 0;
                                    tutu__1718725435 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                  S3633=1;
active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                else {
                  if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                        tutu__18096192 = 0;
                                        tutu__18096192 = appliancePowerDryerR1A3_in.get_r_r();
                                        tutu__18096192++;
                                        appliancePowerDryerR1A3_in.set_r_r(tutu__18096192);
                                        appliancePowerDryerR1A3_in.get_val();
                                        ends[46]=2;
                                        ;
                                        appliancePowerDryerR1A3Int_thread_46 = (Integer)appliancePowerDryerR1A3_in.get_value();
                                        System.out.println("DryerR1A3's power:" + appliancePowerDryerR1A3Int_thread_46);
                                        appliancePowerDryerR1A3String_thread_46 = "" + appliancePowerDryerR1A3Int_thread_46;
                                        dryerR1A3PowerSignal.setPresent();
                    currsigs.addElement(dryerR1A3PowerSignal);
                    dryerR1A3PowerSignal.setValue(appliancePowerDryerR1A3String_thread_46);
                    System.out.println("Emitted dryerR1A3PowerSignal");
                    receivedDryerR1A3Powers_43.setPresent();
                    currsigs.addElement(receivedDryerR1A3Powers_43);
                    receivedDryerR1A3Powers_43.setValue(new Integer(appliancePowerDryerR1A3Int_thread_46));
                    System.out.println("Emitted receivedDryerR1A3Powers_43");
S3643=1;
active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1033791977(int [] tdone, int [] ends){
          if(tdone[45] != 1){
            switch(S3629){
              case 0 : 
              active[45]=0;
              ends[45]=0;
tdone[45]=1;
              break;
              case 1 : 
              switch(S3599){
                case 0 : 
                switch(S3589){
                  case 0 : 
                  if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                        tutu__1067588644 = 0;
                                        tutu__1067588644 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S3589=1;
active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__60777333 = 0;
                                            tutu__60777333 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__60777333++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__60777333);
                                            appliancePowerDishwasherR1A2_in.get_val();
                                            ends[45]=2;
                                            ;
                                            appliancePowerDishwasherR1A2Int_thread_45 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                            System.out.println("DishwasherR1A2's power:" + appliancePowerDishwasherR1A2Int_thread_45);
                                            appliancePowerDishwasherR1A2String_thread_45 = "" + appliancePowerDishwasherR1A2Int_thread_45;
                                            dishwasherR1A2PowerSignal.setPresent();
                      currsigs.addElement(dishwasherR1A2PowerSignal);
                      dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_45);
                      System.out.println("Emitted dishwasherR1A2PowerSignal");
                      receivedDishwasherR1A2Powers_43.setPresent();
                      currsigs.addElement(receivedDishwasherR1A2Powers_43);
                      receivedDishwasherR1A2Powers_43.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_45));
                      System.out.println("Emitted receivedDishwasherR1A2Powers_43");
S3599=1;
active[45]=1;
                      ends[45]=1;
tdone[45]=1;
                      }
                    else {
                      active[45]=1;
                      ends[45]=1;
tdone[45]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3589=1;
S3589=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                        tutu__1067588644 = 0;
                                        tutu__1067588644 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S3589=1;
active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__60777333 = 0;
                                            tutu__60777333 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__60777333++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__60777333);
                                            appliancePowerDishwasherR1A2_in.get_val();
                                            ends[45]=2;
                                            ;
                                            appliancePowerDishwasherR1A2Int_thread_45 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                            System.out.println("DishwasherR1A2's power:" + appliancePowerDishwasherR1A2Int_thread_45);
                                            appliancePowerDishwasherR1A2String_thread_45 = "" + appliancePowerDishwasherR1A2Int_thread_45;
                                            dishwasherR1A2PowerSignal.setPresent();
                      currsigs.addElement(dishwasherR1A2PowerSignal);
                      dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_45);
                      System.out.println("Emitted dishwasherR1A2PowerSignal");
                      receivedDishwasherR1A2Powers_43.setPresent();
                      currsigs.addElement(receivedDishwasherR1A2Powers_43);
                      receivedDishwasherR1A2Powers_43.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_45));
                      System.out.println("Emitted receivedDishwasherR1A2Powers_43");
S3599=1;
active[45]=1;
                      ends[45]=1;
tdone[45]=1;
                      }
                    else {
                      active[45]=1;
                      ends[45]=1;
tdone[45]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3599=1;
S3599=0;
S3589=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                    tutu__1570351516 = 0;
                                    tutu__1570351516 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                  S3589=1;
active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                else {
                  if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                        tutu__63085826 = 0;
                                        tutu__63085826 = appliancePowerDishwasherR1A2_in.get_r_r();
                                        tutu__63085826++;
                                        appliancePowerDishwasherR1A2_in.set_r_r(tutu__63085826);
                                        appliancePowerDishwasherR1A2_in.get_val();
                                        ends[45]=2;
                                        ;
                                        appliancePowerDishwasherR1A2Int_thread_45 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                        System.out.println("DishwasherR1A2's power:" + appliancePowerDishwasherR1A2Int_thread_45);
                                        appliancePowerDishwasherR1A2String_thread_45 = "" + appliancePowerDishwasherR1A2Int_thread_45;
                                        dishwasherR1A2PowerSignal.setPresent();
                    currsigs.addElement(dishwasherR1A2PowerSignal);
                    dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_45);
                    System.out.println("Emitted dishwasherR1A2PowerSignal");
                    receivedDishwasherR1A2Powers_43.setPresent();
                    currsigs.addElement(receivedDishwasherR1A2Powers_43);
                    receivedDishwasherR1A2Powers_43.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_45));
                    System.out.println("Emitted receivedDishwasherR1A2Powers_43");
S3599=1;
active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1060339651(int [] tdone, int [] ends){
          if(tdone[44] != 1){
            switch(S3585){
              case 0 : 
              active[44]=0;
              ends[44]=0;
tdone[44]=1;
              break;
              case 1 : 
              switch(S3555){
                case 0 : 
                switch(S3545){
                  case 0 : 
                  if(appliancePowerFridgeR1A1_in.get_preempted()){
                                        tutu__239075076 = 0;
                                        tutu__239075076 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S3545=1;
active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__59623086 = 0;
                                            tutu__59623086 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__59623086++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__59623086);
                                            appliancePowerFridgeR1A1_in.get_val();
                                            ends[44]=2;
                                            ;
                                            appliancePowerFridgeR1A1Int_thread_44 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                            System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_44);
                                            appliancePowerFridgeR1A1String_thread_44 = "" + appliancePowerFridgeR1A1Int_thread_44;
                                            fridgeR1A1PowerSignal.setPresent();
                      currsigs.addElement(fridgeR1A1PowerSignal);
                      fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_44);
                      System.out.println("Emitted fridgeR1A1PowerSignal");
                      receivedFridgeR1A1Powers_43.setPresent();
                      currsigs.addElement(receivedFridgeR1A1Powers_43);
                      receivedFridgeR1A1Powers_43.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_44));
                      System.out.println("Emitted receivedFridgeR1A1Powers_43");
S3555=1;
active[44]=1;
                      ends[44]=1;
tdone[44]=1;
                      }
                    else {
                      active[44]=1;
                      ends[44]=1;
tdone[44]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S3545=1;
S3545=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                                        tutu__239075076 = 0;
                                        tutu__239075076 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S3545=1;
active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__59623086 = 0;
                                            tutu__59623086 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__59623086++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__59623086);
                                            appliancePowerFridgeR1A1_in.get_val();
                                            ends[44]=2;
                                            ;
                                            appliancePowerFridgeR1A1Int_thread_44 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                            System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_44);
                                            appliancePowerFridgeR1A1String_thread_44 = "" + appliancePowerFridgeR1A1Int_thread_44;
                                            fridgeR1A1PowerSignal.setPresent();
                      currsigs.addElement(fridgeR1A1PowerSignal);
                      fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_44);
                      System.out.println("Emitted fridgeR1A1PowerSignal");
                      receivedFridgeR1A1Powers_43.setPresent();
                      currsigs.addElement(receivedFridgeR1A1Powers_43);
                      receivedFridgeR1A1Powers_43.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_44));
                      System.out.println("Emitted receivedFridgeR1A1Powers_43");
S3555=1;
active[44]=1;
                      ends[44]=1;
tdone[44]=1;
                      }
                    else {
                      active[44]=1;
                      ends[44]=1;
tdone[44]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S3555=1;
S3555=0;
S3545=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                                    tutu__1896102212 = 0;
                                    tutu__1896102212 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                  S3545=1;
active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                else {
                  if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                        tutu__61931579 = 0;
                                        tutu__61931579 = appliancePowerFridgeR1A1_in.get_r_r();
                                        tutu__61931579++;
                                        appliancePowerFridgeR1A1_in.set_r_r(tutu__61931579);
                                        appliancePowerFridgeR1A1_in.get_val();
                                        ends[44]=2;
                                        ;
                                        appliancePowerFridgeR1A1Int_thread_44 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                        System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_44);
                                        appliancePowerFridgeR1A1String_thread_44 = "" + appliancePowerFridgeR1A1Int_thread_44;
                                        fridgeR1A1PowerSignal.setPresent();
                    currsigs.addElement(fridgeR1A1PowerSignal);
                    fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_44);
                    System.out.println("Emitted fridgeR1A1PowerSignal");
                    receivedFridgeR1A1Powers_43.setPresent();
                    currsigs.addElement(receivedFridgeR1A1Powers_43);
                    receivedFridgeR1A1Powers_43.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_44));
                    System.out.println("Emitted receivedFridgeR1A1Powers_43");
S3555=1;
active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1060724400(int [] tdone, int [] ends){
            if(tdone[72] != 1){
              S4199=1;
active[72]=1;
              ends[72]=1;
tdone[72]=1;
              }
            }
public void thread1058800655(int [] tdone, int [] ends){
            if(tdone[71] != 1){
              S4196=1;
active[71]=1;
              ends[71]=1;
tdone[71]=1;
              }
            }
public void thread1058415906(int [] tdone, int [] ends){
            if(tdone[70] != 1){
              S4193=1;
active[70]=1;
              ends[70]=1;
tdone[70]=1;
              }
            }
public void thread1059570153(int [] tdone, int [] ends){
            if(tdone[69] != 1){
              S4190=1;
active[69]=1;
              ends[69]=1;
tdone[69]=1;
              }
            }
public void thread1059185404(int [] tdone, int [] ends){
            if(tdone[68] != 1){
              S4187=1;
active[68]=1;
              ends[68]=1;
tdone[68]=1;
              }
            }
public void thread1069573624(int [] tdone, int [] ends){
            if(tdone[67] != 1){
              S4184=1;
active[67]=1;
              ends[67]=1;
tdone[67]=1;
              }
            }
public void thread1069188876(int [] tdone, int [] ends){
            if(tdone[66] != 1){
              S4181=1;
active[66]=1;
              ends[66]=1;
tdone[66]=1;
              }
            }
public void thread1070343122(int [] tdone, int [] ends){
            if(tdone[65] != 1){
              S4178=1;
active[65]=1;
              ends[65]=1;
tdone[65]=1;
              }
            }
public void thread1069958373(int [] tdone, int [] ends){
            if(tdone[64] != 1){
              S4175=1;
active[64]=1;
              ends[64]=1;
tdone[64]=1;
              }
            }
public void thread1068034629(int [] tdone, int [] ends){
            if(tdone[63] != 1){
              S4172=1;
active[63]=1;
              ends[63]=1;
tdone[63]=1;
              }
            }
public void thread1067649880(int [] tdone, int [] ends){
            if(tdone[62] != 1){
              S4169=1;
active[62]=1;
              ends[62]=1;
tdone[62]=1;
              }
            }
public void thread1068804127(int [] tdone, int [] ends){
            if(tdone[61] != 1){
              S4166=1;
active[61]=1;
              ends[61]=1;
tdone[61]=1;
              }
            }
public void thread1068419378(int [] tdone, int [] ends){
            if(tdone[60] != 1){
              S4163=1;
active[60]=1;
              ends[60]=1;
tdone[60]=1;
              }
            }
public void thread1066495633(int [] tdone, int [] ends){
            if(tdone[59] != 1){
              S4160=1;
active[59]=1;
              ends[59]=1;
tdone[59]=1;
              }
            }
public void thread1066110884(int [] tdone, int [] ends){
          if(tdone[58] != 1){
            S4288=1;
S4200=0;
thread1066495633(tdone,ends);
            thread1068419378(tdone,ends);
            thread1068804127(tdone,ends);
            thread1067649880(tdone,ends);
            thread1068034629(tdone,ends);
            thread1069958373(tdone,ends);
            thread1070343122(tdone,ends);
            thread1069188876(tdone,ends);
            thread1069573624(tdone,ends);
            thread1059185404(tdone,ends);
            thread1059570153(tdone,ends);
            thread1058415906(tdone,ends);
            thread1058800655(tdone,ends);
            thread1060724400(tdone,ends);
            int biggest1061109149 = 0;
            if(ends[59]>=biggest1061109149){
              biggest1061109149=ends[59];
}
            if(ends[60]>=biggest1061109149){
              biggest1061109149=ends[60];
}
            if(ends[61]>=biggest1061109149){
              biggest1061109149=ends[61];
}
            if(ends[62]>=biggest1061109149){
              biggest1061109149=ends[62];
}
            if(ends[63]>=biggest1061109149){
              biggest1061109149=ends[63];
}
            if(ends[64]>=biggest1061109149){
              biggest1061109149=ends[64];
}
            if(ends[65]>=biggest1061109149){
              biggest1061109149=ends[65];
}
            if(ends[66]>=biggest1061109149){
              biggest1061109149=ends[66];
}
            if(ends[67]>=biggest1061109149){
              biggest1061109149=ends[67];
}
            if(ends[68]>=biggest1061109149){
              biggest1061109149=ends[68];
}
            if(ends[69]>=biggest1061109149){
              biggest1061109149=ends[69];
}
            if(ends[70]>=biggest1061109149){
              biggest1061109149=ends[70];
}
            if(ends[71]>=biggest1061109149){
              biggest1061109149=ends[71];
}
            if(ends[72]>=biggest1061109149){
              biggest1061109149=ends[72];
}
            if(biggest1061109149 == 1){
              active[58]=1;
              ends[58]=1;
tdone[58]=1;
              }
            }
          }
public void thread1140367422(int [] tdone, int [] ends){
          if(tdone[57] != 1){
            S4157=1;
S4127=0;
S4117=0;
if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                            tutu__1086955517 = 0;
                            tutu__1086955517 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
              S4117=1;
active[57]=1;
              ends[57]=1;
tdone[57]=1;
              }
            else {
              if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                tutu__5014729 = 0;
                                tutu__5014729 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                tutu__5014729++;
                                appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__5014729);
                                appliancePowerWaterHeaterR4A14_in.get_val();
                                ends[57]=2;
                                ;
                                appliancePowerWaterHeaterR4A14Int_thread_57 = (Integer)appliancePowerWaterHeaterR4A14_in.get_value();
                                System.out.println("WaterHeaterR4A14's power:" + appliancePowerWaterHeaterR4A14Int_thread_57);
                                appliancePowerWaterHeaterR4A14String_thread_57 = "" + appliancePowerWaterHeaterR4A14Int_thread_57;
                                waterHeaterR4A14PowerSignal.setPresent();
                currsigs.addElement(waterHeaterR4A14PowerSignal);
                waterHeaterR4A14PowerSignal.setValue(appliancePowerWaterHeaterR4A14String_thread_57);
                System.out.println("Emitted waterHeaterR4A14PowerSignal");
                receivedWaterHeaterR4A14Powers_43.setPresent();
                currsigs.addElement(receivedWaterHeaterR4A14Powers_43);
                receivedWaterHeaterR4A14Powers_43.setValue(new Integer(appliancePowerWaterHeaterR4A14Int_thread_57));
                System.out.println("Emitted receivedWaterHeaterR4A14Powers_43");
S4127=1;
active[57]=1;
                ends[57]=1;
tdone[57]=1;
                }
              else {
                active[57]=1;
                ends[57]=1;
tdone[57]=1;
                }
              }
            }
          }
public void thread1117667237(int [] tdone, int [] ends){
          if(tdone[56] != 1){
            S4113=1;
S4083=0;
S4073=0;
if(appliancePowerFanR4A13_in.get_preempted()){
                            tutu__68529059 = 0;
                            tutu__68529059 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
              S4073=1;
active[56]=1;
              ends[56]=1;
tdone[56]=1;
              }
            else {
              if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                tutu__4629980 = 0;
                                tutu__4629980 = appliancePowerFanR4A13_in.get_r_r();
                                tutu__4629980++;
                                appliancePowerFanR4A13_in.set_r_r(tutu__4629980);
                                appliancePowerFanR4A13_in.get_val();
                                ends[56]=2;
                                ;
                                appliancePowerFanR4A13Int_thread_56 = (Integer)appliancePowerFanR4A13_in.get_value();
                                System.out.println("FanR4A13's power:" + appliancePowerFanR4A13Int_thread_56);
                                appliancePowerFanR4A13String_thread_56 = "" + appliancePowerFanR4A13Int_thread_56;
                                fanR4A13PowerSignal.setPresent();
                currsigs.addElement(fanR4A13PowerSignal);
                fanR4A13PowerSignal.setValue(appliancePowerFanR4A13String_thread_56);
                System.out.println("Emitted fanR4A13PowerSignal");
                receivedFanR4A13Powers_43.setPresent();
                currsigs.addElement(receivedFanR4A13Powers_43);
                receivedFanR4A13Powers_43.setValue(new Integer(appliancePowerFanR4A13Int_thread_56));
                System.out.println("Emitted receivedFanR4A13Powers_43");
S4083=1;
active[56]=1;
                ends[56]=1;
tdone[56]=1;
                }
              else {
                active[56]=1;
                ends[56]=1;
tdone[56]=1;
                }
              }
            }
          }
public void thread797556152(int [] tdone, int [] ends){
          if(tdone[55] != 1){
            S4069=1;
S4039=0;
S4029=0;
if(appliancePowerLightR4A12_in.get_preempted()){
                            tutu__897042627 = 0;
                            tutu__897042627 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
              S4029=1;
active[55]=1;
              ends[55]=1;
tdone[55]=1;
              }
            else {
              if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                tutu__5784227 = 0;
                                tutu__5784227 = appliancePowerLightR4A12_in.get_r_r();
                                tutu__5784227++;
                                appliancePowerLightR4A12_in.set_r_r(tutu__5784227);
                                appliancePowerLightR4A12_in.get_val();
                                ends[55]=2;
                                ;
                                appliancePowerLightR4A12Int_thread_55 = (Integer)appliancePowerLightR4A12_in.get_value();
                                System.out.println("LightR4A12's power:" + appliancePowerLightR4A12Int_thread_55);
                                appliancePowerLightR4A12String_thread_55 = "" + appliancePowerLightR4A12Int_thread_55;
                                lightR4A12PowerSignal.setPresent();
                currsigs.addElement(lightR4A12PowerSignal);
                lightR4A12PowerSignal.setValue(appliancePowerLightR4A12String_thread_55);
                System.out.println("Emitted lightR4A12PowerSignal");
                receivedLightR4A12Powers_43.setPresent();
                currsigs.addElement(receivedLightR4A12Powers_43);
                receivedLightR4A12Powers_43.setValue(new Integer(appliancePowerLightR4A12Int_thread_55));
                System.out.println("Emitted receivedLightR4A12Powers_43");
S4039=1;
active[55]=1;
                ends[55]=1;
tdone[55]=1;
                }
              else {
                active[55]=1;
                ends[55]=1;
tdone[55]=1;
                }
              }
            }
          }
public void thread773316971(int [] tdone, int [] ends){
          if(tdone[54] != 1){
            S4025=1;
S3995=0;
S3985=0;
if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                            tutu__1398585188 = 0;
                            tutu__1398585188 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
              S3985=1;
active[54]=1;
              ends[54]=1;
tdone[54]=1;
              }
            else {
              if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                tutu__8477469 = 0;
                                tutu__8477469 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                tutu__8477469++;
                                appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__8477469);
                                appliancePowerPowerPlugsR3A11_in.get_val();
                                ends[54]=2;
                                ;
                                appliancePowerPowerPlugsR3A11Int_thread_54 = (Integer)appliancePowerPowerPlugsR3A11_in.get_value();
                                System.out.println("PowerPlugsR3A11's power:" + appliancePowerPowerPlugsR3A11Int_thread_54);
                                appliancePowerPowerPlugsR3A11String_thread_54 = "" + appliancePowerPowerPlugsR3A11Int_thread_54;
                                powerplugsR3A11PowerSignal.setPresent();
                currsigs.addElement(powerplugsR3A11PowerSignal);
                powerplugsR3A11PowerSignal.setValue(appliancePowerPowerPlugsR3A11String_thread_54);
                System.out.println("Emitted powerplugsR3A11PowerSignal");
                receivedPowerPlugsR3A11Powers_43.setPresent();
                currsigs.addElement(receivedPowerPlugsR3A11Powers_43);
                receivedPowerPlugsR3A11Powers_43.setValue(new Integer(appliancePowerPowerPlugsR3A11Int_thread_54));
                System.out.println("Emitted receivedPowerPlugsR3A11Powers_43");
S3995=1;
active[54]=1;
                ends[54]=1;
tdone[54]=1;
                }
              else {
                active[54]=1;
                ends[54]=1;
tdone[54]=1;
                }
              }
            }
          }
public void thread846034513(int [] tdone, int [] ends){
          if(tdone[53] != 1){
            S3981=1;
S3951=0;
S3941=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                            tutu__766815269 = 0;
                            tutu__766815269 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
              S3941=1;
active[53]=1;
              ends[53]=1;
tdone[53]=1;
              }
            else {
              if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                tutu__21558932 = 0;
                                tutu__21558932 = appliancePowerLightR3A10_in.get_r_r();
                                tutu__21558932++;
                                appliancePowerLightR3A10_in.set_r_r(tutu__21558932);
                                appliancePowerLightR3A10_in.get_val();
                                ends[53]=2;
                                ;
                                appliancePowerLightR3A10Int_thread_53 = (Integer)appliancePowerLightR3A10_in.get_value();
                                System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_53);
                                appliancePowerLightR3A10String_thread_53 = "" + appliancePowerLightR3A10Int_thread_53;
                                lightR3A10PowerSignal.setPresent();
                currsigs.addElement(lightR3A10PowerSignal);
                lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_53);
                System.out.println("Emitted lightR3A10PowerSignal");
                receivedLightR3A10Powers_43.setPresent();
                currsigs.addElement(receivedLightR3A10Powers_43);
                receivedLightR3A10Powers_43.setValue(new Integer(appliancePowerLightR3A10Int_thread_53));
                System.out.println("Emitted receivedLightR3A10Powers_43");
S3951=1;
active[53]=1;
                ends[53]=1;
tdone[53]=1;
                }
              else {
                active[53]=1;
                ends[53]=1;
tdone[53]=1;
                }
              }
            }
          }
public void thread821795333(int [] tdone, int [] ends){
          if(tdone[52] != 1){
            S3937=1;
S3907=0;
S3897=0;
if(appliancePowerHeaterR3A9_in.get_preempted()){
                            tutu__1595328837 = 0;
                            tutu__1595328837 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
              S3897=1;
active[52]=1;
              ends[52]=1;
tdone[52]=1;
              }
            else {
              if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                tutu__22713179 = 0;
                                tutu__22713179 = appliancePowerHeaterR3A9_in.get_r_r();
                                tutu__22713179++;
                                appliancePowerHeaterR3A9_in.set_r_r(tutu__22713179);
                                appliancePowerHeaterR3A9_in.get_val();
                                ends[52]=2;
                                ;
                                appliancePowerHeaterR3A9Int_thread_52 = (Integer)appliancePowerHeaterR3A9_in.get_value();
                                System.out.println("HeaterR3A9's power:" + appliancePowerHeaterR3A9Int_thread_52);
                                appliancePowerHeaterR3A9String_thread_52 = "" + appliancePowerHeaterR3A9Int_thread_52;
                                heaterR3A9PowerSignal.setPresent();
                currsigs.addElement(heaterR3A9PowerSignal);
                heaterR3A9PowerSignal.setValue(appliancePowerHeaterR3A9String_thread_52);
                System.out.println("Emitted heaterR3A9PowerSignal");
                receivedHeaterR3A9Powers_43.setPresent();
                currsigs.addElement(receivedHeaterR3A9Powers_43);
                receivedHeaterR3A9Powers_43.setValue(new Integer(appliancePowerHeaterR3A9Int_thread_52));
                System.out.println("Emitted receivedHeaterR3A9Powers_43");
S3907=1;
active[52]=1;
                ends[52]=1;
tdone[52]=1;
                }
              else {
                active[52]=1;
                ends[52]=1;
tdone[52]=1;
                }
              }
            }
          }
public void thread897590866(int [] tdone, int [] ends){
          if(tdone[51] != 1){
            S3893=1;
S3863=0;
S3853=0;
if(appliancePowerHeaterR2A8_in.get_preempted()){
                            tutu__2096871397 = 0;
                            tutu__2096871397 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
              S3853=1;
active[51]=1;
              ends[51]=1;
tdone[51]=1;
              }
            else {
              if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                tutu__25406421 = 0;
                                tutu__25406421 = appliancePowerHeaterR2A8_in.get_r_r();
                                tutu__25406421++;
                                appliancePowerHeaterR2A8_in.set_r_r(tutu__25406421);
                                appliancePowerHeaterR2A8_in.get_val();
                                ends[51]=2;
                                ;
                                appliancePowerHeaterR2A8Int_thread_51 = (Integer)appliancePowerHeaterR2A8_in.get_value();
                                System.out.println("HeaterR2A8's power:" + appliancePowerHeaterR2A8Int_thread_51);
                                appliancePowerHeaterR2A8String_thread_51 = "" + appliancePowerHeaterR2A8Int_thread_51;
                                heaterR2A8PowerSignal.setPresent();
                currsigs.addElement(heaterR2A8PowerSignal);
                heaterR2A8PowerSignal.setValue(appliancePowerHeaterR2A8String_thread_51);
                System.out.println("Emitted heaterR2A8PowerSignal");
                receivedHeaterR2A8Powers_43.setPresent();
                currsigs.addElement(receivedHeaterR2A8Powers_43);
                receivedHeaterR2A8Powers_43.setValue(new Integer(appliancePowerHeaterR2A8Int_thread_51));
                System.out.println("Emitted receivedHeaterR2A8Powers_43");
S3863=1;
active[51]=1;
                ends[51]=1;
tdone[51]=1;
                }
              else {
                active[51]=1;
                ends[51]=1;
tdone[51]=1;
                }
              }
            }
          }
public void thread873351685(int [] tdone, int [] ends){
          if(tdone[50] != 1){
            S3849=1;
S3819=0;
S3809=0;
if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                            tutu__1369582331 = 0;
                            tutu__1369582331 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
              S3809=1;
active[50]=1;
              ends[50]=1;
tdone[50]=1;
              }
            else {
              if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                tutu__26560668 = 0;
                                tutu__26560668 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                tutu__26560668++;
                                appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__26560668);
                                appliancePowerPowerPlugsR2A7_in.get_val();
                                ends[50]=2;
                                ;
                                appliancePowerPowerPlugsR2A7Int_thread_50 = (Integer)appliancePowerPowerPlugsR2A7_in.get_value();
                                System.out.println("PowerPlugsR2A7's power:" + appliancePowerPowerPlugsR2A7Int_thread_50);
                                appliancePowerPowerPlugsR2A7String_thread_50 = "" + appliancePowerPowerPlugsR2A7Int_thread_50;
                                powerplugsR2A7PowerSignal.setPresent();
                currsigs.addElement(powerplugsR2A7PowerSignal);
                powerplugsR2A7PowerSignal.setValue(appliancePowerPowerPlugsR2A7String_thread_50);
                System.out.println("Emitted powerplugsR2A7PowerSignal");
                receivedPowerPlugsR2A7Powers_43.setPresent();
                currsigs.addElement(receivedPowerPlugsR2A7Powers_43);
                receivedPowerPlugsR2A7Powers_43.setValue(new Integer(appliancePowerPowerPlugsR2A7Int_thread_50));
                System.out.println("Emitted receivedPowerPlugsR2A7Powers_43");
S3819=1;
active[50]=1;
                ends[50]=1;
tdone[50]=1;
                }
              else {
                active[50]=1;
                ends[50]=1;
tdone[50]=1;
                }
              }
            }
          }
public void thread946069227(int [] tdone, int [] ends){
          if(tdone[49] != 1){
            S3805=1;
S3775=0;
S3765=0;
if(appliancePowerTVR2A6_in.get_preempted()){
                            tutu__2074699300 = 0;
                            tutu__2074699300 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
              S3765=1;
active[49]=1;
              ends[49]=1;
tdone[49]=1;
              }
            else {
              if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                tutu__15402950 = 0;
                                tutu__15402950 = appliancePowerTVR2A6_in.get_r_r();
                                tutu__15402950++;
                                appliancePowerTVR2A6_in.set_r_r(tutu__15402950);
                                appliancePowerTVR2A6_in.get_val();
                                ends[49]=2;
                                ;
                                appliancePowerTVR2A6Int_thread_49 = (Integer)appliancePowerTVR2A6_in.get_value();
                                System.out.println("TVR2A6's power:" + appliancePowerTVR2A6Int_thread_49);
                                appliancePowerTVR2A6String_thread_49 = "" + appliancePowerTVR2A6Int_thread_49;
                                TVR2A6PowerSignal.setPresent();
                currsigs.addElement(TVR2A6PowerSignal);
                TVR2A6PowerSignal.setValue(appliancePowerTVR2A6String_thread_49);
                System.out.println("Emitted TVR2A6PowerSignal");
                receivedTVR2A6Powers_43.setPresent();
                currsigs.addElement(receivedTVR2A6Powers_43);
                receivedTVR2A6Powers_43.setValue(new Integer(appliancePowerTVR2A6Int_thread_49));
                System.out.println("Emitted receivedTVR2A6Powers_43");
S3775=1;
active[49]=1;
                ends[49]=1;
tdone[49]=1;
                }
              else {
                active[49]=1;
                ends[49]=1;
tdone[49]=1;
                }
              }
            }
          }
public void thread921830047(int [] tdone, int [] ends){
          if(tdone[48] != 1){
            S3761=1;
S3731=0;
S3721=0;
if(appliancePowerOvenR1A5_in.get_preempted()){
                            tutu__1391754428 = 0;
                            tutu__1391754428 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
              S3721=1;
active[48]=1;
              ends[48]=1;
tdone[48]=1;
              }
            else {
              if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                tutu__16557196 = 0;
                                tutu__16557196 = appliancePowerOvenR1A5_in.get_r_r();
                                tutu__16557196++;
                                appliancePowerOvenR1A5_in.set_r_r(tutu__16557196);
                                appliancePowerOvenR1A5_in.get_val();
                                ends[48]=2;
                                ;
                                appliancePowerOvenR1A5Int_thread_48 = (Integer)appliancePowerOvenR1A5_in.get_value();
                                System.out.println("OvenR1A5's power:" + appliancePowerOvenR1A5Int_thread_48);
                                appliancePowerOvenR1A5String_thread_48 = "" + appliancePowerOvenR1A5Int_thread_48;
                                ovenR1A5PowerSignal.setPresent();
                currsigs.addElement(ovenR1A5PowerSignal);
                ovenR1A5PowerSignal.setValue(appliancePowerOvenR1A5String_thread_48);
                System.out.println("Emitted ovenR1A5PowerSignal");
                receivedOvenR1A5Powers_43.setPresent();
                currsigs.addElement(receivedOvenR1A5Powers_43);
                receivedOvenR1A5Powers_43.setValue(new Integer(appliancePowerOvenR1A5Int_thread_48));
                System.out.println("Emitted receivedOvenR1A5Powers_43");
S3731=1;
active[48]=1;
                ends[48]=1;
tdone[48]=1;
                }
              else {
                active[48]=1;
                ends[48]=1;
tdone[48]=1;
                }
              }
            }
          }
public void thread158503553(int [] tdone, int [] ends){
          if(tdone[47] != 1){
            S3717=1;
S3687=0;
S3677=0;
if(appliancePowerStoveR1A4_in.get_preempted()){
                            tutu__890211867 = 0;
                            tutu__890211867 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
              S3677=1;
active[47]=1;
              ends[47]=1;
tdone[47]=1;
              }
            else {
              if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                tutu__19250439 = 0;
                                tutu__19250439 = appliancePowerStoveR1A4_in.get_r_r();
                                tutu__19250439++;
                                appliancePowerStoveR1A4_in.set_r_r(tutu__19250439);
                                appliancePowerStoveR1A4_in.get_val();
                                ends[47]=2;
                                ;
                                appliancePowerStoveR1A4Int_thread_47 = (Integer)appliancePowerStoveR1A4_in.get_value();
                                System.out.println("StoveR1A4's power:" + appliancePowerStoveR1A4Int_thread_47);
                                appliancePowerStoveR1A4String_thread_47 = "" + appliancePowerStoveR1A4Int_thread_47;
                                stoveR1A4PowerSignal.setPresent();
                currsigs.addElement(stoveR1A4PowerSignal);
                stoveR1A4PowerSignal.setValue(appliancePowerStoveR1A4String_thread_47);
                System.out.println("Emitted stoveR1A4PowerSignal");
                receivedStoveR1A4Powers_43.setPresent();
                currsigs.addElement(receivedStoveR1A4Powers_43);
                receivedStoveR1A4Powers_43.setValue(new Integer(appliancePowerStoveR1A4Int_thread_47));
                System.out.println("Emitted receivedStoveR1A4Powers_43");
S3687=1;
active[47]=1;
                ends[47]=1;
tdone[47]=1;
                }
              else {
                active[47]=1;
                ends[47]=1;
tdone[47]=1;
                }
              }
            }
          }
public void thread134264372(int [] tdone, int [] ends){
          if(tdone[46] != 1){
            S3673=1;
S3643=0;
S3633=0;
if(appliancePowerDryerR1A3_in.get_preempted()){
                            tutu__1569131204 = 0;
                            tutu__1569131204 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
              S3633=1;
active[46]=1;
              ends[46]=1;
tdone[46]=1;
              }
            else {
              if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                tutu__63470575 = 0;
                                tutu__63470575 = appliancePowerDryerR1A3_in.get_r_r();
                                tutu__63470575++;
                                appliancePowerDryerR1A3_in.set_r_r(tutu__63470575);
                                appliancePowerDryerR1A3_in.get_val();
                                ends[46]=2;
                                ;
                                appliancePowerDryerR1A3Int_thread_46 = (Integer)appliancePowerDryerR1A3_in.get_value();
                                System.out.println("DryerR1A3's power:" + appliancePowerDryerR1A3Int_thread_46);
                                appliancePowerDryerR1A3String_thread_46 = "" + appliancePowerDryerR1A3Int_thread_46;
                                dryerR1A3PowerSignal.setPresent();
                currsigs.addElement(dryerR1A3PowerSignal);
                dryerR1A3PowerSignal.setValue(appliancePowerDryerR1A3String_thread_46);
                System.out.println("Emitted dryerR1A3PowerSignal");
                receivedDryerR1A3Powers_43.setPresent();
                currsigs.addElement(receivedDryerR1A3Powers_43);
                receivedDryerR1A3Powers_43.setValue(new Integer(appliancePowerDryerR1A3Int_thread_46));
                System.out.println("Emitted receivedDryerR1A3Powers_43");
S3643=1;
active[46]=1;
                ends[46]=1;
tdone[46]=1;
                }
              else {
                active[46]=1;
                ends[46]=1;
tdone[46]=1;
                }
              }
            }
          }
public void thread206981915(int [] tdone, int [] ends){
          if(tdone[45] != 1){
            S3629=1;
S3599=0;
S3589=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                            tutu__1067588644 = 0;
                            tutu__1067588644 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
              S3589=1;
active[45]=1;
              ends[45]=1;
tdone[45]=1;
              }
            else {
              if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                tutu__60777333 = 0;
                                tutu__60777333 = appliancePowerDishwasherR1A2_in.get_r_r();
                                tutu__60777333++;
                                appliancePowerDishwasherR1A2_in.set_r_r(tutu__60777333);
                                appliancePowerDishwasherR1A2_in.get_val();
                                ends[45]=2;
                                ;
                                appliancePowerDishwasherR1A2Int_thread_45 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                System.out.println("DishwasherR1A2's power:" + appliancePowerDishwasherR1A2Int_thread_45);
                                appliancePowerDishwasherR1A2String_thread_45 = "" + appliancePowerDishwasherR1A2Int_thread_45;
                                dishwasherR1A2PowerSignal.setPresent();
                currsigs.addElement(dishwasherR1A2PowerSignal);
                dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_45);
                System.out.println("Emitted dishwasherR1A2PowerSignal");
                receivedDishwasherR1A2Powers_43.setPresent();
                currsigs.addElement(receivedDishwasherR1A2Powers_43);
                receivedDishwasherR1A2Powers_43.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_45));
                System.out.println("Emitted receivedDishwasherR1A2Powers_43");
S3599=1;
active[45]=1;
                ends[45]=1;
tdone[45]=1;
                }
              else {
                active[45]=1;
                ends[45]=1;
tdone[45]=1;
                }
              }
            }
          }
public void thread182742734(int [] tdone, int [] ends){
          if(tdone[44] != 1){
            S3585=1;
S3555=0;
S3545=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                            tutu__239075076 = 0;
                            tutu__239075076 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
              S3545=1;
active[44]=1;
              ends[44]=1;
tdone[44]=1;
              }
            else {
              if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                tutu__59623086 = 0;
                                tutu__59623086 = appliancePowerFridgeR1A1_in.get_r_r();
                                tutu__59623086++;
                                appliancePowerFridgeR1A1_in.set_r_r(tutu__59623086);
                                appliancePowerFridgeR1A1_in.get_val();
                                ends[44]=2;
                                ;
                                appliancePowerFridgeR1A1Int_thread_44 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_44);
                                appliancePowerFridgeR1A1String_thread_44 = "" + appliancePowerFridgeR1A1Int_thread_44;
                                fridgeR1A1PowerSignal.setPresent();
                currsigs.addElement(fridgeR1A1PowerSignal);
                fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_44);
                System.out.println("Emitted fridgeR1A1PowerSignal");
                receivedFridgeR1A1Powers_43.setPresent();
                currsigs.addElement(receivedFridgeR1A1Powers_43);
                receivedFridgeR1A1Powers_43.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_44));
                System.out.println("Emitted receivedFridgeR1A1Powers_43");
S3555=1;
active[44]=1;
                ends[44]=1;
tdone[44]=1;
                }
              else {
                active[44]=1;
                ends[44]=1;
tdone[44]=1;
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
				switch(S4290){
          case 0 : 
          S4290=0;
          break RUN;
                    case 1 : 
          S4290=2;
          receivedFridgeR1A1Powers_43.setClear();
                    receivedDishwasherR1A2Powers_43.setClear();
                    receivedDryerR1A3Powers_43.setClear();
                    receivedStoveR1A4Powers_43.setClear();
                    receivedOvenR1A5Powers_43.setClear();
                    receivedTVR2A6Powers_43.setClear();
                    receivedPowerPlugsR2A7Powers_43.setClear();
                    receivedHeaterR2A8Powers_43.setClear();
                    receivedHeaterR3A9Powers_43.setClear();
                    receivedLightR3A10Powers_43.setClear();
                    receivedPowerPlugsR3A11Powers_43.setClear();
                    receivedLightR4A12Powers_43.setClear();
                    receivedFanR4A13Powers_43.setClear();
                    receivedWaterHeaterR4A14Powers_43.setClear();
          thread182742734(tdone,ends);
          thread206981915(tdone,ends);
          thread134264372(tdone,ends);
          thread158503553(tdone,ends);
          thread921830047(tdone,ends);
          thread946069227(tdone,ends);
          thread873351685(tdone,ends);
          thread897590866(tdone,ends);
          thread821795333(tdone,ends);
          thread846034513(tdone,ends);
          thread773316971(tdone,ends);
          thread797556152(tdone,ends);
          thread1117667237(tdone,ends);
          thread1140367422(tdone,ends);
          thread1066110884(tdone,ends);
          int biggest1059954902 = 0;
          if(ends[44]>=biggest1059954902){
            biggest1059954902=ends[44];
}
          if(ends[45]>=biggest1059954902){
            biggest1059954902=ends[45];
}
          if(ends[46]>=biggest1059954902){
            biggest1059954902=ends[46];
}
          if(ends[47]>=biggest1059954902){
            biggest1059954902=ends[47];
}
          if(ends[48]>=biggest1059954902){
            biggest1059954902=ends[48];
}
          if(ends[49]>=biggest1059954902){
            biggest1059954902=ends[49];
}
          if(ends[50]>=biggest1059954902){
            biggest1059954902=ends[50];
}
          if(ends[51]>=biggest1059954902){
            biggest1059954902=ends[51];
}
          if(ends[52]>=biggest1059954902){
            biggest1059954902=ends[52];
}
          if(ends[53]>=biggest1059954902){
            biggest1059954902=ends[53];
}
          if(ends[54]>=biggest1059954902){
            biggest1059954902=ends[54];
}
          if(ends[55]>=biggest1059954902){
            biggest1059954902=ends[55];
}
          if(ends[56]>=biggest1059954902){
            biggest1059954902=ends[56];
}
          if(ends[57]>=biggest1059954902){
            biggest1059954902=ends[57];
}
          if(ends[58]>=biggest1059954902){
            biggest1059954902=ends[58];
}
          if(biggest1059954902 == 1){
            active[43]=1;
            ends[43]=1;
            break RUN;
            }
                    case 2 : 
                    receivedFridgeR1A1Powers_43.setClear();
                    receivedDishwasherR1A2Powers_43.setClear();
                    receivedDryerR1A3Powers_43.setClear();
                    receivedStoveR1A4Powers_43.setClear();
                    receivedOvenR1A5Powers_43.setClear();
                    receivedTVR2A6Powers_43.setClear();
                    receivedPowerPlugsR2A7Powers_43.setClear();
                    receivedHeaterR2A8Powers_43.setClear();
                    receivedHeaterR3A9Powers_43.setClear();
                    receivedLightR3A10Powers_43.setClear();
                    receivedPowerPlugsR3A11Powers_43.setClear();
                    receivedLightR4A12Powers_43.setClear();
                    receivedFanR4A13Powers_43.setClear();
                    receivedWaterHeaterR4A14Powers_43.setClear();
          thread1060339651(tdone,ends);
          thread1033791977(tdone,ends);
          thread1316582418(tdone,ends);
          thread1290034744(tdone,ends);
          thread1163452356(tdone,ends);
          thread1518575591(tdone,ends);
          thread1395071194(tdone,ends);
          thread1368523520(tdone,ends);
          thread72304475(tdone,ends);
          thread45756801(tdone,ends);
          thread316235278(tdone,ends);
          thread289687604(tdone,ends);
          thread249288969(tdone,ends);
          thread518228451(tdone,ends);
          thread493219772(tdone,ends);
          int biggest429351455 = 0;
          if(ends[44]>=biggest429351455){
            biggest429351455=ends[44];
}
          if(ends[45]>=biggest429351455){
            biggest429351455=ends[45];
}
          if(ends[46]>=biggest429351455){
            biggest429351455=ends[46];
}
          if(ends[47]>=biggest429351455){
            biggest429351455=ends[47];
}
          if(ends[48]>=biggest429351455){
            biggest429351455=ends[48];
}
          if(ends[49]>=biggest429351455){
            biggest429351455=ends[49];
}
          if(ends[50]>=biggest429351455){
            biggest429351455=ends[50];
}
          if(ends[51]>=biggest429351455){
            biggest429351455=ends[51];
}
          if(ends[52]>=biggest429351455){
            biggest429351455=ends[52];
}
          if(ends[53]>=biggest429351455){
            biggest429351455=ends[53];
}
          if(ends[54]>=biggest429351455){
            biggest429351455=ends[54];
}
          if(ends[55]>=biggest429351455){
            biggest429351455=ends[55];
}
          if(ends[56]>=biggest429351455){
            biggest429351455=ends[56];
}
          if(ends[57]>=biggest429351455){
            biggest429351455=ends[57];
}
          if(ends[58]>=biggest429351455){
            biggest429351455=ends[58];
}
          if(biggest429351455 == 1){
            active[43]=1;
            ends[43]=1;
            break RUN;
            }
          //FINXME code
if(biggest429351455 == 0){
            S4290=0;
active[43]=0;
            ends[43]=0;
S4290=0;
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
		receivedFridgeR1A1Powers_43 = new Signal();
		receivedDishwasherR1A2Powers_43 = new Signal();
		receivedDryerR1A3Powers_43 = new Signal();
		receivedStoveR1A4Powers_43 = new Signal();
		receivedOvenR1A5Powers_43 = new Signal();
		receivedTVR2A6Powers_43 = new Signal();
		receivedPowerPlugsR2A7Powers_43 = new Signal();
		receivedHeaterR2A8Powers_43 = new Signal();
		receivedHeaterR3A9Powers_43 = new Signal();
		receivedLightR3A10Powers_43 = new Signal();
		receivedPowerPlugsR3A11Powers_43 = new Signal();
		receivedLightR4A12Powers_43 = new Signal();
		receivedFanR4A13Powers_43 = new Signal();
		receivedWaterHeaterR4A14Powers_43 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[43] != 0){
		int index = 43;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[43]!=0 || suspended[43]!=0 || active[43]!=1);
			else{
				appliancePowerFridgeR1A1_in.update_r_s();
				appliancePowerDishwasherR1A2_in.update_r_s();
				appliancePowerDryerR1A3_in.update_r_s();
				appliancePowerStoveR1A4_in.update_r_s();
				appliancePowerOvenR1A5_in.update_r_s();
				appliancePowerTVR2A6_in.update_r_s();
				appliancePowerPowerPlugsR2A7_in.update_r_s();
				appliancePowerHeaterR2A8_in.update_r_s();
				appliancePowerHeaterR3A9_in.update_r_s();
				appliancePowerLightR3A10_in.update_r_s();
				appliancePowerPowerPlugsR3A11_in.update_r_s();
				appliancePowerLightR4A12_in.update_r_s();
				appliancePowerFanR4A13_in.update_r_s();
				appliancePowerWaterHeaterR4A14_in.update_r_s();
				if(!df){
					appliancePowerFridgeR1A1_in.gethook();
					appliancePowerDishwasherR1A2_in.gethook();
					appliancePowerDryerR1A3_in.gethook();
					appliancePowerStoveR1A4_in.gethook();
					appliancePowerOvenR1A5_in.gethook();
					appliancePowerTVR2A6_in.gethook();
					appliancePowerPowerPlugsR2A7_in.gethook();
					appliancePowerHeaterR2A8_in.gethook();
					appliancePowerHeaterR3A9_in.gethook();
					appliancePowerLightR3A10_in.gethook();
					appliancePowerPowerPlugsR3A11_in.gethook();
					appliancePowerLightR4A12_in.gethook();
					appliancePowerFanR4A13_in.gethook();
					appliancePowerWaterHeaterR4A14_in.gethook();
					df = true;
				}
				runClockDomain();
			}
			date.setpreclear();
			time.setpreclear();
			fridgeR1A1PowerSignal.setpreclear();
			dishwasherR1A2PowerSignal.setpreclear();
			dryerR1A3PowerSignal.setpreclear();
			stoveR1A4PowerSignal.setpreclear();
			ovenR1A5PowerSignal.setpreclear();
			TVR2A6PowerSignal.setpreclear();
			powerplugsR2A7PowerSignal.setpreclear();
			heaterR2A8PowerSignal.setpreclear();
			heaterR3A9PowerSignal.setpreclear();
			lightR3A10PowerSignal.setpreclear();
			powerplugsR3A11PowerSignal.setpreclear();
			lightR4A12PowerSignal.setpreclear();
			fanR4A13PowerSignal.setpreclear();
			waterHeaterR4A14PowerSignal.setpreclear();
			aggregatedPowerSignal.setpreclear();
			receivedFridgeR1A1Powers_43.setpreclear();
			receivedDishwasherR1A2Powers_43.setpreclear();
			receivedDryerR1A3Powers_43.setpreclear();
			receivedStoveR1A4Powers_43.setpreclear();
			receivedOvenR1A5Powers_43.setpreclear();
			receivedTVR2A6Powers_43.setpreclear();
			receivedPowerPlugsR2A7Powers_43.setpreclear();
			receivedHeaterR2A8Powers_43.setpreclear();
			receivedHeaterR3A9Powers_43.setpreclear();
			receivedLightR3A10Powers_43.setpreclear();
			receivedPowerPlugsR3A11Powers_43.setpreclear();
			receivedLightR4A12Powers_43.setpreclear();
			receivedFanR4A13Powers_43.setpreclear();
			receivedWaterHeaterR4A14Powers_43.setpreclear();
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
			dishwasherR1A2PowerSignal.sethook();
			dishwasherR1A2PowerSignal.setClear();
			dryerR1A3PowerSignal.sethook();
			dryerR1A3PowerSignal.setClear();
			stoveR1A4PowerSignal.sethook();
			stoveR1A4PowerSignal.setClear();
			ovenR1A5PowerSignal.sethook();
			ovenR1A5PowerSignal.setClear();
			TVR2A6PowerSignal.sethook();
			TVR2A6PowerSignal.setClear();
			powerplugsR2A7PowerSignal.sethook();
			powerplugsR2A7PowerSignal.setClear();
			heaterR2A8PowerSignal.sethook();
			heaterR2A8PowerSignal.setClear();
			heaterR3A9PowerSignal.sethook();
			heaterR3A9PowerSignal.setClear();
			lightR3A10PowerSignal.sethook();
			lightR3A10PowerSignal.setClear();
			powerplugsR3A11PowerSignal.sethook();
			powerplugsR3A11PowerSignal.setClear();
			lightR4A12PowerSignal.sethook();
			lightR4A12PowerSignal.setClear();
			fanR4A13PowerSignal.sethook();
			fanR4A13PowerSignal.setClear();
			waterHeaterR4A14PowerSignal.sethook();
			waterHeaterR4A14PowerSignal.setClear();
			aggregatedPowerSignal.sethook();
			aggregatedPowerSignal.setClear();
			receivedFridgeR1A1Powers_43.setClear();
			receivedDishwasherR1A2Powers_43.setClear();
			receivedDryerR1A3Powers_43.setClear();
			receivedStoveR1A4Powers_43.setClear();
			receivedOvenR1A5Powers_43.setClear();
			receivedTVR2A6Powers_43.setClear();
			receivedPowerPlugsR2A7Powers_43.setClear();
			receivedHeaterR2A8Powers_43.setClear();
			receivedHeaterR3A9Powers_43.setClear();
			receivedLightR3A10Powers_43.setClear();
			receivedPowerPlugsR3A11Powers_43.setClear();
			receivedLightR4A12Powers_43.setClear();
			receivedFanR4A13Powers_43.setClear();
			receivedWaterHeaterR4A14Powers_43.setClear();
			appliancePowerFridgeR1A1_in.sethook();
			appliancePowerDishwasherR1A2_in.sethook();
			appliancePowerDryerR1A3_in.sethook();
			appliancePowerStoveR1A4_in.sethook();
			appliancePowerOvenR1A5_in.sethook();
			appliancePowerTVR2A6_in.sethook();
			appliancePowerPowerPlugsR2A7_in.sethook();
			appliancePowerHeaterR2A8_in.sethook();
			appliancePowerHeaterR3A9_in.sethook();
			appliancePowerLightR3A10_in.sethook();
			appliancePowerPowerPlugsR3A11_in.sethook();
			appliancePowerLightR4A12_in.sethook();
			appliancePowerFanR4A13_in.sethook();
			appliancePowerWaterHeaterR4A14_in.sethook();
			if(paused[43]!=0 || suspended[43]!=0 || active[43]!=1);
			else{
				appliancePowerFridgeR1A1_in.gethook();
				appliancePowerDishwasherR1A2_in.gethook();
				appliancePowerDryerR1A3_in.gethook();
				appliancePowerStoveR1A4_in.gethook();
				appliancePowerOvenR1A5_in.gethook();
				appliancePowerTVR2A6_in.gethook();
				appliancePowerPowerPlugsR2A7_in.gethook();
				appliancePowerHeaterR2A8_in.gethook();
				appliancePowerHeaterR3A9_in.gethook();
				appliancePowerLightR3A10_in.gethook();
				appliancePowerPowerPlugsR3A11_in.gethook();
				appliancePowerLightR4A12_in.gethook();
				appliancePowerFanR4A13_in.gethook();
				appliancePowerWaterHeaterR4A14_in.gethook();
			}
			if(active[43] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
