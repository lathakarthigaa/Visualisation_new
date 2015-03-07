import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import aucklanduni.xmlParser.Simulation;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;


public class YearlySimulation {

	private JFrame frame;
	private JTextField textField_Input;
	private JTextField textField_Output;
	private JTextField textField_Year;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YearlySimulation window = new YearlySimulation();
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
	public YearlySimulation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYearly = new JLabel("Yearly Energy Data Simulation");
		lblYearly.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblYearly.setBounds(235, 25, 256, 42);
		frame.getContentPane().add(lblYearly);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(156, 118, 59, 14);
		frame.getContentPane().add(lblYear);
		
		JLabel lblInputFile = new JLabel("Input File");
		lblInputFile.setBounds(156, 167, 75, 14);
		frame.getContentPane().add(lblInputFile);
		
		JLabel lblOutputFile = new JLabel("Output File");
		lblOutputFile.setBounds(156, 216, 88, 14);
		frame.getContentPane().add(lblOutputFile);
		
		textField_Input = new JTextField();
		textField_Input.setBounds(241, 164, 250, 20);
		frame.getContentPane().add(textField_Input);
		textField_Input.setColumns(10);
		
		textField_Output = new JTextField();
		textField_Output.setBounds(241, 213, 250, 20);
		frame.getContentPane().add(textField_Output);
		textField_Output.setColumns(10);
				
		JButton btnSimulate = new JButton("Simulate");
		btnSimulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Simulation functions = new Simulation();
				functions.EnergyDataAllAppliances(Integer.parseInt(textField_Year.getText()),textField_Output.getText(), textField_Input.getText());
			}
		});
		btnSimulate.setToolTipText("Simulate Yearly Energy Data");
		btnSimulate.setBounds(282, 289, 89, 23);
		frame.getContentPane().add(btnSimulate);
		
		textField_Year = new JTextField();
		textField_Year.setBounds(241, 115, 86, 20);
		frame.getContentPane().add(textField_Year);
		textField_Year.setColumns(10);
	}
}
