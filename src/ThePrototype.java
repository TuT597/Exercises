import java.util.Scanner;

public class ThePrototype {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main (String[] args) {
        final int number = askForNumberInRange("User 1, enter a number between 0 and 100: ", 0, 100);
        clearConsole();
        
        System.out.println("User 2, guess the number.");
        
        while(true) {
            int guessUserTwo = askForNumber("Guess a number: ");
            numberGuess(number, guessUserTwo);
        }
    }
    
    private static void clearConsole() {
        for (int i = 0; i < 60; i++) {
            System.out.println("");
        }
    }
    
    private static void numberGuess(int number, int guess) {
        if (number < guess) {
            System.out.println(guess + " is too high.");
            
        } else if (number > guess) {
            System.out.println(guess + " is too low.");   
            
        } else {
            System.out.println("You guessed the number!");
            System.exit(0);
        }
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
    
    private static int askForNumber(String text) {
        System.out.println(text);
        int number = scanner.nextInt();
        return number;
    }
}