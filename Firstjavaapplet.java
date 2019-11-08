// your first java applet
// an appplet to print hello world

import java.applet.Applet;
import java.awt.Graphics;

public class Firstjavaapplet extends Applet{
	public void init(){
		resize(500,500);
	}
	public void paint(Graphics g)
	{
		g.drawString("HelloWorld!",150,150);
		
	}
}


