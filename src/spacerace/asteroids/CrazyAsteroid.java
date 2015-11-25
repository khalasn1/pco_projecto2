package spacerace.asteroids;

import spacerace.Asteroid;
import spacerace.Coord2D;
import spacerace.GameState;

import java.awt.*;

public final class CrazyAsteroid extends Asteroid{

    private int passos = 0;

    public CrazyAsteroid(Coord2D location, double direction, int speed) {
		super(location, direction, speed);
		
	}

	public void step(GameState gs){

        if (passos != 100) {
            passos ++;
        } else {
            this.setDirection(Math.random()*360.0);
            passos = 0;
        }
	}
}
