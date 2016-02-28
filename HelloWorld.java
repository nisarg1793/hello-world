package helloWorldImage;


import java.awt.*;
/*
 <applet code="HelloWorld"height="300"width="300">
 </applet>
 */
import java.applet.Applet;
public class HelloWorld extends Applet
{
	
	
  public void paint(Graphics g) {
		
    Dimension d = getSize();
    g.setColor(Color.black);
    g.fillRect(0,0,d.width,d.height);
    g.setFont(new Font("Helvetica", Font.BOLD, 24));
    g.setColor(new Color(255, 215, 0)); // gold color
    g.drawString("Hello World!", 40, 25);
    g.drawImage(getImage(getCodeBase(), "HelloWorld.png"),
                20, 60, this);
  }

}