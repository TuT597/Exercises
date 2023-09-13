import java.util.Scanner;

public class FourSisters {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Sister and Duckbear egg distribution
        System.out.print("How many eggs have been collected today?\n");
        int eggs = scanner.nextInt();
        int eggsPerSister = eggs / 4;
        int eggsForDuckbear = eggs % 4;
        System.out.print("The sisters each receive " + eggsPerSister + ", and the duckbears receives " + eggsForDuckbear + " eggs.\n");
        
        //At how many eggs the Duckbear receives more than the sisters
        moreEggsForDuckbear();       
    }
    
    private static void moreEggsForDuckbear() {
        for (int i = 3; i <= 20; i++) {
            int eggs = i;
            int eggsPerSister = eggs / 4;
            int eggsForDuckbear = eggs % 4; 
            
            if (eggsForDuckbear > eggsPerSister) {
                System.out.print("At " + eggs + " eggs, the duckbear receives more eggs then the sisters with " + eggsForDuckbear + " eggs.\n");
            }
        }
    }
}