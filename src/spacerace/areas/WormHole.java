package spacerace.areas;

import spacerace.Area;
import spacerace.Constants;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.MovingElement;
import spacerace.SoundEffect;


public final class WormHole extends Area {

	private Coord2D out;
	
	public WormHole(Coord2D location, Coord2D exit) {
		super(location);
		out = exit;

	}


	public Coord2D getExit() {
		return out;
	}

	@Override
	public void interactWith(GameState gs, MovingElement e) {
		double d = e.getDirection();
		e.setLocation(out.displace(Constants.ELEM_WIDTH * 1.1, d));
		gs.playSound(SoundEffect.ENTER_WORMHOLE);
	}
}
