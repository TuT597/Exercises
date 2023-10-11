//Reduced scope of x
//Removed duplicate return statement by placing it outside of the if

import java.lang.String;

public class Front22 {
    public static void main (String[] args){
        System.out.println(
            front22("a") + "\n" +
            front22("test") + "\n" +
            front22("kitten")
        );
    }
    
    private static String front22 (String input) {
        String temp = "";
        
        if (input.length() < 2) {
            int x = input.length();
            temp = input.substring(0, x);
        } else {
            temp = input.substring(0,2);
        }
        return temp + input + temp;
    }
}