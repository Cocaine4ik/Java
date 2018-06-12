package Applet;

import java.awt.Graphics;
import java.awt.event.*;
import java.applet.*;

// Method drawline() usage.
// He is drawing with current color a straight line between two points. This method exists from class Graphics.
// Using drawline(), write an applet, tracing mouse moving.
// If mouse bottom is pressed, applet must draw a line on screen until bottom released.


public class PaintLine extends Applet implements MouseListener, MouseMotionListener {

	int mouseXstart = 0, mouseYstart = 0;
	int mouseXend = 0, mouseYend = 0;
	boolean draw;
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
		draw = false;
	}
	
	@Override
	public void mouseDragged(MouseEvent me) {
		mouseXend = me.getX();
		mouseYend = me.getY();
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent me) {
		mouseXstart = me.getX();
		mouseYstart = me.getY();
		draw = true;
		
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		draw = false;
		
	}
	
	public void paint(Graphics g) {
		if(draw)
			g.drawLine(mouseXstart, mouseYstart, mouseXend, mouseYend);
	}

}
