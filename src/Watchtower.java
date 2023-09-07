import java.util.Scanner;

public class Watchtower {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the enemies X and Y coordinates: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
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
        }
    }
}