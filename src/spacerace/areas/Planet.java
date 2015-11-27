package spacerace.areas;

import spacerace.Area;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.MovingElement;
import spacerace.SoundEffect;

/**
 * Planet
 * @author fc45810 Ana Espinheira, fc44314 Francisco Pires
 *
 */
public final class Planet extends Area {
/**
 * construtor
 * @param location localizacao do planeta
 */
	public Planet(Coord2D location) {
		super(location);
	}
/**
 * interacao com game state e moving element.
 * a interacao tem efeito.
 * @param gs GameState
 * @param e MovingElement
 */
	@Override
	public void interactWith(GameState gs, MovingElement e) {
		e.setDirection(e.getDirection() - 180);
		gs.playSound(SoundEffect.COLLISION);
	}
  
}