import java.util.Scanner;

public class SimulaSoup {
    
    private static Soup soup;
    
    public static void main(String[] args) {
        printMenu();
        assembleSoup();

        System.out.println("\nYour order: " + titleCase(soup.getSeasoning()) + " " + titleCase(soup.getIngredient()) + " " + titleCase(soup.getRecipe()));
    }
    
    private static void printMenu() {
        //write and print a menu. In the future could possibly auto generate the menu by collecting the enums values. Would personally also just use arrays instead.
        System.out.println("""
        Welcome to Simula\'s soup store! You can select what type of meal you want, what main ingredient and how it\'s seasoned!
        
        Meal Type:
        -Soup
        -Stew
        -Gumbo
        
        Main Ingredient:
        -Mushroom
        -Chicken
        -Carrot
        -Potato
        
        Seasoning:
        -Sweet
        -Salty
        -Spicy
            
        """);       
    }
    
    private static void assembleSoup() {
        //Initializes the soup object and assigns values through setters. 
        //Added Do while loop with try catch block to test if input is viable.
        
        Scanner scanner = new Scanner(System.in);
        soup = new Soup();

        System.out.println("What type of meal would you like to eat?");     
          
        do {
            String recipe = scanner.nextLine().toUpperCase();         
            try {                
                Soup.RecipeType value = Soup.RecipeType.valueOf(recipe);
                soup.setRecipe(recipe);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("That's not on the menu! Try again.");
            }
        } while(true);
        
        System.out.println("\nAnd what would you like for your main ingredient?");

        do {
            String ingredient = scanner.nextLine().toUpperCase();         
            try {
                Soup.MainIngredient value = Soup.MainIngredient.valueOf(ingredient);
                soup.setIngredient(ingredient);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("That's not on the menu! Try again.");
            }
        } while(true);        
        
        System.out.println("\nHow would you like your meal seasoned?");
        
        do {
            String seasoning = scanner.nextLine().toUpperCase();         
            try {
                Soup.SeasoningType value = Soup.SeasoningType.valueOf(seasoning);
                soup.setSeasoning(seasoning);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("That's not on the menu! Try again.");
            }
        } while(true);        
    }
    
    private static String titleCase(String input) {
        //Simple method to title case format the returned enums
        return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }
}