
public class TestAgency {

	public static void main(String[] args) {
		
		BankAgency ba1 = new BankAgency(3098); //<= utilizando construtores
		//ba1.agencyNum = 3098;
		
		BankAgency ba2 = new BankAgency(7821);
		//ba2.agencyNum = 7821;
		
		System.out.println("Numero da Agencia 1: " + ba1.agencyNum);
		System.out.println("Numero da Agencia 2: " + ba2.agencyNum);
	}

}
