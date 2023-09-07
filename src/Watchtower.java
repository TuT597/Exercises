import java.util.Scanner;

public class Watchtower {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the enemies X and Y coordinates: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Tick");
        } else { 
        System.out.println("Tock");
        }
    }
}