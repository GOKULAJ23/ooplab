import java.applet.*;
import java.awt.*;
public class Draw extends Applet 
{
    public void paint(Graphics g)
	{
			g.setColor(Color.black);
              g.fillOval(0, 0, 170, 175);
			
			g.setColor(Color.gray);
			g.fillRect(100, 190, 170, 175);
			
			int xPoints[] = {250,320,170,250};
			int yPoints[] = {100,150,150,100};
			  
			g.setColor(Color.green);
			g.fillPolygon(xPoints, yPoints, 4);			
    }
}