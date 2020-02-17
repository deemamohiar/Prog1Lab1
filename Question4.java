import java.util.*;
public class Question4 {
	
	public static void main (String[]args){

	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your full name: ");
	String name = scan.nextLine();
	int space = name.indexOf(" ");
	String firstName = name.substring(0,space);
	String lastName = name.substring(space+1);
	System.out.println("First name is: " + firstName);
	System.out.println("Last name is: " + lastName);


	}

}