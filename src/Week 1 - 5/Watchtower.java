import java.util.Scanner;

public class Watchtower {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String xAxis = null;
        String yAxis = null;
        
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
        
        
        /*DRY mistake here. I could've have reduced the amount of IF statements by using concactination just looking at North/South then concatinating the rest.
        if (x > 0 && y > 0) {
            System.out.println("The enemy is approaching from the North-West!");
        } else if (x > 0 && y < 0) {
            System.out.println("The enemy is approaching from the South-West!");
        } else if (x < 0 && y > 0) {
            System.out.println("The enemy is approaching from the North-East!");
        } else if (x < 0 && y < 0) {
            System.out.println("The enemy is approaching from the South-East!");
        } else if (x == 0 && y > 0) {
            System.out.println("The enemy is approaching from the North!");
        } else if (x == 0 && y < 0) {
            System.out.println("The enemy is approaching from the South!");
        } else if (x > 0 && y == 0) {
            System.out.println("The enemy is approaching from the West!");
        } else if (x < 0 && y == 0) {
            System.out.println("The enemy is approaching from the East!");
        } else {
            System.out.println("The enemy is ALREADY HERE!");
        } */
    }
}
