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
        for (int i = 3; i <= 20; i++) {
            int eggs2 = i;
            int eggsPerSister2 = eggs2 / 4;
            int eggsForDuckbear2 = eggs2 % 4; 
            if (eggsForDuckbear2 > eggsPerSister2) {
                System.out.print("At " + eggs2 + " eggs, the duckbear receives more eggs then the sisters with " + eggsForDuckbear2 + " eggs.\n");
            }
        }
    }
}