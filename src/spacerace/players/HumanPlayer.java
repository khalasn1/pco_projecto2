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
    if (c==HumanPlayerCommand.SPEED_UP) {
    	if(this.getSpeed() < Constants.MAX_SPEED){
    		acelerar();
    	}
    }
    if (c==HumanPlayerCommand.SPEED_DOWN){
    	if(this.getSpeed() > 0){
    		abrandar();
    	}
    }
    
    if(c == HumanPlayerCommand.TURN_LEFT){
    	this.setDirection(this.getDirection() - 10);
    }
    if(c == HumanPlayerCommand.TURN_RIGHT){
    	this.setDirection(this.getDirection() + 10);
    }
   
  }
  
  public void acelerar() {
	  this.setReferenceSpeed(this.getSpeed() + 1);
  }
  public void abrandar(){
	  this.setReferenceSpeed(this.getSpeed() - 1);
  } 
}
