package spacerace.players;

import spacerace.AIPlayer;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.areas.Dust;
import spacerace.areas.EmptyArea;


public final class CrazyPlayer extends AIPlayer {

    private int passos = 0;
    private boolean first = true;

    public CrazyPlayer(Coord2D location, double direction, int referenceSpeed) {
        super(location, direction, referenceSpeed);
    }

    @Override
    public void step(GameState gs) {

        if (first) {
            setDirection(Math.random()*360.0);
            first = false;
        }

        if (passos != 50) {
            passos ++;
        }

        if (passos == 50) {
            setDirection(Math.random()*360.0);
            if (gs.getArea(this.getLocation()) instanceof EmptyArea) {
                gs.addArea(new Dust(getLocation()));
            }
            passos = 0;
        }
    }
}