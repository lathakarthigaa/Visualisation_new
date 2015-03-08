package householdApplianceGUI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JLabel;


public class AppliancePowerDishwasherR1A2Thread extends Thread
{
	private int dishwasherR1A2Power = 0;
	public AppliancePowerDishwasherR1A2Thread()
	{
	}
	public int getDishwasherR1A1Power() {
		return dishwasherR1A2Power;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
			try {
				ServerSocket ss = new ServerSocket(50003, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerDishwasherR1A2Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					dishwasherR1A2Power = Integer.parseInt(msg.trim());
					System.out.println("appliancePowerDishwasherR1A2Thread::::: dishwasher R1A2 Power:"+dishwasherR1A2Power);
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