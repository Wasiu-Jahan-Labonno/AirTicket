package swingex;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Registration {

	JFrame frame = new JFrame();
	JLabel lab = new JLabel("hello");
	Registration(){
		lab.setBounds(100, 100, 1270, 791);
		lab.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		frame.add(lab);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(new Color(205, 240, 252));
		frame.setForeground(new Color(0, 128, 255));
	

		frame.setLayout(null);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
