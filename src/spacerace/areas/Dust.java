package spacerace.areas;

import spacerace.Area;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.MovingElement;
import spacerace.Constants;

/**
 * Dust
 * @author fc45810 Ana Espinheira, fc44314 Francisco Pires
 *
 */
public final class Dust extends Area {
/**
 * construtor
 * @param location localizacao do dust
 */
	public Dust(Coord2D location) {
		super(location);
		
	}
/**
 * interacao com moving element.
 * a interacao nao tem efeito.
 * @param e MovingElement
 */
	@Override
	public void interactWith(GameState gs, MovingElement e) {
		e.setMaximumSpeed(Constants.MAX_SPEED_IN_DUST);
	}


	
  
}

