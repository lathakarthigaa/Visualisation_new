package householdApplianceGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Visualisation {

	private JFrame frame;
	private appliancePowerFridgeR1A1Thread fridgeR1A1thread = null;
	private appliancePowerDishwasherR1A2Thread dishwasherR1A2Thread = null;
	private appliancePowerLightR3A10Thread lightR3A10thread = null;
	private aggregatedPowerThread aggregatedthread = null;
	private JLabel fridgeR1A1PowerLabel, dishwasherR1A2PowerLabel, dryerR1A3PowerLabel, stoveR1A4PowerLabel, ovenR1A5PowerLabel, TVR2A6PowerLabel, powerplugR2A7PowerLabel, heaterR2A8PowerLabel, heaterR3A9PowerLabel, lightR3A10PowerLabel, powerplugR3A11PowerLabel, lightR4A12PowerLabel, fanR4A13PowerLabel, waterHeaterR4A14PowerLabel = null;
	private JLabel fridgeR1A1IconLabel, dishwasherR1A2IconLabel, dryerR1A3IconLabel, stoveR1A4IconLabel, ovenR1A5IconLabel, TVR2A6IconLabel, powerplugR2A7IconLabel, heaterR2A8IconLabel, heaterR3A9IconLabel, lightR3A10IconLabel, powerplugR3A11IconLabel, lightR4A12IconLabel, fanR4A13IconLabel, waterHeaterR4A14IconLabel = null;
	private JButton fridgeR1A1Button, dishwasherR1A2Button, dryerR1A3Button, stoveR1A4Button, ovenR1A5Button, TVR2A6Button, powerplugR2A7Button, heaterR2A8Button, heaterR3A9Button, lightR3A10Button, powerplugR3A11Button, lightR4A12Button, fanR4A13Button, waterHeaterR4A14Button = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualisation window = new Visualisation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Visualisation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1281, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fridgeR1A1thread = new appliancePowerFridgeR1A1Thread();
		System.out.println("Fridge R1 A1 Thread created");	
		dishwasherR1A2Thread = new appliancePowerDishwasherR1A2Thread();
		System.out.println("Dishwasher R1 A2 Thread created");	
		lightR3A10thread = new appliancePowerLightR3A10Thread();
		System.out.println("Light R3 A10 Thread created");	
		aggregatedthread = new aggregatedPowerThread();
		System.out.println("Agg Thread created");	
		
		fridgeR1A1thread.start();
		dishwasherR1A2Thread.start();
		lightR3A10thread.start();
		aggregatedthread.start();
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(866, 93, 2, 266);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(49, 357, 1002, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel lblKitchen = new JLabel("Kitchen (Room 1)");
		lblKitchen.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblKitchen.setBounds(279, 66, 138, 26);
		frame.getContentPane().add(lblKitchen);
		
		JLabel lblLivingRoom = new JLabel("Living Room (Room 2)");
		lblLivingRoom.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblLivingRoom.setBounds(206, 374, 175, 18);
		frame.getContentPane().add(lblLivingRoom);
		
		JLabel lblBedRoom = new JLabel("Bed Room (Room 3)");
		lblBedRoom.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblBedRoom.setBounds(1068, 66, 167, 26);
		frame.getContentPane().add(lblBedRoom);
		
		JLabel lblBathRoom = new JLabel("Bath Room (Room 4)");
		lblBathRoom.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblBathRoom.setBounds(633, 370, 175, 26);
		frame.getContentPane().add(lblBathRoom);
		
		JLabel lblAggregatedPower = new JLabel("Aggregated Power:");
		lblAggregatedPower.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblAggregatedPower.setBounds(431, 690, 175, 21);
		frame.getContentPane().add(lblAggregatedPower);
		
		JLabel aggregatedValueLabel = new JLabel("0W");
		aggregatedValueLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		aggregatedValueLabel.setBounds(603, 693, 46, 14);
		frame.getContentPane().add(aggregatedValueLabel);
		
		fridgeR1A1Button = new JButton("ON");
		fridgeR1A1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (fridgeR1A1Button.getText().equalsIgnoreCase("ON")) 
				{
					fridgeR1A1IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Fridge_ON.jpg"));
					fridgeR1A1Button.setText("OFF");
					Socket skt = null;
					PrintWriter out = null;
					BufferedReader in = null;
					try {
						skt = new Socket(InetAddress.getByName("127.0.0.1"), 44444);
						in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
						out = new PrintWriter(skt.getOutputStream(),true);
						out.println(true);
						in.close();out.close();skt.close();
						fridgeR1A1thread.join(3);
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
					fridgeR1A1PowerLabel.setText(fridgeR1A1thread.getFridgeR1A1Power()+"W");
					//aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgeR1A1thread.getFridgePower()+lightthread.getLightPower())+"W");
				}
				else if(fridgeR1A1Button.getText().equalsIgnoreCase("OFF"))
				{
					fridgeR1A1IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Fridge_OFF.jpg"));
					fridgeR1A1Button.setText("ON");
					Socket skt = null;
					PrintWriter out = null;
					BufferedReader in = null;
					try {
						skt = new Socket(InetAddress.getByName("127.0.0.1"), 44445);
						in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
						out = new PrintWriter(skt.getOutputStream(),true);
					    out.println(true);
					    in.close();out.close();skt.close();
					    fridgeR1A1thread.join(3);//waits for 3 ms until fridgethread finishes and updates the fridge power
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
					fridgeR1A1PowerLabel.setText(fridgeR1A1thread.getFridgeR1A1Power()+"W");
					//aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgethread.getFridgePower()+lightthread.getLightPower())+"W");
				}
			}
		});
		fridgeR1A1Button.setBounds(81, 303, 80, 23);
		frame.getContentPane().add(fridgeR1A1Button);
		
		fridgeR1A1IconLabel = new JLabel("New label");
		fridgeR1A1IconLabel.setBackground(Color.LIGHT_GRAY);
		fridgeR1A1IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Fridge_ON.jpg"));
		fridgeR1A1IconLabel.setBounds(34, 119, 154, 148);
		frame.getContentPane().add(fridgeR1A1IconLabel);
		
		fridgeR1A1PowerLabel = new JLabel("0W");
		fridgeR1A1PowerLabel.setBounds(115, 278, 46, 14);
		frame.getContentPane().add(fridgeR1A1PowerLabel);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(534, 357, 2, 266);
		frame.getContentPane().add(separator);
		
		dishwasherR1A2IconLabel = new JLabel("New label");
		dishwasherR1A2IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Dishwasher_ON.jpg"));
		dishwasherR1A2IconLabel.setBounds(198, 120, 154, 147);
		frame.getContentPane().add(dishwasherR1A2IconLabel);
		
		dishwasherR1A2PowerLabel = new JLabel("0W");
		dishwasherR1A2PowerLabel.setBounds(262, 278, 46, 14);
		frame.getContentPane().add(dishwasherR1A2PowerLabel);
		
		dishwasherR1A2Button = new JButton("ON");
		dishwasherR1A2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dishwasherR1A2Button.getText().equalsIgnoreCase("ON")) 
				{
					dishwasherR1A2IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Dishwasher_ON.jpg"));
					dishwasherR1A2Button.setText("OFF");
					Socket skt = null;
					PrintWriter out = null;
					BufferedReader in = null;
					try {
						skt = new Socket(InetAddress.getByName("127.0.0.1"), 44446);
						in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
						out = new PrintWriter(skt.getOutputStream(),true);
						out.println(true);
						in.close();out.close();skt.close();
						dishwasherR1A2Thread.join(3);
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
					dishwasherR1A2PowerLabel.setText(dishwasherR1A2Thread.getDishwasherR1A1Power()+"W");
					//aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgeR1A1thread.getFridgePower()+lightthread.getLightPower())+"W");
				}
				else if(dishwasherR1A2Button.getText().equalsIgnoreCase("OFF"))
				{
					dishwasherR1A2IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Dishwasher_OFF.jpg"));
					dishwasherR1A2Button.setText("ON");
					Socket skt = null;
					PrintWriter out = null;
					BufferedReader in = null;
					try {
						skt = new Socket(InetAddress.getByName("127.0.0.1"), 44447);
						in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
						out = new PrintWriter(skt.getOutputStream(),true);
					    out.println(true);
					    in.close();out.close();skt.close();
					    dishwasherR1A2Thread.join(3);//waits for 3 ms until dishwasher thread finishes and updates the dishwasher power
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
					dishwasherR1A2PowerLabel.setText(dishwasherR1A2Thread.getDishwasherR1A1Power()+"W");
					//aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgethread.getFridgePower()+lightthread.getLightPower())+"W");
				}
			}
		});
		dishwasherR1A2Button.setBounds(234, 303, 74, 23);
		frame.getContentPane().add(dishwasherR1A2Button);
		
		dryerR1A3IconLabel = new JLabel("New label");
		dryerR1A3IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Dryer_ON.jpg"));
		dryerR1A3IconLabel.setBounds(370, 119, 154, 147);
		frame.getContentPane().add(dryerR1A3IconLabel);
		
		dryerR1A3PowerLabel = new JLabel("0W");
		dryerR1A3PowerLabel.setBounds(434, 277, 46, 14);
		frame.getContentPane().add(dryerR1A3PowerLabel);
		
		dryerR1A3Button = new JButton("ON");
		dryerR1A3Button.setBounds(410, 302, 70, 23);
		frame.getContentPane().add(dryerR1A3Button);
		
		stoveR1A4IconLabel = new JLabel("New label");
		stoveR1A4IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Stove_ON.jpg"));
		stoveR1A4IconLabel.setBounds(534, 120, 154, 147);
		frame.getContentPane().add(stoveR1A4IconLabel);
		
		stoveR1A4PowerLabel = new JLabel("0W");
		stoveR1A4PowerLabel.setBounds(598, 278, 46, 14);
		frame.getContentPane().add(stoveR1A4PowerLabel);
		
		stoveR1A4Button = new JButton("ON");
		stoveR1A4Button.setBounds(571, 303, 78, 23);
		frame.getContentPane().add(stoveR1A4Button);
		
		ovenR1A5IconLabel = new JLabel("New label");
		ovenR1A5IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Oven_ON.jpg"));
		ovenR1A5IconLabel.setBounds(698, 120, 154, 147);
		frame.getContentPane().add(ovenR1A5IconLabel);
		
		ovenR1A5PowerLabel = new JLabel("0W");
		ovenR1A5PowerLabel.setBounds(762, 278, 46, 14);
		frame.getContentPane().add(ovenR1A5PowerLabel);
		
		ovenR1A5Button = new JButton("ON");
		ovenR1A5Button.setBounds(735, 303, 73, 23);
		frame.getContentPane().add(ovenR1A5Button);
		
		heaterR3A9IconLabel = new JLabel("New label");
		heaterR3A9IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Heater_ON.jpg"));
		heaterR3A9IconLabel.setBounds(1078, 113, 154, 147);
		frame.getContentPane().add(heaterR3A9IconLabel);
		
		heaterR3A9PowerLabel = new JLabel("0W");
		heaterR3A9PowerLabel.setBounds(1142, 271, 46, 14);
		frame.getContentPane().add(heaterR3A9PowerLabel);
		
		heaterR3A9Button = new JButton("ON");
		heaterR3A9Button.setBounds(1117, 296, 71, 23);
		frame.getContentPane().add(heaterR3A9Button);
		
		lightR3A10IconLabel = new JLabel("New label");
		lightR3A10IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_ON.jpg"));
		lightR3A10IconLabel.setBounds(1081, 404, 154, 147);
		frame.getContentPane().add(lightR3A10IconLabel);
		
		lightR3A10PowerLabel = new JLabel("0W");
		lightR3A10PowerLabel.setBounds(1145, 562, 46, 14);
		frame.getContentPane().add(lightR3A10PowerLabel);
		
		lightR3A10Button = new JButton("ON");
		lightR3A10Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lightR3A10Button.getText().equalsIgnoreCase("ON")) 
				{
					lightR3A10IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_ON.jpg"));
					lightR3A10Button.setText("OFF");
					Socket skt = null;
					PrintWriter out = null;
					BufferedReader in = null;
					try {
						skt = new Socket(InetAddress.getByName("127.0.0.1"), 44462);
						in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
						out = new PrintWriter(skt.getOutputStream(),true);
						out.println(true);
						in.close();out.close();skt.close();
						lightR3A10thread.join(3);
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
					lightR3A10PowerLabel.setText(lightR3A10thread.getLightR3A10Power()+"W");
					//aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgeR1A1thread.getFridgePower()+lightthread.getLightPower())+"W");
				}
				else if(lightR3A10Button.getText().equalsIgnoreCase("OFF"))
				{
					lightR3A10IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_OFF.jpg"));
					lightR3A10Button.setText("ON");
					Socket skt = null;
					PrintWriter out = null;
					BufferedReader in = null;
					try {
						skt = new Socket(InetAddress.getByName("127.0.0.1"), 44463);
						in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
						out = new PrintWriter(skt.getOutputStream(),true);
					    out.println(true);
					    in.close();out.close();skt.close();
					    lightR3A10thread.join(3);//waits for 3 ms until dishwasher thread finishes and updates the dishwasher power
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
					lightR3A10PowerLabel.setText(lightR3A10thread.getLightR3A10Power()+"W");
					//aggregatedPowerLabel.setText("   Aggregated Power: "+(fridgethread.getFridgePower()+lightthread.getLightPower())+"W");
				}
			}
		});
		lightR3A10Button.setBounds(1117, 587, 71, 23);
		frame.getContentPane().add(lightR3A10Button);
		
		TVR2A6IconLabel = new JLabel("New label");
		TVR2A6IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\TV_ON.jpg"));
		TVR2A6IconLabel.setBounds(34, 404, 154, 147);
		frame.getContentPane().add(TVR2A6IconLabel);
		
		TVR2A6PowerLabel = new JLabel("0W");
		TVR2A6PowerLabel.setBounds(98, 562, 46, 14);
		frame.getContentPane().add(TVR2A6PowerLabel);
		
		TVR2A6Button = new JButton("ON");
		TVR2A6Button.setBounds(70, 587, 74, 23);
		frame.getContentPane().add(TVR2A6Button);
		
		powerplugR2A7IconLabel = new JLabel("New label");
		powerplugR2A7IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Powerplug_ON.jpg"));
		powerplugR2A7IconLabel.setBounds(198, 404, 154, 147);
		frame.getContentPane().add(powerplugR2A7IconLabel);
		
		powerplugR2A7PowerLabel = new JLabel("0W");
		powerplugR2A7PowerLabel.setBounds(262, 562, 46, 14);
		frame.getContentPane().add(powerplugR2A7PowerLabel);
		
		powerplugR2A7Button = new JButton("ON");
		powerplugR2A7Button.setBounds(234, 587, 74, 23);
		frame.getContentPane().add(powerplugR2A7Button);
		
		heaterR2A8IconLabel = new JLabel("New label");
		heaterR2A8IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Heater_ON.jpg"));
		heaterR2A8IconLabel.setBounds(370, 404, 154, 147);
		frame.getContentPane().add(heaterR2A8IconLabel);
		
		heaterR2A8PowerLabel = new JLabel("0W");
		heaterR2A8PowerLabel.setBounds(434, 562, 46, 14);
		frame.getContentPane().add(heaterR2A8PowerLabel);
		
		heaterR2A8Button = new JButton("ON");
		heaterR2A8Button.setBounds(410, 587, 70, 23);
		frame.getContentPane().add(heaterR2A8Button);
		
		lightR4A12IconLabel = new JLabel("New label");
		lightR4A12IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_ON.jpg"));
		lightR4A12IconLabel.setBounds(546, 404, 154, 147);
		frame.getContentPane().add(lightR4A12IconLabel);
		
		lightR4A12PowerLabel = new JLabel("0W");
		lightR4A12PowerLabel.setBounds(610, 562, 46, 14);
		frame.getContentPane().add(lightR4A12PowerLabel);
		
		lightR4A12Button = new JButton("ON");
		lightR4A12Button.setBounds(582, 587, 74, 23);
		frame.getContentPane().add(lightR4A12Button);
		
		fanR4A13IconLabel = new JLabel("New label");
		fanR4A13IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\ExhaustFan_ON.jpg"));
		fanR4A13IconLabel.setBounds(714, 404, 154, 147);
		frame.getContentPane().add(fanR4A13IconLabel);
		
		fanR4A13PowerLabel = new JLabel("0W");
		fanR4A13PowerLabel.setBounds(778, 562, 46, 14);
		frame.getContentPane().add(fanR4A13PowerLabel);
		
		fanR4A13Button = new JButton("ON");
		fanR4A13Button.setBounds(750, 587, 74, 23);
		frame.getContentPane().add(fanR4A13Button);
		
		waterHeaterR4A14IconLabel = new JLabel("New label");
		waterHeaterR4A14IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\WaterHeater_ON.jpg"));
		waterHeaterR4A14IconLabel.setBounds(881, 404, 154, 147);
		frame.getContentPane().add(waterHeaterR4A14IconLabel);
		
		waterHeaterR4A14PowerLabel = new JLabel("0W");
		waterHeaterR4A14PowerLabel.setBounds(945, 562, 46, 14);
		frame.getContentPane().add(waterHeaterR4A14PowerLabel);
		
		waterHeaterR4A14Button = new JButton("ON");
		waterHeaterR4A14Button.setBounds(917, 587, 74, 23);
		frame.getContentPane().add(waterHeaterR4A14Button);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(1049, 357, 2, 266);
		frame.getContentPane().add(separator_2);
		
		powerplugR3A11IconLabel = new JLabel("New label");
		powerplugR3A11IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Powerplug_ON.jpg"));
		powerplugR3A11IconLabel.setBounds(897, 120, 154, 147);
		frame.getContentPane().add(powerplugR3A11IconLabel);
		
		powerplugR3A11PowerLabel = new JLabel("0W");
		powerplugR3A11PowerLabel.setBounds(961, 278, 46, 14);
		frame.getContentPane().add(powerplugR3A11PowerLabel);
		
		powerplugR3A11Button = new JButton("ON");
		powerplugR3A11Button.setBounds(928, 303, 79, 23);
		frame.getContentPane().add(powerplugR3A11Button);
	}
}
