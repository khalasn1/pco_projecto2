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
    Scanner inp = new Scanner(file);
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
            // TODO OUTROS CASOS
            // adicionar todas as classes da Area
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
    // TODO VALIDAR COORDENADAS
    return new Coord2D(x,y);
  }


  private static int readDirection(Scanner inp) {
    int d = inp.nextInt();
    // TODO VALIDAR DIREÇÃO
    return d;
  }

  private static int readSpeed(Scanner inp) {
    int s = inp.nextInt();
    // TODO VALIDAR VELOCIDADE
    return s;
  }

  /**
   * Private constructor to prevent instantiation.
   */
  private GameLevelReader() {

  }

}
