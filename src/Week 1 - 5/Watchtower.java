//Fixed bugged null output by changing default coordinate values

import java.util.Scanner;

public class Watchtower {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String xAxis = "";
        String yAxis = "";
        
        System.out.println("Give the enemies X and Y coordinates: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (y > 0) {
            yAxis = "north";
        } else if (y < 0) {
            yAxis = "south";
        }
        
        if (x > 0) {
            xAxis = "east";
        } else if (x < 0) {
            xAxis = "west";
        }
        
        if (x == 0 && y == 0) {
            System.out.println("The enemy is here!");
        } else {
            System.out.println("The enemy is to the " + yAxis + xAxis + "!");
        }
    }
}
