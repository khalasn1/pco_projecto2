package spacerace.areas;

import spacerace.Area;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.MovingElement;



public final class WayPoint extends Area {

  // TODO
  
  public WayPoint(Coord2D location, int index) {
    super(location);
    // TODO
  }

  public int getIndex() {
    // TODO
    return -1;
  }

  
  @Override
  public void interactWith(GameState gs, MovingElement e) {
    // TODO
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
