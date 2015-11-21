package spacerace.asteroids;

import spacerace.Asteroid;
import spacerace.Coord2D;

public final class CrazyAsteroid extends Asteroid{

    private int passos = 0;

    public CrazyAsteroid(Coord2D location, double direction, int speed) {
		super(location, direction, speed);
		
	}
	public void step(){
		if (passos == 100){
			this.setDirection(Math.random());
			passos = 0;
		}
		else{
			passos = passos + 1;
		}
	}
}
