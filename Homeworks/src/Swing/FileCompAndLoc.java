package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

// utility for compare files and 
// finding differences in their location

public class FileCompAndLoc implements ActionListener, ItemListener {

	JTextField fileA;
	JTextField fileB;
	
	JButton buttonComp;
	
	JCheckBox locate;
	
	JLabel labelA, labelB;
	JLabel result;
	
	FileCompAndLoc() {
		
		JFrame frame = new JFrame("Compare files Utility");
		
		frame.setLayout(new FlowLayout());
		
		frame.setSize(200, 400);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fileA = new JTextField(14);
		fileB = new JTextField(14);
		
		frame.add(labelA);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
