package spacerace.areas;

import spacerace.Area;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.MovingElement;
import spacerace.SoundEffect;


/**
 * Black Hole
 * @author fc45810 Ana Espinheira, fc44314 Francisco Pires
 *
 */
public final class BlackHole extends Area  {
/**
 * construtor
 * @param location localizacao do blackhole
 */
	public BlackHole(Coord2D location) {
		super(location);
	
	}

	@Override
	/**
	 * interacao com MovingElement e GameState.
	 * a interacao tem efeito
	 * @param gs GameState
	 * @param e MovingElement
	 */
	public void interactWith(GameState gs, MovingElement e) {
		e.die();
		gs.playSound(SoundEffect.EXPLOSION);
	} 
 
}
