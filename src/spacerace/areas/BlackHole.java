package spacerace.areas;

import spacerace.Area;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.MovingElement;
import spacerace.SoundEffect;



public final class BlackHole extends Area  {

	public BlackHole(Coord2D location) {
		super(location);
	
	}

	@Override
	public void interactWith(GameState gs, MovingElement e) {
		e.die();
		gs.playSound(SoundEffect.EXPLOSION);
		
	} 
 
}
