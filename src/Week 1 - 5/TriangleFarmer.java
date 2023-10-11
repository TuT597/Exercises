import java.util.Scanner;

public class TriangleFarmer {
    public static void main (String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time to figure out the area of your triangle.\nWhat is the base of your triangle?");
        float base = scanner.nextFloat();
        System.out.println("What about the height?");
        float height = scanner.nextFloat();
        float area = (base * height) / 2f;
        System.out.println("The area of your triangle is: " + area);
    }
}