package Applet;

// Status string usage

import java.awt.*;
import java.applet.*;

public class StatusWindow extends Applet {

	// show content of the variable msg in applet window
	public void paint(Graphics g) {
		g.drawString("This is in applet windows", 10, 20);
		showStatus("This is shown in the status window.");
	}
}
