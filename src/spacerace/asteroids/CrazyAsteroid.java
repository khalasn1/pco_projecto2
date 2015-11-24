package spacerace.asteroids;

import spacerace.Asteroid;
import spacerace.Coord2D;

public final class CrazyAsteroid extends Asteroid{

    private int passos = 0;
	private boolean first = true;

    public CrazyAsteroid(Coord2D location, double direction, int speed) {
		super(location, direction, speed);
		
	}
	public void step(){

        if (first) {
            setDirection(Math.random()*360.0);
            first = false;
        }

        if (passos != 100) {
            passos ++;
        }

        if (passos == 100) {
            setDirection(Math.random()*360.0);
        }
	}
}
