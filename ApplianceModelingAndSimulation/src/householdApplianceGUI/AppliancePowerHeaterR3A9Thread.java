package householdApplianceGUI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppliancePowerHeaterR3A9Thread extends Thread
{
	private int heaterR3A9Power = 0;
	public AppliancePowerHeaterR3A9Thread()
	{
	}
	public int getHeaterR3A9Power() {
		return heaterR3A9Power;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
			try {
				ServerSocket ss = new ServerSocket(50010, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerHeaterR3A9Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					heaterR3A9Power = Integer.parseInt(msg.trim());
					System.out.println("AppliancePowerHeaterR3A9Thread::::: heater R3A9 Power:"+heaterR3A9Power);
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