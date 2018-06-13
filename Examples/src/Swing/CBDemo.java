package Swing;

// Checkboxes demonstration
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CBDemo implements ItemListener{

	JLabel jlabSelected;
	JLabel jlabChanged;
	JCheckBox jcbAlpha;
	JCheckBox jcbBeta;
	JCheckBox jcbGamma;
	
	CBDemo() {
		
		JFrame jfrm = new JFrame("Demonstrate Check Boxes");
		
		jfrm.setLayout(new FlowLayout());
		
		jfrm.setSize(280, 120);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create empty labels
		jlabSelected = new JLabel("");
		jlabChanged = new JLabel("");
		
		// checkbox creating
		jcbAlpha = new JCheckBox("Alpha");
		jcbBeta = new JCheckBox("Beta");
		jcbGamma = new JCheckBox("Gamma");
		
		// Events, formed by JCheckBox components, and treating
        // with only one method itemStateChanged(), implements in classCBDemo.
		jcbAlpha.addItemListener(this);
		jcbBeta.addItemListener(this);
		jcbGamma.addItemListener(this);
		
		// add checkboxes and labels to content panel
		jfrm.add(jcbAlpha);
		jfrm.add(jcbBeta);
		jfrm.add(jcbGamma);
		jfrm.add(jlabSelected);
		jfrm.add(jlabChanged);
		
		jfrm.setVisible(true);		
	}
	// event handler for elements (in this case for checkboxes)
	public void itemStateChanged(ItemEvent ie) {
		String str = "";
		
		// get a link to chechbox component, which formed an event
		JCheckBox cb = (JCheckBox) ie.getItem();
		
		// message about changes in checkboxes status
		if(cb.isSelected()) // define checkbox status
			jlabChanged.setText(cb.getText() + " was just selected.");
		else
			jlabChanged.setText(cb.getText() + " was just cleared. ");
		
		// message about all selected checkboxes
		if(jcbAlpha.isSelected()) {
			str += "Alpha";
		}
		if(jcbBeta.isSelected()) {
			str += "Beta";
		}
		if(jcbGamma.isSelected()) {
			str += "Gamma";
		}
		
		jlabSelected.setText("Selected check boxes: " + str);
	}
	public static void main(String args[]) {
		// create a border in windows o events dispatching
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CBDemo();
			}
		});
	}
		
}
