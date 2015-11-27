package spacerace.areas;

import spacerace.Area;
import spacerace.Constants;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.MovingElement;
import spacerace.SoundEffect;

/**
 * Worm Hole
 * @author fc45810 Ana Espinheira, fc44314 Francisco Pires
 *
 */
public final class WormHole extends Area {

	private Coord2D out;
	/**
	 * construtor
	 * @param location localizacao do WormHole
	 * @param exit localizacao da saida do WormHole
	 */
	public WormHole(Coord2D location, Coord2D exit) {
		super(location);
		out = exit;

	}

/**
 * Retorna as coordenadas da saida do WormHole
 * @return Coord2D do WormHole
 */
	public Coord2D getExit() {
		return out;
	}
/**
 * Interacao com game state e moving element.
 * Interacao com efeito.
 * @param gs GameState
 * @param e MovingElement
 */
	@Override
	public void interactWith(GameState gs, MovingElement e) {
		double d = e.getDirection();
		e.setLocation(out.displace(Constants.ELEM_WIDTH * 1.1, d));
		gs.playSound(SoundEffect.ENTER_WORMHOLE);
	}
}
