package entidade;

public class Agencia {
	private int nroAgencia;
	private Conta conta;
	private Cliente cliente;

	public Agencia() {
	}

	public Agencia(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Agencia(Conta conta) {
		super();
		this.conta = conta;
	}

	public Agencia(int nroAgencia, Conta conta, Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNroAgencia() {
		return nroAgencia;
	}

	public void setNroAgencia(int nroAgencia) {
		this.nroAgencia = nroAgencia;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Agencia: " + nroAgencia + cliente;
	}

}
