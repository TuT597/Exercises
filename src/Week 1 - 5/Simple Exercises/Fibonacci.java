//Order or operations and formatting fixed

public class Fibonacci {
    public static void main (String[] args) {
        int x = 1000;
        int a = 0;
        int b = 1;
        
        while (b < x){
            int c = a + b;
            a = b;
            System.out.print(a + " ");
            b = c;   
        }
    }
}