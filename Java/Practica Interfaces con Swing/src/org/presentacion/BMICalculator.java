package org.presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BMICalculator extends JFrame{
	
	private final JTextField txtMass = makePrettyTextField();
	private final JTextField txtHeight = makePrettyTextField();
	private final JButton btnCalc = makePrettyButton("Calcular BMI");
	private final String TEXTKG = "Tu masa en kilos :";
	private final String TEXTCM = "Tu altura en cm : ";
	
	public BMICalculator(){
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("BMI Calculator");
		
		//Setters de los textos
		
		getContentPane().setLayout(
			new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
			setButton(txtMass);
			setButton(txtHeight);
			addTextAndButton(TEXTKG, txtMass);
			
			getContentPane().add(Box.createVerticalGlue());
			getContentPane().add(Box.createHorizontalGlue());
			addTextAndButton(TEXTCM, txtHeight);
			
			getContentPane().add(Box.createVerticalGlue());
			getContentPane().add(Box.createHorizontalGlue());
			getContentPane().add(btnCalc);
			getContentPane().add(Box.createRigidArea(new Dimension(5,5)));
			
			pack();
			setVisible(true);
	}
	private void setButton(JTextField texto){
		texto.setPreferredSize(new Dimension(200,30));
		texto.setMaximumSize(texto.getPreferredSize());
	}
	private void addTextAndButton(String text, JTextField textField){
		getContentPane().add(makePrettyLabel(text));
		getContentPane().add(Box.createRigidArea(new Dimension(5,5)));
		getContentPane().add(textField);
		getContentPane().add(Box.createRigidArea(new Dimension(5,5)));
	}
	private JButton makePrettyButton(String title) {
		JButton button = new JButton(title);
		button.setFont(new Font(Font.SERIF, Font.PLAIN, 16));
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		button.setBackground(Color.red);
		button.setForeground(Color.green);
		return button;
		}
	private JTextField makePrettyTextField() {
		JTextField field = new JTextField();
		field.setFont(new Font(Font.SERIF, Font.ITALIC, 14));
		field.setHorizontalAlignment(JTextField.RIGHT);
		field.setBorder(BorderFactory.createLoweredBevelBorder());
		return field;
	}
	private JLabel makePrettyLabel(String title) {
		JLabel label = new JLabel(title);
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
		label.setForeground(new Color(53, 124, 255));
		return label;
	}
public static void main (String[] args){
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			new BMICalculator();
	
		}
	});
}
}
