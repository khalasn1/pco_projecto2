package spacerace.players;

import spacerace.*;
import spacerace.areas.*;

// TODO
public class SmartPlayer extends AIPlayer {

    /* Construtor SmartPlayer
     */


    public SmartPlayer(Coord2D location, double direction, int referenceSpeed) {

        super(location, direction, referenceSpeed);
    }

    public void step (GameState gs) {

        Coord2D p = Constants.normalize(getLocation());

        Area look = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, getDirection()));

        Area lookOne = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 0));
        Area lookTwo = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 90));
        Area lookThree = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 180));
        Area lookFour = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 270));

        Coord2D nextWaypoint = gs.getWayPointLocation(getTargetWayPoint());


        if (nextWaypoint.compareTo(lookFour.getLocation()) > nextWaypoint.compareTo(lookThree.getLocation())) {

            setDirection(180);

        }
        else if (nextWaypoint.compareTo(lookThree.getLocation()) > nextWaypoint.compareTo(lookTwo.getLocation())) {
            setDirection(90);

        }
        else if (nextWaypoint.compareTo(lookTwo.getLocation()) > nextWaypoint.compareTo(lookOne.getLocation())) {
            setDirection(0);

        }
        else {
            setDirection(270);
        }


        //cria a var "look" aqui. porque entretanto, a dir muda


        if ( look instanceof EmptyArea) {
        }

        if (look instanceof BlackHole || look instanceof Planet) {
            // ignore d
        }

        if (look instanceof EmptyArea) {


            setDirection(0);

            Coord2D b = gs.getWayPointLocation(getTargetWayPoint());

            double distance = p.distanceTo(p);
        }

        if (look instanceof Dust) {

        }

        if (look instanceof WormHole) {

        }
    }
}
