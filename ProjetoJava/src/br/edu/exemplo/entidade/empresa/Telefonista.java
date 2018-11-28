package br.edu.exemplo.entidade.empresa;

public class Telefonista extends Funcionario {

	private int ramal;

	public Telefonista() {

	}

	public Telefonista(int ramal) {
		super();
		this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		return super.toString() + " ramal=" + ramal;
	}

}
