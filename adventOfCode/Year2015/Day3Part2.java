package adventOfCode.Year2015;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Day3Part2 {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String directions = sc.next();
        System.out.println(housesVisited(directions));
    }
    private static int housesVisited(String directions){
        Point SantaCoordinates = new Point(0, 0);
        Point RoboCoordinates = new Point(0, 0);
        Point currentCoordinates;
        boolean santaTurn = true;
        int visitedHouses = 1;
        HashSet<Point> visited = new HashSet<>();
        visited.add(new Point(0, 0));

        for(int i=0 ; i<directions.length() ; i++, santaTurn = !santaTurn){
            currentCoordinates = (santaTurn)? SantaCoordinates : RoboCoordinates;
            char currentDirection = directions.charAt(i);

            switch (currentDirection) {
                case '^':
                    currentCoordinates.y++;
                    break;
                case '>':
                    currentCoordinates.x++;
                    break;   
                case '<':
                    currentCoordinates.x--;
                    break;     
                case 'v':
                    currentCoordinates.y--;
                    break;                    
                default:
                    break;
            }

            if(!visited.contains(currentCoordinates)){
                visitedHouses ++;
                visited.add(new Point(currentCoordinates.x, currentCoordinates.y));
            }

        }
        return visitedHouses;
    }
}
class Point {
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point p = (Point) o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
