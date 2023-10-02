import java.util.Scanner;

public class HuntingTheManticore {
    
    public static Scanner scanner = new Scanner(System.in);
    private static int round = 1;
    private static int townMaxHealth = 15;
    private static int townHealth = townMaxHealth;
    private static int manticoreMaxHealth = 10;
    private static int manticoreHealth = manticoreMaxHealth;
    private static int manticoreRange;
    private static int cannonDamage;
    private static int cannonRange;
    
    
    public static void main (String[] args) {
        manticoreRange = askForNumberInRange("Player one, at what range between 0 and 100 do you want to position the manticore?", 0, 100);
        
        for(int x = 0; x < 50; x++){
            System.out.println("\n");
        }
        
        System.out.println("Player 2, it is your turn.");
        
        while(true) {
            if (manticoreHealth > 0 && townHealth > 0){
                cannonDamage = cannonballDamage();
                
                System.out.println("""
                -------------------------------------------------------
                STATUS: Round: %d City: %d/%d Manticore %d/%d
                The cannon is expected to deal %d damage this round."""
                .formatted(round, townHealth, townMaxHealth, manticoreHealth, manticoreMaxHealth, cannonDamage));
                
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
        cannonRange = scanner.nextInt();
        
        if (cannonRange > 0 && cannonRange <= 100){
            if (cannonRange == manticoreRange){
                System.out.println("That round was a DIRECT HIT!");
                manticoreHealth -= cannonDamage;
                townHealth--;
                round++;
                return true;
            } else if (cannonRange > manticoreRange){
                System.out.println("That round OVERSHOT the target.");
                townHealth--;
                round++;
                return true;
            } else {
                System.out.println("That round FELL SHORT of the target.");
                townHealth--;
                round++;
                return true;
            }
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
    
    
    //Recursie fout
    /*private static int askForNumberInRange(String text, int min, int max) {
        System.out.println(text);
        int number = scanner.nextInt();
        if (number >= min && number <= max) return number;
        else return askForNumberInRange("Error, invalid number! Try again!", min, max);
    }*/
    
    private static int askForNumberInRange(String text, int min, int max) {
        System.out.println(text);
        do {
            int number = scanner.nextInt();
            if (number >= min && number <= max) return number;
            else System.out.println("Invalid input try again.");
        } while (true);
    }
}  