//cannonShot() repetition reduced
//Scanner scope adjusted to private
//final static variables properly named

import java.util.Scanner;

public class HuntingTheManticore {
    
    private static Scanner scanner = new Scanner(System.in);
    private static int round = 1;
    private final static int TOWN_MAX_HEALTH = 15;
    private static int townHealth = TOWN_MAX_HEALTH;
    private final static int MANTICORE_MAX_HEALTH = 10;
    private static int manticoreHealth = MANTICORE_MAX_HEALTH;
    private static int manticoreRange;
    private static int cannonDamage;
    
    
    public static void main (String[] args){
        manticoreRange = askForNumberInRange("Player one, at what range between 0 and 100 do you want to position the manticore?", 0, 100);
        
        for(int x = 0; x < 50; x++){
            System.out.println("\n");
        }
        
        System.out.println("Player 2, it is your turn.");
        
        while(true){
            if (manticoreHealth > 0 && townHealth > 0){
                cannonDamage = cannonballDamage();
                
                System.out.println("""
                -------------------------------------------------------
                STATUS: Round: %d City: %d/%d Manticore %d/%d
                The cannon is expected to deal %d damage this round."""
                .formatted(round, townHealth, TOWN_MAX_HEALTH, manticoreHealth, MANTICORE_MAX_HEALTH, cannonDamage));
                
                cannonShot();
                
            } else if (manticoreHealth <= 0){
                System.out.println("The Manticore has been destroyed! The city of Consolas has been saved!");
                break;
            } else if (townHealth == 0){
                System.out.println("The city has been destroyed! The manticore has succeeded in it's mission!");
                break;
            }  
        }   
    } 
    
    private static boolean cannonShot() {
        System.out.print("Enter desired cannon range: ");
        int cannonRange = scanner.nextInt();
        
        if (cannonRange > 0 && cannonRange <= 100) {
            if (cannonRange == manticoreRange) {
                System.out.println("That round was a DIRECT HIT!");
                manticoreHealth -= cannonDamage;
            } else if (cannonRange > manticoreRange) {
                System.out.println("That round OVERSHOT the target.");
            } else {
                System.out.println("That round FELL SHORT of the target.");
            }
            townHealth--;
            round++;
            return true;
        } else {
            System.out.println("Invalid input, please enter a range between 0 and 100");
            cannonShot();
            return true;
        }
    }
    
    private static int cannonballDamage() {
        if (round % 3 == 0 && round % 5 == 0) return 10;
        else if (round % 3 == 0 || round % 5 == 0) return 3;
        else return 1;
    }
    
    private static int askForNumberInRange(String text, int min, int max) {
        System.out.println(text);
        do {
            int number = scanner.nextInt();
            if (number >= min && number <= max) return number;
            else System.out.println("Invalid input try again.");
        } while (true);
    }
}  