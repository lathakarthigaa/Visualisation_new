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

public class Visualisation extends TimerTask{

	private JFrame frame;
	private AppliancePowerFridgeR1A1Thread fridgeR1A1Thread = null;
	private AppliancePowerDishwasherR1A2Thread dishwasherR1A2Thread = null;
	private AppliancePowerDryerR1A3Thread dryerR1A3Thread = null;
	private AppliancePowerStoveR1A4Thread stoveR1A4Thread = null;
	private AppliancePowerOvenR1A5Thread ovenR1A5Thread = null;
	private AppliancePowerTVR2A6Thread TVR2A6Thread = null;
	private AppliancePowerPowerPlugsR2A7Thread powerplugsR2A7Thread = null;
	private AppliancePowerHeaterR2A8Thread heaterR2A8Thread = null;
	private AppliancePowerHeaterR3A9Thread heaterR3A9Thread = null;
	private AppliancePowerLightR3A10Thread lightR3A10Thread = null;
	private AppliancePowerPowerPlugsR3A11Thread powerplugsR3A11Thread = null;
	private AppliancePowerLightR4A12Thread lightR4A12Thread = null;
	private AppliancePowerFanR4A13Thread fanR4A13Thread = null;
	private AppliancePowerWaterHeaterR4A14Thread waterHeaterR4A14Thread = null;
	private aggregatedPowerThread aggregatedthread = null;
	private JLabel fridgeR1A1PowerLabel, dishwasherR1A2PowerLabel, dryerR1A3PowerLabel, stoveR1A4PowerLabel, ovenR1A5PowerLabel, TVR2A6PowerLabel, powerplugR2A7PowerLabel, heaterR2A8PowerLabel, heaterR3A9PowerLabel, lightR3A10PowerLabel, powerplugR3A11PowerLabel, lightR4A12PowerLabel, fanR4A13PowerLabel, waterHeaterR4A14PowerLabel = null;
	private JLabel fridgeR1A1IconLabel, dishwasherR1A2IconLabel, dryerR1A3IconLabel, stoveR1A4IconLabel, ovenR1A5IconLabel, TVR2A6IconLabel, powerplugR2A7IconLabel, heaterR2A8IconLabel, heaterR3A9IconLabel, lightR3A10IconLabel, powerplugR3A11IconLabel, lightR4A12IconLabel, fanR4A13IconLabel, waterHeaterR4A14IconLabel = null;
	private JToggleButton fridgeR1A1Button, dishwasherR1A2Button, dryerR1A3Button, stoveR1A4Button, ovenR1A5Button, TVR2A6Button, powerplugR2A7Button, heaterR2A8Button, heaterR3A9Button, lightR3A10Button, powerplugR3A11Button, lightR4A12Button, fanR4A13Button, waterHeaterR4A14Button = null;
	private JLabel kitchenAggregatedLabel;
	private JLabel LivingRoomAggregatedLabel;
	private JLabel BathRoomAggregatedLabel;
	private JLabel BedroomAggregatedLabel;
	private JLabel kitchenAggPowerLabel;
	private JLabel BedRoomAggPowerLabel;
	private JLabel LivingRoomAggPowerLabel;
	private JLabel BathRoomAggPowerLabel;
	private JLabel TotalAggregatedValueLabel;	

	private PrintWriter printWriter = null;
    private static Calendar cal = Calendar.getInstance();

