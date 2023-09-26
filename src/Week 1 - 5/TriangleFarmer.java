import java.util.Scanner;

public class TriangleFarmer {
    public static void main (String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time to figure out the area of your triangle.\nWhat is the base of your triangle?");
        int base = scanner.nextInt();
        System.out.println("What about the height?");
        int height = scanner.nextInt();
        System.out.println("The area of your triangle is: " + (base * height / 2));
    }
}