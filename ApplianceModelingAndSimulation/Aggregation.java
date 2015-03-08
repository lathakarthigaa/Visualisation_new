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
	private int tutu__796742226;
	private int tutu__1765295364;
	private int tutu__798281222;
	private int appliancePowerFridgeR1A1Int_thread_44;
	private String appliancePowerFridgeR1A1String_thread_44;
	private int tutu__1438324356;
	private int tutu__800589715;
	private int tutu__1199615804;
	private int tutu__802128711;
	private int appliancePowerDishwasherR1A2Int_thread_45;
	private String appliancePowerDishwasherR1A2String_thread_45;
	private int tutu__1526586812;
	private int tutu__801359213;
	private int tutu__784382340;
	private int tutu__815210174;
	private int appliancePowerDryerR1A3Int_thread_46;
	private String appliancePowerDryerR1A3String_thread_46;
	private int tutu__2136610566;
	private int tutu__817518667;
	private int tutu__501329594;
	private int tutu__819057663;
	private int appliancePowerStoveR1A4Int_thread_47;
	private String appliancePowerStoveR1A4String_thread_47;
	private int tutu__828300602;
	private int tutu__818288165;
	private int tutu__1482668550;
	private int tutu__819827160;
	private int appliancePowerOvenR1A5Int_thread_48;
	private String appliancePowerOvenR1A5String_thread_48;
	private int tutu__1155697542;
	private int tutu__809823689;
	private int tutu__1133525445;
	private int tutu__811362685;
	private int appliancePowerTVR2A6Int_thread_49;
	private String appliancePowerTVR2A6String_thread_49;
	private int tutu__806554437;
	private int tutu__810593187;
	private int tutu__1177443707;
	private int tutu__812132182;
	private int appliancePowerPowerPlugsR2A7Int_thread_50;
	private String appliancePowerPowerPlugsR2A7String_thread_50;
	private int tutu__1504414715;
	private int tutu__814440676;
	private int tutu__152612422;
	private int tutu__828291636;
	private int appliancePowerHeaterR2A8Int_thread_51;
	private String appliancePowerHeaterR2A8String_thread_51;
	private int tutu__1504840647;
	private int tutu__827522138;
	private int tutu__479157497;
	private int tutu__829061134;
	private int appliancePowerHeaterR3A9Int_thread_52;
	private String appliancePowerHeaterR3A9String_thread_52;
	private int tutu__806128505;
	private int tutu__831369627;
	private int tutu__850898632;
	private int tutu__832908623;
	private int appliancePowerLightR3A10Int_thread_53;
	private String appliancePowerLightR3A10String_thread_53;
	private int tutu__523927624;
	private int tutu__832139125;
	private int tutu__1460070520;
	private int tutu__821366156;
	private int appliancePowerPowerPlugsR3A11Int_thread_54;
	private String appliancePowerPowerPlugsR3A11String_thread_54;
	private int tutu__828726534;
	private int tutu__823674649;
	private int tutu__1809213625;
	private int tutu__825213645;
	private int appliancePowerLightR4A12Int_thread_55;
	private String appliancePowerLightR4A12String_thread_55;
	private int tutu__2136184633;
	private int tutu__824444147;
	private int tutu__174784519;
	private int tutu__825983143;
	private int appliancePowerFanR4A13Int_thread_56;
	private String appliancePowerFanR4A13String_thread_56;
	private int tutu__152186489;
	private int tutu__742107883;
	private int tutu__1659619394;
	private int tutu__743646878;
	private int appliancePowerWaterHeaterR4A14Int_thread_57;
	private String appliancePowerWaterHeaterR4A14String_thread_57;
	private int tutu__1986590402;
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
		public void thread60702256(int [] tdone, int [] ends){
                if(tdone[72] != 1){
                  S4199=1;
active[72]=1;
                  ends[72]=1;
tdone[72]=1;
                  }
                }
public void thread71090477(int [] tdone, int [] ends){
                if(tdone[71] != 1){
                  S4196=1;
active[71]=1;
                  ends[71]=1;
tdone[71]=1;
                  }
                }
public void thread70705728(int [] tdone, int [] ends){
                if(tdone[70] != 1){
                  S4193=1;
active[70]=1;
                  ends[70]=1;
tdone[70]=1;
                  }
                }
public void thread71859974(int [] tdone, int [] ends){
                if(tdone[69] != 1){
                  S4190=1;
active[69]=1;
                  ends[69]=1;
tdone[69]=1;
                  }
                }
public void thread71475226(int [] tdone, int [] ends){
                if(tdone[68] != 1){
                  S4187=1;
active[68]=1;
                  ends[68]=1;
tdone[68]=1;
                  }
                }
public void thread69551481(int [] tdone, int [] ends){
                if(tdone[67] != 1){
                  S4184=1;
active[67]=1;
                  ends[67]=1;
tdone[67]=1;
                  }
                }
public void thread69166732(int [] tdone, int [] ends){
                if(tdone[66] != 1){
                  S4181=1;
active[66]=1;
                  ends[66]=1;
tdone[66]=1;
                  }
                }
public void thread70320979(int [] tdone, int [] ends){
                if(tdone[65] != 1){
                  S4178=1;
active[65]=1;
                  ends[65]=1;
tdone[65]=1;
                  }
                }
public void thread69936230(int [] tdone, int [] ends){
                if(tdone[64] != 1){
                  S4175=1;
active[64]=1;
                  ends[64]=1;
tdone[64]=1;
                  }
                }