	public void run()
	{
		int fridgeR1A1Power, dishwasherR1A2Power, dryerR1A3Power,  stoveR1A4Power, ovenR1A5Power, TVR2A6Power, powerplugR2A7Power, heaterR2A8Power, heaterR3A9Power, lightR3A10Power, powerplugR3A11Power, lightR4A12Power, fanR4A13Power, waterHeaterR4A14Power, aggregatedPower;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:00");
	    
		try {
			printWriter = new PrintWriter(new FileWriter("D:/all.txt", true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    printWriter.print(dateFormat.format(cal.getTime())+" ");
	    
		if(fridgeR1A1Button.isSelected())
		{
			fridgeR1A1Button.setText("OFF");
			fridgeR1A1Power = OnOffFridgeR1A1("ON");
			printWriter.print(fridgeR1A1Power+" ");
		}
		else
		{
			fridgeR1A1Button.setText("ON");
			fridgeR1A1Power = OnOffFridgeR1A1("OFF");
			printWriter.print(fridgeR1A1Power+" ");
		}
		if(dishwasherR1A2Button.isSelected())
		{
			dishwasherR1A2Button.setText("OFF");
			dishwasherR1A2Power = OnOffDishwasherR1A2("ON");
			printWriter.print(dishwasherR1A2Power+" ");
		}
		else
		{
			dishwasherR1A2Button.setText("ON");
			dishwasherR1A2Power = OnOffDishwasherR1A2("OFF");
			printWriter.print(dishwasherR1A2Power+" ");
		}
		if(dryerR1A3Button.isSelected())
		{
			dryerR1A3Button.setText("OFF");
			dryerR1A3Power = OnOffDryerR1A3("ON");
			printWriter.print(dryerR1A3Power+" ");
		}
		else
		{
			dryerR1A3Button.setText("ON");
			dryerR1A3Power = OnOffDryerR1A3("OFF");
			printWriter.print(dryerR1A3Power+" ");
		}
		if(stoveR1A4Button.isSelected())
		{
			stoveR1A4Button.setText("OFF");
			stoveR1A4Power = OnOffStoveR1A4("ON");
			printWriter.print(stoveR1A4Power+" ");
		}
		else
		{
			stoveR1A4Button.setText("ON");
			stoveR1A4Power = OnOffStoveR1A4("OFF");
			printWriter.print(stoveR1A4Power+" ");
		}
		if(ovenR1A5Button.isSelected())
		{
			ovenR1A5Button.setText("OFF");
			ovenR1A5Power = OnOffOvenR1A5("ON");
			printWriter.print(ovenR1A5Power+" ");
		}
		else
		{
			ovenR1A5Button.setText("ON");
			ovenR1A5Power = OnOffOvenR1A5("OFF");
			printWriter.print(ovenR1A5Power+" ");
		}
		if(TVR2A6Button.isSelected())
		{
			TVR2A6Button.setText("OFF");
			TVR2A6Power = OnOffTVR2A6("ON");
			printWriter.print(TVR2A6Power+" ");
		}
		else
		{
			TVR2A6Button.setText("ON");
			TVR2A6Power = OnOffTVR2A6("OFF");
			printWriter.print(TVR2A6Power+" ");
		}
		if(powerplugR2A7Button.isSelected())
		{
			powerplugR2A7Button.setText("OFF");
			powerplugR2A7Power = OnOffPowerPlugsR2A7("ON");
			printWriter.print(powerplugR2A7Power+" ");
		}
		else
		{
			powerplugR2A7Button.setText("ON");
			powerplugR2A7Power = OnOffPowerPlugsR2A7("OFF");
			printWriter.print(powerplugR2A7Power+" ");
		}
		if(heaterR2A8Button.isSelected())
		{
			heaterR2A8Button.setText("OFF");
			heaterR2A8Power = OnOffHeaterR2A8("ON");
			printWriter.print(heaterR2A8Power+" ");
		}
		else
		{
			heaterR2A8Button.setText("ON");
			heaterR2A8Power = OnOffHeaterR2A8("OFF");
			printWriter.print(heaterR2A8Power+" ");
		}
		if(heaterR3A9Button.isSelected())
		{
			heaterR3A9Button.setText("OFF");
			heaterR3A9Power = OnOffHeaterR3A9("ON");
			printWriter.print(heaterR3A9Power+" ");
		}
		else
		{
			heaterR3A9Button.setText("ON");
			heaterR3A9Power = OnOffHeaterR3A9("OFF");
			printWriter.print(heaterR3A9Power+" ");
		}
		if(lightR3A10Button.isSelected())
		{
			lightR3A10Button.setText("OFF");
			lightR3A10Power = OnOffLightR3A10("ON");
			printWriter.print(lightR3A10Power+" ");
		}
		else
		{
			lightR3A10Button.setText("ON");
			lightR3A10Power = OnOffLightR3A10("OFF");
			printWriter.print(lightR3A10Power+" ");
		}
		if(powerplugR3A11Button.isSelected())
		{
			powerplugR3A11Button.setText("OFF");
			powerplugR3A11Power = OnOffPowerPlugsR3A11("ON");
			printWriter.print(powerplugR3A11Power+" ");
		}
		else
		{
			powerplugR3A11Button.setText("ON");
			powerplugR3A11Power = OnOffPowerPlugsR3A11("OFF");
			printWriter.print(powerplugR3A11Power+" ");
		}
		if(lightR4A12Button.isSelected())
		{
			lightR4A12Button.setText("OFF");
			lightR4A12Power = OnOffLightR4A12("ON");
			printWriter.print(lightR4A12Power+" ");
		}
		else
		{
			lightR4A12Button.setText("ON");
			lightR4A12Power = OnOffLightR4A12("OFF");
			printWriter.print(lightR4A12Power+" ");
		}
		if(fanR4A13Button.isSelected())
		{
			fanR4A13Button.setText("OFF");
			fanR4A13Power = OnOffFanR4A13("ON");
			printWriter.print(fanR4A13Power+" ");
		}
		else
		{
			fanR4A13Button.setText("ON");
			fanR4A13Power = OnOffFanR4A13("OFF");
			printWriter.print(fanR4A13Power+" ");
		}
		if(waterHeaterR4A14Button.isSelected())
		{
			waterHeaterR4A14Button.setText("OFF");
			waterHeaterR4A14Power = OnOffWaterHeaterR4A14("ON");
			printWriter.print(waterHeaterR4A14Power+" ");
		}
		else
		{
			waterHeaterR4A14Button.setText("ON");
			waterHeaterR4A14Power = OnOffWaterHeaterR4A14("OFF");
			printWriter.print(waterHeaterR4A14Power+" ");
		}
		aggregatedPower = fridgeR1A1Power + dishwasherR1A2Power + dryerR1A3Power + stoveR1A4Power + ovenR1A5Power + TVR2A6Power + powerplugR2A7Power + heaterR2A8Power + heaterR3A9Power + lightR3A10Power + powerplugR3A11Power + lightR4A12Power + fanR4A13Power + waterHeaterR4A14Power;
		printWriter.println(aggregatedPower);
		printWriter.close();

	    cal.add(Calendar.MINUTE,1);
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
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
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
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return fridgeR1A1Thread.getFridgeR1A1Power();
	}
	
	/**
	 * ON/OFF Dishwasher R1A2
	 */
	private int OnOffDishwasherR1A2(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
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
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
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
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return dishwasherR1A2Thread.getDishwasherR1A1Power();
	}
	
	/**
	 * ON/OFF Dryer R1 A3
	 */
	private int OnOffDryerR1A3(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			dryerR1A3IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Dryer_ON.jpg"));
			dryerR1A3Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44448);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				dryerR1A3Thread.join(3);
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
			dryerR1A3PowerLabel.setText(dryerR1A3Thread.getDryerR1A3Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			dryerR1A3IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Dryer_OFF.jpg"));
			dryerR1A3Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44449);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    dryerR1A3Thread.join(3);//waits for 3 ms until dryer thread finishes and updates the dryer power
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
			dryerR1A3PowerLabel.setText(dryerR1A3Thread.getDryerR1A3Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return dryerR1A3Thread.getDryerR1A3Power();
	}
	
	/**
	 * On/OFF Stove R1 A4
	 */
	private int OnOffStoveR1A4(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			stoveR1A4IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Stove_ON.jpg"));
			stoveR1A4Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44450);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				stoveR1A4Thread.join(3);
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
			stoveR1A4PowerLabel.setText(stoveR1A4Thread.getStoveR1A4Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			stoveR1A4IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Stove_OFF.jpg"));
			stoveR1A4Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44451);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    stoveR1A4Thread.join(3);//waits for 3 ms until stove thread finishes and updates the stove power
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
			stoveR1A4PowerLabel.setText(stoveR1A4Thread.getStoveR1A4Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return stoveR1A4Thread.getStoveR1A4Power();
	}
	
	/**
	 * On/OFF Oven R1 A5
	 */
	private int OnOffOvenR1A5(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			ovenR1A5IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Oven_ON.jpg"));
			ovenR1A5Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44452);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				ovenR1A5Thread.join(3);
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
			ovenR1A5PowerLabel.setText(ovenR1A5Thread.getOvenR1A5Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			ovenR1A5IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Oven_OFF.jpg"));
			ovenR1A5Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44453);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    ovenR1A5Thread.join(3);//waits for 3 ms until oven thread finishes and updates the oven power
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
			ovenR1A5PowerLabel.setText(ovenR1A5Thread.getOvenR1A5Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return ovenR1A5Thread.getOvenR1A5Power();
	}

	/**
	 * On/OFF TV R2 A6
	 */
	private int OnOffTVR2A6(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			TVR2A6IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\TV_ON.jpg"));
			TVR2A6Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44454);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				TVR2A6Thread.join(3);
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
			TVR2A6PowerLabel.setText(TVR2A6Thread.getTVR2A6Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			TVR2A6IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\TV_OFF.jpg"));
			TVR2A6Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44455);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    TVR2A6Thread.join(3);//waits for 3 ms until TV thread finishes and updates the TV power
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
			TVR2A6PowerLabel.setText(TVR2A6Thread.getTVR2A6Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return TVR2A6Thread.getTVR2A6Power();
	}

	/**
	 * On/OFF PowerPlugs R2 A7
	 */
	private int OnOffPowerPlugsR2A7(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			powerplugR2A7IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Powerplug_ON.jpg"));
			powerplugR2A7Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44456);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				powerplugsR2A7Thread.join(3);
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
			powerplugR2A7PowerLabel.setText(powerplugsR2A7Thread.getPowerPlugsR2A7Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			powerplugR2A7IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Powerplug_OFF.jpg"));
			powerplugR2A7Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44457);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    powerplugsR2A7Thread.join(3);//waits for 3 ms until power plugs thread finishes and updates the power plugs power
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
			powerplugR2A7PowerLabel.setText(powerplugsR2A7Thread.getPowerPlugsR2A7Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return powerplugsR2A7Thread.getPowerPlugsR2A7Power();
	}

	/**
	 * On/OFF Heater R2 A8
	 */
	private int OnOffHeaterR2A8(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			heaterR2A8IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Heater_ON.jpg"));
			heaterR2A8Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44458);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				heaterR2A8Thread.join(3);
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
			heaterR2A8PowerLabel.setText(heaterR2A8Thread.getHeaterR2A8Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			heaterR2A8IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Heater_OFF.jpg"));
			heaterR2A8Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44459);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    heaterR2A8Thread.join(3);//waits for 3 ms until heater thread finishes and updates the heater power
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
			heaterR2A8PowerLabel.setText(heaterR2A8Thread.getHeaterR2A8Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}		
		return heaterR2A8Thread.getHeaterR2A8Power();
	}

	/**
	 * On/OFF Heater R3 A9
	 */
	private int OnOffHeaterR3A9(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			heaterR3A9IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Heater_ON.jpg"));
			heaterR3A9Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44460);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				heaterR3A9Thread.join(3);
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
			heaterR3A9PowerLabel.setText(heaterR3A9Thread.getHeaterR3A9Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			heaterR3A9IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Heater_OFF.jpg"));
			heaterR3A9Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44461);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    heaterR3A9Thread.join(3);//waits for 3 ms until heater thread finishes and updates the heater power
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
			heaterR3A9PowerLabel.setText(heaterR3A9Thread.getHeaterR3A9Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return heaterR3A9Thread.getHeaterR3A9Power();
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
	 * On/OFF PowerPlugs R3 A11
	 */
	private int OnOffPowerPlugsR3A11(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			powerplugR3A11IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Powerplug_ON.jpg"));
			powerplugR3A11Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44464);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				powerplugsR3A11Thread.join(3);
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
			powerplugR3A11PowerLabel.setText(powerplugsR3A11Thread.getPowerPlugsR3A11Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			powerplugR3A11IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Powerplug_OFF.jpg"));
			powerplugR3A11Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44465);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    powerplugsR3A11Thread.join(3);//waits for 3 ms until power plugs thread finishes and updates the power plugs power
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
			powerplugR3A11PowerLabel.setText(powerplugsR3A11Thread.getPowerPlugsR3A11Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return powerplugsR3A11Thread.getPowerPlugsR3A11Power();
	}

	/**
	 * On/OFF Light R4 A12
	 */
	private int OnOffLightR4A12(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			lightR4A12IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_ON.jpg"));
			lightR4A12Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44466);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				lightR4A12Thread.join(3);
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
			lightR4A12PowerLabel.setText(lightR4A12Thread.getLightR4A12Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			lightR4A12IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_OFF.jpg"));
			lightR4A12Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44467);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    lightR4A12Thread.join(3);//waits for 3 ms until LIGHT thread finishes and updates the LIGHT power
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
			lightR4A12PowerLabel.setText(lightR4A12Thread.getLightR4A12Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return lightR4A12Thread.getLightR4A12Power();
	}

	/**
	 * On/OFF Fan R4 A13
	 */
	private int OnOffFanR4A13(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			fanR4A13IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\ExhaustFan_ON.jpg"));
			fanR4A13Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44468);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				fanR4A13Thread.join(3);
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
			fanR4A13PowerLabel.setText(fanR4A13Thread.getFanR4A13Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			fanR4A13IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\ExhaustFan_OFF.jpg"));
			fanR4A13Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44469);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    fanR4A13Thread.join(3);//waits for 3 ms until FAN thread finishes and updates the FAN power
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
			fanR4A13PowerLabel.setText(fanR4A13Thread.getFanR4A13Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return fanR4A13Thread.getFanR4A13Power();
	}

	/**
	 * On/OFF Water Heater R4 A14
	 */
	private int OnOffWaterHeaterR4A14(String OnOff)
	{
		if (OnOff.equalsIgnoreCase("ON")) 
		{
			waterHeaterR4A14IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\WaterHeater_ON.jpg"));
			waterHeaterR4A14Button.setText("OFF");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44470);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
				out.println(true);
				in.close();out.close();skt.close();
				waterHeaterR4A14Thread.join(3);
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
			waterHeaterR4A14PowerLabel.setText(waterHeaterR4A14Thread.getWaterHeaterR4A14Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		else if(OnOff.equalsIgnoreCase("OFF"))
		{
			waterHeaterR4A14IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\WaterHeater_OFF.jpg"));
			waterHeaterR4A14Button.setText("ON");
			Socket skt = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try {
				skt = new Socket(InetAddress.getByName("127.0.0.1"), 44471);
				in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				out = new PrintWriter(skt.getOutputStream(),true);
			    out.println(true);
			    in.close();out.close();skt.close();
			    waterHeaterR4A14Thread.join(3);//waits for 3 ms until WATER HEATER thread finishes and updates the WATER HEATER power
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
			waterHeaterR4A14PowerLabel.setText(waterHeaterR4A14Thread.getWaterHeaterR4A14Power()+"W");
			kitchenAggPowerLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power())+" W");
			LivingRoomAggPowerLabel.setText((TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power())+" W");
			BedRoomAggPowerLabel.setText((heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power())+" W");
			BathRoomAggPowerLabel.setText((lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
			TotalAggregatedValueLabel.setText((fridgeR1A1Thread.getFridgeR1A1Power()+dishwasherR1A2Thread.getDishwasherR1A1Power()+dryerR1A3Thread.getDryerR1A3Power()+stoveR1A4Thread.getStoveR1A4Power()+ovenR1A5Thread.getOvenR1A5Power()+TVR2A6Thread.getTVR2A6Power()+powerplugsR2A7Thread.getPowerPlugsR2A7Power()+heaterR2A8Thread.getHeaterR2A8Power()+heaterR3A9Thread.getHeaterR3A9Power()+lightR3A10Thread.getLightR3A10Power()+powerplugsR3A11Thread.getPowerPlugsR3A11Power()+lightR4A12Thread.getLightR4A12Power()+fanR4A13Thread.getFanR4A13Power()+waterHeaterR4A14Thread.getWaterHeaterR4A14Power())+" W");
		}
		return waterHeaterR4A14Thread.getWaterHeaterR4A14Power();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Visualisation window = null;
		Timer timer = new Timer();
		timer.schedule(window = new Visualisation(), 0, 100);//schedule to execute very 1000 ms which is 1 second
		window.frame.setVisible(true);
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
		
		fridgeR1A1Thread = new AppliancePowerFridgeR1A1Thread();
		System.out.println("Fridge R1 A1 Thread created");	
		dishwasherR1A2Thread = new AppliancePowerDishwasherR1A2Thread();
		System.out.println("Dishwasher R1 A2 Thread created");		
		dryerR1A3Thread = new AppliancePowerDryerR1A3Thread();
		System.out.println("Dryer R1 A3 Thread created");		
		stoveR1A4Thread = new AppliancePowerStoveR1A4Thread();
		System.out.println("Stove R1 A4 Thread created");		
		ovenR1A5Thread = new AppliancePowerOvenR1A5Thread();
		System.out.println("Oven R1 A5 Thread created");		
		TVR2A6Thread = new AppliancePowerTVR2A6Thread();
		System.out.println("TV R2 A6 Thread created");		
		powerplugsR2A7Thread = new AppliancePowerPowerPlugsR2A7Thread();
		System.out.println("Power Plug R2 A7 Thread created");		
		heaterR2A8Thread = new AppliancePowerHeaterR2A8Thread();
		System.out.println("Heater R2 A8 Thread created");		
		heaterR3A9Thread = new AppliancePowerHeaterR3A9Thread();
		System.out.println("Heater R3 A9 Thread created");	
		lightR3A10Thread = new AppliancePowerLightR3A10Thread();
		System.out.println("Light R3 A10 Thread created");		
		powerplugsR3A11Thread = new AppliancePowerPowerPlugsR3A11Thread();
		System.out.println("Power Plugs R3 A11 Thread created");		
		lightR4A12Thread = new AppliancePowerLightR4A12Thread();
		System.out.println("Light R4 A12 Thread created");		
		fanR4A13Thread = new AppliancePowerFanR4A13Thread();
		System.out.println("Fan R4 A13 Thread created");		
		waterHeaterR4A14Thread = new AppliancePowerWaterHeaterR4A14Thread();
		System.out.println("Water Heater R4 A14 Thread created");	
		aggregatedthread = new aggregatedPowerThread();
		System.out.println("Agg Thread created");	
		
		//start all the appliances thread and the aggregated thread
		fridgeR1A1Thread.start();
		dishwasherR1A2Thread.start();
		dryerR1A3Thread.start();
		stoveR1A4Thread.start();
		ovenR1A5Thread.start();
		TVR2A6Thread.start();
		powerplugsR2A7Thread.start();
		heaterR2A8Thread.start();
		heaterR3A9Thread.start();
		lightR3A10Thread.start();
		powerplugsR3A11Thread.start();
		lightR4A12Thread.start();
		fanR4A13Thread.start();
		waterHeaterR4A14Thread.start();
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
		lblLivingRoom.setBounds(154, 374, 175, 18);
		frame.getContentPane().add(lblLivingRoom);
		
		JLabel lblBedRoom = new JLabel("Bed Room (Room 3)");
		lblBedRoom.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblBedRoom.setBounds(881, 66, 167, 26);
		frame.getContentPane().add(lblBedRoom);
		
		JLabel lblBathRoom = new JLabel("Bath Room (Room 4)");
		lblBathRoom.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblBathRoom.setBounds(633, 370, 175, 26);
		frame.getContentPane().add(lblBathRoom);
		
		JLabel lblAggregatedPower = new JLabel("Total Aggregated Power:");
		lblAggregatedPower.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblAggregatedPower.setBounds(376, 690, 236, 21);
		frame.getContentPane().add(lblAggregatedPower);
		
		TotalAggregatedValueLabel = new JLabel("0W");
		TotalAggregatedValueLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		TotalAggregatedValueLabel.setBounds(603, 693, 107, 14);
		frame.getContentPane().add(TotalAggregatedValueLabel);
		
		fridgeR1A1Button = new JToggleButton("ON");
		fridgeR1A1Button.setBounds(81, 303, 80, 23);
		frame.getContentPane().add(fridgeR1A1Button);
		
		fridgeR1A1IconLabel = new JLabel("New label");
		fridgeR1A1IconLabel.setBackground(Color.LIGHT_GRAY);
		fridgeR1A1IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Fridge_OFF.jpg"));
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
		dishwasherR1A2IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Dishwasher_OFF.jpg"));
		dishwasherR1A2IconLabel.setBounds(198, 120, 154, 147);
		frame.getContentPane().add(dishwasherR1A2IconLabel);
		
		dishwasherR1A2PowerLabel = new JLabel("0W");
		dishwasherR1A2PowerLabel.setBounds(262, 278, 46, 14);
		frame.getContentPane().add(dishwasherR1A2PowerLabel);
		
		dishwasherR1A2Button = new JToggleButton("ON");
		dishwasherR1A2Button.setBounds(234, 303, 74, 23);
		frame.getContentPane().add(dishwasherR1A2Button);
		
		dryerR1A3IconLabel = new JLabel("New label");
		dryerR1A3IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Dryer_OFF.jpg"));
		dryerR1A3IconLabel.setBounds(370, 119, 154, 147);
		frame.getContentPane().add(dryerR1A3IconLabel);
		
		dryerR1A3PowerLabel = new JLabel("0W");
		dryerR1A3PowerLabel.setBounds(434, 277, 46, 14);
		frame.getContentPane().add(dryerR1A3PowerLabel);
		
		dryerR1A3Button = new JToggleButton("ON");
		dryerR1A3Button.setBounds(410, 302, 70, 23);
		frame.getContentPane().add(dryerR1A3Button);
		
		stoveR1A4IconLabel = new JLabel("New label");
		stoveR1A4IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Stove_OFF.jpg"));
		stoveR1A4IconLabel.setBounds(534, 120, 154, 147);
		frame.getContentPane().add(stoveR1A4IconLabel);
		
		stoveR1A4PowerLabel = new JLabel("0W");
		stoveR1A4PowerLabel.setBounds(598, 278, 46, 14);
		frame.getContentPane().add(stoveR1A4PowerLabel);
		
		stoveR1A4Button = new JToggleButton("ON");
		stoveR1A4Button.setBounds(571, 303, 78, 23);
		frame.getContentPane().add(stoveR1A4Button);
		
		ovenR1A5IconLabel = new JLabel("New label");
		ovenR1A5IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Oven_OFF.jpg"));
		ovenR1A5IconLabel.setBounds(698, 120, 154, 147);
		frame.getContentPane().add(ovenR1A5IconLabel);
		
		ovenR1A5PowerLabel = new JLabel("0W");
		ovenR1A5PowerLabel.setBounds(762, 278, 46, 14);
		frame.getContentPane().add(ovenR1A5PowerLabel);
		
		ovenR1A5Button = new JToggleButton("ON");
		ovenR1A5Button.setBounds(735, 303, 73, 23);
		frame.getContentPane().add(ovenR1A5Button);
		
		heaterR3A9IconLabel = new JLabel("New label");
		heaterR3A9IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Heater_OFF.jpg"));
		heaterR3A9IconLabel.setBounds(1078, 113, 154, 147);
		frame.getContentPane().add(heaterR3A9IconLabel);
		
		heaterR3A9PowerLabel = new JLabel("0W");
		heaterR3A9PowerLabel.setBounds(1142, 271, 46, 14);
		frame.getContentPane().add(heaterR3A9PowerLabel);
		
		heaterR3A9Button = new JToggleButton("ON");
		heaterR3A9Button.setBounds(1117, 296, 71, 23);
		frame.getContentPane().add(heaterR3A9Button);
		
		lightR3A10IconLabel = new JLabel("New label");
		lightR3A10IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_OFF.jpg"));
		lightR3A10IconLabel.setBounds(1081, 404, 154, 147);
		frame.getContentPane().add(lightR3A10IconLabel);
		
		lightR3A10PowerLabel = new JLabel("0W");
		lightR3A10PowerLabel.setBounds(1145, 562, 46, 14);
		frame.getContentPane().add(lightR3A10PowerLabel);
		
		lightR3A10Button = new JToggleButton("ON");
		lightR3A10Button.setBounds(1117, 587, 71, 23);
		frame.getContentPane().add(lightR3A10Button);
		
		TVR2A6IconLabel = new JLabel("New label");
		TVR2A6IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\TV_OFF.jpg"));
		TVR2A6IconLabel.setBounds(34, 404, 154, 147);
		frame.getContentPane().add(TVR2A6IconLabel);
		
		TVR2A6PowerLabel = new JLabel("0W");
		TVR2A6PowerLabel.setBounds(98, 562, 46, 14);
		frame.getContentPane().add(TVR2A6PowerLabel);
		
		TVR2A6Button = new JToggleButton("ON");
		TVR2A6Button.setBounds(70, 587, 74, 23);
		frame.getContentPane().add(TVR2A6Button);
		
		powerplugR2A7IconLabel = new JLabel("New label");
		powerplugR2A7IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Powerplug_OFF.jpg"));
		powerplugR2A7IconLabel.setBounds(198, 404, 154, 147);
		frame.getContentPane().add(powerplugR2A7IconLabel);
		
		powerplugR2A7PowerLabel = new JLabel("0W");
		powerplugR2A7PowerLabel.setBounds(262, 562, 46, 14);
		frame.getContentPane().add(powerplugR2A7PowerLabel);
		
		powerplugR2A7Button = new JToggleButton("ON");
		powerplugR2A7Button.setBounds(234, 587, 74, 23);
		frame.getContentPane().add(powerplugR2A7Button);
		
		heaterR2A8IconLabel = new JLabel("New label");
		heaterR2A8IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Heater_OFF.jpg"));
		heaterR2A8IconLabel.setBounds(370, 404, 154, 147);
		frame.getContentPane().add(heaterR2A8IconLabel);
		
		heaterR2A8PowerLabel = new JLabel("0W");
		heaterR2A8PowerLabel.setBounds(434, 562, 46, 14);
		frame.getContentPane().add(heaterR2A8PowerLabel);
		
		heaterR2A8Button = new JToggleButton("ON");
		heaterR2A8Button.setBounds(410, 587, 70, 23);
		frame.getContentPane().add(heaterR2A8Button);
		
		lightR4A12IconLabel = new JLabel("New label");
		lightR4A12IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Light_OFF.jpg"));
		lightR4A12IconLabel.setBounds(546, 404, 154, 147);
		frame.getContentPane().add(lightR4A12IconLabel);
		
		lightR4A12PowerLabel = new JLabel("0W");
		lightR4A12PowerLabel.setBounds(610, 562, 46, 14);
		frame.getContentPane().add(lightR4A12PowerLabel);
		
		lightR4A12Button = new JToggleButton("ON");
		lightR4A12Button.setBounds(582, 587, 74, 23);
		frame.getContentPane().add(lightR4A12Button);
		
		fanR4A13IconLabel = new JLabel("New label");
		fanR4A13IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\ExhaustFan_OFF.jpg"));
		fanR4A13IconLabel.setBounds(714, 404, 154, 147);
		frame.getContentPane().add(fanR4A13IconLabel);
		
		fanR4A13PowerLabel = new JLabel("0W");
		fanR4A13PowerLabel.setBounds(778, 562, 46, 14);
		frame.getContentPane().add(fanR4A13PowerLabel);
		
		fanR4A13Button = new JToggleButton("ON");
		fanR4A13Button.setBounds(750, 587, 74, 23);
		frame.getContentPane().add(fanR4A13Button);
		
		waterHeaterR4A14IconLabel = new JLabel("New label");
		waterHeaterR4A14IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\WaterHeater_OFF.jpg"));
		waterHeaterR4A14IconLabel.setBounds(881, 404, 154, 147);
		frame.getContentPane().add(waterHeaterR4A14IconLabel);
		
		waterHeaterR4A14PowerLabel = new JLabel("0W");
		waterHeaterR4A14PowerLabel.setBounds(945, 562, 46, 14);
		frame.getContentPane().add(waterHeaterR4A14PowerLabel);
		
		waterHeaterR4A14Button = new JToggleButton("ON");
		waterHeaterR4A14Button.setBounds(917, 587, 74, 23);
		frame.getContentPane().add(waterHeaterR4A14Button);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(1049, 357, 2, 266);
		frame.getContentPane().add(separator_2);
		
		powerplugR3A11IconLabel = new JLabel("New label");
		powerplugR3A11IconLabel.setIcon(new ImageIcon("D:\\Projects\\ApplianceModelingAndSimulation\\images\\Powerplug_OFF.jpg"));
		powerplugR3A11IconLabel.setBounds(897, 120, 154, 147);
		frame.getContentPane().add(powerplugR3A11IconLabel);
		
		powerplugR3A11PowerLabel = new JLabel("0W");
		powerplugR3A11PowerLabel.setBounds(961, 278, 46, 14);
		frame.getContentPane().add(powerplugR3A11PowerLabel);
		
		powerplugR3A11Button = new JToggleButton("ON");
		powerplugR3A11Button.setBounds(928, 303, 79, 23);
		frame.getContentPane().add(powerplugR3A11Button);
		
		kitchenAggregatedLabel = new JLabel("Aggregated Power:");
		kitchenAggregatedLabel.setBounds(510, 74, 116, 14);
		frame.getContentPane().add(kitchenAggregatedLabel);
		
		LivingRoomAggregatedLabel = new JLabel("Aggregated Power:");
		LivingRoomAggregatedLabel.setBounds(352, 378, 116, 14);
		frame.getContentPane().add(LivingRoomAggregatedLabel);
		
		BathRoomAggregatedLabel = new JLabel("Aggregated Power:");
		BathRoomAggregatedLabel.setBounds(817, 378, 116, 14);
		frame.getContentPane().add(BathRoomAggregatedLabel);
		
		BedroomAggregatedLabel = new JLabel("Aggregated Power:");
		BedroomAggregatedLabel.setBounds(1072, 74, 116, 14);
		frame.getContentPane().add(BedroomAggregatedLabel);
		
		kitchenAggPowerLabel = new JLabel("0W");
		kitchenAggPowerLabel.setBounds(630, 74, 80, 14);
		frame.getContentPane().add(kitchenAggPowerLabel);
		
		BedRoomAggPowerLabel = new JLabel("0W");
		BedRoomAggPowerLabel.setBounds(1198, 74, 57, 14);
		frame.getContentPane().add(BedRoomAggPowerLabel);
		
		LivingRoomAggPowerLabel = new JLabel("0W");
		LivingRoomAggPowerLabel.setBounds(465, 378, 74, 14);
		frame.getContentPane().add(LivingRoomAggPowerLabel);
		
		BathRoomAggPowerLabel = new JLabel("0W");
		BathRoomAggPowerLabel.setBounds(931, 378, 76, 14);
		frame.getContentPane().add(BathRoomAggPowerLabel);
	}
}
