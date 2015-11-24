package spacerace.areas;

import spacerace.*;
import spacerace.decorations.WayPointReached;


public final class WayPoint extends Area {

  private int index;

  public WayPoint(Coord2D location, int index) {
    super(location);

      this.index = index;
      setLocation(location);

  }

  public int getIndex() {
    return this.index;
  }


  @Override
  public void interactWith(GameState gs, MovingElement e) {

      Player[] players = gs.getPlayers();

      for (Player i : players) {
          if (i.getTargetWayPoint() == getIndex() && i.equals(e)) {
              if (getIndex() == gs.numberOfWaypoints()-1) {
                  gs.addDecoration(new WayPointReached(getLocation()));
                  gs.playSound(SoundEffect.PLAYER_WON);
                  gs.gameIsOver();
              }
              gs.playSound(SoundEffect.WAYPOINT_REACHED);
              gs.addDecoration(new WayPointReached(getLocation()));
              i.advanceToNextWayPoint();
          }
      }
  }

  /**
   * Yield way-point index as label.
   * @return A string for the way-point index.
   */
  @Override
  public String getLabel() {
    return String.valueOf(getIndex());
  }

}
