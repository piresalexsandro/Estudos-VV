package entidade;

public class Conta {
	private double limite;
	private int nroConta;
	private double valorDeposito;
	private double valorSaque;
	private double saldo;
	private Cliente cliente;

	public Conta() {

	}

	public Conta(double limite, int nroConta) {
		this.limite = limite;
		this.nroConta = nroConta;
	}

	public Conta(double limite, int nroConta, double saldo, Cliente cliente) {
		this.limite = limite;
		this.nroConta = nroConta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public void deposita(double valorDeposito) {
		// TODO Auto-generated method stub
		this.valorDeposito += valorDeposito;
		this.saldo += valorDeposito;
	}

	public void saca(double valorSaque) {
		this.valorSaque -= valorSaque;
		this.saldo -= valorSaque;
	}

	public void imprimeExtrato() {
		System.out.println("Extrato padrao dos ultimos 15 dias ");
	}

	public void imprimeExtrato(int dias) {
		// this.imprimeExtrato(15);
		System.out.println("Extrato dos ultimos x dias.");
	}

	public double consultaSaldoDisponivel() {
		return this.saldo + this.limite;

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public double getSaldo() {
		return saldo + limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n" + "Numero da Conta: " + nroConta + "\n" + "Valor do Limite: " + limite + "\n"
				+ "Valor do Depositado: " + valorDeposito + "\n" + "Saldo: " + getSaldo();
	}
}
