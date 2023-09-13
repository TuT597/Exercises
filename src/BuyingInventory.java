import java.util.Scanner;

public class BuyingInventory {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String discountName = "Tuyan";
        
        System.out.println("Welcome to my store, what is your name my friend?");
        String name = scanner.next();
        
        if (name.equals(discountName)) {
            System.out.println("Ah that is a lucky name! Discount for you!");
        }
        
        System.out.println("The following items are for sale!\n");
        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");
        System.out.println("\nWhat are you interested in my friend?");
        
        int item = scanner.nextInt();
        
        if (name.equals(discountName)) {
            switch (item) {
                case 1:
                    System.out.println("Rope costs 5 gold");
                    break;
                case 2:
                    System.out.println("Torches cost 8 gold");
                    break;
                case 3:
                    System.out.println("Climbing Equipment is 12 gold");
                    break;
                case 4:
                    System.out.println("Clean Water is 1 gold");
                    break;
                case 5:
                    System.out.println("Machetes are 10 gold");
                    break;
                case 6:
                    System.out.println("Canoes are 100 gold");
                    break;
                case 7:
                    System.out.println("Food Supplies are 1 gold");
                    break;
            }
        } else { 
            /*In the future don't use multiple switch cases. I could've made the price a variable and simply divide it by
                2 if the name checkes out. This is a DRY mistake. */
            switch (item) {
                case 1:
                    System.out.println("Rope costs 10 gold");
                    break;
                case 2:
                    System.out.println("Torches cost 15 gold");
                    break;
                case 3:
                    System.out.println("Climbing Equipment is 25 gold");
                    break;
                case 4:
                    System.out.println("Clean Water is 1 gold");
                    break;
                case 5:
                    System.out.println("Machetes are 20 gold");
                    break;
                case 6:
                    System.out.println("Canoes are 200 gold");
                    break;
                case 7:
                    System.out.println("Food Supplies are 1 gold");
                    break;
            }
        }
    }
}
