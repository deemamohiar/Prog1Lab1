import java.util.Scanner;
public class GetSecondWordEntered {
	public static void main (String[]args){

Scanner scan = new Scanner (System.in);

System.out.println("Enter full name: ");
scan.next();

System.out.println("Your family name is " + scan.next());

	}
}