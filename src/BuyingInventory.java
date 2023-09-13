import java.util.Scanner;
import java.util.Map;

public class BuyingInventory {
    
    static final private Map<String, Float> INVENTORY = Map.of("Rope", 5f, "Torches", 8f, "Climbing Equipment", 12f, "Clean Water", 1f, "Machete", 10f, "Canoes", 100f, "Food Supplies", 1f);
        
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
        
        System.out.println("The following items are for sale!\n");
        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");
        
        while (true) {
            System.out.println("\nWhat are you interested in my friend?");
            String item = scanner.nextLine();
            priceGenerator(item, discountEnabled);
        }
    }
    
    private static void priceGenerator(String item, boolean discountEnabled) {
        float price;
        if (INVENTORY.containsKey(item)) {
            if (discountEnabled) {
                price = INVENTORY.get(item) * 0.5f;
            } else {
                price = INVENTORY.get(item);
            }
            System.out.println(item + " costs " + price + " gold");
            System.exit(0);
        } 
    }
}