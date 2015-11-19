package spacerace.areas;

import spacerace.*;
import spacerace.players.HumanPlayer;


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
          if(p[i].getTargetWayPoint() == getIndex()){
              if (getIndex() == gs.numberOfWaypoints()) {
                  gs.playSound(SoundEffect.PLAYER_WON);
                  gs.gameIsOver();
              }
              gs.playSound(SoundEffect.WAYPOINT_REACHED);
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
