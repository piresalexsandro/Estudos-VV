package br.com.udemy.curso;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	public static double price;
	public static double quantity;
	public static double valorEmReais;
	
	public static double valueConverted(double dollarPrice, double dollarQuantity) {
		dollarPrice += dollarPrice * IOF;
		double realValue = dollarPrice * dollarQuantity; 
		valorEmReais = realValue;
		return realValue;
	}
}
