package Applet;

// applet sketch

import java.awt.*;
import java.applet.*;

/* 
 <applet code = "AppletSkel" width = 300 height = 100
 </applet>
 */

public class AppletSkel {

	// this method is calling firstly
	public void init() {
	// initial applet
	}
	
	/* This method is calling secondly after method init()/ He is calling
	 * in those cases when he is need to resume applet work. 
	 */
	public void start () {
		// start or resume applet execution
	}
	
	// This method is calling for stopping applet work
	public void stop() {
		// stop applet executing
	}
	
	/* This method is calling last to end applet work. */
	public void destroy() {
		// perform actions, which ends applet executing
	}
	
	// This method is calling to update data in applet window
	public void paint(Graphics g) {
		// update applet windows content
	}
}
