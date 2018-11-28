import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

public class TestAccount {

	public static void main(String[] args) {
		
		BigDecimal bd = new BigDecimal(BigDecimal.ZERO.toString());
		bd.setScale(2, RoundingMode.HALF_DOWN);
		
		BankAgency bankAgency1 = new BankAgency(1111);
		BankAccount ba1 = new BankAccount(bankAgency1);
		
		ba1.accountNum = 252576;
		ba1.accountBalance = 4245.69;
		ba1.accountLimit = 16989.41;

		BankAgency bankAgency2 = new BankAgency(2222);
		BankAccount ba2 = new BankAccount(bankAgency2);
		
		ba2.accountNum = 486584;
		ba2.accountBalance = 1485.25;
		ba2.accountLimit = 8325.44;
		
		// metodo deposita valor na conta
		//ba1.deposita(64.31);
		//ba2.deposita(14.75);
		
		// metodo saca valor da conta
		//ba1.saca(1600.0);
		//ba2.saca(99.99);
		
		// Armazenando a resposta de um método em uma variável
		//double saldoDisponivel = ba1.consultaSaldoDisponivel();    
		
		// metodo transfere valor da conta
		ba1.transfere(ba2, 245.69);

		DecimalFormat decimalFormat= new DecimalFormat("######.00");
		decimalFormat.setCurrency(Currency.getInstance(Locale.US));

		//System.out.println("Numero da Agencia1........: " + bankAgency1.agencyNum);
		//System.out.println("Numero da Conta...........: " + ba1.accountNum);
		System.out.println("Saldo da Conta1.............: R$ " + decimalFormat.format(ba1.accountBalance));
		//System.out.println("Limite da Conta...........: " + ba1.accountLimit);
		//System.out.println("Saldo disponivel na conta1: " + saldoDisponivel);
		
		System.out.println();
		
		//System.out.println("Numero da Agencia2........: " + bankAgency2.agencyNum);
		//System.out.println("Numero da Conta2..........: " + ba2.accountNum);
		System.out.println("Saldo da Conta2.............: R$ " + decimalFormat.format(ba2.accountBalance));
		//System.out.println("Limite da Conta2..........: " + ba2.accountLimit);
		//System.out.println("Saldo disponivel na conta2: " + ba2.consultaSaldoDisponivel());
	}

}
