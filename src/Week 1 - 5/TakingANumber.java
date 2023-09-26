import java.util.Scanner;

public class TakingANumber {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main (String[] args) {
        System.out.println(askForNumberInRange("Give a number: ", 1, 10));
    }
    
    private static int askForNumber(String text) {
        System.out.println(text);
        int number = scanner.nextInt();
        return number;
    }
    
    private static int askForNumberInRange(String text, int min, int max) {
        System.out.println(text);
        int number = scanner.nextInt();
        if (number >= min && number <= max) return number;
        else {
            System.out.println("Error, invalid number!");
            return askForNumberInRange(text, min, max);
        }
    }
}

//Implemented in ThePrototype.java