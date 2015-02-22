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


public class appliancePowerLightThread extends Thread
{
	private int lightPower = 0;
	public appliancePowerLightThread()
	{	
	}
	public int getLightPower() {
		return lightPower;
	}
	@Override
	public void run(){
		while(true){
			Socket socket = null;
			try 
			{
				ServerSocket ss = new ServerSocket(50003, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerLightThread :-)");	
				InputStream in = socket.getInputStream();	
				byte[] array = new byte[150]; 
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					lightPower = Integer.parseInt(msg.trim());
					System.out.println("appliancePowerLightThread::::: Light Power:"+lightPower);
				}
				catch(EOFException e)
				{
					e.printStackTrace();
				}				
				in.close();
				socket.close();
				ss.close();								
			} 
			catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}