public void thread68012485(int [] tdone, int [] ends){
                if(tdone[63] != 1){
                  S4172=1;
active[63]=1;
                  ends[63]=1;
tdone[63]=1;
                  }
                }
public void thread67627737(int [] tdone, int [] ends){
                if(tdone[62] != 1){
                  S4169=1;
active[62]=1;
                  ends[62]=1;
tdone[62]=1;
                  }
                }
public void thread68781983(int [] tdone, int [] ends){
                if(tdone[61] != 1){
                  S4166=1;
active[61]=1;
                  ends[61]=1;
tdone[61]=1;
                  }
                }
public void thread68397234(int [] tdone, int [] ends){
                if(tdone[60] != 1){
                  S4163=1;
active[60]=1;
                  ends[60]=1;
tdone[60]=1;
                  }
                }
public void thread66473490(int [] tdone, int [] ends){
                if(tdone[59] != 1){
                  S4160=1;
active[59]=1;
                  ends[59]=1;
tdone[59]=1;
                  }
                }
public void thread53776776(int [] tdone, int [] ends){
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
public void thread54931023(int [] tdone, int [] ends){
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
public void thread54546274(int [] tdone, int [] ends){
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
public void thread40310565(int [] tdone, int [] ends){
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
public void thread39925816(int [] tdone, int [] ends){
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
public void thread41080062(int [] tdone, int [] ends){
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
public void thread40695314(int [] tdone, int [] ends){
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
public void thread38771569(int [] tdone, int [] ends){
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
public void thread38386820(int [] tdone, int [] ends){
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
public void thread39541067(int [] tdone, int [] ends){
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
public void thread39156318(int [] tdone, int [] ends){
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
public void thread37232573(int [] tdone, int [] ends){
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
public void thread36847825(int [] tdone, int [] ends){
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
public void thread38002071(int [] tdone, int [] ends){
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
public void thread37617322(int [] tdone, int [] ends){
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
                thread38002071(tdone,ends);
                thread36847825(tdone,ends);
                thread37232573(tdone,ends);
                thread39156318(tdone,ends);
                thread39541067(tdone,ends);
                thread38386820(tdone,ends);
                thread38771569(tdone,ends);
                thread40695314(tdone,ends);
                thread41080062(tdone,ends);
                thread39925816(tdone,ends);
                thread40310565(tdone,ends);
                thread54546274(tdone,ends);
                thread54931023(tdone,ends);
                thread53776776(tdone,ends);
                int biggest54161525 = 0;
                if(ends[59]>=biggest54161525){
                  biggest54161525=ends[59];
}
                if(ends[60]>=biggest54161525){
                  biggest54161525=ends[60];
}
                if(ends[61]>=biggest54161525){
                  biggest54161525=ends[61];
}
                if(ends[62]>=biggest54161525){
                  biggest54161525=ends[62];
}
                if(ends[63]>=biggest54161525){
                  biggest54161525=ends[63];
}
                if(ends[64]>=biggest54161525){
                  biggest54161525=ends[64];
}
                if(ends[65]>=biggest54161525){
                  biggest54161525=ends[65];
}
                if(ends[66]>=biggest54161525){
                  biggest54161525=ends[66];
}
                if(ends[67]>=biggest54161525){
                  biggest54161525=ends[67];
}
                if(ends[68]>=biggest54161525){
                  biggest54161525=ends[68];
}
                if(ends[69]>=biggest54161525){
                  biggest54161525=ends[69];
}
                if(ends[70]>=biggest54161525){
                  biggest54161525=ends[70];
}
                if(ends[71]>=biggest54161525){
                  biggest54161525=ends[71];
}
                if(ends[72]>=biggest54161525){
                  biggest54161525=ends[72];
}
                if(biggest54161525 == 1){
                  active[58]=1;
                  ends[58]=1;
tdone[58]=1;
                  }
                //FINXME code
if(biggest54161525 == 0){
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
thread66473490(tdone,ends);
                thread68397234(tdone,ends);
                thread68781983(tdone,ends);
                thread67627737(tdone,ends);
                thread68012485(tdone,ends);
                thread69936230(tdone,ends);
                thread70320979(tdone,ends);
                thread69166732(tdone,ends);
                thread69551481(tdone,ends);
                thread71475226(tdone,ends);
                thread71859974(tdone,ends);
                thread70705728(tdone,ends);
                thread71090477(tdone,ends);
                thread60702256(tdone,ends);
                int biggest61087005 = 0;
                if(ends[59]>=biggest61087005){
                  biggest61087005=ends[59];
}
                if(ends[60]>=biggest61087005){
                  biggest61087005=ends[60];
}
                if(ends[61]>=biggest61087005){
                  biggest61087005=ends[61];
}
                if(ends[62]>=biggest61087005){
                  biggest61087005=ends[62];
}
                if(ends[63]>=biggest61087005){
                  biggest61087005=ends[63];
}
                if(ends[64]>=biggest61087005){
                  biggest61087005=ends[64];
}
                if(ends[65]>=biggest61087005){
                  biggest61087005=ends[65];
}
                if(ends[66]>=biggest61087005){
                  biggest61087005=ends[66];
}
                if(ends[67]>=biggest61087005){
                  biggest61087005=ends[67];
}
                if(ends[68]>=biggest61087005){
                  biggest61087005=ends[68];
}
                if(ends[69]>=biggest61087005){
                  biggest61087005=ends[69];
}
                if(ends[70]>=biggest61087005){
                  biggest61087005=ends[70];
}
                if(ends[71]>=biggest61087005){
                  biggest61087005=ends[71];
}
                if(ends[72]>=biggest61087005){
                  biggest61087005=ends[72];
}
                if(biggest61087005 == 1){
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
public void thread162660715(int [] tdone, int [] ends){
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
                                        tutu__1659619394 = 0;
                                        tutu__1659619394 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                    S4117=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                            tutu__742107883 = 0;
                                            tutu__742107883 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                            tutu__742107883++;
                                            appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__742107883);
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
                                        tutu__1659619394 = 0;
                                        tutu__1659619394 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                    S4117=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                            tutu__742107883 = 0;
                                            tutu__742107883 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                            tutu__742107883++;
                                            appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__742107883);
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
                                    tutu__1986590402 = 0;
                                    tutu__1986590402 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                  S4117=1;
active[57]=1;
                  ends[57]=1;
tdone[57]=1;
                  }
                else {
                  if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                        tutu__743646878 = 0;
                                        tutu__743646878 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                        tutu__743646878++;
                                        appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__743646878);
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
public void thread639525418(int [] tdone, int [] ends){
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
                                        tutu__174784519 = 0;
                                        tutu__174784519 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                    S4073=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                            tutu__824444147 = 0;
                                            tutu__824444147 = appliancePowerFanR4A13_in.get_r_r();
                                            tutu__824444147++;
                                            appliancePowerFanR4A13_in.set_r_r(tutu__824444147);
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
                                        tutu__174784519 = 0;
                                        tutu__174784519 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                    S4073=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                            tutu__824444147 = 0;
                                            tutu__824444147 = appliancePowerFanR4A13_in.get_r_r();
                                            tutu__824444147++;
                                            appliancePowerFanR4A13_in.set_r_r(tutu__824444147);
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
                                    tutu__152186489 = 0;
                                    tutu__152186489 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                  S4073=1;
active[56]=1;
                  ends[56]=1;
tdone[56]=1;
                  }
                else {
                  if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                        tutu__825983143 = 0;
                                        tutu__825983143 = appliancePowerFanR4A13_in.get_r_r();
                                        tutu__825983143++;
                                        appliancePowerFanR4A13_in.set_r_r(tutu__825983143);
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
public void thread516021021(int [] tdone, int [] ends){
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
                                        tutu__1809213625 = 0;
                                        tutu__1809213625 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                    S4029=1;
active[55]=1;
                    ends[55]=1;
tdone[55]=1;
                    }
                  else {
                    if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                            tutu__823674649 = 0;
                                            tutu__823674649 = appliancePowerLightR4A12_in.get_r_r();
                                            tutu__823674649++;
                                            appliancePowerLightR4A12_in.set_r_r(tutu__823674649);
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
                                        tutu__1809213625 = 0;
                                        tutu__1809213625 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                    S4029=1;
active[55]=1;
                    ends[55]=1;
tdone[55]=1;
                    }
                  else {
                    if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                            tutu__823674649 = 0;
                                            tutu__823674649 = appliancePowerLightR4A12_in.get_r_r();
                                            tutu__823674649++;
                                            appliancePowerLightR4A12_in.set_r_r(tutu__823674649);
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
                                    tutu__2136184633 = 0;
                                    tutu__2136184633 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                  S4029=1;
active[55]=1;
                  ends[55]=1;
tdone[55]=1;
                  }
                else {
                  if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                        tutu__825213645 = 0;
                                        tutu__825213645 = appliancePowerLightR4A12_in.get_r_r();
                                        tutu__825213645++;
                                        appliancePowerLightR4A12_in.set_r_r(tutu__825213645);
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
public void thread477161382(int [] tdone, int [] ends){
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
                                        tutu__1460070520 = 0;
                                        tutu__1460070520 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                    S3985=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                            tutu__832139125 = 0;
                                            tutu__832139125 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                            tutu__832139125++;
                                            appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__832139125);
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
                                        tutu__1460070520 = 0;
                                        tutu__1460070520 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                    S3985=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                            tutu__832139125 = 0;
                                            tutu__832139125 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                            tutu__832139125++;
                                            appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__832139125);
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
                                    tutu__828726534 = 0;
                                    tutu__828726534 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                  S3985=1;
active[54]=1;
                  ends[54]=1;
tdone[54]=1;
                  }
                else {
                  if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                        tutu__821366156 = 0;
                                        tutu__821366156 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                        tutu__821366156++;
                                        appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__821366156);
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
public void thread744561867(int [] tdone, int [] ends){
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
                                        tutu__850898632 = 0;
                                        tutu__850898632 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S3941=1;
active[53]=1;
                    ends[53]=1;
tdone[53]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__831369627 = 0;
                                            tutu__831369627 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__831369627++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__831369627);
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
                                        tutu__850898632 = 0;
                                        tutu__850898632 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S3941=1;
active[53]=1;
                    ends[53]=1;
tdone[53]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__831369627 = 0;
                                            tutu__831369627 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__831369627++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__831369627);
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
                                    tutu__523927624 = 0;
                                    tutu__523927624 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                  S3941=1;
active[53]=1;
                  ends[53]=1;
tdone[53]=1;
                  }
                else {
                  if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                        tutu__832908623 = 0;
                                        tutu__832908623 = appliancePowerLightR3A10_in.get_r_r();
                                        tutu__832908623++;
                                        appliancePowerLightR3A10_in.set_r_r(tutu__832908623);
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
public void thread718014193(int [] tdone, int [] ends){
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
                                        tutu__479157497 = 0;
                                        tutu__479157497 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                    S3897=1;
active[52]=1;
                    ends[52]=1;
tdone[52]=1;
                    }
                  else {
                    if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                            tutu__827522138 = 0;
                                            tutu__827522138 = appliancePowerHeaterR3A9_in.get_r_r();
                                            tutu__827522138++;
                                            appliancePowerHeaterR3A9_in.set_r_r(tutu__827522138);
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
                                        tutu__479157497 = 0;
                                        tutu__479157497 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                    S3897=1;
active[52]=1;
                    ends[52]=1;
tdone[52]=1;
                    }
                  else {
                    if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                            tutu__827522138 = 0;
                                            tutu__827522138 = appliancePowerHeaterR3A9_in.get_r_r();
                                            tutu__827522138++;
                                            appliancePowerHeaterR3A9_in.set_r_r(tutu__827522138);
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
                                    tutu__806128505 = 0;
                                    tutu__806128505 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                  S3897=1;
active[52]=1;
                  ends[52]=1;
tdone[52]=1;
                  }
                else {
                  if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                        tutu__829061134 = 0;
                                        tutu__829061134 = appliancePowerHeaterR3A9_in.get_r_r();
                                        tutu__829061134++;
                                        appliancePowerHeaterR3A9_in.set_r_r(tutu__829061134);
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
public void thread1000804635(int [] tdone, int [] ends){
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
                                        tutu__152612422 = 0;
                                        tutu__152612422 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                    S3853=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                            tutu__814440676 = 0;
                                            tutu__814440676 = appliancePowerHeaterR2A8_in.get_r_r();
                                            tutu__814440676++;
                                            appliancePowerHeaterR2A8_in.set_r_r(tutu__814440676);
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
                                        tutu__152612422 = 0;
                                        tutu__152612422 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                    S3853=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                            tutu__814440676 = 0;
                                            tutu__814440676 = appliancePowerHeaterR2A8_in.get_r_r();
                                            tutu__814440676++;
                                            appliancePowerHeaterR2A8_in.set_r_r(tutu__814440676);
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
                                    tutu__1504840647 = 0;
                                    tutu__1504840647 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                  S3853=1;
active[51]=1;
                  ends[51]=1;
tdone[51]=1;
                  }
                else {
                  if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                        tutu__828291636 = 0;
                                        tutu__828291636 = appliancePowerHeaterR2A8_in.get_r_r();
                                        tutu__828291636++;
                                        appliancePowerHeaterR2A8_in.set_r_r(tutu__828291636);
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
public void thread974256961(int [] tdone, int [] ends){
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
                                        tutu__1177443707 = 0;
                                        tutu__1177443707 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                    S3809=1;
active[50]=1;
                    ends[50]=1;
tdone[50]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                            tutu__810593187 = 0;
                                            tutu__810593187 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                            tutu__810593187++;
                                            appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__810593187);
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
                                        tutu__1177443707 = 0;
                                        tutu__1177443707 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                    S3809=1;
active[50]=1;
                    ends[50]=1;
tdone[50]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                            tutu__810593187 = 0;
                                            tutu__810593187 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                            tutu__810593187++;
                                            appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__810593187);
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
                                    tutu__1504414715 = 0;
                                    tutu__1504414715 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                  S3809=1;
active[50]=1;
                  ends[50]=1;
tdone[50]=1;
                  }
                else {
                  if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                        tutu__812132182 = 0;
                                        tutu__812132182 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                        tutu__812132182++;
                                        appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__812132182);
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
public void thread847674573(int [] tdone, int [] ends){
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
                                        tutu__1133525445 = 0;
                                        tutu__1133525445 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                    S3765=1;
active[49]=1;
                    ends[49]=1;
tdone[49]=1;
                    }
                  else {
                    if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                            tutu__809823689 = 0;
                                            tutu__809823689 = appliancePowerTVR2A6_in.get_r_r();
                                            tutu__809823689++;
                                            appliancePowerTVR2A6_in.set_r_r(tutu__809823689);
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
                                        tutu__1133525445 = 0;
                                        tutu__1133525445 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                    S3765=1;
active[49]=1;
                    ends[49]=1;
tdone[49]=1;
                    }
                  else {
                    if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                            tutu__809823689 = 0;
                                            tutu__809823689 = appliancePowerTVR2A6_in.get_r_r();
                                            tutu__809823689++;
                                            appliancePowerTVR2A6_in.set_r_r(tutu__809823689);
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
                                    tutu__806554437 = 0;
                                    tutu__806554437 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                  S3765=1;
active[49]=1;
                  ends[49]=1;
tdone[49]=1;
                  }
                else {
                  if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                        tutu__811362685 = 0;
                                        tutu__811362685 = appliancePowerTVR2A6_in.get_r_r();
                                        tutu__811362685++;
                                        appliancePowerTVR2A6_in.set_r_r(tutu__811362685);
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
public void thread1202797807(int [] tdone, int [] ends){
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
                                        tutu__1482668550 = 0;
                                        tutu__1482668550 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                    S3721=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                            tutu__818288165 = 0;
                                            tutu__818288165 = appliancePowerOvenR1A5_in.get_r_r();
                                            tutu__818288165++;
                                            appliancePowerOvenR1A5_in.set_r_r(tutu__818288165);
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
                                        tutu__1482668550 = 0;
                                        tutu__1482668550 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                    S3721=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                            tutu__818288165 = 0;
                                            tutu__818288165 = appliancePowerOvenR1A5_in.get_r_r();
                                            tutu__818288165++;
                                            appliancePowerOvenR1A5_in.set_r_r(tutu__818288165);
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
                                    tutu__1155697542 = 0;
                                    tutu__1155697542 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                  S3721=1;
active[48]=1;
                  ends[48]=1;
tdone[48]=1;
                  }
                else {
                  if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                        tutu__819827160 = 0;
                                        tutu__819827160 = appliancePowerOvenR1A5_in.get_r_r();
                                        tutu__819827160++;
                                        appliancePowerOvenR1A5_in.set_r_r(tutu__819827160);
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
public void thread1177789129(int [] tdone, int [] ends){
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
                                        tutu__501329594 = 0;
                                        tutu__501329594 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                    S3677=1;
active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                            tutu__817518667 = 0;
                                            tutu__817518667 = appliancePowerStoveR1A4_in.get_r_r();
                                            tutu__817518667++;
                                            appliancePowerStoveR1A4_in.set_r_r(tutu__817518667);
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
                                        tutu__501329594 = 0;
                                        tutu__501329594 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                    S3677=1;
active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                            tutu__817518667 = 0;
                                            tutu__817518667 = appliancePowerStoveR1A4_in.get_r_r();
                                            tutu__817518667++;
                                            appliancePowerStoveR1A4_in.set_r_r(tutu__817518667);
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
                                    tutu__828300602 = 0;
                                    tutu__828300602 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                  S3677=1;
active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                else {
                  if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                        tutu__819057663 = 0;
                                        tutu__819057663 = appliancePowerStoveR1A4_in.get_r_r();
                                        tutu__819057663++;
                                        appliancePowerStoveR1A4_in.set_r_r(tutu__819057663);
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
public void thread1052745736(int [] tdone, int [] ends){
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
                                        tutu__784382340 = 0;
                                        tutu__784382340 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                    S3633=1;
active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                            tutu__801359213 = 0;
                                            tutu__801359213 = appliancePowerDryerR1A3_in.get_r_r();
                                            tutu__801359213++;
                                            appliancePowerDryerR1A3_in.set_r_r(tutu__801359213);
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
                                        tutu__784382340 = 0;
                                        tutu__784382340 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                    S3633=1;
active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                            tutu__801359213 = 0;
                                            tutu__801359213 = appliancePowerDryerR1A3_in.get_r_r();
                                            tutu__801359213++;
                                            appliancePowerDryerR1A3_in.set_r_r(tutu__801359213);
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
                                    tutu__2136610566 = 0;
                                    tutu__2136610566 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                  S3633=1;
active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                else {
                  if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                        tutu__815210174 = 0;
                                        tutu__815210174 = appliancePowerDryerR1A3_in.get_r_r();
                                        tutu__815210174++;
                                        appliancePowerDryerR1A3_in.set_r_r(tutu__815210174);
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
public void thread144977590(int [] tdone, int [] ends){
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
                                        tutu__1199615804 = 0;
                                        tutu__1199615804 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S3589=1;
active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__800589715 = 0;
                                            tutu__800589715 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__800589715++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__800589715);
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
                                        tutu__1199615804 = 0;
                                        tutu__1199615804 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S3589=1;
active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__800589715 = 0;
                                            tutu__800589715 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__800589715++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__800589715);
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
                                    tutu__1526586812 = 0;
                                    tutu__1526586812 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                  S3589=1;
active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                else {
                  if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                        tutu__802128711 = 0;
                                        tutu__802128711 = appliancePowerDishwasherR1A2_in.get_r_r();
                                        tutu__802128711++;
                                        appliancePowerDishwasherR1A2_in.set_r_r(tutu__802128711);
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
public void thread270020982(int [] tdone, int [] ends){
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
                                        tutu__1765295364 = 0;
                                        tutu__1765295364 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S3545=1;
active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__796742226 = 0;
                                            tutu__796742226 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__796742226++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__796742226);
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
                                        tutu__1765295364 = 0;
                                        tutu__1765295364 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S3545=1;
active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__796742226 = 0;
                                            tutu__796742226 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__796742226++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__796742226);
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
                                    tutu__1438324356 = 0;
                                    tutu__1438324356 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                  S3545=1;
active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                else {
                  if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                        tutu__798281222 = 0;
                                        tutu__798281222 = appliancePowerFridgeR1A1_in.get_r_r();
                                        tutu__798281222++;
                                        appliancePowerFridgeR1A1_in.set_r_r(tutu__798281222);
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
public void thread267327740(int [] tdone, int [] ends){
            if(tdone[72] != 1){
              S4199=1;
active[72]=1;
              ends[72]=1;
tdone[72]=1;
              }
            }
public void thread268481987(int [] tdone, int [] ends){
            if(tdone[71] != 1){
              S4196=1;
active[71]=1;
              ends[71]=1;
tdone[71]=1;
              }
            }
public void thread268097238(int [] tdone, int [] ends){
            if(tdone[70] != 1){
              S4193=1;
active[70]=1;
              ends[70]=1;
tdone[70]=1;
              }
            }
public void thread278485458(int [] tdone, int [] ends){
            if(tdone[69] != 1){
              S4190=1;
active[69]=1;
              ends[69]=1;
tdone[69]=1;
              }
            }
public void thread278100709(int [] tdone, int [] ends){
            if(tdone[68] != 1){
              S4187=1;
active[68]=1;
              ends[68]=1;
tdone[68]=1;
              }
            }
public void thread279254956(int [] tdone, int [] ends){
            if(tdone[67] != 1){
              S4184=1;
active[67]=1;
              ends[67]=1;
tdone[67]=1;
              }
            }
public void thread278870207(int [] tdone, int [] ends){
            if(tdone[66] != 1){
              S4181=1;
active[66]=1;
              ends[66]=1;
tdone[66]=1;
              }
            }
public void thread276946462(int [] tdone, int [] ends){
            if(tdone[65] != 1){
              S4178=1;
active[65]=1;
              ends[65]=1;
tdone[65]=1;
              }
            }
public void thread276561713(int [] tdone, int [] ends){
            if(tdone[64] != 1){
              S4175=1;
active[64]=1;
              ends[64]=1;
tdone[64]=1;
              }
            }
public void thread277715960(int [] tdone, int [] ends){
            if(tdone[63] != 1){
              S4172=1;
active[63]=1;
              ends[63]=1;
tdone[63]=1;
              }
            }
public void thread277331211(int [] tdone, int [] ends){
            if(tdone[62] != 1){
              S4169=1;
active[62]=1;
              ends[62]=1;
tdone[62]=1;
              }
            }
public void thread275407467(int [] tdone, int [] ends){
            if(tdone[61] != 1){
              S4166=1;
active[61]=1;
              ends[61]=1;
tdone[61]=1;
              }
            }
public void thread275022718(int [] tdone, int [] ends){
            if(tdone[60] != 1){
              S4163=1;
active[60]=1;
              ends[60]=1;
tdone[60]=1;
              }
            }
public void thread276176965(int [] tdone, int [] ends){
            if(tdone[59] != 1){
              S4160=1;
active[59]=1;
              ends[59]=1;
tdone[59]=1;
              }
            }
public void thread275792216(int [] tdone, int [] ends){
          if(tdone[58] != 1){
            S4288=1;
S4200=0;
thread276176965(tdone,ends);
            thread275022718(tdone,ends);
            thread275407467(tdone,ends);
            thread277331211(tdone,ends);
            thread277715960(tdone,ends);
            thread276561713(tdone,ends);
            thread276946462(tdone,ends);
            thread278870207(tdone,ends);
            thread279254956(tdone,ends);
            thread278100709(tdone,ends);
            thread278485458(tdone,ends);
            thread268097238(tdone,ends);
            thread268481987(tdone,ends);
            thread267327740(tdone,ends);
            int biggest267712489 = 0;
            if(ends[59]>=biggest267712489){
              biggest267712489=ends[59];
}
            if(ends[60]>=biggest267712489){
              biggest267712489=ends[60];
}
            if(ends[61]>=biggest267712489){
              biggest267712489=ends[61];
}
            if(ends[62]>=biggest267712489){
              biggest267712489=ends[62];
}
            if(ends[63]>=biggest267712489){
              biggest267712489=ends[63];
}
            if(ends[64]>=biggest267712489){
              biggest267712489=ends[64];
}
            if(ends[65]>=biggest267712489){
              biggest267712489=ends[65];
}
            if(ends[66]>=biggest267712489){
              biggest267712489=ends[66];
}
            if(ends[67]>=biggest267712489){
              biggest267712489=ends[67];
}
            if(ends[68]>=biggest267712489){
              biggest267712489=ends[68];
}
            if(ends[69]>=biggest267712489){
              biggest267712489=ends[69];
}
            if(ends[70]>=biggest267712489){
              biggest267712489=ends[70];
}
            if(ends[71]>=biggest267712489){
              biggest267712489=ends[71];
}
            if(ends[72]>=biggest267712489){
              biggest267712489=ends[72];
}
            if(biggest267712489 == 1){
              active[58]=1;
              ends[58]=1;
tdone[58]=1;
              }
            }
          }
public void thread251553035(int [] tdone, int [] ends){
          if(tdone[57] != 1){
            S4157=1;
S4127=0;
S4117=0;
if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                            tutu__1659619394 = 0;
                            tutu__1659619394 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
              S4117=1;
active[57]=1;
              ends[57]=1;
tdone[57]=1;
              }
            else {
              if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                tutu__742107883 = 0;
                                tutu__742107883 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                tutu__742107883++;
                                appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__742107883);
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
public void thread324270577(int [] tdone, int [] ends){
          if(tdone[56] != 1){
            S4113=1;
S4083=0;
S4073=0;
if(appliancePowerFanR4A13_in.get_preempted()){
                            tutu__174784519 = 0;
                            tutu__174784519 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
              S4073=1;
active[56]=1;
              ends[56]=1;
tdone[56]=1;
              }
            else {
              if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                tutu__824444147 = 0;
                                tutu__824444147 = appliancePowerFanR4A13_in.get_r_r();
                                tutu__824444147++;
                                appliancePowerFanR4A13_in.set_r_r(tutu__824444147);
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
public void thread300031396(int [] tdone, int [] ends){
          if(tdone[55] != 1){
            S4069=1;
S4039=0;
S4029=0;
if(appliancePowerLightR4A12_in.get_preempted()){
                            tutu__1809213625 = 0;
                            tutu__1809213625 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
              S4029=1;
active[55]=1;
              ends[55]=1;
tdone[55]=1;
              }
            else {
              if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                tutu__823674649 = 0;
                                tutu__823674649 = appliancePowerLightR4A12_in.get_r_r();
                                tutu__823674649++;
                                appliancePowerLightR4A12_in.set_r_r(tutu__823674649);
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
public void thread18155944(int [] tdone, int [] ends){
          if(tdone[54] != 1){
            S4025=1;
S3995=0;
S3985=0;
if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                            tutu__1460070520 = 0;
                            tutu__1460070520 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
              S3985=1;
active[54]=1;
              ends[54]=1;
tdone[54]=1;
              }
            else {
              if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                tutu__832139125 = 0;
                                tutu__832139125 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                tutu__832139125++;
                                appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__832139125);
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
public void thread42395125(int [] tdone, int [] ends){
          if(tdone[53] != 1){
            S3981=1;
S3951=0;
S3941=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                            tutu__850898632 = 0;
                            tutu__850898632 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
              S3941=1;
active[53]=1;
              ends[53]=1;
tdone[53]=1;
              }
            else {
              if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                tutu__831369627 = 0;
                                tutu__831369627 = appliancePowerLightR3A10_in.get_r_r();
                                tutu__831369627++;
                                appliancePowerLightR3A10_in.set_r_r(tutu__831369627);
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
public void thread30322417(int [] tdone, int [] ends){
          if(tdone[52] != 1){
            S3937=1;
S3907=0;
S3897=0;
if(appliancePowerHeaterR3A9_in.get_preempted()){
                            tutu__479157497 = 0;
                            tutu__479157497 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
              S3897=1;
active[52]=1;
              ends[52]=1;
tdone[52]=1;
              }
            else {
              if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                tutu__827522138 = 0;
                                tutu__827522138 = appliancePowerHeaterR3A9_in.get_r_r();
                                tutu__827522138++;
                                appliancePowerHeaterR3A9_in.set_r_r(tutu__827522138);
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
public void thread4159492(int [] tdone, int [] ends){
          if(tdone[51] != 1){
            S3893=1;
S3863=0;
S3853=0;
if(appliancePowerHeaterR2A8_in.get_preempted()){
                            tutu__152612422 = 0;
                            tutu__152612422 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
              S3853=1;
active[51]=1;
              ends[51]=1;
tdone[51]=1;
              }
            else {
              if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                tutu__814440676 = 0;
                                tutu__814440676 = appliancePowerHeaterR2A8_in.get_r_r();
                                tutu__814440676++;
                                appliancePowerHeaterR2A8_in.set_r_r(tutu__814440676);
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
public void thread78416030(int [] tdone, int [] ends){
          if(tdone[50] != 1){
            S3849=1;
S3819=0;
S3809=0;
if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                            tutu__1177443707 = 0;
                            tutu__1177443707 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
              S3809=1;
active[50]=1;
              ends[50]=1;
tdone[50]=1;
              }
            else {
              if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                tutu__810593187 = 0;
                                tutu__810593187 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                tutu__810593187++;
                                appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__810593187);
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
public void thread55715845(int [] tdone, int [] ends){
          if(tdone[49] != 1){
            S3805=1;
S3775=0;
S3765=0;
if(appliancePowerTVR2A6_in.get_preempted()){
                            tutu__1133525445 = 0;
                            tutu__1133525445 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
              S3765=1;
active[49]=1;
              ends[49]=1;
tdone[49]=1;
              }
            else {
              if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                tutu__809823689 = 0;
                                tutu__809823689 = appliancePowerTVR2A6_in.get_r_r();
                                tutu__809823689++;
                                appliancePowerTVR2A6_in.set_r_r(tutu__809823689);
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
public void thread129972383(int [] tdone, int [] ends){
          if(tdone[48] != 1){
            S3761=1;
S3731=0;
S3721=0;
if(appliancePowerOvenR1A5_in.get_preempted()){
                            tutu__1482668550 = 0;
                            tutu__1482668550 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
              S3721=1;
active[48]=1;
              ends[48]=1;
tdone[48]=1;
              }
            else {
              if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                tutu__818288165 = 0;
                                tutu__818288165 = appliancePowerOvenR1A5_in.get_r_r();
                                tutu__818288165++;
                                appliancePowerOvenR1A5_in.set_r_r(tutu__818288165);
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
public void thread104194206(int [] tdone, int [] ends){
          if(tdone[47] != 1){
            S3717=1;
S3687=0;
S3677=0;
if(appliancePowerStoveR1A4_in.get_preempted()){
                            tutu__501329594 = 0;
                            tutu__501329594 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
              S3677=1;
active[47]=1;
              ends[47]=1;
tdone[47]=1;
              }
            else {
              if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                tutu__817518667 = 0;
                                tutu__817518667 = appliancePowerStoveR1A4_in.get_r_r();
                                tutu__817518667++;
                                appliancePowerStoveR1A4_in.set_r_r(tutu__817518667);
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
public void thread215532130(int [] tdone, int [] ends){
          if(tdone[46] != 1){
            S3673=1;
S3643=0;
S3633=0;
if(appliancePowerDryerR1A3_in.get_preempted()){
                            tutu__784382340 = 0;
                            tutu__784382340 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
              S3633=1;
active[46]=1;
              ends[46]=1;
tdone[46]=1;
              }
            else {
              if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                tutu__801359213 = 0;
                                tutu__801359213 = appliancePowerDryerR1A3_in.get_r_r();
                                tutu__801359213++;
                                appliancePowerDryerR1A3_in.set_r_r(tutu__801359213);
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
public void thread238232315(int [] tdone, int [] ends){
          if(tdone[45] != 1){
            S3629=1;
S3599=0;
S3589=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                            tutu__1199615804 = 0;
                            tutu__1199615804 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
              S3589=1;
active[45]=1;
              ends[45]=1;
tdone[45]=1;
              }
            else {
              if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                tutu__800589715 = 0;
                                tutu__800589715 = appliancePowerDishwasherR1A2_in.get_r_r();
                                tutu__800589715++;
                                appliancePowerDishwasherR1A2_in.set_r_r(tutu__800589715);
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
public void thread163975777(int [] tdone, int [] ends){
          if(tdone[44] != 1){
            S3585=1;
S3555=0;
S3545=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                            tutu__1765295364 = 0;
                            tutu__1765295364 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
              S3545=1;
active[44]=1;
              ends[44]=1;
tdone[44]=1;
              }
            else {
              if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                tutu__796742226 = 0;
                                tutu__796742226 = appliancePowerFridgeR1A1_in.get_r_r();
                                tutu__796742226++;
                                appliancePowerFridgeR1A1_in.set_r_r(tutu__796742226);
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
          thread163975777(tdone,ends);
          thread238232315(tdone,ends);
          thread215532130(tdone,ends);
          thread104194206(tdone,ends);
          thread129972383(tdone,ends);
          thread55715845(tdone,ends);
          thread78416030(tdone,ends);
          thread4159492(tdone,ends);
          thread30322417(tdone,ends);
          thread42395125(tdone,ends);
          thread18155944(tdone,ends);
          thread300031396(tdone,ends);
          thread324270577(tdone,ends);
          thread251553035(tdone,ends);
          thread275792216(tdone,ends);
          int biggest269636233 = 0;
          if(ends[44]>=biggest269636233){
            biggest269636233=ends[44];
}
          if(ends[45]>=biggest269636233){
            biggest269636233=ends[45];
}
          if(ends[46]>=biggest269636233){
            biggest269636233=ends[46];
}
          if(ends[47]>=biggest269636233){
            biggest269636233=ends[47];
}
          if(ends[48]>=biggest269636233){
            biggest269636233=ends[48];
}
          if(ends[49]>=biggest269636233){
            biggest269636233=ends[49];
}
          if(ends[50]>=biggest269636233){
            biggest269636233=ends[50];
}
          if(ends[51]>=biggest269636233){
            biggest269636233=ends[51];
}
          if(ends[52]>=biggest269636233){
            biggest269636233=ends[52];
}
          if(ends[53]>=biggest269636233){
            biggest269636233=ends[53];
}
          if(ends[54]>=biggest269636233){
            biggest269636233=ends[54];
}
          if(ends[55]>=biggest269636233){
            biggest269636233=ends[55];
}
          if(ends[56]>=biggest269636233){
            biggest269636233=ends[56];
}
          if(ends[57]>=biggest269636233){
            biggest269636233=ends[57];
}
          if(ends[58]>=biggest269636233){
            biggest269636233=ends[58];
}
          if(biggest269636233 == 1){
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
          thread270020982(tdone,ends);
          thread144977590(tdone,ends);
          thread1052745736(tdone,ends);
          thread1177789129(tdone,ends);
          thread1202797807(tdone,ends);
          thread847674573(tdone,ends);
          thread974256961(tdone,ends);
          thread1000804635(tdone,ends);
          thread718014193(tdone,ends);
          thread744561867(tdone,ends);
          thread477161382(tdone,ends);
          thread516021021(tdone,ends);
          thread639525418(tdone,ends);
          thread162660715(tdone,ends);
          thread37617322(tdone,ends);
          int biggest59932759 = 0;
          if(ends[44]>=biggest59932759){
            biggest59932759=ends[44];
}
          if(ends[45]>=biggest59932759){
            biggest59932759=ends[45];
}
          if(ends[46]>=biggest59932759){
            biggest59932759=ends[46];
}
          if(ends[47]>=biggest59932759){
            biggest59932759=ends[47];
}
          if(ends[48]>=biggest59932759){
            biggest59932759=ends[48];
}
          if(ends[49]>=biggest59932759){
            biggest59932759=ends[49];
}
          if(ends[50]>=biggest59932759){
            biggest59932759=ends[50];
}
          if(ends[51]>=biggest59932759){
            biggest59932759=ends[51];
}
          if(ends[52]>=biggest59932759){
            biggest59932759=ends[52];
}
          if(ends[53]>=biggest59932759){
            biggest59932759=ends[53];
}
          if(ends[54]>=biggest59932759){
            biggest59932759=ends[54];
}
          if(ends[55]>=biggest59932759){
            biggest59932759=ends[55];
}
          if(ends[56]>=biggest59932759){
            biggest59932759=ends[56];
}
          if(ends[57]>=biggest59932759){
            biggest59932759=ends[57];
}
          if(ends[58]>=biggest59932759){
            biggest59932759=ends[58];
}
          if(biggest59932759 == 1){
            active[43]=1;
            ends[43]=1;
            break RUN;
            }
          //FINXME code
if(biggest59932759 == 0){
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
