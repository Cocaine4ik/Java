package Applet;
/*
Exercise 14.1.

Simple applet, showing big banner.

In this applet is creating a thread, controlling by scrolling of 
the big banner, storages in value msg,
from tight to left in applet window.
*/

import java.awt.*;
import java.applet.*;

/* <applet code = "Banner" width=300 height=50>
	<param name = message value = " I like Java! ">
	<param name = delay value = 500>
	</applet>
*/

public class Banner extends Applet implements Runnable {
	String msg;
	int delay;
	Thread t;
	boolean stopFlag;

	// initial variable t with empty value null
	public void init() {
		String temp;
		msg = getParameter("message");
		if(msg == null) msg = "Java Rules the Web";
		temp = getParameter("delay");
		try {
			if(temp != null)
				delay = Integer.parseInt(temp);
			else 
				delay = 250; // if paramater doesn't exist used default value.
		}
		catch(NumberFormatException exc) {
			delay = 250; // if error is occurred we are using default value
		}
		t = null;
		
	}
	
	// start thread
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	
	// enter point to thread manipulate a big banner
	public void run() {
		char ch;
		// show big banner again
		for( ; ; ) {
			try { 
				repaint();
				Thread.sleep(delay);
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				if(stopFlag)
					break;
			}
			catch (InterruptedException exc) {}
		}
	}
	
	// stop applet working
	public void stop() {
		stopFlag = true;
		t = null;
	}
	
	// show big banner
	public void paint(Graphics g) {
		g.drawString(msg, 50, 30);
	}
	
}
