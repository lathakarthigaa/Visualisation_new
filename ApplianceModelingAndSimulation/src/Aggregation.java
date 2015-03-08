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
	private int tutu__1182102398;
	private int tutu__1884977460;
	private int tutu__1179793904;
	private int appliancePowerFridgeR1A1Int_thread_44;
	private String appliancePowerFridgeR1A1String_thread_44;
	private int tutu__752962700;
	private int tutu__1180948151;
	private int tutu__1581476268;
	private int tutu__1178639657;
	private int appliancePowerDishwasherR1A2Int_thread_45;
	private String appliancePowerDishwasherR1A2String_thread_45;
	private int tutu__75550868;
	private int tutu__1178254909;
	private int tutu__1079933708;
	private int tutu__1163634450;
	private int appliancePowerDryerR1A3Int_thread_46;
	private String appliancePowerDryerR1A3String_thread_46;
	private int tutu__2038674634;
	private int tutu__1161710706;
	private int tutu__773837078;
	private int tutu__1162480204;
	private int appliancePowerStoveR1A4Int_thread_47;
	private String appliancePowerStoveR1A4String_thread_47;
	private int tutu__1210161066;
	private int tutu__1162095455;
	private int tutu__1929321654;
	private int tutu__1159786961;
	private int appliancePowerOvenR1A5Int_thread_48;
	private String appliancePowerOvenR1A5String_thread_48;
	private int tutu__708618506;
	private int tutu__1160556459;
	private int tutu__1602350646;
	private int tutu__1170559931;
	private int appliancePowerTVR2A6Int_thread_49;
	private String appliancePowerTVR2A6String_thread_49;
	private int tutu__1580178549;
	private int tutu__1170175182;
	private int tutu__424693973;
	private int tutu__1167866688;
	private int appliancePowerPowerPlugsR2A7Int_thread_50;
	private String appliancePowerPowerPlugsR2A7String_thread_50;
	private int tutu__2081721110;
	private int tutu__1167481939;
	private int tutu__926236534;
	private int tutu__1168251437;
	private int appliancePowerHeaterR2A8Int_thread_51;
	private String appliancePowerHeaterR2A8String_thread_51;
	private int tutu__1057761610;
	private int tutu__1166327693;
	private int tutu__1754750102;
	private int tutu__1167097190;
	private int appliancePowerHeaterR3A9Int_thread_52;
	private String appliancePowerHeaterR3A9String_thread_52;
	private int tutu__229248042;
	private int tutu__1166712442;
	private int tutu__1384732618;
	private int tutu__1249818204;
	private int appliancePowerLightR3A10Int_thread_53;
	private String appliancePowerLightR3A10String_thread_53;
	private int tutu__908167379;
	private int tutu__1247894459;
	private int tutu__1904344333;
	private int tutu__1248663957;
	private int appliancePowerPowerPlugsR3A11Int_thread_54;
	private String appliancePowerPowerPlugsR3A11String_thread_54;
	private int tutu__79653811;
	private int tutu__1248279208;
	private int tutu__1235138387;
	private int tutu__1245970715;
	private int appliancePowerLightR4A12Int_thread_55;
	private String appliancePowerLightR4A12String_thread_55;
	private int tutu__421888749;
	private int tutu__1247124962;
	private int tutu__406624819;
	private int tutu__1257128433;
	private int appliancePowerFanR4A13Int_thread_56;
	private String appliancePowerFanR4A13String_thread_56;
	private int tutu__428796916;
	private int tutu__1256743684;
	private int tutu__1584281492;
	private int tutu__1255974186;
	private int appliancePowerWaterHeaterR4A14Int_thread_57;
	private String appliancePowerWaterHeaterR4A14String_thread_57;
	private int tutu__399716652;
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
		public void thread1471910840(int [] tdone, int [] ends){
                if(tdone[72] != 1){
                  S4199=1;
active[72]=1;
                  ends[72]=1;
tdone[72]=1;
                  }
                }
public void thread1473065086(int [] tdone, int [] ends){
                if(tdone[71] != 1){
                  S4196=1;
active[71]=1;
                  ends[71]=1;
tdone[71]=1;
                  }
                }
public void thread1472680337(int [] tdone, int [] ends){
                if(tdone[70] != 1){
                  S4193=1;
active[70]=1;
                  ends[70]=1;
tdone[70]=1;
                  }
                }
public void thread1470756593(int [] tdone, int [] ends){
                if(tdone[69] != 1){
                  S4190=1;
active[69]=1;
                  ends[69]=1;
tdone[69]=1;
                  }
                }
public void thread1470371844(int [] tdone, int [] ends){
                if(tdone[68] != 1){
                  S4187=1;
active[68]=1;
                  ends[68]=1;
tdone[68]=1;
                  }
                }
public void thread1471526091(int [] tdone, int [] ends){
                if(tdone[67] != 1){
                  S4184=1;
active[67]=1;
                  ends[67]=1;
tdone[67]=1;
                  }
                }
public void thread1471141342(int [] tdone, int [] ends){
                if(tdone[66] != 1){
                  S4181=1;
active[66]=1;
                  ends[66]=1;
tdone[66]=1;
                  }
                }
public void thread1469217597(int [] tdone, int [] ends){
                if(tdone[65] != 1){
                  S4178=1;
active[65]=1;
                  ends[65]=1;
tdone[65]=1;
                  }
                }
public void thread1468832848(int [] tdone, int [] ends){
                if(tdone[64] != 1){
                  S4175=1;
active[64]=1;
                  ends[64]=1;
tdone[64]=1;
                  }
                }
