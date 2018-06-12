package Swing;

// Demonstration of the button pressing and handling of events actions

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
	JLabel jlab;
	
	ButtonDemo() {
		
		// create new container JFrame
		JFrame jfrm = new JFrame("A Button Example");
		
		// install layout manager FlowLayout
		jfrm.setLayout(new FlowLayout());
		
		// set default windows border size
		jfrm.setSize(220, 90);
		
		// When windows is closed program being ended
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create two buttons
		JButton JbtnUp = new JButton("Up");
		JButton JbtnDown = new JButton("Down");
		
		// add event receiver from button
		JbtnUp.addActionListener(this);
		JbtnDown.addActionListener(this);
		
		// add button to container panel
		jfrm.add(JbtnUp);
		jfrm.add(JbtnDown);
		
		// create a label
		jlab = new JLabel("Press a button");
		
		// add label in window border
		jfrm.add(jlab);
		
		// show on window border
		jfrm.setVisible(true);
	}

	// handling events from button
	public void actionPerformed(ActionEvent ae) {
		// to define pressed button using action command
		if(ae.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up.");
		else 
			jlab.setText("Ypu pressed Down");
	}
	
	public void main(String args[]) {
		// create window border in thread of dispatching events
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}
		});
	}
}
