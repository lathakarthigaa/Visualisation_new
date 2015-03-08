package householdApplianceGUI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppliancePowerPowerPlugsR3A11Thread extends Thread
{
	private int powerplugsR3A11Power = 0;
	public AppliancePowerPowerPlugsR3A11Thread()
	{
	}
	public int getPowerPlugsR3A11Power() {
		return powerplugsR3A11Power;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
			try {
				ServerSocket ss = new ServerSocket(50012, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerPowerPlugsR3A11Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					powerplugsR3A11Power = Integer.parseInt(msg.trim());
					System.out.println("AppliancePowerPowerPlugsR3A11Thread::::: powerplugs R3A11 Power:"+powerplugsR3A11Power);
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