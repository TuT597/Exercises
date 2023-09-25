public class SleepIn {
    public static void main (String[] args) {
        System.out.println(
            sleepIn(true, false) + "\n" +
            sleepIn(false, true) + "\n" +
            sleepIn(false, false) + "\n" +
            sleepIn(true, true)
        );
    }
    
    private static boolean sleepIn (boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
}