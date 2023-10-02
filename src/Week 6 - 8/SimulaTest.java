import java.util.Scanner;
import java.lang.String;

public class SimulaTest {
    
    private enum BoxState {
        OPEN,
        CLOSED,
        LOCKED
    }
    
    public static void main(String[] args) {
        System.out.println("Before you you find a box, you can open, close, lock and unlock the box.\n");
        
        useTheBox();
    }
    
    private static void useTheBox() {
        BoxState state = BoxState.CLOSED;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("The box is, " + state.toString().toLowerCase() + " What do you want to do? ");
            
            String boxAction = scanner.nextLine();
            
            System.out.println();
            
            switch (boxAction) {
                case "open": 
                    if (state == BoxState.CLOSED) {
                        System.out.println("You open the box.");
                        state = BoxState.OPEN;
                    } else {
                        System.out.println("Box can't be opened in it's current state.");
                    }
                    break;
                case "close":
                    if (state == BoxState.OPEN) {
                        System.out.println("You close the box.");
                        state = BoxState.CLOSED;
                    } else {
                        System.out.println("Box can't be closed in it's current state.");
                    }
                    break;
                case "lock":
                    if (state == BoxState.CLOSED) {
                        System.out.println("You lock the box.");
                        state = BoxState.LOCKED;
                    } else {
                        System.out.println("Box can't be locked in it's current state.");
                    }
                    break;
                case "unlock":
                    if (state == BoxState.LOCKED) {
                        System.out.println("You unlock the box.");
                        state = BoxState.CLOSED;
                    } else {
                        System.out.println("Box can't be unlocked in it's current state.");
                    }
                    break;
            }
            
            System.out.println();
        } while (true);
    }
}
    