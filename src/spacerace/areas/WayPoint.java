package spacerace.areas;

import spacerace.Area;
import spacerace.Coord2D;
import spacerace.GameState;
import spacerace.MovingElement;



public final class WayPoint extends Area {

  private int index;
  
  public WayPoint(Coord2D location, int index) {
    super(location);
    
    this.index = index;
  }

  public int getIndex() {
    return this.index;
  }

  
  @Override
  public void interactWith(GameState gs, MovingElement e) {
    //TODO
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
