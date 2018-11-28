
public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard cc1 = new CreditCard();
		cc1.cardNumber = "8345954814227854";
		cc1.expirationDate = "31.12.2025";
		System.out.println("Numero do Cartão: " + cc1.cardNumber + "\nData de Validade: " + cc1.expirationDate);
	}

}
