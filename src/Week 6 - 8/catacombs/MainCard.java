enum CardColor {RED, GREEN, BLUE, YELLOW};

enum CardType {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, DOLLAR, PERCENTAGE, CIRCUMFLEX, AMPERSAND};

class Card{
    final private CardColor color;
    final private CardType type;
    
    public Card(CardColor color, CardType type){
        this.color = color;
        this.type = type;
    }
    
    public String printCard(){
        return String.format("The %s %s", titleCase(this.color.toString()), titleCase(this.type.toString()));
    }
    
    public String titleCase(String input){
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}

public class MainCard{
    
}



//We use enumerations here because we know all of the options, in the past class you could make a custom color so it's too many options for an enum.