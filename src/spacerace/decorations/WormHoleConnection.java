package spacerace.decorations;

import java.awt.Color;
import java.awt.Graphics;

import spacerace.Constants;
import spacerace.Coord2D;
import spacerace.Decoration;
import spacerace.GameState;
import spacerace.areas.WormHole;

/**
 * Decoration of worm-hole connection.
 */
public final class WormHoleConnection extends Decoration {
  private Coord2D exit;
  private Color c;
  private int a = 0;
  public WormHoleConnection(WormHole w) {
    super(w.getLocation());
    exit = w.getExit();
    
  }

  /**
   * Step, varying alpha.
   */
  @Override
  public void step(GameState gs) {
    if (a < 100){
    	a = a + 10;
    }
    else{
    	a = 0;
    }
  }

  @Override
  public void draw(Graphics g) {
	 
	  	c = new Color(255,255,255, a);
	  	g.setColor(c);
	  	int x = (int) this.getLocation().getX();
	    int y = (int) this.getLocation().getY();
	    g.fillOval(x-5, y-5, 10, 10);
	    int exitx = (int) exit.getX();
	    int exity = (int) exit.getY();
	    g.fillOval(exitx-5, exity-5, 10, 10);
	    g.drawLine(x, y, exitx, exity);
  }

}
