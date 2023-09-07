import java.util.Scanner;

public class DominionOfKings {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int duchyValue = 3;
        int provinceValue = 6;
        
        System.out.println("How many estates do you posess?");
        int estatePoints = scanner.nextInt();
        System.out.println("\nHow man duchies do you rule?");
        int duchyPoints = scanner.nextInt() * 3;
        System.out.println("\nHow many provinces do you rule?");
        int provincePoints = scanner.nextInt() * 6;
        System.out.println("\nYour total point value is: " + (estatePoints + duchyPoints + provincePoints));
    }
}