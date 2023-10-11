//Formatting adjusted
//Changed name of variable item changed to itemNameName
//While loop changed to do while
//Made buying item input not case sensitive
//Turned prints into a block to reduce repetition
//Shortened priceGenerator() method using ternary operator


import java.util.Scanner;
import java.util.Map;

public class BuyingInventory {
    
    static final private Map<String, Double> INVENTORY = Map.of("rope", 5.0, "torches", 8.0, "climbing equipment", 12.0, "clean water", 1.0, "machete", 10.0, "canoes",
                                                                100.0, "food supplies", 1.0);

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String discountName = "Tuyan";
        boolean discountEnabled = false;
        
        System.out.println("Welcome to my store, what is your name my friend?");
        String name = scanner.nextLine();
        
        if (name.equals(discountName)) {
            System.out.println("Ah that is a lucky name! Discount for you!");
            discountEnabled = true;
        }
        
        System.out.println("""
        The following items are for sale!
        
        1. Rope
        2. Torches
        3. Climbing Equipment
        4. Clean Water
        5. Machete
        6. Canoe
        7. Food Supplies   
        """);
        
        do {
            System.out.println("\nWhat are you interested in my friend?");
            String itemName = scanner.nextLine().toLowerCase();
            priceGenerator(itemName, discountEnabled);
        } while (true);
    }
    
    private static void priceGenerator(String itemName, boolean discountEnabled) {
        if (INVENTORY.containsKey(itemName)) {
            double price = discountEnabled ? INVENTORY.get(itemName) * 0.5 : INVENTORY.get(itemName);
            System.out.println("\n" + itemName + " costs " + price + " gold");
            System.exit(0);
        } else System.out.println("I'm afraid i don't carry that item, want something else?");
        return;
    }
}