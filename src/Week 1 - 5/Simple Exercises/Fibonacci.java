public class Fibonacci {
    public static void main (String[] args) {
        int x = 1000;
        int a = 0;
        int b = 1;
        
        System.out.println(a);
        
        while (b < x){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;   
        }
    }
}