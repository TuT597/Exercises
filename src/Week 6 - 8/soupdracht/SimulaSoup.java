import java.util.Scanner;

public class SimulaSoup {
    
    private static String recipe;
    private static String ingredient;
    private static String seasoning;
    private static Soup soup;
    
    public static void main(String[] args) {
        printMenu();
        chooseOptions();
        assembleSoup();

        System.out.println("Your order: " + titleCase(soup.getSeasoning()) + " " + titleCase(soup.getIngredient()) + " " + titleCase(soup.getRecipe()));
    }
    
    public static void printMenu() {
        //write and print a menu. In the future could possibly auto generate the menu by collecting the enums values. Would personally also just use arrays instead.
        System.out.println("""
            Welcome to Simula's soup store! You can select what type of meal you want, what main ingredient and how it\'s seasoned!
            
            Meal Type:
            -Soup
            -Stew
            -Gumbo
            
            Main Ingredient:
            -Mushroom
            -Chicken
            -Carrot
            -Potatoe
            
            Seasoning:
            -Sweet
            -Salty
            -Spicy
            
        """);       
    }
    
    public static void chooseOptions() {
        //Collect input from user and create variables from them
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What type of meal would you like to eat?");
        recipe = scanner.nextLine();
        
        System.out.println("\nAnd what would you like for your main ingredient?");
        ingredient = scanner.nextLine();
        
        System.out.println("\nHow would you like your meal seasoned?");
        seasoning = scanner.nextLine();
    }
    
    public static void assembleSoup() {
        //Initializes the soup object and assigns variables through setters
        soup = new Soup();
        soup.setRecipe(recipe);
        soup.setIngredient(ingredient);
        soup.setSeasoning(seasoning);
    }
    
    public static String titleCase(String input) {
        //Simple method to title case format the returned enums
        return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }
}