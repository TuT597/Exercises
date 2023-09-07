import java.util.Scanner;

public class TheThingNamer3000 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		String c = "of Doom"; //Stores the given string in this case "of Doom"
		String d = "3000"; //Same as above
		
		System.out.println("What kind of thing are we talking about?");
		String a = input.nextLine(); //Stores whatever word or character if before the first whitepsace
		System.out.println("How would you describe it? Big? Azure? Tattered?");
		String b = input.nextLine(); //Stores whatever word or character if before the second whitepsace
		System.out.println("The " + b + " " + a + " " + c + " " + d + "!");
		/* The changes i've made include switching input scanner statements to next line inputs. 
		I've also removed the word "of" from the print statement since it was already in one of the variables. */
	}
}

//What else i did to improve readability is Put all the variable and object creation above the execution statements and separating them