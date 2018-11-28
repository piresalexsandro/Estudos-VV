
public abstract class Conta {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString(){
		return "O saldo da conta e de R$" + this.getSaldo();
	}
}
