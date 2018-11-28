
public class Conta {
	private double saldo;
	private int numero;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString(){
		return "O saldo da conta " + this.numero + " é de R$" + this.saldo;
	}
	
	public String geraDescricao(){
		return "O saldo da conta " + this.numero + " é de R$" + this.saldo;
	}
	
	
	
}
