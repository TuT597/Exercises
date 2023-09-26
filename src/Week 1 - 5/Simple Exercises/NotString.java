public class NotString {
    public static void main (String[] args){
        System.out.println(
            notString("hello there!") + "\n" +
            notString("not test")
        );
    }
    
    private static String notString(String input){
        String temp = input.toLowerCase();
        
        if (temp.startsWith("not")){
            return input;
        } else {
            return "not " + input;
        }
    }
}