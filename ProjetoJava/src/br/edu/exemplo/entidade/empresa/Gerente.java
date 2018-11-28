package br.edu.exemplo.entidade.empresa;

public class Gerente extends Funcionario {

	private String area;
	private Secretaria secretaria;
	private Telefonista telefonista;
	private OperadorMaquinas operadorMaquinas;
	
	public Gerente() {

	}

	public Gerente(String area) {
		super();
		this.area = area;
	}

	public Gerente(String area, Secretaria secretaria, Telefonista telefonista, OperadorMaquinas operadorMaquinas) {
		super();
		this.area = area;
		this.secretaria = secretaria;
		this.telefonista = telefonista;
		this.operadorMaquinas = operadorMaquinas;
	}

	@Override
	public double reajustaSalario() {

		setSalario(getSalario() * 1.15);

		return getSalario();
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}

	public Telefonista getTelefonista() {
		return telefonista;
	}

	public void setTelefonista(Telefonista telefonista) {
		this.telefonista = telefonista;
	}

	
	public OperadorMaquinas getOperadorMaquinas() {
		return operadorMaquinas;
	}

	public void setOperadorMaquinas(OperadorMaquinas operadorMaquinas) {
		this.operadorMaquinas = operadorMaquinas;
	}

	@Override
	public String toString() {
		return super.toString() + " area=" + area;
	}

}
