package financial;

public class Quotation {
	public static double CurrencyConverterDolarToReais (double dollarQuotation, double dollarValue) {
		return dollarQuotation * dollarValue * Tax.IOF;
	}
}
