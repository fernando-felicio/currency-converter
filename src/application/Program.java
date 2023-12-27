package application;
import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Value of the dollar today:");
		double valueDollarToday = scanner.nextDouble();
		
		System.out.println("How many dollars to buy?");
		double dollarsToBuy = scanner.nextDouble();
		
		double result = CurrencyConverter.totalConvert(valueDollarToday, dollarsToBuy);
		
		System.out.printf("Amount to be paid in Reais (R$) is: %.2f%n", result);
		
		
		scanner.close();
		
	}

}
