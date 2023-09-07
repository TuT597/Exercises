import java.util.Scanner;
import java.awt.Toolkit;

public class DefenseOfConsolas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Target row?");
        int row = scanner.nextInt();
        System.out.println("Target column?");
        int column = scanner.nextInt();
        
        int deploy1c = column - 1;
        int deploy2r = row - 1;
        int deploy3c = column + 1;
        int deploy4r = row + 1;
        
        System.out.println("\n\u001B[31m FORMATION!");
        System.out.println("(" + row + ", " + deploy1c + ")");
        System.out.println("(" + deploy2r + ", " + column + ")");
        System.out.println("(" + row + ", " + deploy3c + ")");
        System.out.println("(" + deploy4r + ", " + column + ")");
        Toolkit.getDefaultToolkit().beep();
    }
}

//Colored text is not supported by windows' terminal