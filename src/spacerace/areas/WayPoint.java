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

      Player[] p = gs.getPlayers();

      for (int i = 0; i < p.length; i++) {
          if(p[i].getTargetWayPoint() == getIndex() && p[i].equals(e)){
              if (getIndex() == gs.numberOfWaypoints()-1) {
            	  gs.addDecoration(new WayPointReached(this.getLocation()));
                  gs.playSound(SoundEffect.PLAYER_WON);
                  gs.gameIsOver();
              }
              gs.playSound(SoundEffect.WAYPOINT_REACHED);
              gs.addDecoration(new WayPointReached(this.getLocation()));
              p[i].advanceToNextWayPoint();
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
