package br.com.udemy.curso;


import java.util.Locale;
import java.util.Scanner;


public class DolarQuotation {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("What's the dollar price: ");
		CurrencyConverter.price = input.nextDouble();
	
		
		System.out.printf("How many dollar will be bought? ");
		CurrencyConverter.quantity = input.nextDouble();
		
		CurrencyConverter.valueConverted(CurrencyConverter.price, CurrencyConverter.quantity);
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.valorEmReais);
	}
}
