import java.util.Scanner;

public class TheVariableShop2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Byte
		System.out.println("Enter a byte, this a number between -128 and 127:");
		String byte1 = scanner.nextByte();
		System.out.println("Your byte: " + byte1);
		
		//Short
		System.out.println("Enter a short, this a number between -32,768 and 32,767:");
		String short1 = scanner.nextShort();
		System.out.println("Your short: " + short1);
		
		//Int
		System.out.println("Enter an int, this a number between -2,147,483,648 and 2,147,483,647:");
		String int1 = scanner.nextInt();
		System.out.println("Your short: " + short1);
		
		
		
	}
}

		byte byte1 = -128;
		byte byte2 = 127;
		short short1 = -32768;
		short short2 = 32767;
		int int1 = -2147483648;
		int int2 = 2147483647;
		long long1 = -9223372036854775808l;
		long long2 = 9223372036854775807l;
		float float1 = 1.1234567f;
		double double1 = 1.123456789012345;
		boolean boolean1 = true;
		char char1 = '&';
		String text = "Hey!";
		String intro = "These are ";
		String intro2 = "This is a ";