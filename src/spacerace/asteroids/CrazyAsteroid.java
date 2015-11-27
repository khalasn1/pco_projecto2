package spacerace.asteroids;

import spacerace.Asteroid;
import spacerace.Coord2D;
import spacerace.GameState;

import java.awt.*;
/**
 * Crazy Asteroid
 * @author fc45810 Ana Espinheira, fc44314 Francisco Pires
 *
 */
public final class CrazyAsteroid extends Asteroid{

    private int passos = 0;
/**
 * Constructs CrazyAsteroid
 * @param location localizacao 
 * @param direction direcao inicial
 * @param speed velocidade
 */
    public CrazyAsteroid(Coord2D location, double direction, int speed) {
		super(location, direction, speed);
		
	}
/**
 * Step do CrazyAsteroid
 */
	public void step(GameState gs){

        if (passos != 100) {
            passos ++;
        } else {
            this.setDirection(Math.random()*360.0);
            passos = 0;
        }
	}
}
