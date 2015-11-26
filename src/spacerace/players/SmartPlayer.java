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

        Coord2D wp = gs.getWayPointLocation(getTargetWayPoint());

        Area look = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, getDirection()));

        Area lookOne = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 0));
        Area lookTwo = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 90));
        Area lookThree = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 180));
        Area lookFour = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 270));

        /* if (look.getClass() != BlackHole.class || look.getClass()!= Planet.class) {
            if (look.getClass() == WormHole.class) {

            }

            else if (look.getClass() == Dust.class) {

            }
            else {

            }
        }
        */

        if (wp.distanceTo(lookFour.getLocation()) > wp.distanceTo(lookThree.getLocation())) {
            setDirection(180);
        }

        else if (wp.distanceTo(lookThree.getLocation()) > wp.distanceTo(lookTwo.getLocation())) {
            setDirection(90);
        }

        else if (wp.distanceTo(lookTwo.getLocation()) > wp.distanceTo(lookOne.getLocation())) {
            setDirection(0);
        }
        else {
            setDirection(270);
        }

        /*
        if (wp.compareTo(lookFour.getLocation()) > wp.compareTo(lookThree.getLocation())) {
            setDirection(180);

        }
        else if (wp.compareTo(lookThree.getLocation()) > wp.compareTo(lookTwo.getLocation())) {
            setDirection(90);

        }
        else if (wp.compareTo(lookTwo.getLocation()) > wp.compareTo(lookOne.getLocation())) {
            setDirection(0);
        }
        else {
            setDirection(0);
        }
        */
    }
}
