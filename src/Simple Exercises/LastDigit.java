public class LastDigit {
    public static void main (String[] args) {
        System.out.println(
            lastDigit(1, 48) + "\n" +
            lastDigit(24, 3874) + "\n" +
            lastDigit(8, 78)
        );
    }
    
    private static boolean lastDigit (int x, int y){
        return (x % 10 == y % 10);
    }
}