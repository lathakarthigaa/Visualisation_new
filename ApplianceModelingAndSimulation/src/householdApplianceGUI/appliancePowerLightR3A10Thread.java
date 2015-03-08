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


public class AppliancePowerLightR3A10Thread extends Thread
{
	private int lightR3A10Power = 0;
	public AppliancePowerLightR3A10Thread()
	{	
	}
	public int getLightR3A10Power() {
		return lightR3A10Power;
	}
	@Override
	public void run(){
		while(true){
			Socket socket = null;
			try 
			{
				ServerSocket ss = new ServerSocket(50011, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerLightR3A10Thread :-)");	
				InputStream in = socket.getInputStream();	
				byte[] array = new byte[150]; 
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					lightR3A10Power = Integer.parseInt(msg.trim());
					System.out.println("appliancePowerLightR3A10Thread::::: LightR3A10 Power:"+lightR3A10Power);
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