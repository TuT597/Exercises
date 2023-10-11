import java.util.Scanner;

public class FourSisters {
    
    static int amountOfSisters = 4;
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Sister and Duckbear egg distribution
        System.out.print("How many eggs have been collected today?\n");
        int eggs = scanner.nextInt();
        int eggsPerSister = eggs / amountOfSisters;
        int eggsForDuckbear = eggs % amountOfSisters;
        System.out.print("The sisters each receive " + eggsPerSister + "egg(s), and the duckbears receives " + eggsForDuckbear + " egg(s).\n");
        
        //At how many eggs the Duckbear receives more than the sisters
        moreEggsForDuckbear();       
    }
    
    private static void moreEggsForDuckbear() {
        for (int eggs = 1; eggs <= 20; eggs++) {
            int eggsPerSister = eggs / amountOfSisters;
            int eggsForDuckbear = eggs % amountOfSisters; 
            
            if (eggsForDuckbear > eggsPerSister) {
                System.out.print("At " + eggs + " eggs, the duckbear receives more eggs then the sisters with " + eggsForDuckbear + " eggs.\n");
            }
        }
    }
}