import java.util.Arrays;
import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runProgram(scanner);
    }

    static void runProgram(Scanner scanner) {
        System.out.println("Enter two numbers to divide separated by a space: ");

        String numbers = scanner.nextLine();
        String[] parts = numbers.split(" ");

        if (parts.length == 2) {
            int[] myNumbers = Arrays.stream(parts)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println("Result: " + myNumbers[0]/myNumbers[1]);
            scanner.close();
        } else {
            System.out.println("Input string was not two numbers separated by a space");
            runProgram(scanner);
        }
    }
}
