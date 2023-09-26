public class MagicCannon {
    public static void main (String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("\u001B[35m\u001B[47mMEGA BLAST\u001B[0m");
                    
                } else {
                    System.out.println("\u001B[31mFire\u001B[0m");
                    
                }              
            } else if (i % 5 == 0) {
                System.out.println("\u001B[33mElectric\u001B[0m");
                
            } else {
                System.out.println("Normal");
            }
        } 
    }
}