
public class Conta {
	// atributos da conta
	int numero;
	double saldo;
	double limite;
	double disponivel;
	Cliente titular;
	
	// metodos da conta
	// metodo saca
	void saca(double quantidade){
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	// metodo deposita
	void deposita(double quantidade){
		this.saldo += quantidade; // += guarda em saldo o saldo + quantidade
	}
	
	// metodo transfere
	void transferePara(Conta destino, double valor){
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	
	// metodo total disponivel
	void saldoTotal(double valor){
		this.disponivel = this.saldo + this.limite;
	}
	
	// metodo com retorno
	boolean sacaretorno(double valor){
		if (this.saldo > valor){
			this.saldo = this.saldo - valor;
			return true;
		}
		else{
			return false;
		}
	}
}
