/* In this exercise I simply display the current date and time */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayTime {
    public static void main(String[] args) {
        //Given Solution
        System.out.printf("Current Date time: %tc", System.currentTimeMillis());

       /*  My Solution
       LocalDateTime myObj = LocalDateTime.now();

       DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd hh:mm:ss yyyy");

       String formattedDate = myObj.format(myFormatObj);
       System.out.println(formattedDate);
       */

    }
}