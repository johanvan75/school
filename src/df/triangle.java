package df;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class triangle extends Applet {;

public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.blue); 
    g.setColor(Color.yellow);
    g.drawRoundRect(20, 20, 100, 50, 10, 10);
    g.fillRoundRect(20, 20, 100, 50, 10, 10);
    int [] xPoints = {100,50,150};
    int [] yPoints = {100,200,200};
	g.drawPolygon(xPoints, yPoints, 3);
  }
}