package spacerace.players;

import spacerace.AIPlayer;
import spacerace.Coord2D;
import spacerace.GameState;

public class StraightAheadPlayer extends AIPlayer {

  public StraightAheadPlayer(Coord2D location, double direction, int referenceSpeed) {
    super(location, direction, referenceSpeed);
  }
 
  @Override
  public void step(GameState gs) {

      Coord2D p = gs.getWayPointLocation(getTargetWayPoint());

      setDirection(getLocation().directionTo(p));
  }

}
