package application;
import java.util.Locale;
import java.util.Scanner;


public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Value of the dollar today:");
		double valueDollarToday = scanner.nextDouble();
		
		System.out.println("How many dollars to buy?");
		double dollarsToBuy = scanner.nextDouble();
		
		
		scanner.close();
		
	}

}
