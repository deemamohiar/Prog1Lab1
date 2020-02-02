import java.util.Scanner;
public class Rectangle {
	public static void main (String[]args){
	double length;
	double width;
	double area;
	double perimeter;
	int i = 0;

	while (true){
	
	System.out.println("Let's calculate the area and perimeter of a rectangle.");
	System.out.println("Enter length: ");

	Scanner scan = new Scanner (System.in);

	length = scan.nextDouble();
	if (length == 0){
		break;
	}
	if (length < 0){
		System.out.println("Invalid entry. Please try again");
	}
	else{
		System.out.println("Enter width: ");
		width = scan.nextDouble();
	if (width == 0){
		break;
	}
	if(width < 0){
	System.out.println("Invalid entry. Please try again");
	}

	else {
	area = width*length;
	perimeter = 2*(length+width);

	System.out.println("Rectangle information: \nLength: " + length + "\nWidth: " + width
		+ "\nArea: " + area + "\nPerimeter: " + perimeter);
	}
	
	}
}
	
	}
}