package Swing;

// Demonstration of the simple component JList
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ListDemo implements ListSelectionListener{

	JList <String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;
	
	// create array with name
	String names[] = { "Sherry", "Jon", "Rachel", 
           "Sasha", "Josselyn", "Randy", 
           "Tom", "Mary", "Ken",
           "Andrew", "Matt", "Todd" };
	
	ListDemo() {
		JFrame jfrm = new JFrame("JList Demo");
		
		jfrm.setLayout(new FlowLayout());
		
		jfrm.setSize(200, 160);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create component list
		jlst = new JList <String> (names); // create list with names
		
		// set option choosing element from list
		// Changing to option of choosing elements from list one by one
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// add list to scroll panel
		// list component is putting to container on scroll panel
		jscrlp = new JScrollPane(jlst);
		
		// set sizes of the scroll panel
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
		// create a label to show choose result from list
		jlab = new JLabel("Pls choose a name");
		
		jlst.addListSelectionListener(this);
		
		// add list or label to content panel
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	// handle event connect with chossing elements from list
	public void valueChanged(ListSelectionEvent le) {
		// get index those element which was selected
		// or cancelled in list
		int idx = jlst.getSelectedIndex();
		
		// show result of choosing, if element was choose
		if(idx != -1) 
			jlab.setText("Current selection: " + names[idx]);
		else // else ask again to make a choice
			jlab.setText("Please choose a name");
	}
	public static void main(String args[]) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ListDemo();
			}
		});
	}

}
