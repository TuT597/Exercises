package soupstore;
import java.lang.String;

public class Soup {
    
    enum RecipeType {
        SOUP, STEW, GUMBO
    }
    
    enum MainIngredient {
        MUSHROOM, CHICKEN, CARROT, POTATOE
    }
    
    enum SeasoningType {
        SWEET, SALTY, SPICY
    }
    
    private RecipeType recipe = RecipeType.SOUP; 
    private MainIngredient ingredient = MainIngredient.MUSHROOM;
    private SeasoningType seasoning = SeasoningType.SWEET;
    
    public String getRecipe() {
        return recipe;
    }
    
    public String getIngredient() {
        return ingredient;
    }
    
    public String getSpice() {
        return spice;
    }
    
    public void setRecipe(String newRecipe){
        this.recipe = RecipeType.newRecipe.toUpperCase();
    }
    
    public void setIngredient(String newIngredient){
        this.ingredient = MainIngredient.newIngredient.toUpperCase();
    }
    
    public void setSpice(String newSpice){
        this.spice = SeasoningType.newSpice.toUpperCase();
    }
}