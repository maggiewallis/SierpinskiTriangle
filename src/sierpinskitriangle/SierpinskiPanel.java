
package sierpinskitriangle;

import java.awt.Graphics;
import javax.swing.JPanel;


public class SierpinskiPanel extends JPanel {
        private int myDepth;
        
        public SierpinskiPanel()
        {
            super();
            myDepth = 1;
        }
        
        public void setDepth(int depth)
        {
            if (depth>0)
                myDepth = depth;
            repaint();
            
        }
        
    	
        public void paintComponent(Graphics g)
        {
        		super.paintComponent(g);
           
        		int x1 = 200;
            	int y1 = 500;
            	int x2 = 800;
            	int y2 = 500;
            	int x3 = 500;
            	int y3 = 100;
        	g.drawLine(x1, y1, x2, y2);
        	g.drawLine(x1, y1, x3, y3);
        	g.drawLine(x3, y3, x2, y2);
        	recursivething(x1, y1, x2, y2, x3, y3, myDepth, g);
        	
        		g.drawString("Num levels to display: "+myDepth, 100, 100);
        }
        public void recursivething(int x1, int y1, int x2, int y2, int x3, int y3, int myDepth, Graphics g)
        {
        	if (myDepth ==0)
        	{
        		g.drawLine(x1, y1, x2, y2);
            	g.drawLine(x1, y1, x3, y3);
            	g.drawLine(x3, y3, x2, y2);
        	}
        	if (myDepth > 0)
        	{
        		myDepth = myDepth - 1;
        		int xx1 = (x2-x1)/2 + x1;
            	int yy1 = (y2 - y1)/2 + y1;
            	int xx2 = (x3-x2)/2 + x2;
            	int yy2 = (y3-y2)/2 + y2;
            	int xx3 = (x1 - x3)/2 + x3;
            	int yy3 = (y1-y3)/2 + y3;
            	
            	recursivething(x1, y1, xx1, yy1, xx3, yy3, myDepth, g);
            	recursivething(xx1, yy1, x2, y2, xx2, yy2, myDepth, g);
            	recursivething(xx3, yy3, xx2, yy2, x3, y3, myDepth, g);
        	}
        	
        	
        	
        	
        	
        }
}
