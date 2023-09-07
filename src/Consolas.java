import java.util.Scanner;

public class Consolas {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bread is ready!");
		System.out.println("Who is the bread for?");
		String name = scanner.nextLine();
		System.out.println("Noted: " + name + " got bread.");
	}
}