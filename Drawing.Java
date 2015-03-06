import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Drawing extends JFrame
{
	// store the location
	private static int x , y;
	// create ADT
	private static dotDraw object = new dotDraw();
	
	Drawing()
	{
		super("Drawing Panel");
	}
	
	static class MyMouseMotionAdapter extends MouseMotionAdapter
	{
		// Handle mouse dragged.
		public void mouseDragged(MouseEvent me) 
		{
			//showStatus("Mouse dragged");
			// get the location
			x = me.getX();
			y = me.getY();
			// draw movement at the location
			object.drawDot(x, y);
		} 
	}

	 public void run(JFrame frame, int width, int height) 
	 {
		 // set frame
		 frame.setSize(width, height);
		 frame.setVisible(true);
		 frame.setBackground(Color.WHITE);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.add(object);
	 }
	
	public static void main(String[] args) 
	{
		Drawing crabby = new Drawing();
	    
	    // Adds the specified mouse motion listener to receive mouse motion events from object component
	    object.addMouseMotionListener(new MyMouseMotionAdapter());
		
		crabby.run(crabby, 500, 500);		
	}
}


