package spacerace.decorations;

import java.awt.Color;
import java.awt.Graphics;

import spacerace.Coord2D;
import spacerace.Decoration;
import spacerace.GameState;
/**
 * Class for trail
 * @author fc45810 Ana Espinheira, fc44314 Francisco Pires
 *
 */
public final class Trail extends Decoration {

  private int step = 20;
  private Color c;
  /**
   * construtor
   * @param location localizacao do trail
   */
  public Trail(Coord2D location) {
    super(location);
    c = new Color(0,128,0, step);
  }

  /**
   * Trail step
   */
  @Override
  public void step(GameState gs) {
	  if (step > 0) {
		  step = step - 1; 
	  }
	  else{
		  this.die();
	  }
  }
  
/**
 * Desenho do trail
 * @param g Graphics
 */
  @Override
  public void draw(Graphics g) {
    g.setColor(c);
    int x = (int) this.getLocation().getX() - 10;
    int y = (int) this.getLocation().getY() - 10;
    g.fillOval(x, y, step , step );
  }


}
