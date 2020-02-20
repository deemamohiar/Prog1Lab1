import java.util.*;
public class Name {
	public static void main (String[]args){

	String fullName;
	String firstName;
	String lastName;

	System.out.println("Enter your full name in the following format: \nlastName, firstName ");
	Scanner scan = new Scanner (System.in);
	fullName = scan.nextLine();
	fullName = fullName.replace(" ", "");

	int comma = fullName.indexOf(",");
	lastName = fullName.substring(0,comma);
	firstName = fullName.substring(comma+1);

	System.out.println("Your name is " + firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " 
		+ lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());


}
}