import java.util.Scanner;

public class TheVariableShop2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Byte
		System.out.println("Enter a byte, this a number between -128 and 127:");
		byte byte1 = scanner.nextByte();
		System.out.println("Your byte: " + byte1);
		
		//Short
		System.out.println("Enter a short, this a number between -32,768 and 32,767:");
		short short1 = scanner.nextShort();
		System.out.println("Your short: " + short1);
		
		//Int
		System.out.println("Enter an int, this a number between -2,147,483,648 and 2,147,483,647:");
		int int1 = scanner.nextInt();
		System.out.println("Your int: " + int1);
		
		
        //Long
        System.out.println("Enter a long, this is a number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807:");
        long long1 = scanner.nextLong();
        System.out.println("Your long: " + long1);
        
        //Float
        System.out.println("Enter a float, this is a number with up to 7 decimals:");
        float float1 = scanner.nextFloat();
        System.out.println("Your float: " + float1);
        
        //Double
        System.out.println("Enter a double, this is a number with up to 15 decimals:");
        double double1 = scanner.nextDouble();
        System.out.println("Your double: " + double1);
	}
}