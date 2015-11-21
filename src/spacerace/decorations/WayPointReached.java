package spacerace.decorations;

import java.awt.Color;
import java.awt.Graphics;

import spacerace.Coord2D;
import spacerace.Decoration;
import spacerace.GameState;

public class WayPointReached extends Decoration {
	private int step = 20;
	private Color c;
	private Color cc;
	public WayPointReached(Coord2D location) {
		super(location);
		c = new Color(0,128,0, 50);
		cc = new Color(0,128,0, 10);
	}

	
	@Override
	public void step(GameState gs) {
		  if (step > 0) {
			  step = step - 1; 
		  }
		  else{
			  this.die();
		  }
	}
  
	@Override
	public void draw(Graphics g) {
		if( step % 2 == 0){
			g.setColor(c);
		}
		else{
			g.setColor(cc);
		}
	    int x = (int) this.getLocation().getX();
	    int y = (int) this.getLocation().getY();
	    g.fillOval(x-25, y-25, 50, 50);
	  }

}

