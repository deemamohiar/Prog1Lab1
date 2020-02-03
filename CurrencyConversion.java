public class CurrencyConversion {
	public static void main (String[]args){
	double amountCAD = 65;
	double amountUSD = amountCAD*0.76;
	double amountEUR = amountCAD*0.68;
	String euroSign = "\u20ac";

System.out.println(amountCAD + " CAD$ = \n" + amountUSD + " USD$ \n" + amountEUR + euroSign + " Euros");

	}
}