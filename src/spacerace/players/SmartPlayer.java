package spacerace.players;

import spacerace.AIPlayer;
import spacerace.Coord2D;

// TODO
public class SmartPlayer extends AIPlayer { 
  public SmartPlayer(Coord2D location, double direction, int referenceSpeed) {
    super(location, direction, referenceSpeed);
  }
  // metodo de smartplayer
  /*
  / 1. fazer straightAhead
  / 2. afastar dos objectos por ordem
  / 2.1 fazer 45°
  / 2.2 andar e verifica -45° ate ser empty space
  /retomar rota.
  / 3. repetir
  */
  
}