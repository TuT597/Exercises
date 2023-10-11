//Math function removed
//Ternary operator implemented for more concise code

public class Diff21 {
    public static void main (String[] args) {
        System.out.println(
            diff21(19) + "\n" +
            diff21(10) + "\n" +
            diff21(21) + "\n" +
            diff21(23)
        );
    }
    
    private static int diff21(int x) {
        int number = x <= 21 
            ? 21 - x 
            : (x - 21) * 2;
        return number;
    }
}