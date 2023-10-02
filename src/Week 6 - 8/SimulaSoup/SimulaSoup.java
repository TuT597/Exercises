package soupstore;
import java.util.Scanner;

public class {
    public static void main(String... args) {
        printMenu();
        
        chooseOptions();
        
        assembleSoup();
    }
    
    public static void printMenu() {
        //write and print a menu.
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
        //Collect input from user and create variable from them
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What type of meal would you like to eat?");
        String recipe = scanner.nextLine();
        
        System.out.println("\nAnd what would you like for your main ingredient?");
        String ingredient = scanner.nextLine();
        
        System.out.println("\nHow would you like your meal seasoned?");
        String spice = scanner.nextLine();
    }
    
    public static void assembleSoup() {
        //Create new soup object
        //Use setters to select ingredients
        //Build a string using getters in the format Seasoning Ingredient Recipe
        Soup soup = new Soup();
        
        soup.setRecipe(recipe);
        soup.setIngredient(ingredient);
        soup.setSpice(spice);
        
    }
}