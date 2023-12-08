import java.util.LinkedList;

public class Map {
    private static LinkedList<Location> car;
    private static final char taxiIcon = 'V';

    public static final int MAP_SIZE = 10;
    public static final char EMPTY = '.';
    public static final char Vehicle = 'V';
    public static final char Person = 'P';

    public char[][] map;

    public Map() {
        map = new char[MAP_SIZE][MAP_SIZE];
        initializeMap();
    }

    public void initializeMap() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(map[i][j] + " ");

                }
            System.out.println();
        }
    }
public void placeOnMap(int x, int y, char type){
 map[x][y] = type;

    }
    int startX = 5;
    int startY = 5;
    public void spawnCar() {
        car.add(new Location(startX, startY));
        map[startX][startY] = taxiIcon;
    }


}





