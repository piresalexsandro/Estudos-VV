
public class TestAccount {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		
		ba1.accountNum = 252576;
		ba1.accountBalance = 4245.69;
		ba1.accountLimit = 16989.41;

		BankAccount ba2 = new BankAccount();
		
		ba2.accountNum = 486584;
		ba2.accountBalance = 1485.25;
		ba2.accountLimit = 8325.44;
		
		System.out.println("Numero da Conta1: " + ba1.accountNum + "\nSaldo da Conta1: " + ba1.accountBalance + "\nLimite da Conta1: " + ba1.accountLimit);
		System.out.println();
		System.out.println("Numero da Conta2: " + ba2.accountNum + "\nSaldo da Conta2: " + ba2.accountBalance + "\nLimite da Conta2: " + ba2.accountLimit);
	}

}
