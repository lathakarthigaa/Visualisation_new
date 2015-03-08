package householdApplianceGUI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppliancePowerPowerPlugsR2A7Thread extends Thread
{
	private int powerplugsR2A7Power = 0;
	public AppliancePowerPowerPlugsR2A7Thread()
	{
	}
	public int getPowerPlugsR2A7Power() {
		return powerplugsR2A7Power;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
			try {
				ServerSocket ss = new ServerSocket(50008, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerPowerPlugsR2A7Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					powerplugsR2A7Power = Integer.parseInt(msg.trim());
					System.out.println("AppliancePowerPowerPlugsR2A7Thread::::: powerplugs R2A7 Power:"+powerplugsR2A7Power);
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