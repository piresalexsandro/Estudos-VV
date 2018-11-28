
public class BankAccount {
	public int accountNum;
	public double accountBalance;
	public double accountLimit;
	
	public BankAgency bankAgency;
	
	public BankAccount(BankAgency bankAgency){
		this.bankAgency = bankAgency;
	}
	
	void deposita(double valorDep){
		this.accountBalance += valorDep;
	}
	
	void saca(double valorSaque){
		this.accountBalance -= valorSaque;
	}
	
	double consultaSaldoDisponivel(){
		return this.accountBalance + this.accountLimit;
	}
	
	void transfere(BankAccount contaDestino, double valorTransf){
		this.accountBalance -= valorTransf;
		contaDestino.accountBalance += valorTransf;
	}
	
}
