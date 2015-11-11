package spacerace;

// TODO A COMPLETAR
public abstract class Player extends MovingElement {
  
  public Player(Coord2D location, double direction, int referenceSpeed) {
    super(location, direction, referenceSpeed);
 
  }

  public final int getTargetWayPoint() {
    // TODO
    return -1;
  }
  
  public final void advanceToNextWayPoint() {
    // TODO
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
