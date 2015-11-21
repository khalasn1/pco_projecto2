package spacerace.players;

import spacerace.AIPlayer;
import spacerace.Coord2D;
import spacerace.GameState;


public final class CrazyPlayer extends AIPlayer {

    private int passos = 0;

    public CrazyPlayer(Coord2D location, double direction, int referenceSpeed) {
        super(location, direction, referenceSpeed);
    }

    @Override
    public void step(GameState gs) {
        if (passos == 50) {
            this.setDirection(Math.random());
            passos = 0;
        } else {
            passos = passos + 1;
        }
    }
}

