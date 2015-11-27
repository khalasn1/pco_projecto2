package spacerace.players;

import spacerace.*;
import spacerace.areas.*;
import java.util.ArrayList;

// TODO

public class SmartPlayer extends AIPlayer {

    /* Construtor Class SmartPlayer
     *
     * lookA = Previous displace of GameState (type Area)
     * preDir = Previous direction
     *
     */

    private int i = 0;
    private Area lookA;
    private ArrayList<Double> prevDir = new ArrayList<>();

    public SmartPlayer(Coord2D location, double direction, int referenceSpeed) {

        super(location, direction, referenceSpeed);
    }

    /* Secondary method
     * (ignore code)
     *
    public void secondStep (ArrayList<Integer> d, ArrayList<Area> lookArray, Coord2D wp) {

        for (int i = lookArray.size()-1; i > 0; i--) {
            if (wp.distanceTo(lookArray.get(i).getLocation()) > wp.distanceTo(lookArray.get(i-1).getLocation())) {
                setDirection(d.get(i));
            }
            else {
                setDirection(d.get(i));
            }
        }
    }
    */

    public void step (GameState gs) {

        int[] d = new int[]{0, 90, 180, 270};

        Coord2D p = Constants.normalize(getLocation());

        Coord2D wp = Constants.normalize(gs.getWayPointLocation(getTargetWayPoint()));

        Area look = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, getDirection()));

        // ArrayList<Area> lookArray = new ArrayList<>();

        Area lookOne = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 0));
        Area lookTwo = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 90));
        Area lookThree = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 180));
        Area lookFour = gs.getArea(p.displace(Constants.ELEM_WIDTH * 1.1, 270));

        if (prevDir.size() != 0 ) {
            if (lookA.getClass() != EmptyArea.class || lookA.getClass() != Dust.class) {
                setDirection(prevDir.get(i));
                i++;
            }
            else {
                prevDir.clear();
                lookA = null;
            }
        }
        else {
            if (look.getClass() == BlackHole.class || look.getClass() == Planet.class) {

                lookA = look;
                prevDir.add(getDirection());

                if (lookTwo.getClass() == EmptyArea.class && lookTwo.getClass() == EmptyArea.class) {
                    setDirection(d[0]);
                }
                if (lookThree.getClass() == EmptyArea.class && lookThree.getClass() == EmptyArea.class) {
                    setDirection(d[1]);
                }
                if (lookOne.getClass() == EmptyArea.class && lookOne.getClass() == EmptyArea.class) {
                    setDirection(d[2]);
                }
                if (lookFour.getClass() == EmptyArea.class && lookFour.getClass() == EmptyArea.class) {
                    setDirection(d[3]);
                }

            } else {
                if (wp.distanceTo(lookFour.getLocation()) > wp.distanceTo(lookThree.getLocation())) {
                    setDirection(d[2]);
                } else if (wp.distanceTo(lookThree.getLocation()) > wp.distanceTo(lookTwo.getLocation())) {
                    setDirection(d[1]);
                } else if (wp.distanceTo(lookTwo.getLocation()) > wp.distanceTo(lookOne.getLocation())) {
                    setDirection(d[0]);
                } else {
                    setDirection(d[3]);
                }
            }
        }

        /* Second way of choosing best path
         * (ignore code)

        if (lookOne.getClass() == EmptyArea.class) {
            a.add(d[0]);
            lookArray.add(lookOne);
        }

        if (lookTwo.getClass() == EmptyArea.class) {
            a.add(d[1]);
            lookArray.add(lookTwo);
        }

        if (lookThree.getClass() == EmptyArea.class) {
            a.add(d[2]);
            lookArray.add(lookThree);
        }

        if (lookFour.getClass() == EmptyArea.class) {
            a.add(d[3]);
            lookArray.add(lookFour);
        }

        secondStep(a, lookArray, wp);

        */

        /* Secondary code (third try)
         * (ignore code)
         *

        if (look.getClass() == Dust.class) {
            if (wp.distanceTo(look.getLocation()) * 1.25 > wp.distanceTo(look.getLocation())) {
                if (wp.distanceTo(lookFour.getLocation()) > wp.distanceTo(lookThree.getLocation())) {
                    if (getDirection() != d[2]) {
                        setDirection(d[2]);
                    }
                } else if (wp.distanceTo(lookThree.getLocation()) > wp.distanceTo(lookTwo.getLocation())) {
                    if (getDirection() != d[1]) {
                        setDirection(d[1]);
                    }
                } else if (wp.distanceTo(lookTwo.getLocation()) > wp.distanceTo(lookOne.getLocation())) {
                    if (getDirection() != d[0]) {
                        setDirection(d[0]);
                    }
                } else {
                    if (getDirection() != d[3]) {
                        setDirection(d[3]);
                    }
                }
            }
        }
            // setDirection(getDirection() + 90);

            /* Fourth try
             * (ignore code

            if (look.getClass() == WormHole.class) {
                //cenas
            }

            else if (look.getClass() == Dust.class) {
                if (wp.distanceTo(lookFour.getLocation()) * 1.25 > wp.distanceTo(lookThree.getLocation()) * 1.25) {
                    setDirection(180);
                }
                else if (wp.distanceTo(lookThree.getLocation()) * 1.25 > wp.distanceTo(lookTwo.getLocation()) * 1.25) {
                    setDirection(90);
                }

                else if (wp.distanceTo(lookTwo.getLocation()) * 1.25 > wp.distanceTo(lookOne.getLocation()) * 1.25) {
                    setDirection(0);
                }
                else {
                    setDirection(270);
                }
            }
            else {
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
            }
            */
    }
}