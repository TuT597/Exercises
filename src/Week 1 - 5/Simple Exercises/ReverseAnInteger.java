public class ReverseAnInteger {
    public static void main (String[]args) {
        int number = 1234567890;
        reverse(number);  
    }
    
    public static void reverse(int input) {
        int a = 10;
        int b = input;
        
        for (int x = 0; x < Integer.toString(input).length(); x++) {
            int c = b % a;
            System.out.print(c);
            b /= a;
        }
    }
}