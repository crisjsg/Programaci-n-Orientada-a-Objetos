package org.presentacion;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Mi primera interfacio");
		
		JPanel panelAzul = new JPanel();
		JPanel panelRojo = new JPanel();
		
		JLabel label = new JLabel("<-- Escoge tu equipo -->");
		
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		panelAzul.setBackground(Color.blue);
		panelRojo.setBackground(Color.red);
		
		frame.getContentPane().add(panelAzul, BorderLayout.LINE_START);
		frame.getContentPane().add(panelRojo, BorderLayout.LINE_END);
		
		JButton blueButton = new JButton("EQUIPO AZUL");
		JButton redButton = new JButton("EQUIPO ROJO");
		
		panelAzul.add(blueButton);
		panelRojo.add(redButton);
		
		frame.pack();
		frame.setVisible(true); 

	}

}
