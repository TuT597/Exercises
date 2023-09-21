public class HuntingTheManticore {
    
    private int round = 1;
    private int townHealth = 15;
    private int manticoreHealth = 10;
    private int cannonDamage;
    private int manticoreRange = askForNumberInRange("Player one, at what range between 0 and 100 do you want to position the manticore?", 0, 100);
    
    
    public static void main (String[] args) {
        
        
        
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