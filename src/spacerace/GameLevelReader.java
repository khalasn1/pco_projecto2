package spacerace;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import spacerace.areas.*;
import spacerace.asteroids.*;
import spacerace.players.*;


public class GameLevelReader {

    public static GameState read(int level) throws FileNotFoundException, InvalidLevelException {
        GameState gs = new GameState(level);
        File file = new File(Constants.LEVELS_PATH, "level_" + level + ".txt");
        Scanner inp;
        // Exception FileNotFoundException
        if (file.exists()) {
            inp = new Scanner(file);
        }
        else {
            throw new FileNotFoundException("Ficheiro nao encontrado");
        }
        try {
            while(inp.hasNext()) {
                String typeOfElem = inp.next();
                //System.out.println(typeOfElem);
                switch (typeOfElem) {
                    case "HumanPlayer":
                        HumanPlayer hp = new HumanPlayer(readCoord(inp), readDirection(inp));
                        gs.addHumanPlayer(hp);
                        break;
                    case "WayPoints":
                        int n = inp.nextInt();
                        for (int i=0; i < n; i++) {
                            gs.addArea(new WayPoint(readCoord(inp), i));
                        }
                        break;
                    case "LooseAsteroid":
                        gs.addAsteroid(
                                new LooseAsteroid(readCoord(inp),
                                        readDirection(inp),
                                        readSpeed(inp)));
                        break;
                    case "Dust":
                        gs.addArea(new Dust(readCoord(inp)));
                        break;
                    case "BlackHole":
                        gs.addArea(new BlackHole(readCoord(inp)));
                        break;
                    case "Planet":
                        gs.addArea(new Planet(readCoord(inp)));
                        break;
                    case "WormHole":
                        gs.addArea(new WormHole(readCoord(inp), readCoord(inp)));
                        break;
                    default:
                }
            }
        }
        finally {
            inp.close();
        }
        return gs;
    }

    private static Coord2D readCoord(Scanner inp) {
        int x = inp.nextInt();
        int y = inp.nextInt();
        // VALIDAR COORDENADAS
        if (x < 0 || x > Constants.GAME_AREA_LENGTH) {
            throw new InvalidLocationException("Coordenadas Invalida");
        }
        return new Coord2D(x,y);
    }


    private static int readDirection(Scanner inp) {
        int d = inp.nextInt();
        // VALIDAR DIRECCAO
        if ( d < 0 || d > 360 ){
            throw new InvalidDirectionException("Direccao Invalida");
        }
        return d;
    }

    private static int readSpeed(Scanner inp) {
        int s = inp.nextInt();
        // VALIDAR VELOCIDADE
        if ( s < 0 || s > Constants.MAX_SPEED) {
            throw new InvalidSpeedException("Velocidade Invalida");
        }
        return s;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private GameLevelReader() {

    }

}
