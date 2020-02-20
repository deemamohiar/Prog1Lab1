import java.util.*;
public class BMI {
	
public static void main (String[]args){
	
double weight;
double height;
double BMI;
Scanner scan = new Scanner(System.in);
System.out.println("Enter your weight in pounds:");
weight = scan.nextDouble() * 0.45;

System.out.println("Enter your height in feet: ");
height = scan.nextDouble() * 0.3;

BMI = weight/(Math.pow(height,2));

System.out.printf("**You weigh " + weight + "kg**\n**You are " + height + "m tall**\n**Therefore, your BMI is: %.2f",BMI);
System.out.print("**");

}
}