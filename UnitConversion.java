import java.util.Scanner;

public class UnitConversion {
	public static void main (String[]args){
	double distanceMeters;
	double distanceFeet;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to be converted into feet: ");
	distanceMeters = scan.nextDouble();
	distanceFeet = distanceMeters*3.28084;
	//System.out.format("%.2f", distanceFeet);
	System.out.println(distanceMeters + "m is equivalent to " + String.format("%.2f", distanceFeet) + "ft !");

	}

}