public class EvenSumOfDigits {
    public static void main (String[] args) {
        for (int a = 100; a < 150; a++) {
            int x = a / 100;                        //extract first number
            int y = (a % 100) / 10;      //extract second number
            int z = a % 10;                         //extract third number
            int sum = x + y + z;                    //add them together

            if (sum % 2 == 0) System.out.println(a);
        }

    }
}