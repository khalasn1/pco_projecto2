package spacerace.asteroids;

import spacerace.Asteroid;
import spacerace.Coord2D;

public final class OrbitalAsteroid extends Asteroid {
  private double orbitStep;
  public OrbitalAsteroid(Coord2D location, double orbitStep, int speed) {
    super(location, orbitStep, speed);
    this.orbitStep = orbitStep;
  }
  public void step(){
	  this.setDirection(getDirection() + orbitStep);
	  
  }
}