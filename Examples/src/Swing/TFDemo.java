package Swing;

// Usage field for text entering

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TFDemo implements ActionListener {

	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;
	
	TFDemo() {
		
		JFrame jfrm = new JFrame("Use a text Field");
		
		jfrm.setLayout(new FlowLayout());
		
		jfrm.setSize(240, 120);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a text field with width 10 characters
		jtf = new JTextField(10);
		
		jtf.setActionCommand("myTF");
		
		jbtnRev = new JButton("Reverse");
		
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);
		
		jlabPrompt = new JLabel("Enter text: ");
		jlabContents = new JLabel("");
		
		// add component to content panel
		jfrm.add(jlabPrompt);
		jfrm.add(jtf);
		jfrm.add(jbtnRev);
		jfrm.add(jlabContents);
		
		jfrm.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Reverse")) {
			String orgStr = jtf.getText();
			String resStr = "";
			
			// reverse character string to text field
			for(int i = orgStr.length()-1; i >= 0; i--)
				resStr += orgStr.charAt(i);
			
			jtf.setText(resStr);
		}
		else
			jlabContents.setText("You pressed Enter. Test is: " + jtf.getText());	
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new TFDemo();			
			}			
		});
	}
}
