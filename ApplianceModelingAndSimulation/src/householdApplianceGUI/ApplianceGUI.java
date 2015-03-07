package householdApplianceGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Timer;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ApplianceGUI extends JFrame implements ActionListener 
{
	private Timer timer = null;
	private appliancePowerFridgeR1A1Thread fridgethread = null;
	private appliancePowerLightR3A10Thread lightthread = null;
	private aggregatedPowerThread aggregatedthread = null;
	ImageIcon pic1, pic2, pic3, pic4 = null;
	JButton b1, b2, b3, b4 = null;
	JLabel iconLabel1, iconLabel2, iconLabel3, iconLabel4 = null;
	JLabel fridgePowerLabel, lightPowerLabel, aggregatedPowerLabel = null;
		
	public ApplianceGUI(){
		
		this.setBackground(Color.white);
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		container.setBackground(Color.white);
		container.add(getFieldPanel());
		
		setTitle("Control Engine");
		setSize(900, 400);
		setLocation(600, 300);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		timer = new Timer();
		applianceTimerTask tt = new applianceTimerTask();
		timer.schedule(tt, 0, 500);
		fridgethread = new appliancePowerFridgeR1A1Thread();
		System.out.println("Fridge Thread created");	
		lightthread = new appliancePowerLightR3A10Thread();
		System.out.println("Light Thread created");	
		aggregatedthread = new aggregatedPowerThread();
		System.out.println("Agg Thread created");	
		fridgethread.start();
		lightthread.start();
		aggregatedthread.start();
				
		setResizable(false);
		setVisible(true);
	}
	
	private JPanel getFieldPanel() {
		JPanel p = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		p.setBackground(Color.white);

		pic1 = new ImageIcon("H:/Latha/SystemJ/Lab 2 new/Task5_Refrigerator/images/FRIDGE_ON.png");
		iconLabel1 = new JLabel(pic1);
		p.add(iconLabel1);
		iconLabel1.setVisible(false);
		
		pic2 = new ImageIcon("H:/Latha/SystemJ/Lab 2 new/Task5_Refrigerator/images/FRIDGE_OFF.png");
		iconLabel2 = new JLabel(pic2);
		p.add(iconLabel2);
		
		fridgePowerLabel = new JLabel();
		fridgePowerLabel.setText("0W");
		p.add(fridgePowerLabel);
		
		b1 = new JButton("ON");
		b1.setActionCommand("FRIDGE_ON");
		b1.addActionListener(this);
		p.add(b1);

		b2 = new JButton("OFF");
		b2.setActionCommand("FRIDGE_OFF");
		b2.addActionListener(this);
		p.add(b2);
		b2.setVisible(false);
		
		iconLabel2.setVisible(true);
		pic3 = new ImageIcon("H:/Latha/SystemJ/Lab 2 new/Task5_Refrigerator/images/LIGHT_ON.png");
		iconLabel3 = new JLabel(pic3);
		p.add(iconLabel3);
		iconLabel3.setVisible(false);
		
		pic4 = new ImageIcon("H:/Latha/SystemJ/Lab 2 new/Task5_Refrigerator/images/LIGHT_OFF.png");
		iconLabel4 = new JLabel(pic4);
		p.add(iconLabel4);
		iconLabel4.setVisible(true);
		
		lightPowerLabel = new JLabel();
		lightPowerLabel.setText("0W");
		p.add(lightPowerLabel);
		
		b3 = new JButton("ON");
		b3.setActionCommand("LIGHT_ON");
		b3.addActionListener(this);
		p.add(b3);
		
		b4 = new JButton("OFF");
		b4.setActionCommand("LIGHT_OFF");
		b4.addActionListener(this);
		p.add(b4);
		b4.setVisible(false);
		
		aggregatedPowerLabel = new JLabel();
		aggregatedPowerLabel.setText("   Aggregated Power: 0W");
		p.add(aggregatedPowerLabel);
		
		return p;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("FRIDGE_ON".equals(e.getActionCommand())) 
		{	
			b1.setVisible(false);
			b2.setVisible(true);
			iconLabel2.setVisible(false);
			iconLabel1.setVisible(true);
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44444);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				fridgethread.join(3);
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
			fridgePowerLabel.setText(fridgethread.getFridgePower()+"W");
			aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgethread.getFridgePower()+lightthread.getLightPower())+"W");
		}
		else if("FRIDGE_OFF".equals(e.getActionCommand()))
		{
			b1.setVisible(true);
			b2.setVisible(false);
			iconLabel2.setVisible(true);
			iconLabel1.setVisible(false);
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44445);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
				fridgethread.join(3);//waits for 3 ms until fridgethread finishes and updates the fridge power
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
			fridgePowerLabel.setText(fridgethread.getFridgePower()+"W");
			aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgethread.getFridgePower()+lightthread.getLightPower())+"W");
		}
		else if("LIGHT_ON".equals(e.getActionCommand()))
		{
			b3.setVisible(false);
			b4.setVisible(true);
			iconLabel4.setVisible(false);
			iconLabel3.setVisible(true);
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
	
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44446);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    lightthread.join(3);
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
			lightPowerLabel.setText(lightthread.getLightPower()+"W");
			aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgethread.getFridgePower()+lightthread.getLightPower())+"W");
		}
		else if("LIGHT_OFF".equals(e.getActionCommand()))
		{
			b3.setVisible(true);
			b4.setVisible(false);
			iconLabel4.setVisible(true);
			iconLabel3.setVisible(false);
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
	
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44447);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    lightthread.join(3);
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
			lightPowerLabel.setText(lightthread.getLightPower()+"W");
			aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgethread.getFridgePower()+lightthread.getLightPower())+"W");
		}
	}
	
	/*
	 * Function:
	 * Input: 'ON' or 'OFF' signal
	 * Output: Corresponding energy rating
	 */
	public int RetrieveEnergyRating(String OnOff, String applianceId)
	{
		int energyRating = 0;
		Socket skt = null;
		PrintWriter out = null;
		BufferedReader in = null;
		if(OnOff.equalsIgnoreCase("on") && applianceId.equalsIgnoreCase("A1"))/*fridge_on*/
		{
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44444);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block 
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(OnOff.equalsIgnoreCase("off") && applianceId.equalsIgnoreCase("A1"))/*fridge_off*/
		{
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44445);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			} catch (UnknownHostException e1) {  
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		try
		{
			fridgethread.join(3);//Call join() to wait until fridgethread thread finishes
			//lightthread.join();//Call join() to wait until lightthread thread finishes
			//aggregatedthread.join();//Call join() to wait until aggregatedthread thread finishes
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		energyRating = fridgethread.getFridgePower();
		return energyRating;
	}
	
	public static void main(String arg[])
	{ 
		new ApplianceGUI();
		/*System.out.println("Energy rating:::"+applianceGUI.RetrieveEnergyRating("ON", "A1"));
		System.out.println("Energy rating:::"+applianceGUI.RetrieveEnergyRating("Off", "A1"));
		System.out.println("Energy rating:::"+applianceGUI.RetrieveEnergyRating("ON", "A1"));
		System.out.println("Energy rating:::"+applianceGUI.RetrieveEnergyRating("ON", "A1"));
		System.out.println("Energy rating:::"+applianceGUI.RetrieveEnergyRating("Off", "A1"));*/
	}
	
}