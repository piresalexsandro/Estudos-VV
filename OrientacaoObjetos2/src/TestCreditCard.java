
public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard cc1 = new CreditCard("8345954814227854", "31.12.2025"); // <<= usando construtores
		//cc1.cardNumber = "8345954814227854";
		//cc1.expirationDate = "31.12.2025";
		System.out.println("Numero do Cart�o: " + cc1.cardNumber);
		System.out.println("Data de Validade: " + cc1.expirationDate);
	}

}
