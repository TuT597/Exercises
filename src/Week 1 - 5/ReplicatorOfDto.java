//Made it so both arrays are int arrays

import java.util.Scanner;
import java.util.Arrays;

public class ReplicatorOfDto {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Instead of limiting the replicator and original array to only 5 numbers i build the array from the scanner input giving more freedom to the user
        System.out.print("Enter numbers with spaces inbetween: ");
        
        String numbers = scanner.nextLine();
        String[] temp = numbers.split(" ");
        int size = temp.length;
        
        int[] arrayOne = new int[size];
        for (int i = 0; i < size; i++){
            arrayOne[i] = Integer.parseInt(temp[i]);
        }
        
        //Here the second array is defined and then using a for loop is copied over
        int[] arrayTwo = new int[arrayOne.length];
        
        for(int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }
        
        System.out.println("Original Array: " + Arrays.toString(arrayOne));
        System.out.println("Copied Array: " + Arrays.toString(arrayTwo)); 
    }
}