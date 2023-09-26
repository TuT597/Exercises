public class Countdown {
    public static void main (String[] args) {
        sum(10);
    }
    
    static void sum(int k) {
        if (k > 0) {
            System.out.println(k);
            sum(k - 1);
        } else {
            System.out.println("Countdown over");
        }
    }
}