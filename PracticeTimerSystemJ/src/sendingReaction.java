import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class sendingReaction extends ClockDomain{
	public sendingReaction(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public output_Channel TransferData_o = new output_Channel();
	private String toSend_thread_1;
	private int tutu__1471884961;
	private int tutu__1067193975;
	private int tutu__1478425692;
	private int tutu__1396174632;
	private int S271 = 1;
	private int S270 = 1;
	private int S0 = 1;
	private int S7 = 1;
	private int S2 = 1;
	
	private int[] ends = new int[3];
	private int[] tdone = new int[3];
		public void runClockDomain(){
			for(int i=0;i<ends.length;i++){
				ends[i] = 0;
				tdone[i] = 0;
				}
RUN: while(true){
				switch(S271){
          case 0 : 
          S271=0;
          break RUN;
                    case 1 : 
          S271=2;
S271=2;
          toSend_thread_1 = null;
          S270=0;
          toSend_thread_1 = "Hello World";
          S0=0;
active[1]=1;
          ends[1]=1;
          break RUN;
                    case 2 : 
          switch(S270){
            case 0 : 
            switch(S0){
              case 0 : 
              S0=0;
S0=1;
S7=0;
if(TransferData_o.get_preempted()){
                                tutu__1067193975 = 0;
                                tutu__1067193975 = TransferData_o.get_preempted() ? TransferData_o.refresh() : 0;
                S7=1;
active[1]=1;
                ends[1]=1;
                break RUN;
                }
              else {
                S2=0;
if(TransferData_o.get_w_s() == TransferData_o.get_w_r()){
                                    tutu__1471884961 = 0;
                                    tutu__1471884961 = TransferData_o.get_w_s();
                                    tutu__1471884961++;
                                    TransferData_o.set_w_s(tutu__1471884961);
                                    TransferData_o.set_value(toSend_thread_1);
                  S2=1;
if(TransferData_o.get_w_s() == TransferData_o.get_w_r()){
                                        ends[1]=2;
                                        ;
                    S0=2;
active[1]=1;
                    ends[1]=1;
                    break RUN;
                    }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                    }
                  }
                else {
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                  }
                }
                            case 1 : 
              switch(S7){
                case 0 : 
                if(TransferData_o.get_preempted()){
                                    tutu__1396174632 = 0;
                                    tutu__1396174632 = TransferData_o.get_preempted() ? TransferData_o.refresh() : 0;
                  S7=1;
active[1]=1;
                  ends[1]=1;
                  break RUN;
                  }
                else {
                  switch(S2){
                    case 0 : 
                    if(TransferData_o.get_w_s() == TransferData_o.get_w_r()){
                                            tutu__1478425692 = 0;
                                            tutu__1478425692 = TransferData_o.get_w_s();
                                            tutu__1478425692++;
                                            TransferData_o.set_w_s(tutu__1478425692);
                                            TransferData_o.set_value(toSend_thread_1);
                      S2=1;
if(TransferData_o.get_w_s() == TransferData_o.get_w_r()){
                                                ends[1]=2;
                                                ;
                        S0=2;
active[1]=1;
                        ends[1]=1;
                        break RUN;
                        }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                        }
                      }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                      }
                                        case 1 : 
                    if(TransferData_o.get_w_s() == TransferData_o.get_w_r()){
                                            ends[1]=2;
                                            ;
                      S0=2;
active[1]=1;
                      ends[1]=1;
                      break RUN;
                      }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                      }
                                        }
                  }
                break;
                case 1 : 
                S7=1;
S7=0;
if(TransferData_o.get_preempted()){
                                    tutu__1396174632 = 0;
                                    tutu__1396174632 = TransferData_o.get_preempted() ? TransferData_o.refresh() : 0;
                  S7=1;
active[1]=1;
                  ends[1]=1;
                  break RUN;
                  }
                else {
                  S2=0;
if(TransferData_o.get_w_s() == TransferData_o.get_w_r()){
                                        tutu__1478425692 = 0;
                                        tutu__1478425692 = TransferData_o.get_w_s();
                                        tutu__1478425692++;
                                        TransferData_o.set_w_s(tutu__1478425692);
                                        TransferData_o.set_value(toSend_thread_1);
                    S2=1;
if(TransferData_o.get_w_s() == TransferData_o.get_w_r()){
                                            ends[1]=2;
                                            ;
                      S0=2;
active[1]=1;
                      ends[1]=1;
                      break RUN;
                      }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                      }
                    }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                    }
                  }
                                }
              break;
              case 2 : 
              S0=2;
              toSend_thread_1 = "Hello World";
              S0=0;
active[1]=1;
              ends[1]=1;
              break RUN;
                            }
            break;
            case 1 : 
            S270=1;
S271=0;
active[1]=0;
            ends[1]=0;
S271=0;
            break RUN;
                        }
                    }
        			}
		}
	public void init(){
		char [] active1 = {1, 1, 1};
		char [] paused1 = {0, 0, 0};
		char [] suspended1 = {0, 0, 0};
		paused = paused1;
		active = active1;
		suspended = suspended1;
		// Now instantiate all the local signals ONLY
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
				TransferData_o.update_w_r();
				if(!df){
					TransferData_o.gethook();
					df = true;
				}
				runClockDomain();
			}
			int dummyint = 0;
			for(int qw=0;qw<currsigs.size();++qw){
				dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
				((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
			}
			currsigs.removeAllElements();
			TransferData_o.sethook();
			if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
			else{
				TransferData_o.gethook();
			}
			if(active[1] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
