package hellotvxlet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;


// javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import org.dvb.event.EventManager;
import org.dvb.event.UserEvent;
import org.dvb.event.UserEventListener;
import org.dvb.event.UserEventRepository;
import org.havi.ui.HContainer;
import org.havi.ui.HScene;
import org.havi.ui.event.HRcEvent;

/**
 * @author Cynthia Da Costa & Charis Van Looveren
 * Model // methodes model opgeroepen in controler (hier in hellotvxlet door aanmaken snake snake = new Snake(scene);)
 */
public class Snake  extends TimerTask implements ActionListener, UserEventListener 
{

	public static Snake snake;

	public HContainer jframe;

	public RenderPanel renderPanel;

	public Timer timer = new Timer();

	public ArrayList snakeParts = new ArrayList();

	public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3, SCALE = 10;

	public int ticks = 0, nrMove = 1, score, tailLength = 10, time;

	public Point head, fruit;

	public Random random;

	public boolean over = false, paused;

	public Dimension ScreenSize;
        HelloTVXlet hoi = new HelloTVXlet();
   

	public Snake(HScene scene)
	{
            //System.out.println("Snake constructor");
		ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
               // ScreenSize = (0,0,720,576);
                System.out.println("Screensize = " + ScreenSize);
		jframe = new HContainer(0,0,720,576);
		jframe.setVisible(true);
		//jframe.setSize(805, 700);
                jframe.setSize(720, 576);
	//	jframe.setResizable(false);
		jframe.setLocation(0,0);
		jframe.add(renderPanel = new RenderPanel(0,0,720,576));
	//	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                UserEventRepository userEvents=new UserEventRepository("rep1");
                userEvents.addAllArrowKeys();
                userEvents.addKey(HRcEvent.VK_SPACE);
		EventManager.getInstance().addUserEventListener(this, userEvents);
                scene.add(jframe);
 
		startGame();
	}

	public void startGame()
	{
		over = false;
		paused = false;
		time= 0;
		score = 0;
		tailLength = 8;
		ticks = 0;
		HelloTVXlet.nrMove = 1;
		head = new Point(10, 10);
		random = new Random();
		snakeParts.clear();
		fruit = new Point(random.nextInt(70)+1, random.nextInt(50)+5);
	timer=new Timer();
        timer.scheduleAtFixedRate(this, 0, 20);
                //timer.start();
               // System.out.println("test");
	}

	//@Override
	public void run()
	{
           // System.out.println(".");
		renderPanel.repaint();
		ticks++;

		if (ticks % 2 == 0 && head != null && !over && !paused)
		{
                    
			time++;

			snakeParts.add(new Point(head.x, head.y));

			if (HelloTVXlet.nrMove == 3)
			{
				if (head.y - 1 >= 5 && noTailAt(head.x, head.y - 1))
				{
					head = new Point(head.x, head.y - 1);
				}
				else
				{
					over = true;

				}
			}

			if (HelloTVXlet.nrMove == 1)
			{
				if (head.y + 1 < 55 && noTailAt(head.x, head.y + 1))
				{
					head = new Point(head.x, head.y + 1);
				}
				else
				{
					over = true;
				}
			}

			if (HelloTVXlet.nrMove == 2)
			{
				if (head.x - 1 >= 1 && noTailAt(head.x - 1, head.y))
				{
					head = new Point(head.x - 1, head.y);
				}
				else
				{
					over = true;
				}
			}

			if (HelloTVXlet.nrMove == 4)
			{
				if (head.x + 1 < 71 && noTailAt(head.x + 1, head.y))
				{
					head = new Point(head.x + 1, head.y);
				}
				else
				{
					over = true;
				}
			}
                        
                          
                        

			if (snakeParts.size() > tailLength)
			{
				snakeParts.remove(0);

			}

			if (fruit != null)
			{
				if (head.equals(fruit))
				{
					score += 10;
					tailLength++;
					fruit.setLocation(random.nextInt(70)+1, random.nextInt(50)+5);
                                 }
			}
                        
		}
                
                  
                jframe.repaint();
	}

	public boolean noTailAt(int x, int y)
	{
            for (int i=0;i<snakeParts.size();i++)
		{
                        Point point=(Point)snakeParts.get(i);
			if (point.equals(new Point(x, y)))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(HScene scene)
	{
		snake = new Snake(scene);
	}

	

    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void spatie()
    {
    
        //if (HelloTVXlet.nrMove == 5)
                        //{
                              System.out.println("SPACE");
                            if (over)
                            {
				snake.startGame();
                            }
                            else
                            {
				paused = !paused;
                                }
                      //  }
    }
    

    public void userEventReceived(UserEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
       if (e.getType()==HRcEvent.KEY_PRESSED)
        {
            hoi.keyPressed(e.getCode());
        }
       
    }

   


}