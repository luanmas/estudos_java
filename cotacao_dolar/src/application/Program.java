package application;

import java.util.Locale;
import java.util.Scanner;

import financial.Quotation;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? ");
		double dollarQuotation = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarValue = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", Quotation.CurrencyConverterDolarToReais(dollarQuotation, dollarValue));
		
		sc.close();
	}

}
