public class PosNeg {
    public static void main (String[] args) {
        System.out.println(
            posNeg(-1, 1, false) + "\n" +  //true
            posNeg(1, -1, false) + "\n" +  //true
            posNeg(1, 1, false) + "\n" +   //false
            posNeg(-1, -1, false) + "\n" + //false
            posNeg(-1, -1, true)           //true
        );
    }
    
    public static boolean posNeg(int x, int y, boolean bothNeg) {
        if (!bothNeg) {
            return ((x > 0 && y < 0) || (x < 0 && y > 0));
        } else {
            return (x < 0 && y < 0);
        }
    }
}