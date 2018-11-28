
public class TestClientAndCreditCard {

	public static void main(String[] args) {
		
		Client c = new Client();
		CreditCard cc = new CreditCard();	
		
		c.nome = "Madeline";
		c.codCli = 1980318;
		
		cc.cardNumber = "9856452174586523";
		cc.expirationDate = "18.09.2025";
		
		System.out.println("Credit Card Number: " + cc.cardNumber);
		System.out.println("Expiration Date...: " + cc.expirationDate);

		System.out.println("Client Name.......: " + c.nome);
		System.out.println("Client Code.......: " + c.codCli);
		
		
		cc.client = c;
		System.out.println("Client Name.......: " + cc.client.nome);
		System.out.println("Client Code.......: " + cc.client.codCli);
		
	}

}
