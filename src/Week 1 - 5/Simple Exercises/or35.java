public class or35 {
    public static void main (String[] args) {
        System.out.println(
            or35(481) + "\n" + //should return false
            or35(999) + "\n" + //should return true
            or35(200)          //should return true
        );
    }
    
    private static boolean or35 (int x) {
        return (x % 3 == 0 || x % 5 == 0);
    }
    
}