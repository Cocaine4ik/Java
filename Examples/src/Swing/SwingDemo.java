package Swing;

// Simple Swing-program
// for each Swing-program is importing package javax.swing;

import javax.swing.*;

public class SwingDemo {

	SwingDemo() {
		
		// Creating new container JFrame .
		JFrame jfrm = new JFrame("A simple Swing application");
		
		// Install default sizes for window's border.
		jfrm.setSize(275, 100);
		
		// When windows is closed program being ended
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creating text label through Swing component
		JLabel jlab = new JLabel("Swing defines the modern Java GUI.");
		
		// Add label to the container panel
		jfrm.add(jlab);
		
		// show on window border
		jfrm.setVisible(true);
	}
	public static void main(String args[]) {
		
		// Object SwingDemo must being created in thread of
		// events dispatching
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				
				new SwingDemo();
			}
			
		});
	}
}
