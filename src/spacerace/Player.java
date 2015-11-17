package spacerace;

// TODO A COMPLETAR
public abstract class Player extends MovingElement {
  
  public Player(Coord2D location, double direction, int referenceSpeed) {
    super(location, direction, referenceSpeed);
 
  }

  private int value_waypoint = 0;

  public final int getTargetWayPoint() {
    // TODO: supostamente completo.
    return this.value_waypoint;
  }
  
  public final void advanceToNextWayPoint() {
      // supostamente completo.
    this.value_waypoint = this.value_waypoint + 1;
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
