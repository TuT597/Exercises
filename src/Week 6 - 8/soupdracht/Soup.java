import java.lang.String;

public class Soup {
    
    enum RecipeType {
        SOUP, STEW, GUMBO
    }
    
    enum MainIngredient {
        MUSHROOM, CHICKEN, CARROT, POTATO
    }
    
    enum SeasoningType {
        SWEET, SALTY, SPICY
    }
    
    private RecipeType recipe = RecipeType.SOUP; 
    private MainIngredient ingredient = MainIngredient.MUSHROOM;
    private SeasoningType seasoning = SeasoningType.SWEET;
    
    public String getRecipe() {
        return recipe.toString();
    }
    
    public String getIngredient() {
        return ingredient.toString();
    }
    
    public String getSeasoning() {
        return seasoning.toString();
    }
    
    public void setRecipe(String newRecipe){
        try {
            this.recipe = RecipeType.valueOf(newRecipe.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid recipe type: " + newRecipe);
        }
    }
    
    public void setIngredient(String newIngredient){
        try {
            this.ingredient = MainIngredient.valueOf(newIngredient.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ingredient: " + newIngredient);
        }
    }
    
    public void setSeasoning(String newSeasoning){
        try {
            this.seasoning = SeasoningType.valueOf(newSeasoning.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid seasoning type: " + newSeasoning);
        }
    }
}