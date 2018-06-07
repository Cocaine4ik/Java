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

/* <applet code="Banner" width=300 height=50>
   </applet>
*/

public class Banner extends Applet implements Runnable {
	String msg = " Java Rules the Web ";
	Thread t;
	boolean stopFlag;

	// initial variable t with empty value null
	public void init() {
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
		// show big banner again
		for( ; ; ) {
			try { 
				repaint();
				Thread.sleep(650);
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
		char ch;
		ch = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += ch;
		g.drawString(msg, 50, 30);
	}
	
}
