package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


//import javax.swing.JPanel;
import org.havi.ui.HComponent;
import org.havi.ui.HContainer;

//@SuppressWarnings("serial")
/**
 * @author Cynthia Da Costa & Charis Van Looveren
 * View
 */
public class RenderPanel extends HComponent
{
    
    
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B = (int)(Math.random()*256);
        Color randomColor = new Color(R,G,B);
	//public static final Color GREEN = new Color(BLACK)

        public RenderPanel(int x,int y, int w, int h)
        {
            super(x,y,w,h);
        }
	
	public void paint(Graphics g)
	{
		//super.paint(g);
		//System.out.println("RenderPanelPaint");
		Snake snake = Snake.snake;

		g.setColor(Color.BLACK);
		
		g.fillRect(0, 0, 720, 576);
                   // moet in timer staan
                      /* R = (int)(Math.random()*256);
                      G = (int)(Math.random()*256);
                      B = (int)(Math.random()*256); 
                      randomColor = new Color(R,G,B); */
                        g.setColor(randomColor);
                
               
                        
                             
		//g.setColor(randomColor);
              //g.setColor(Color.WHITE);
                for (int i=0;i<snake.snakeParts.size();i++)
		{
                   Point point=(Point)snake.snakeParts.get(i);
                   g.fillRect(point.x * Snake.SCALE, point.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
                      
		}
		
		g.fillRect(snake.head.x * Snake.SCALE, snake.head.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		
		g.setColor(Color.RED);
		
		g.fillRect(snake.fruit.x * Snake.SCALE, snake.fruit.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		
		String string = "Score: " + snake.score + "  Length: " + snake.tailLength + "  Time: " + snake.time / 20;
		
		g.setColor(Color.white);
                
                g.drawRect(10, 50, 700, 500);
                
		g.drawString(string, (int) (getWidth() / 2 - string.length() * 4.5f), 35);

		string = "Game Over!";

		if (snake.over)
		{
                  g.drawString(string, (int) (getWidth() / 2 - string.length() * 4.5f), 500 / 4);
		}

		string = "Paused!";

		if (snake.paused && !snake.over)
		{
			g.drawString(string, (int) (getWidth() / 2 - string.length() * 4.5f), 500 / 4);
		}
	}
}
