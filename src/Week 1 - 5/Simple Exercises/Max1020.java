//Removed unnecessary return

public class Max1020 {
    public static void main(String[] args) {
        System.out.println(
            max1020(8, 12) + "\n" +
            max1020(14, 19) + "\n" +
            max1020(9, 21) + "\n" +
            max1020(12, 24) + "\n" +
            max1020(19, 3)
        );
    }
    
    private static int max1020(int x, int y){
        if (x >= 10 && x <= 20) {
            if (x > y || y > 20) return x;
        }
        
        if (y >= 10 && y <= 20) {
            if (y > x || x > 20) return y;
        }
        return 0;
    }
}