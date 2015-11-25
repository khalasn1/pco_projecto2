package spacerace.players;

import spacerace.*;
import spacerace.areas.*;

// TODO
public class SmartPlayer extends AIPlayer {

  public SmartPlayer(Coord2D location, double direction, int referenceSpeed) {
    super(location, direction, referenceSpeed);
  }

  public void step (GameState gs) {

      //  d = 0,90,180,270;

      Area look = gs.getArea(getLocation().displace(Constants.ELEM_WIDTH * 1.1 , getDirection()));

      if (look instanceof BlackHole || look instanceof Planet) {
        /* ignore d */
      }

      if (look instanceof EmptyArea) {
        /* evaluate d to waypoint destiny */

          setDirection(0);

          Coord2D p = gs.getWayPointLocation(getTargetWayPoint());

          double distance = p.distanceTo(p);
      }

      if (look instanceof Dust) {
        /* evaluate d to waypoint destiny * 1.25 */
      }

      if (look instanceof WormHole) {
        /* not sure */
      }
  }
  
}
