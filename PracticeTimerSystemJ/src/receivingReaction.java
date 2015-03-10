import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class receivingReaction extends ClockDomain{
	public receivingReaction(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public input_Channel TransferData_in = new input_Channel();
	private String transDataStr_thread_2;
	private int tutu__1426869340;
	private int tutu__1180064110;
	private int tutu__1508436106;
	private int tutu__1329658341;
	private int tutu__1511514098;
	private int tutu__1983600357;
	private int S357 = 1;
	private int S356 = 1;
	private int S285 = 1;
	private int S275 = 1;
	
	private int[] ends = new int[3];
	private int[] tdone = new int[3];
		public void runClockDomain(){
			for(int i=0;i<ends.length;i++){
				ends[i] = 0;
				tdone[i] = 0;
				}
RUN: while(true){
				switch(S357){
          case 0 : 
          S357=0;
          break RUN;
                    case 1 : 
          S357=2;
S357=2;
          transDataStr_thread_2 = "";
          S356=0;
S285=0;
S275=0;
if(TransferData_in.get_preempted()){
                        tutu__1180064110 = 0;
                        tutu__1180064110 = TransferData_in.get_preempted() ? TransferData_in.refresh() : 0;
            S275=1;
active[2]=1;
            ends[2]=1;
            break RUN;
            }
          else {
            if(TransferData_in.get_r_s() > TransferData_in.get_r_r()){
                            tutu__1426869340 = 0;
                            tutu__1426869340 = TransferData_in.get_r_r();
                            tutu__1426869340++;
                            TransferData_in.set_r_r(tutu__1426869340);
                            TransferData_in.get_val();
                            ends[2]=2;
                            ;
                            transDataStr_thread_2 = (String)TransferData_in.get_value();
              S285=1;
active[2]=1;
              ends[2]=1;
              break RUN;
              }
            else {
              active[2]=1;
              ends[2]=1;
              break RUN;
              }
            }
                    case 2 : 
          switch(S356){
            case 0 : 
            switch(S285){
              case 0 : 
              switch(S275){
                case 0 : 
                if(TransferData_in.get_preempted()){
                                    tutu__1329658341 = 0;
                                    tutu__1329658341 = TransferData_in.get_preempted() ? TransferData_in.refresh() : 0;
                  S275=1;
active[2]=1;
                  ends[2]=1;
                  break RUN;
                  }
                else {
                  if(TransferData_in.get_r_s() > TransferData_in.get_r_r()){
                                        tutu__1508436106 = 0;
                                        tutu__1508436106 = TransferData_in.get_r_r();
                                        tutu__1508436106++;
                                        TransferData_in.set_r_r(tutu__1508436106);
                                        TransferData_in.get_val();
                                        ends[2]=2;
                                        ;
                                        transDataStr_thread_2 = (String)TransferData_in.get_value();
                    S285=1;
active[2]=1;
                    ends[2]=1;
                    break RUN;
                    }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                    }
                  }
                                case 1 : 
                S275=1;
S275=0;
if(TransferData_in.get_preempted()){
                                    tutu__1329658341 = 0;
                                    tutu__1329658341 = TransferData_in.get_preempted() ? TransferData_in.refresh() : 0;
                  S275=1;
active[2]=1;
                  ends[2]=1;
                  break RUN;
                  }
                else {
                  if(TransferData_in.get_r_s() > TransferData_in.get_r_r()){
                                        tutu__1508436106 = 0;
                                        tutu__1508436106 = TransferData_in.get_r_r();
                                        tutu__1508436106++;
                                        TransferData_in.set_r_r(tutu__1508436106);
                                        TransferData_in.get_val();
                                        ends[2]=2;
                                        ;
                                        transDataStr_thread_2 = (String)TransferData_in.get_value();
                    S285=1;
active[2]=1;
                    ends[2]=1;
                    break RUN;
                    }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                    }
                  }
                                }
              break;
              case 1 : 
              S285=1;
              if(transDataStr_thread_2 != null) {
					System.out.println(transDataStr_thread_2);
				}
              S285=2;
active[2]=1;
              ends[2]=1;
              break RUN;
                            case 2 : 
              S285=2;
S285=0;
S275=0;
if(TransferData_in.get_preempted()){
                                tutu__1983600357 = 0;
                                tutu__1983600357 = TransferData_in.get_preempted() ? TransferData_in.refresh() : 0;
                S275=1;
active[2]=1;
                ends[2]=1;
                break RUN;
                }
              else {
                if(TransferData_in.get_r_s() > TransferData_in.get_r_r()){
                                    tutu__1511514098 = 0;
                                    tutu__1511514098 = TransferData_in.get_r_r();
                                    tutu__1511514098++;
                                    TransferData_in.set_r_r(tutu__1511514098);
                                    TransferData_in.get_val();
                                    ends[2]=2;
                                    ;
                                    transDataStr_thread_2 = (String)TransferData_in.get_value();
                  S285=1;
active[2]=1;
                  ends[2]=1;
                  break RUN;
                  }
                else {
                  active[2]=1;
                  ends[2]=1;
                  break RUN;
                  }
                }
                            }
            break;
            case 1 : 
            S356=1;
S357=0;
active[2]=0;
            ends[2]=0;
S357=0;
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
		while(active[2] != 0){
		int index = 2;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
			else{
				TransferData_in.update_r_s();
				if(!df){
					TransferData_in.gethook();
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
			TransferData_in.sethook();
			if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
			else{
				TransferData_in.gethook();
			}
			if(active[2] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
