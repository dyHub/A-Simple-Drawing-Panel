import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class dotDraw extends JPanel
{
	// start from far outside the panel
	int x=10000, y=10000;
	
    public void paint(Graphics g)
    {
    	// color of the drawing pen
    	g.setColor(Color.BLUE);
    	// size of the drawing pen
        g.fillOval(x, y, 10,10);      
    }  

    public void drawDot(int a, int b)
    {
    	x = a;
    	y = b;
    	repaint();
    }
}
