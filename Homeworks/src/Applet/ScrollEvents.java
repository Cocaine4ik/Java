package Applet;

import java.awt.Graphics;

// Scrolling event handling demonstration 

import java.awt.event.*;
import java.applet.*;

/*
 <applet code = "MouseEvents" width = 300 height = 300>
 </applet>
 */

public class ScrollEvents extends Applet implements MouseListener, MouseMotionListener, MouseWheelListener {

	String msg = "";
	int mouseX = 0, mouseY = 0; // Mouse cursor coordinates
	
	public void init() {
		// This class is registering like a mouse event receiver.
		addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
	}
	
	// handle event clickable
	// This and other methods of event handling  is calling when
	// onset different events from mouse
	public void mouseClicked(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Cliked";
		repaint();
	}

	// handle an event started when cursor is entered
	// to user interface component
	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered";
		repaint();	
	}

	// handle an event started when cursor is exiting
	// from user interface component 
	public void mouseExited(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited";
		repaint();		
	}
	
	// handle an event started when mouse bottom pressed
	public void mousePressed(MouseEvent me) {
		// save coordinates of the current mouse destination
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();		
	}
	
	// handle an event, started when mouse bottom is released
	public void mouseReleased(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();		
	}
	
	// handle an event, started when mouse cursor is dragged
	public void mouseDragged(MouseEvent me) {
		// save coordinates of the current cursor destination
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mosue at " + mouseX + ", " + mouseY);
		repaint();	
	}
	
	// handle an event, started when mouse cursor is moved
	public void mouseMoved(MouseEvent me) {
		// show current cursor destination in status string
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent mwe) {
		if(mwe.getWheelRotation()==1)
		msg = "Scrolling down!";
		else
			msg = "Scrolling up!";
		repaint();
	}
	
	// show message from variable msg in applet window
	// on coordinates of the current cursor destination 
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
}
