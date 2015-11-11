package spacerace.players;

import spacerace.Constants;
import spacerace.Coord2D;
import spacerace.HumanPlayerCommand;
import spacerace.Player;

public class HumanPlayer extends Player {

  public HumanPlayer(Coord2D location, double direction) {
    super(location, direction, 0);
  }
 
  public final void handleCommand(HumanPlayerCommand c) {
    // TODO
  }
}
