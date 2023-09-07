import java.util.Scanner;

public class Clocktower {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number to the tower: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Tick");
        } else { 
        System.out.println("Tock");
        }
    }
}