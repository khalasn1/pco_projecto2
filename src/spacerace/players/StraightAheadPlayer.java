package spacerace.players;

import spacerace.AIPlayer;
import spacerace.Coord2D;
import spacerace.GameState;

/* Class StraightAheadPlayer
 *
 * Moves a Player in a Straigh line in direction of the waypoints
 */

public class StraightAheadPlayer extends AIPlayer {

    /* Construtor
     *
     */

    public StraightAheadPlayer(Coord2D location, double direction, int referenceSpeed) {
        super(location, direction, referenceSpeed);
    }

    /* Method step.
     *
     * Overrides the step() from AIPlayer class
     * @param GameState gs
     *
     */

    @Override
    public void step(GameState gs) {

        Coord2D p = gs.getWayPointLocation(getTargetWayPoint());

        setDirection(getLocation().directionTo(p));
    }

}
