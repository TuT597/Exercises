import java.util.Scanner;
import java.awt.Toolkit;

public class DefenseOfConsolas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Target row?");
        int row = scanner.nextInt();
        System.out.println("Target column?");
        int column = scanner.nextInt();
        
        System.out.println("\n\u001B[31m FORMATION!");
        deployment(row, column - 1);
        deployment(row - 1, column);
        deployment(row, column + 1);
        deployment(row + 1, column);
        Toolkit.getDefaultToolkit().beep();
    }
    
    private static void deployment(int row, int column) {
        System.out.println("(" + row + ", " + column + ")");
    }
}

//Colored text is not supported by windows' terminal