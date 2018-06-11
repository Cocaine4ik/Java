package Applet;

import java.util.*;
import java.awt.*;
import java.applet.*;

/*
 * <applet code = "Clock" width = 300 height = 200>
 * </applet>
 */

// This applet must show current time, refresh
// content of the current window every second.
// Use object from the class Calendar and his methods.

public class Clock extends Applet implements Runnable {
	
	String msg;
	Calendar clock;
	Thread t;
	boolean stopFlag;
	
	// initialize applet
	public void init() {
		t = null;
		msg = null;
	}
	
	// start thread
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	public void run() {
		for( ; ; ) {
			try {
				repaint();
				Thread.sleep(1000);
				if(stopFlag)
					break;
				
			}
			catch(InterruptedException exc) {}
		}
	}
	
	public void stop() {
		stopFlag = true;
		t = null;
	}
	
	public void paint(Graphics g) {
		clock = Calendar.getInstance();
		msg = "Current time: " + Integer.toString(clock.get(Calendar.HOUR)) + " : " + 
				Integer.toString(clock.get(Calendar.MINUTE)) + " : " + 
				Integer.toString(clock.get(Calendar.SECOND));
		g.drawString(msg, 50, 30);
	}
	
}
