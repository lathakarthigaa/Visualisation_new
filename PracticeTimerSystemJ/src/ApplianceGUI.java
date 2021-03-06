import householdAppliances.AppliancePowerFridgeR1A1Thread;
import householdAppliances.AppliancePowerLightR3A10Thread;
import householdAppliances.aggregatedPowerThread;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JToggleButton;


public class ApplianceGUI extends TimerTask
{	
	private JFrame frame;
	private AppliancePowerFridgeR1A1Thread fridgeR1A1Thread = null;
	private AppliancePowerLightR3A10Thread lightR3A10Thread = null;
	private aggregatedPowerThread aggregatedthread = null;
	private JLabel fridgeR1A1PowerLabel, lightR3A10PowerLabel = null;
	private JLabel fridgeR1A1IconLabel, lightR3A10IconLabel =null;
	private JToggleButton FridgeR1A1ToggleButton;
	private JToggleButton LightR3A10ToggleButton;
	private PrintWriter printWriter = null;
    private static Calendar cal = Calendar.getInstance();
	

	public void run()
	{
		int fridgeR1A1Power, lightR3A10Power, aggregatedPower;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:00");
	    
		try {
			printWriter = new PrintWriter(new FileWriter("D:/ddd.txt", true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    printWriter.print(dateFormat.format(cal.getTime())+" ");
	    
		if(FridgeR1A1ToggleButton.isSelected())
		{
			FridgeR1A1ToggleButton.setText("OFF");
			fridgeR1A1Power = OnOffFridgeR1A1("ON");
			printWriter.print(fridgeR1A1Power+" ");
		}
		else
		{
			FridgeR1A1ToggleButton.setText("ON");
			fridgeR1A1Power = OnOffFridgeR1A1("OFF");
			printWriter.print(fridgeR1A1Power+" ");
		}
		if(LightR3A10ToggleButton.isSelected())
		{
			LightR3A10ToggleButton.setText("OFF");
			lightR3A10Power = OnOffLightR3A10("ON");
			printWriter.print(lightR3A10Power+" ");
		}
		else
		{
			LightR3A10ToggleButton.setText("ON");
			lightR3A10Power = OnOffLightR3A10("OFF");
			printWriter.print(lightR3A10Power+" ");
		}
		aggregatedPower = fridgeR1A1Power + lightR3A10Power;
		printWriter.println(aggregatedPower);
		printWriter.close();

	    cal.add(Calendar.MINUTE,1);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		ApplianceGUI window = null;
		Timer timer = new Timer();
		timer.schedule(window = new ApplianceGUI(), 0, 1000);//schedule to execute very 1000 ms which is 1 second
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public ApplianceGUI() {
		initialize();
	}
	
	
	/**
	 * ON/OFF appliance Fridge R1 A1
	 */
	private int OnOffFridgeR1A1(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			fridgeR1A1IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Fridge_ON.jpg"));
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44444);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				fridgeR1A1Thread.join(3);
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block 
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException ie){
				// TODO Auto-generated catch block
				ie.printStackTrace();
			} 
			fridgeR1A1PowerLabel.setText(fridgeR1A1Thread.getFridgeR1A1Power()+"W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			fridgeR1A1IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Fridge_OFF.jpg"));
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44445);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    fridgeR1A1Thread.join(3);//waits for 3 ms until fridgethread finishes and updates the fridge power
			} catch (UnknownHostException e1) {  
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException ie){ //exception for join()
				// TODO Auto-generated catch block
				ie.printStackTrace();
			} 
			fridgeR1A1PowerLabel.setText(fridgeR1A1Thread.getFridgeR1A1Power()+"W");
		}
		return fridgeR1A1Thread.getFridgeR1A1Power();
	}
	
	/**
	 * ON/OFF Light R3A10
	 */
	private int OnOffLightR3A10(String onOff)
	{
		if (onOff.equalsIgnoreCase("ON")) 
		{
			lightR3A10IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_ON.jpg"));
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44462);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				lightR3A10Thread.join(3);
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block 
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException ie){
				// TODO Auto-generated catch block
				ie.printStackTrace();
			} 
			lightR3A10PowerLabel.setText(lightR3A10Thread.getLightR3A10Power()+"W");
		}
		else if(onOff.equalsIgnoreCase("OFF"))
		{
			lightR3A10IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_OFF.jpg"));
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44463);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    lightR3A10Thread.join(3);//waits for 3 ms until LIGHT thread finishes and updates the LIGHT power
			} catch (UnknownHostException e1) {  
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException ie){ //exception for join()
				// TODO Auto-generated catch block
				ie.printStackTrace();
			} 
			lightR3A10PowerLabel.setText(lightR3A10Thread.getLightR3A10Power()+"W");
		}
		return lightR3A10Thread.getLightR3A10Power();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fridgeR1A1Thread = new AppliancePowerFridgeR1A1Thread();
		System.out.println("Fridge R1 A1 Thread created");	
		lightR3A10Thread = new AppliancePowerLightR3A10Thread();
		System.out.println("Light R3 A10 Thread created");	
		aggregatedthread = new aggregatedPowerThread();
		System.out.println("Agg Thread created");	
		
		//start all the appliances thread and the aggregated thread
		fridgeR1A1Thread.start();
		lightR3A10Thread.start();
		aggregatedthread.start();
		
		/*try {
			printWriter = new PrintWriter(new FileWriter("D:/ddd.txt", true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		fridgeR1A1IconLabel = new JLabel("New label");
		fridgeR1A1IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Fridge_OFF.jpg"));
		fridgeR1A1IconLabel.setBounds(93, 96, 153, 152);
		frame.getContentPane().add(fridgeR1A1IconLabel);
		
		lightR3A10IconLabel = new JLabel("New label");
		lightR3A10IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_OFF.jpg"));
		lightR3A10IconLabel.setBounds(288, 104, 153, 136);
		frame.getContentPane().add(lightR3A10IconLabel);
		
		fridgeR1A1PowerLabel = new JLabel("");
		fridgeR1A1PowerLabel.setBounds(126, 71, 100, 14);
		frame.getContentPane().add(fridgeR1A1PowerLabel);
		
		lightR3A10PowerLabel = new JLabel("");
		lightR3A10PowerLabel.setBounds(330, 71, 111, 14);
		frame.getContentPane().add(lightR3A10PowerLabel);
		
		FridgeR1A1ToggleButton = new JToggleButton("ON");
		FridgeR1A1ToggleButton.setBounds(113, 259, 121, 23);
		frame.getContentPane().add(FridgeR1A1ToggleButton);
		
		LightR3A10ToggleButton = new JToggleButton("ON");
		LightR3A10ToggleButton.setBounds(308, 259, 121, 23);
		frame.getContentPane().add(LightR3A10ToggleButton);
	}

}
