package spacerace.players;

import spacerace.AIPlayer;
import spacerace.Coord2D;
import spacerace.GameState;


public final class CrazyPlayer extends AIPlayer {

    private int passos = 0;
    private boolean first = true;

    public CrazyPlayer(Coord2D location, double direction, int referenceSpeed) {
        super(location, direction, referenceSpeed);
    }

    @Override
    public void step(GameState gs) {
        if (first) {
            setDirection(Math.random());
            first = false;
        }
        else {
            if (passos == 50) {
                setDirection(Math.random());
                if (gs.getArea(this.getLocation()) instanceof EmptyArea) {
                    gs.addArea(new Dust(getLocation()));
                }
                passos = 0;
            }
            passos = passos + 1;
        }
    }
}

