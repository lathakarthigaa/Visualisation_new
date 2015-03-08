package householdApplianceGUI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppliancePowerLightR4A12Thread extends Thread
{
	private int lightR4A12Power = 0;
	public AppliancePowerLightR4A12Thread()
	{
	}
	public int getLightR4A12Power() {
		return lightR4A12Power;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
			try {
				ServerSocket ss = new ServerSocket(50013, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerLightR4A12Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					lightR4A12Power = Integer.parseInt(msg.trim());
					System.out.println("AppliancePowerLightR4A12Thread::::: light R4A12 Power:"+lightR4A12Power);
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