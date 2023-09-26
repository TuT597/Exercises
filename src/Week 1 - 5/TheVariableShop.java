public class TheVariableShop {
	public static void main (String[] args) {
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
		
		System.out.println(intro + "bytes " + byte1 + " " + byte2);
		System.out.println(intro + "shorts " + short1 + " " + short2);
		System.out.println(intro + "ints " + int1 + " " + int2);
		System.out.println(intro + "longs " + long1 + " " + long2);
		System.out.println(intro2 + "float " + float1);
		System.out.println(intro2 + "double " + double1);
		System.out.println(intro2 + "boolean " + boolean1);
		System.out.println(intro2 + "char " + char1);
	}
}