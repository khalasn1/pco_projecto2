package spacerace.decorations;

import java.awt.Color;
import java.awt.Graphics;

import spacerace.Coord2D;
import spacerace.Decoration;
import spacerace.GameState;

public final class Trail extends Decoration {

  private int step = 20;
  private Color c;
  public Trail(Coord2D location) {
    super(location);
    c = new Color(0,128,0, step);
  }


  @Override
  public void step(GameState gs) {
	  if (step > 0) {
		  step = step - 1; 
		 
	  }
	
    
    
  }
  

  @Override
  public void draw(Graphics g) {
    g.setColor(c);
    int x = (int) this.getLocation().getX();
    int y = (int) this.getLocation().getY();
    g.fillOval(x, y, step , step );
  }


}
