import java.lang.Math;

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
        int diff = 21;
        int number = Math.abs(x - diff);
        if (x > 21) return number * 2;
        return number;
    }
}