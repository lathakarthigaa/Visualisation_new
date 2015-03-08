package householdApplianceGUI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JLabel;


public class AppliancePowerStoveR1A4Thread extends Thread
{
	private int stoveR1A4Power = 0;
	public AppliancePowerStoveR1A4Thread()
	{
	}
	public int getStoveR1A4Power() {
		return stoveR1A4Power;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
			try {
				ServerSocket ss = new ServerSocket(50005, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerStoveR1A4Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					stoveR1A4Power = Integer.parseInt(msg.trim());
					System.out.println("AppliancePowerStoveR1A4Thread::::: Stove R1A4 Power:"+stoveR1A4Power);
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