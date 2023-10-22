import java.util.Scanner;

enum Arrowhead {
    STEEL(10),
    WOOD(3),
    OBSIDIAN(5);
    
    private final int price;
    
    Arrowhead(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }
}

enum Fletching {
    PLASTIC(10),
    TURKEY(5),
    GOOSE(3);
    
    private final int price;
    
    Fletching(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }
}

enum ArrowTypes {CUSTOM, ELITE, BEGINNER, MARKSMAN};


class Arrow{
    final private Arrowhead arrowHead;
    final private Fletching fletchType;
    final private int shaftLength;

    public Arrow(Arrowhead head, Fletching fletch, int length){
        arrowHead = head;
        fletchType = fletch;
        shaftLength = length;
    }
    
    public Arrowhead getArrowHead(){
        return arrowHead;
    }
    
    public Fletching getFletchType(){
        return fletchType;
    }
    
    public int getShaftLength(){
        return shaftLength;
    }
}



public class VinsFletchery{
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Welcome to Vin's Fletchery, what kind of arrow are you looking for today?\n");
        storeOptions();
    }  
    
    public static void storeOptions(){
        for (ArrowTypes arrow : ArrowTypes.values()){
            System.out.println(arrow.ordinal() + 1 + ". " + titleCase(arrow.toString()));
        }
        
        int choice = scanner.nextInt() - 1;
        
        switch (choice) {
            case 0 -> createCustomArrow();
            case 1 -> createEliteArrow();
            case 2 -> createBeginnerArrow();
            case 3 -> createMarksmanArrow();
        }
    }
    
    
    public static void createCustomArrow(){
        //Creates a custom new arrow object depending on customers choices
        System.out.println("\nAh an expert, i will make a custom arrow for you. Here are my options.");
        System.out.println("What arrowhead would you like?");
        
        //Dynamically generate order menu by printing out enums
        for (Arrowhead head : Arrowhead.values()){
            System.out.println(head.ordinal() + 1 +". " + titleCase(head.toString()) + " " + head.getPrice() + " gold");
        }
        //Sets the enum you want to give to your custom arrow object
        Arrowhead headEnum = Arrowhead.values()[getEnum()];
            
        System.out.println("\nWhat fletching would you like?");
        for (Fletching fletch : Fletching.values()){
            System.out.println(fletch.ordinal() + 1 +". " + titleCase(fletch.toString()) + " " + fletch.getPrice() + " gold");
        }
        Fletching fletchEnum = Fletching.values()[getEnum()];
        
        System.out.print("\nLength between 60cm and 100cm every cm costs 0.05 gold: ");
        int length = setLength();
        
        System.out.println("\nHere is your custom arrow.");
        
        Arrow customArrow = new Arrow(headEnum, fletchEnum, length);
        
        getCost(customArrow);
    }

    public static int getEnum(){
        //Returns a number that stands for the enum value you want to use for the arrow
        do {
            int temp = scanner.nextInt() - 1;
            if (temp <= 2) return temp;
            else System.out.println("That is not one of the options, try again!\n");
        } while (true);
    }
    
    public static int setLength(){
        //Simply returns an int used for the arrow shaft, makes sure it's not too short or long
        do {
            int temp = scanner.nextInt();
            if (temp >= 60 && temp <= 100) return temp;
            else System.out.println("I don't support that length, try again!\n");
        } while (true);
    }
    
    public static void createEliteArrow(){
        System.out.println("\nOne for the experts, the elite arrow.");
        Arrow eliteArrow = new Arrow(Arrowhead.STEEL, Fletching.PLASTIC, 95);
        getCost(eliteArrow);
    }
    
    public static void createBeginnerArrow(){
        System.out.println("\nThe beginner arrow, we all start somewhere.");
        Arrow beginnerArrow = new Arrow(Arrowhead.WOOD, Fletching.GOOSE, 75);
        getCost(beginnerArrow);
    }
    
    public static void createMarksmanArrow(){
        System.out.println("\nFor when you really need to hit the mark, the marksman arrow.");
        Arrow marksmanArrow = new Arrow(Arrowhead.STEEL, Fletching.GOOSE, 65);
        getCost(marksmanArrow);
    }
    
    public static void getCost(Arrow arrow){
        //Calculates price of given Arrow object and generates order text
        int headPrice = arrow.getArrowHead().getPrice();
        int fletchPrice = arrow.getFletchType().getPrice();
        float shaftPrice = arrow.getShaftLength() * 0.05f;
        float arrowPrice = headPrice + fletchPrice + shaftPrice;

        System.out.println("Head: " + titleCase(arrow.getArrowHead().toString()) + " " + headPrice + " gold");
        System.out.println("Fletching: " + titleCase(arrow.getFletchType().toString()) + " " + fletchPrice + " gold");
        System.out.println("With a " + arrow.getShaftLength() + "cm shaft " + shaftPrice + " gold");
        System.out.println("This arrow costs: " + arrowPrice + " gold");   
    }

    
    public static String titleCase(String input){
        //Simple titlecase method
        return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }
}