public void thread1469987095(int [] tdone, int [] ends){
                if(tdone[63] != 1){
                  S4172=1;
active[63]=1;
                  ends[63]=1;
tdone[63]=1;
                  }
                }
public void thread1469602346(int [] tdone, int [] ends){
                if(tdone[62] != 1){
                  S4169=1;
active[62]=1;
                  ends[62]=1;
tdone[62]=1;
                  }
                }
public void thread1467678602(int [] tdone, int [] ends){
                if(tdone[61] != 1){
                  S4166=1;
active[61]=1;
                  ends[61]=1;
tdone[61]=1;
                  }
                }
public void thread1467293853(int [] tdone, int [] ends){
                if(tdone[60] != 1){
                  S4163=1;
active[60]=1;
                  ends[60]=1;
tdone[60]=1;
                  }
                }
public void thread1468448099(int [] tdone, int [] ends){
                if(tdone[59] != 1){
                  S4160=1;
active[59]=1;
                  ends[59]=1;
tdone[59]=1;
                  }
                }
public void thread1554247104(int [] tdone, int [] ends){
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
public void thread1540011395(int [] tdone, int [] ends){
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
public void thread1539626646(int [] tdone, int [] ends){
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
public void thread1540780893(int [] tdone, int [] ends){
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
public void thread1540396144(int [] tdone, int [] ends){
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
public void thread1538472399(int [] tdone, int [] ends){
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
public void thread1538087650(int [] tdone, int [] ends){
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
public void thread1539241897(int [] tdone, int [] ends){
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
public void thread1538857148(int [] tdone, int [] ends){
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
public void thread1536933404(int [] tdone, int [] ends){
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
public void thread1536548655(int [] tdone, int [] ends){
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
public void thread1537702901(int [] tdone, int [] ends){
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
public void thread1537318153(int [] tdone, int [] ends){
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
public void thread1535394408(int [] tdone, int [] ends){
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
public void thread1535009659(int [] tdone, int [] ends){
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
                thread1535394408(tdone,ends);
                thread1537318153(tdone,ends);
                thread1537702901(tdone,ends);
                thread1536548655(tdone,ends);
                thread1536933404(tdone,ends);
                thread1538857148(tdone,ends);
                thread1539241897(tdone,ends);
                thread1538087650(tdone,ends);
                thread1538472399(tdone,ends);
                thread1540396144(tdone,ends);
                thread1540780893(tdone,ends);
                thread1539626646(tdone,ends);
                thread1540011395(tdone,ends);
                thread1554247104(tdone,ends);
                int biggest1554631853 = 0;
                if(ends[59]>=biggest1554631853){
                  biggest1554631853=ends[59];
}
                if(ends[60]>=biggest1554631853){
                  biggest1554631853=ends[60];
}
                if(ends[61]>=biggest1554631853){
                  biggest1554631853=ends[61];
}
                if(ends[62]>=biggest1554631853){
                  biggest1554631853=ends[62];
}
                if(ends[63]>=biggest1554631853){
                  biggest1554631853=ends[63];
}
                if(ends[64]>=biggest1554631853){
                  biggest1554631853=ends[64];
}
                if(ends[65]>=biggest1554631853){
                  biggest1554631853=ends[65];
}
                if(ends[66]>=biggest1554631853){
                  biggest1554631853=ends[66];
}
                if(ends[67]>=biggest1554631853){
                  biggest1554631853=ends[67];
}
                if(ends[68]>=biggest1554631853){
                  biggest1554631853=ends[68];
}
                if(ends[69]>=biggest1554631853){
                  biggest1554631853=ends[69];
}
                if(ends[70]>=biggest1554631853){
                  biggest1554631853=ends[70];
}
                if(ends[71]>=biggest1554631853){
                  biggest1554631853=ends[71];
}
                if(ends[72]>=biggest1554631853){
                  biggest1554631853=ends[72];
}
                if(biggest1554631853 == 1){
                  active[58]=1;
                  ends[58]=1;
tdone[58]=1;
                  }
                //FINXME code
if(biggest1554631853 == 0){
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
thread1468448099(tdone,ends);
                thread1467293853(tdone,ends);
                thread1467678602(tdone,ends);
                thread1469602346(tdone,ends);
                thread1469987095(tdone,ends);
                thread1468832848(tdone,ends);
                thread1469217597(tdone,ends);
                thread1471141342(tdone,ends);
                thread1471526091(tdone,ends);
                thread1470371844(tdone,ends);
                thread1470756593(tdone,ends);
                thread1472680337(tdone,ends);
                thread1473065086(tdone,ends);
                thread1471910840(tdone,ends);
                int biggest1472295588 = 0;
                if(ends[59]>=biggest1472295588){
                  biggest1472295588=ends[59];
}
                if(ends[60]>=biggest1472295588){
                  biggest1472295588=ends[60];
}
                if(ends[61]>=biggest1472295588){
                  biggest1472295588=ends[61];
}
                if(ends[62]>=biggest1472295588){
                  biggest1472295588=ends[62];
}
                if(ends[63]>=biggest1472295588){
                  biggest1472295588=ends[63];
}
                if(ends[64]>=biggest1472295588){
                  biggest1472295588=ends[64];
}
                if(ends[65]>=biggest1472295588){
                  biggest1472295588=ends[65];
}
                if(ends[66]>=biggest1472295588){
                  biggest1472295588=ends[66];
}
                if(ends[67]>=biggest1472295588){
                  biggest1472295588=ends[67];
}
                if(ends[68]>=biggest1472295588){
                  biggest1472295588=ends[68];
}
                if(ends[69]>=biggest1472295588){
                  biggest1472295588=ends[69];
}
                if(ends[70]>=biggest1472295588){
                  biggest1472295588=ends[70];
}
                if(ends[71]>=biggest1472295588){
                  biggest1472295588=ends[71];
}
                if(ends[72]>=biggest1472295588){
                  biggest1472295588=ends[72];
}
                if(biggest1472295588 == 1){
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
public void thread1561557333(int [] tdone, int [] ends){
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
                                        tutu__1584281492 = 0;
                                        tutu__1584281492 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                    S4117=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                            tutu__1256743684 = 0;
                                            tutu__1256743684 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                            tutu__1256743684++;
                                            appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__1256743684);
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
                                        tutu__1584281492 = 0;
                                        tutu__1584281492 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                    S4117=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                            tutu__1256743684 = 0;
                                            tutu__1256743684 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                            tutu__1256743684++;
                                            appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__1256743684);
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
                                    tutu__399716652 = 0;
                                    tutu__399716652 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                  S4117=1;
active[57]=1;
                  ends[57]=1;
tdone[57]=1;
                  }
                else {
                  if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                        tutu__1255974186 = 0;
                                        tutu__1255974186 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                        tutu__1255974186++;
                                        appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__1255974186);
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
public void thread1294156848(int [] tdone, int [] ends){
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
                                        tutu__406624819 = 0;
                                        tutu__406624819 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                    S4073=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                            tutu__1247124962 = 0;
                                            tutu__1247124962 = appliancePowerFanR4A13_in.get_r_r();
                                            tutu__1247124962++;
                                            appliancePowerFanR4A13_in.set_r_r(tutu__1247124962);
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
                                        tutu__406624819 = 0;
                                        tutu__406624819 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                    S4073=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                            tutu__1247124962 = 0;
                                            tutu__1247124962 = appliancePowerFanR4A13_in.get_r_r();
                                            tutu__1247124962++;
                                            appliancePowerFanR4A13_in.set_r_r(tutu__1247124962);
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
                                    tutu__428796916 = 0;
                                    tutu__428796916 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                  S4073=1;
active[56]=1;
                  ends[56]=1;
tdone[56]=1;
                  }
                else {
                  if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                        tutu__1257128433 = 0;
                                        tutu__1257128433 = appliancePowerFanR4A13_in.get_r_r();
                                        tutu__1257128433++;
                                        appliancePowerFanR4A13_in.set_r_r(tutu__1257128433);
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
public void thread1333016487(int [] tdone, int [] ends){
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
                                        tutu__1235138387 = 0;
                                        tutu__1235138387 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                    S4029=1;
active[55]=1;
                    ends[55]=1;
tdone[55]=1;
                    }
                  else {
                    if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                            tutu__1248279208 = 0;
                                            tutu__1248279208 = appliancePowerLightR4A12_in.get_r_r();
                                            tutu__1248279208++;
                                            appliancePowerLightR4A12_in.set_r_r(tutu__1248279208);
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
                                        tutu__1235138387 = 0;
                                        tutu__1235138387 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                    S4029=1;
active[55]=1;
                    ends[55]=1;
tdone[55]=1;
                    }
                  else {
                    if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                            tutu__1248279208 = 0;
                                            tutu__1248279208 = appliancePowerLightR4A12_in.get_r_r();
                                            tutu__1248279208++;
                                            appliancePowerLightR4A12_in.set_r_r(tutu__1248279208);
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
                                    tutu__421888749 = 0;
                                    tutu__421888749 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                  S4029=1;
active[55]=1;
                  ends[55]=1;
tdone[55]=1;
                  }
                else {
                  if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                        tutu__1245970715 = 0;
                                        tutu__1245970715 = appliancePowerLightR4A12_in.get_r_r();
                                        tutu__1245970715++;
                                        appliancePowerLightR4A12_in.set_r_r(tutu__1245970715);
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
public void thread1062538010(int [] tdone, int [] ends){
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
                                        tutu__1904344333 = 0;
                                        tutu__1904344333 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                    S3985=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                            tutu__1247894459 = 0;
                                            tutu__1247894459 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                            tutu__1247894459++;
                                            appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__1247894459);
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
                                        tutu__1904344333 = 0;
                                        tutu__1904344333 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                    S3985=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                            tutu__1247894459 = 0;
                                            tutu__1247894459 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                            tutu__1247894459++;
                                            appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__1247894459);
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
                                    tutu__79653811 = 0;
                                    tutu__79653811 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                  S3985=1;
active[54]=1;
                  ends[54]=1;
tdone[54]=1;
                  }
                else {
                  if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                        tutu__1248663957 = 0;
                                        tutu__1248663957 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                        tutu__1248663957++;
                                        appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__1248663957);
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
public void thread1089085684(int [] tdone, int [] ends){
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
                                        tutu__1384732618 = 0;
                                        tutu__1384732618 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S3941=1;
active[53]=1;
                    ends[53]=1;
tdone[53]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__1166712442 = 0;
                                            tutu__1166712442 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__1166712442++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__1166712442);
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
                                        tutu__1384732618 = 0;
                                        tutu__1384732618 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S3941=1;
active[53]=1;
                    ends[53]=1;
tdone[53]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__1166712442 = 0;
                                            tutu__1166712442 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__1166712442++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__1166712442);
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
                                    tutu__908167379 = 0;
                                    tutu__908167379 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                  S3941=1;
active[53]=1;
                  ends[53]=1;
tdone[53]=1;
                  }
                else {
                  if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                        tutu__1249818204 = 0;
                                        tutu__1249818204 = appliancePowerLightR3A10_in.get_r_r();
                                        tutu__1249818204++;
                                        appliancePowerLightR3A10_in.set_r_r(tutu__1249818204);
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
public void thread1203356107(int [] tdone, int [] ends){
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
                                        tutu__1754750102 = 0;
                                        tutu__1754750102 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                    S3897=1;
active[52]=1;
                    ends[52]=1;
tdone[52]=1;
                    }
                  else {
                    if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                            tutu__1166327693 = 0;
                                            tutu__1166327693 = appliancePowerHeaterR3A9_in.get_r_r();
                                            tutu__1166327693++;
                                            appliancePowerHeaterR3A9_in.set_r_r(tutu__1166327693);
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
                                        tutu__1754750102 = 0;
                                        tutu__1754750102 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                    S3897=1;
active[52]=1;
                    ends[52]=1;
tdone[52]=1;
                    }
                  else {
                    if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                            tutu__1166327693 = 0;
                                            tutu__1166327693 = appliancePowerHeaterR3A9_in.get_r_r();
                                            tutu__1166327693++;
                                            appliancePowerHeaterR3A9_in.set_r_r(tutu__1166327693);
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
                                    tutu__229248042 = 0;
                                    tutu__229248042 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                  S3897=1;
active[52]=1;
                  ends[52]=1;
tdone[52]=1;
                  }
                else {
                  if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                        tutu__1167097190 = 0;
                                        tutu__1167097190 = appliancePowerHeaterR3A9_in.get_r_r();
                                        tutu__1167097190++;
                                        appliancePowerHeaterR3A9_in.set_r_r(tutu__1167097190);
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
public void thread1883114894(int [] tdone, int [] ends){
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
                                        tutu__926236534 = 0;
                                        tutu__926236534 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                    S3853=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                            tutu__1167481939 = 0;
                                            tutu__1167481939 = appliancePowerHeaterR2A8_in.get_r_r();
                                            tutu__1167481939++;
                                            appliancePowerHeaterR2A8_in.set_r_r(tutu__1167481939);
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
                                        tutu__926236534 = 0;
                                        tutu__926236534 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                    S3853=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                            tutu__1167481939 = 0;
                                            tutu__1167481939 = appliancePowerHeaterR2A8_in.get_r_r();
                                            tutu__1167481939++;
                                            appliancePowerHeaterR2A8_in.set_r_r(tutu__1167481939);
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
                                    tutu__1057761610 = 0;
                                    tutu__1057761610 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                  S3853=1;
active[51]=1;
                  ends[51]=1;
tdone[51]=1;
                  }
                else {
                  if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                        tutu__1168251437 = 0;
                                        tutu__1168251437 = appliancePowerHeaterR2A8_in.get_r_r();
                                        tutu__1168251437++;
                                        appliancePowerHeaterR2A8_in.set_r_r(tutu__1168251437);
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
public void thread1759610497(int [] tdone, int [] ends){
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
                                        tutu__424693973 = 0;
                                        tutu__424693973 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                    S3809=1;
active[50]=1;
                    ends[50]=1;
tdone[50]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                            tutu__1170175182 = 0;
                                            tutu__1170175182 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                            tutu__1170175182++;
                                            appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__1170175182);
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
                                        tutu__424693973 = 0;
                                        tutu__424693973 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                    S3809=1;
active[50]=1;
                    ends[50]=1;
tdone[50]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                            tutu__1170175182 = 0;
                                            tutu__1170175182 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                            tutu__1170175182++;
                                            appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__1170175182);
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
                                    tutu__2081721110 = 0;
                                    tutu__2081721110 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                  S3809=1;
active[50]=1;
                  ends[50]=1;
tdone[50]=1;
                  }
                else {
                  if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                        tutu__1167866688 = 0;
                                        tutu__1167866688 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                        tutu__1167866688++;
                                        appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__1167866688);
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
public void thread1733062822(int [] tdone, int [] ends){
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
                                        tutu__1602350646 = 0;
                                        tutu__1602350646 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                    S3765=1;
active[49]=1;
                    ends[49]=1;
tdone[49]=1;
                    }
                  else {
                    if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                            tutu__1160556459 = 0;
                                            tutu__1160556459 = appliancePowerTVR2A6_in.get_r_r();
                                            tutu__1160556459++;
                                            appliancePowerTVR2A6_in.set_r_r(tutu__1160556459);
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
                                        tutu__1602350646 = 0;
                                        tutu__1602350646 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                    S3765=1;
active[49]=1;
                    ends[49]=1;
tdone[49]=1;
                    }
                  else {
                    if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                            tutu__1160556459 = 0;
                                            tutu__1160556459 = appliancePowerTVR2A6_in.get_r_r();
                                            tutu__1160556459++;
                                            appliancePowerTVR2A6_in.set_r_r(tutu__1160556459);
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
                                    tutu__1580178549 = 0;
                                    tutu__1580178549 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                  S3765=1;
active[49]=1;
                  ends[49]=1;
tdone[49]=1;
                  }
                else {
                  if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                        tutu__1170559931 = 0;
                                        tutu__1170559931 = appliancePowerTVR2A6_in.get_r_r();
                                        tutu__1170559931++;
                                        appliancePowerTVR2A6_in.set_r_r(tutu__1170559931);
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
public void thread2086647062(int [] tdone, int [] ends){
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
                                        tutu__1929321654 = 0;
                                        tutu__1929321654 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                    S3721=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                            tutu__1162095455 = 0;
                                            tutu__1162095455 = appliancePowerOvenR1A5_in.get_r_r();
                                            tutu__1162095455++;
                                            appliancePowerOvenR1A5_in.set_r_r(tutu__1162095455);
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
                                        tutu__1929321654 = 0;
                                        tutu__1929321654 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                    S3721=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                            tutu__1162095455 = 0;
                                            tutu__1162095455 = appliancePowerOvenR1A5_in.get_r_r();
                                            tutu__1162095455++;
                                            appliancePowerOvenR1A5_in.set_r_r(tutu__1162095455);
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
                                    tutu__708618506 = 0;
                                    tutu__708618506 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                  S3721=1;
active[48]=1;
                  ends[48]=1;
tdone[48]=1;
                  }
                else {
                  if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                        tutu__1159786961 = 0;
                                        tutu__1159786961 = appliancePowerOvenR1A5_in.get_r_r();
                                        tutu__1159786961++;
                                        appliancePowerOvenR1A5_in.set_r_r(tutu__1159786961);
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
public void thread1961603669(int [] tdone, int [] ends){
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
                                        tutu__773837078 = 0;
                                        tutu__773837078 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                    S3677=1;
active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                            tutu__1161710706 = 0;
                                            tutu__1161710706 = appliancePowerStoveR1A4_in.get_r_r();
                                            tutu__1161710706++;
                                            appliancePowerStoveR1A4_in.set_r_r(tutu__1161710706);
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
                                        tutu__773837078 = 0;
                                        tutu__773837078 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                    S3677=1;
active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                            tutu__1161710706 = 0;
                                            tutu__1161710706 = appliancePowerStoveR1A4_in.get_r_r();
                                            tutu__1161710706++;
                                            appliancePowerStoveR1A4_in.set_r_r(tutu__1161710706);
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
                                    tutu__1210161066 = 0;
                                    tutu__1210161066 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                  S3677=1;
active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                else {
                  if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                        tutu__1162480204 = 0;
                                        tutu__1162480204 = appliancePowerStoveR1A4_in.get_r_r();
                                        tutu__1162480204++;
                                        appliancePowerStoveR1A4_in.set_r_r(tutu__1162480204);
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
public void thread1936594991(int [] tdone, int [] ends){
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
                                        tutu__1079933708 = 0;
                                        tutu__1079933708 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                    S3633=1;
active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                            tutu__1178254909 = 0;
                                            tutu__1178254909 = appliancePowerDryerR1A3_in.get_r_r();
                                            tutu__1178254909++;
                                            appliancePowerDryerR1A3_in.set_r_r(tutu__1178254909);
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
                                        tutu__1079933708 = 0;
                                        tutu__1079933708 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                    S3633=1;
active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                            tutu__1178254909 = 0;
                                            tutu__1178254909 = appliancePowerDryerR1A3_in.get_r_r();
                                            tutu__1178254909++;
                                            appliancePowerDryerR1A3_in.set_r_r(tutu__1178254909);
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
                                    tutu__2038674634 = 0;
                                    tutu__2038674634 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                  S3633=1;
active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                else {
                  if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                        tutu__1163634450 = 0;
                                        tutu__1163634450 = appliancePowerDryerR1A3_in.get_r_r();
                                        tutu__1163634450++;
                                        appliancePowerDryerR1A3_in.set_r_r(tutu__1163634450);
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
public void thread2077120859(int [] tdone, int [] ends){
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
                                        tutu__1581476268 = 0;
                                        tutu__1581476268 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S3589=1;
active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__1180948151 = 0;
                                            tutu__1180948151 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__1180948151++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__1180948151);
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
                                        tutu__1581476268 = 0;
                                        tutu__1581476268 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S3589=1;
active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__1180948151 = 0;
                                            tutu__1180948151 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__1180948151++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__1180948151);
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
                                    tutu__75550868 = 0;
                                    tutu__75550868 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                  S3589=1;
active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                else {
                  if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                        tutu__1178639657 = 0;
                                        tutu__1178639657 = appliancePowerDishwasherR1A2_in.get_r_r();
                                        tutu__1178639657++;
                                        appliancePowerDishwasherR1A2_in.set_r_r(tutu__1178639657);
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
public void thread2105207529(int [] tdone, int [] ends){
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
                                        tutu__1884977460 = 0;
                                        tutu__1884977460 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S3545=1;
active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__1182102398 = 0;
                                            tutu__1182102398 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__1182102398++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__1182102398);
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
                                        tutu__1884977460 = 0;
                                        tutu__1884977460 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S3545=1;
active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__1182102398 = 0;
                                            tutu__1182102398 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__1182102398++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__1182102398);
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
                                    tutu__752962700 = 0;
                                    tutu__752962700 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                  S3545=1;
active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                else {
                  if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                        tutu__1179793904 = 0;
                                        tutu__1179793904 = appliancePowerFridgeR1A1_in.get_r_r();
                                        tutu__1179793904++;
                                        appliancePowerFridgeR1A1_in.set_r_r(tutu__1179793904);
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
public void thread2104053282(int [] tdone, int [] ends){
            if(tdone[72] != 1){
              S4199=1;
active[72]=1;
              ends[72]=1;
tdone[72]=1;
              }
            }
public void thread2103668533(int [] tdone, int [] ends){
            if(tdone[71] != 1){
              S4196=1;
active[71]=1;
              ends[71]=1;
tdone[71]=1;
              }
            }
public void thread2101744789(int [] tdone, int [] ends){
            if(tdone[70] != 1){
              S4193=1;
active[70]=1;
              ends[70]=1;
tdone[70]=1;
              }
            }
public void thread2101360040(int [] tdone, int [] ends){
            if(tdone[69] != 1){
              S4190=1;
active[69]=1;
              ends[69]=1;
tdone[69]=1;
              }
            }
public void thread2102514287(int [] tdone, int [] ends){
            if(tdone[68] != 1){
              S4187=1;
active[68]=1;
              ends[68]=1;
tdone[68]=1;
              }
            }
public void thread2102129538(int [] tdone, int [] ends){
            if(tdone[67] != 1){
              S4184=1;
active[67]=1;
              ends[67]=1;
tdone[67]=1;
              }
            }
public void thread2112517758(int [] tdone, int [] ends){
            if(tdone[66] != 1){
              S4181=1;
active[66]=1;
              ends[66]=1;
tdone[66]=1;
              }
            }
public void thread2112133009(int [] tdone, int [] ends){
            if(tdone[65] != 1){
              S4178=1;
active[65]=1;
              ends[65]=1;
tdone[65]=1;
              }
            }
public void thread2113287256(int [] tdone, int [] ends){
            if(tdone[64] != 1){
              S4175=1;
active[64]=1;
              ends[64]=1;
tdone[64]=1;
              }
            }
public void thread2112902507(int [] tdone, int [] ends){
            if(tdone[63] != 1){
              S4172=1;
active[63]=1;
              ends[63]=1;
tdone[63]=1;
              }
            }
public void thread2110978763(int [] tdone, int [] ends){
            if(tdone[62] != 1){
              S4169=1;
active[62]=1;
              ends[62]=1;
tdone[62]=1;
              }
            }
public void thread2110594014(int [] tdone, int [] ends){
            if(tdone[61] != 1){
              S4166=1;
active[61]=1;
              ends[61]=1;
tdone[61]=1;
              }
            }
public void thread2111748260(int [] tdone, int [] ends){
            if(tdone[60] != 1){
              S4163=1;
active[60]=1;
              ends[60]=1;
tdone[60]=1;
              }
            }
public void thread2111363511(int [] tdone, int [] ends){
            if(tdone[59] != 1){
              S4160=1;
active[59]=1;
              ends[59]=1;
tdone[59]=1;
              }
            }
public void thread2109439767(int [] tdone, int [] ends){
          if(tdone[58] != 1){
            S4288=1;
S4200=0;
thread2111363511(tdone,ends);
            thread2111748260(tdone,ends);
            thread2110594014(tdone,ends);
            thread2110978763(tdone,ends);
            thread2112902507(tdone,ends);
            thread2113287256(tdone,ends);
            thread2112133009(tdone,ends);
            thread2112517758(tdone,ends);
            thread2102129538(tdone,ends);
            thread2102514287(tdone,ends);
            thread2101360040(tdone,ends);
            thread2101744789(tdone,ends);
            thread2103668533(tdone,ends);
            thread2104053282(tdone,ends);
            int biggest2102899036 = 0;
            if(ends[59]>=biggest2102899036){
              biggest2102899036=ends[59];
}
            if(ends[60]>=biggest2102899036){
              biggest2102899036=ends[60];
}
            if(ends[61]>=biggest2102899036){
              biggest2102899036=ends[61];
}
            if(ends[62]>=biggest2102899036){
              biggest2102899036=ends[62];
}
            if(ends[63]>=biggest2102899036){
              biggest2102899036=ends[63];
}
            if(ends[64]>=biggest2102899036){
              biggest2102899036=ends[64];
}
            if(ends[65]>=biggest2102899036){
              biggest2102899036=ends[65];
}
            if(ends[66]>=biggest2102899036){
              biggest2102899036=ends[66];
}
            if(ends[67]>=biggest2102899036){
              biggest2102899036=ends[67];
}
            if(ends[68]>=biggest2102899036){
              biggest2102899036=ends[68];
}
            if(ends[69]>=biggest2102899036){
              biggest2102899036=ends[69];
}
            if(ends[70]>=biggest2102899036){
              biggest2102899036=ends[70];
}
            if(ends[71]>=biggest2102899036){
              biggest2102899036=ends[71];
}
            if(ends[72]>=biggest2102899036){
              biggest2102899036=ends[72];
}
            if(biggest2102899036 == 1){
              active[58]=1;
              ends[58]=1;
tdone[58]=1;
              }
            }
          }
public void thread2109731996(int [] tdone, int [] ends){
          if(tdone[57] != 1){
            S4157=1;
S4127=0;
S4117=0;
if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                            tutu__1584281492 = 0;
                            tutu__1584281492 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
              S4117=1;
active[57]=1;
              ends[57]=1;
tdone[57]=1;
              }
            else {
              if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                tutu__1256743684 = 0;
                                tutu__1256743684 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                tutu__1256743684++;
                                appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__1256743684);
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
public void thread2133971176(int [] tdone, int [] ends){
          if(tdone[56] != 1){
            S4113=1;
S4083=0;
S4073=0;
if(appliancePowerFanR4A13_in.get_preempted()){
                            tutu__406624819 = 0;
                            tutu__406624819 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
              S4073=1;
active[56]=1;
              ends[56]=1;
tdone[56]=1;
              }
            else {
              if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                tutu__1247124962 = 0;
                                tutu__1247124962 = appliancePowerFanR4A13_in.get_r_r();
                                tutu__1247124962++;
                                appliancePowerFanR4A13_in.set_r_r(tutu__1247124962);
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
public void thread1839730788(int [] tdone, int [] ends){
          if(tdone[55] != 1){
            S4069=1;
S4039=0;
S4029=0;
if(appliancePowerLightR4A12_in.get_preempted()){
                            tutu__1235138387 = 0;
                            tutu__1235138387 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
              S4029=1;
active[55]=1;
              ends[55]=1;
tdone[55]=1;
              }
            else {
              if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                tutu__1248279208 = 0;
                                tutu__1248279208 = appliancePowerLightR4A12_in.get_r_r();
                                tutu__1248279208++;
                                appliancePowerLightR4A12_in.set_r_r(tutu__1248279208);
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
public void thread1815491607(int [] tdone, int [] ends){
          if(tdone[54] != 1){
            S4025=1;
S3995=0;
S3985=0;
if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                            tutu__1904344333 = 0;
                            tutu__1904344333 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
              S3985=1;
active[54]=1;
              ends[54]=1;
tdone[54]=1;
              }
            else {
              if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                tutu__1247894459 = 0;
                                tutu__1247894459 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                tutu__1247894459++;
                                appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__1247894459);
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
public void thread1891287141(int [] tdone, int [] ends){
          if(tdone[53] != 1){
            S3981=1;
S3951=0;
S3941=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                            tutu__1384732618 = 0;
                            tutu__1384732618 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
              S3941=1;
active[53]=1;
              ends[53]=1;
tdone[53]=1;
              }
            else {
              if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                tutu__1166712442 = 0;
                                tutu__1166712442 = appliancePowerLightR3A10_in.get_r_r();
                                tutu__1166712442++;
                                appliancePowerLightR3A10_in.set_r_r(tutu__1166712442);
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
public void thread1867047960(int [] tdone, int [] ends){
          if(tdone[52] != 1){
            S3937=1;
S3907=0;
S3897=0;
if(appliancePowerHeaterR3A9_in.get_preempted()){
                            tutu__1754750102 = 0;
                            tutu__1754750102 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
              S3897=1;
active[52]=1;
              ends[52]=1;
tdone[52]=1;
              }
            else {
              if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                tutu__1166327693 = 0;
                                tutu__1166327693 = appliancePowerHeaterR3A9_in.get_r_r();
                                tutu__1166327693++;
                                appliancePowerHeaterR3A9_in.set_r_r(tutu__1166327693);
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
public void thread1939765502(int [] tdone, int [] ends){
          if(tdone[51] != 1){
            S3893=1;
S3863=0;
S3853=0;
if(appliancePowerHeaterR2A8_in.get_preempted()){
                            tutu__926236534 = 0;
                            tutu__926236534 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
              S3853=1;
active[51]=1;
              ends[51]=1;
tdone[51]=1;
              }
            else {
              if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                tutu__1167481939 = 0;
                                tutu__1167481939 = appliancePowerHeaterR2A8_in.get_r_r();
                                tutu__1167481939++;
                                appliancePowerHeaterR2A8_in.set_r_r(tutu__1167481939);
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
public void thread1915526321(int [] tdone, int [] ends){
          if(tdone[50] != 1){
            S3849=1;
S3819=0;
S3809=0;
if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                            tutu__424693973 = 0;
                            tutu__424693973 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
              S3809=1;
active[50]=1;
              ends[50]=1;
tdone[50]=1;
              }
            else {
              if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                tutu__1170175182 = 0;
                                tutu__1170175182 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                tutu__1170175182++;
                                appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__1170175182);
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
public void thread1979009890(int [] tdone, int [] ends){
          if(tdone[49] != 1){
            S3805=1;
S3775=0;
S3765=0;
if(appliancePowerTVR2A6_in.get_preempted()){
                            tutu__1602350646 = 0;
                            tutu__1602350646 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
              S3765=1;
active[49]=1;
              ends[49]=1;
tdone[49]=1;
              }
            else {
              if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                tutu__1160556459 = 0;
                                tutu__1160556459 = appliancePowerTVR2A6_in.get_r_r();
                                tutu__1160556459++;
                                appliancePowerTVR2A6_in.set_r_r(tutu__1160556459);
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
public void thread1954770709(int [] tdone, int [] ends){
          if(tdone[48] != 1){
            S3761=1;
S3731=0;
S3721=0;
if(appliancePowerOvenR1A5_in.get_preempted()){
                            tutu__1929321654 = 0;
                            tutu__1929321654 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
              S3721=1;
active[48]=1;
              ends[48]=1;
tdone[48]=1;
              }
            else {
              if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                tutu__1162095455 = 0;
                                tutu__1162095455 = appliancePowerOvenR1A5_in.get_r_r();
                                tutu__1162095455++;
                                appliancePowerOvenR1A5_in.set_r_r(tutu__1162095455);
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
public void thread1085530424(int [] tdone, int [] ends){
          if(tdone[47] != 1){
            S3717=1;
S3687=0;
S3677=0;
if(appliancePowerStoveR1A4_in.get_preempted()){
                            tutu__773837078 = 0;
                            tutu__773837078 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
              S3677=1;
active[47]=1;
              ends[47]=1;
tdone[47]=1;
              }
            else {
              if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                tutu__1161710706 = 0;
                                tutu__1161710706 = appliancePowerStoveR1A4_in.get_r_r();
                                tutu__1161710706++;
                                appliancePowerStoveR1A4_in.set_r_r(tutu__1161710706);
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
public void thread1109769604(int [] tdone, int [] ends){
          if(tdone[46] != 1){
            S3673=1;
S3643=0;
S3633=0;
if(appliancePowerDryerR1A3_in.get_preempted()){
                            tutu__1079933708 = 0;
                            tutu__1079933708 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
              S3633=1;
active[46]=1;
              ends[46]=1;
tdone[46]=1;
              }
            else {
              if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                tutu__1178254909 = 0;
                                tutu__1178254909 = appliancePowerDryerR1A3_in.get_r_r();
                                tutu__1178254909++;
                                appliancePowerDryerR1A3_in.set_r_r(tutu__1178254909);
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
public void thread1033974071(int [] tdone, int [] ends){
          if(tdone[45] != 1){
            S3629=1;
S3599=0;
S3589=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                            tutu__1581476268 = 0;
                            tutu__1581476268 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
              S3589=1;
active[45]=1;
              ends[45]=1;
tdone[45]=1;
              }
            else {
              if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                tutu__1180948151 = 0;
                                tutu__1180948151 = appliancePowerDishwasherR1A2_in.get_r_r();
                                tutu__1180948151++;
                                appliancePowerDishwasherR1A2_in.set_r_r(tutu__1180948151);
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
public void thread1058213252(int [] tdone, int [] ends){
          if(tdone[44] != 1){
            S3585=1;
S3555=0;
S3545=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                            tutu__1884977460 = 0;
                            tutu__1884977460 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
              S3545=1;
active[44]=1;
              ends[44]=1;
tdone[44]=1;
              }
            else {
              if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                tutu__1182102398 = 0;
                                tutu__1182102398 = appliancePowerFridgeR1A1_in.get_r_r();
                                tutu__1182102398++;
                                appliancePowerFridgeR1A1_in.set_r_r(tutu__1182102398);
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
          thread1058213252(tdone,ends);
          thread1033974071(tdone,ends);
          thread1109769604(tdone,ends);
          thread1085530424(tdone,ends);
          thread1954770709(tdone,ends);
          thread1979009890(tdone,ends);
          thread1915526321(tdone,ends);
          thread1939765502(tdone,ends);
          thread1867047960(tdone,ends);
          thread1891287141(tdone,ends);
          thread1815491607(tdone,ends);
          thread1839730788(tdone,ends);
          thread2133971176(tdone,ends);
          thread2109731996(tdone,ends);
          thread2109439767(tdone,ends);
          int biggest2103283785 = 0;
          if(ends[44]>=biggest2103283785){
            biggest2103283785=ends[44];
}
          if(ends[45]>=biggest2103283785){
            biggest2103283785=ends[45];
}
          if(ends[46]>=biggest2103283785){
            biggest2103283785=ends[46];
}
          if(ends[47]>=biggest2103283785){
            biggest2103283785=ends[47];
}
          if(ends[48]>=biggest2103283785){
            biggest2103283785=ends[48];
}
          if(ends[49]>=biggest2103283785){
            biggest2103283785=ends[49];
}
          if(ends[50]>=biggest2103283785){
            biggest2103283785=ends[50];
}
          if(ends[51]>=biggest2103283785){
            biggest2103283785=ends[51];
}
          if(ends[52]>=biggest2103283785){
            biggest2103283785=ends[52];
}
          if(ends[53]>=biggest2103283785){
            biggest2103283785=ends[53];
}
          if(ends[54]>=biggest2103283785){
            biggest2103283785=ends[54];
}
          if(ends[55]>=biggest2103283785){
            biggest2103283785=ends[55];
}
          if(ends[56]>=biggest2103283785){
            biggest2103283785=ends[56];
}
          if(ends[57]>=biggest2103283785){
            biggest2103283785=ends[57];
}
          if(ends[58]>=biggest2103283785){
            biggest2103283785=ends[58];
}
          if(biggest2103283785 == 1){
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
          thread2105207529(tdone,ends);
          thread2077120859(tdone,ends);
          thread1936594991(tdone,ends);
          thread1961603669(tdone,ends);
          thread2086647062(tdone,ends);
          thread1733062822(tdone,ends);
          thread1759610497(tdone,ends);
          thread1883114894(tdone,ends);
          thread1203356107(tdone,ends);
          thread1089085684(tdone,ends);
          thread1062538010(tdone,ends);
          thread1333016487(tdone,ends);
          thread1294156848(tdone,ends);
          thread1561557333(tdone,ends);
          thread1535009659(tdone,ends);
          int biggest1461907368 = 0;
          if(ends[44]>=biggest1461907368){
            biggest1461907368=ends[44];
}
          if(ends[45]>=biggest1461907368){
            biggest1461907368=ends[45];
}
          if(ends[46]>=biggest1461907368){
            biggest1461907368=ends[46];
}
          if(ends[47]>=biggest1461907368){
            biggest1461907368=ends[47];
}
          if(ends[48]>=biggest1461907368){
            biggest1461907368=ends[48];
}
          if(ends[49]>=biggest1461907368){
            biggest1461907368=ends[49];
}
          if(ends[50]>=biggest1461907368){
            biggest1461907368=ends[50];
}
          if(ends[51]>=biggest1461907368){
            biggest1461907368=ends[51];
}
          if(ends[52]>=biggest1461907368){
            biggest1461907368=ends[52];
}
          if(ends[53]>=biggest1461907368){
            biggest1461907368=ends[53];
}
          if(ends[54]>=biggest1461907368){
            biggest1461907368=ends[54];
}
          if(ends[55]>=biggest1461907368){
            biggest1461907368=ends[55];
}
          if(ends[56]>=biggest1461907368){
            biggest1461907368=ends[56];
}
          if(ends[57]>=biggest1461907368){
            biggest1461907368=ends[57];
}
          if(ends[58]>=biggest1461907368){
            biggest1461907368=ends[58];
}
          if(biggest1461907368 == 1){
            active[43]=1;
            ends[43]=1;
            break RUN;
            }
          //FINXME code
if(biggest1461907368 == 0){
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
