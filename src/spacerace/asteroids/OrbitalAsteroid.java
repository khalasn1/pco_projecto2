package spacerace.asteroids;

import spacerace.Asteroid;
import spacerace.Coord2D;
import spacerace.GameException;
import spacerace.GameState;
/**
 * Orbital Asteroid
 * @author fc45810 Ana Espinheira, fc44314 Francisco Pires
 *
 */
public final class OrbitalAsteroid extends Asteroid {

    private double orbitStep;
/**
 * Constructs OrbitalAsteroid
 * @param location localizacao 
 * @param orbitStep step do asteroid
 * @param speed velocidade 
 */
    public OrbitalAsteroid(Coord2D location, double orbitStep, int speed) {
        super(location, orbitStep, speed);
        this.orbitStep = orbitStep;
  }
/**
 * Step do OrbitalAsteroid
 */
    public void step(GameState gs){
	    setDirection(getDirection() + this.orbitStep);
  }
}