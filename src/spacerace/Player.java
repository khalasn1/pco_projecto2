package spacerace;

// TODO A COMPLETAR
public abstract class Player extends MovingElement {
  
  public Player(Coord2D location, double direction, int referenceSpeed) {
    super(location, direction, referenceSpeed);
 
  }

  // proximo waypoint.
  private int target_waypoint = 0;

  public final int getTargetWayPoint() {

    return this.target_waypoint;
  }
  
  public final void advanceToNextWayPoint() {

    this.target_waypoint = this.target_waypoint + 1;
  }
  
  /**
   * Yield target way-point as label.
   * @return The target way-point as a string.
   */
  @Override
  public String getLabel() {
    return String.valueOf(getTargetWayPoint());
  }
}
