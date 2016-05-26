package hellotvxlet;

import javax.tv.xlet.Xlet;
import javax.tv.xlet.XletContext;
import javax.tv.xlet.XletStateChangeException;
import org.bluray.ui.event.HRcEvent;
import org.dvb.event.UserEvent;
import org.dvb.event.UserEventListener;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;

/**
 * @author Cynthia Da Costa & Charis Van Looveren
 * Controller // alles reageert als ge op een knoppeke duwt
 * 
 * MODEL wordt afgebeeld in VIEW en bewerkt in Controler
 * 
 */

public class HelloTVXlet implements Xlet, UserEventListener  {
public static int nrMove = 1;
public boolean over = false, paused;
    

    public void initXlet(XletContext ctx) throws XletStateChangeException {
            HScene scene=HSceneFactory.getInstance().getDefaultHScene();
            Snake.main(scene); //snake = new Snake(scene);
            scene.validate();
            scene.setVisible(true);
    }
public int keyPressed(int key)
	{
		if ((key == HRcEvent.VK_LEFT) && nrMove != 4)
		{
			nrMove = 2;
		}

		if ((key == HRcEvent.VK_RIGHT) && nrMove != 2)
		{
			nrMove = 4;
		}

		if ((key == HRcEvent.VK_UP) && nrMove != 1)
		{
			nrMove = 3;
		}

		if ((key == HRcEvent.VK_DOWN) && nrMove != 3)
		{
			nrMove = 1;
		}

		if (key == HRcEvent.VK_SPACE)
		{
			/*if (over)
			{
				Snake.snake.startGame();
      			}
			else
			{
				paused = !paused;
			} */
                    Snake.snake.spatie();
                 //  nrMove=5;
		}
                return nrMove;
	}
   
  public void userEventReceived(UserEvent e) {
        if (e.getType()==HRcEvent.KEY_PRESSED)
        {
            keyPressed(e.getCode());
        }
    }

public void pauseXlet() {
      
    }

    public void startXlet() throws XletStateChangeException {

    }
   public void destroyXlet(boolean unconditional) throws XletStateChangeException {
       
    }
}
