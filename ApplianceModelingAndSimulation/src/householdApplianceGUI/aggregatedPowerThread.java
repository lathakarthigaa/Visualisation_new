package householdApplianceGUI;
//package householdApplianceGUI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JLabel;


public class aggregatedPowerThread extends Thread
{
	private int aggregatedPower = 0;
	public aggregatedPowerThread()
	{
	}
	public int getAggregatedPower() {
		return aggregatedPower;
	}
	@Override
	public void run(){
		while(true){
			Socket socket = null;
			try {
				ServerSocket ss = new ServerSocket(50004, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					aggregatedPower = Integer.parseInt(msg.trim());
					System.out.println("aggregatedPowerThread::::: Aggregated Power:"+aggregatedPower);	
				}
				catch(EOFException e)
				{
					e.printStackTrace();
				}
				
				in.close();
				socket.close();
				ss.close();
								
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}