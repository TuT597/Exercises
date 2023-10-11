public class Countdown {
    public static void main (String[] args) {
        countdown(10);
    }
    
    static void countdown(int k) {
        if (k > 0) {
            System.out.println(k);
            countdown(k - 1);
        } else {
            System.out.println("Countdown over");
        }
    }
}