package Swing;

 // Utility which compare files, created on Swing.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener {

	JTextField fileA;
	JTextField fileB;
	
	JButton CompareButton;
	
	JLabel labelA, labelB;
	JLabel result;
	
	SwingFC() {
		JFrame frame = new JFrame("Compare files.");
		
		frame.setLayout(new FlowLayout());
		
		frame.setSize(200, 190);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fileA = new JTextField(14);
		fileB = new JTextField(14);
		
		fileA.setActionCommand("fileA");
		fileB.setActionCommand("fileB");
		
		CompareButton = new JButton("Compare");
		
		CompareButton.addActionListener(this);
		
		labelA = new JLabel("First file");
		labelB = new JLabel("Second file");
		result = new JLabel("");
		
		frame.add(labelA);
		frame.add(fileA);
		frame.add(labelB);
		frame.add(fileB);
		frame.add(CompareButton);
		frame.add(result);
		
		frame.setVisible(true);
		
	}
	
	// compare files
	public void actionPerformed(ActionEvent ae) {
		int i = 0, j = 0;
		
		if(fileA.getText().equals("")) {
			result.setText("First file is missing.");
			return;
		}
		if(fileB.getText().equals("")) {
			result.setText("Second File is missing.");
			return;
		}
		
		try (FileInputStream fA = new FileInputStream(fileA.getText());
				FileInputStream fB = new FileInputStream(fileB.getText())) {
					do {
						i = fA.read();
						j = fB.read();
						if(i != j) break;
					}
					while (i != -1 && j != -1);
					if(i != j)
						result.setText("Files are not the same.");
					else 
						result.setText("Files are equal.");
		}
		catch (IOException exc) {
			result.setText("File Error");
		}
				
			
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingFC();
			}
		});
	}

}
