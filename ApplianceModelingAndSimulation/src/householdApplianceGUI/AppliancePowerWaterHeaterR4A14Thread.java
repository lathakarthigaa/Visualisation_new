package householdApplianceGUI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppliancePowerWaterHeaterR4A14Thread extends Thread
{
	private int waterHeaterR4A14Power = 0;
	public AppliancePowerWaterHeaterR4A14Thread()
	{
	}
	public int getWaterHeaterR4A14Power() {
		return waterHeaterR4A14Power;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
			try {
				ServerSocket ss = new ServerSocket(50015, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				System.out.println("Entered AppliancePowerWaterHeaterR4A14Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					waterHeaterR4A14Power = Integer.parseInt(msg.trim());
					System.out.println("AppliancePowerWaterHeaterR4A14Thread::::: water Heater R4A14 Power:"+waterHeaterR4A14Power);
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