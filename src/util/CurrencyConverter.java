package util;

public class CurrencyConverter {
	
	public static final double TAX_CONVERT = 0.06;
	
	public static double totalConvert(double valueDollarToday, double dollarsToBuy) {
		return valueDollarToday * dollarsToBuy * (1.0 + TAX_CONVERT);
	}

}
