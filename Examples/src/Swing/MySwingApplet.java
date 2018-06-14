package Swing;

// simple swing applet

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* This html code can be use to load applet
 	<object code = "MySwingApplet" width = 200 height = 80>
 	</object>
*/

// Swing applet must extend class JApplet
public class MySwingApplet extends JApplet{
	
	JButton buttonUp;
	JButton buttonDown;
	
	JLabel label;
	
	// initialize applet
	public void init() {
		try {
			// create graphic applet interface is using method
			// invokeAndWait().
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		}
		catch (Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}
	// install and initialize graphic interface 
	private void makeGUI() {
		setLayout(new FlowLayout());
		
		// make two buttons
		buttonUp = new JButton("Up");
		buttonDown = new JButton("Down");
		
		// add event listener from button Up
		// for handling event from button UP
		// using anonymous inner class
		buttonUp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				label.setText("You pressed Up");				
			}
		});
		
		// add event listener from button Up
		// for handling event from button UP
		// using anonymous inner class
		buttonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				label.setText("Yoy pressed Down");
			}
		});
		
		add(buttonUp);
		add(buttonDown);
		
		label = new JLabel("Press a button.");
		
		add(label);
	}
}
