package Applet;

// transfer parameters to applet

import java.awt.*;
import java.applet.*;

// Parameters are transferring to applet in HTML code
/* 
 	<applet code = "Param" width = 300 height = 80>
 	<param name = author value = "Herb Schildt">
 	<param name = purpose value = "Demonstrate Paramters">
 	<param name = version value = 2>
 	</applet>
 */

public class Param extends Applet {

	String author;
	String purpose;
	int ver;
	
	public void start() {
		String temp;
		
		author = getParameter("author");
		// Important to know if parameter really exists
		if(author == null) author = "not found";
		
		purpose = getParameter("purpose");
		if(purpose == null) purpose = "not found";
		temp = getParameter("version");
		try {
			if(temp != null)
				ver = Integer.parseInt(temp);
			else
				ver = 0;
		}
		// Is is important too, to know that transforming to 
		// integer being done correct
		catch (NumberFormatException exc) {
			ver = -1; // Error code
		}		
	}
	public void paint(Graphics g) {
		g.drawString("Purpose: " + purpose, 10, 20);
		g.drawString("By: ", 10, 40);
		g.drawString("Version " + ver, 10, 60);
	}
}
