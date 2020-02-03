public class SquareCalculator {
	public static void main (String[]args){

	int number = 1;

	for (int i=0; i<9; i++){
	int square = number*number;
	System.out.println("The square of " + number + " is: " + square);
	number++;
	}
	}
}