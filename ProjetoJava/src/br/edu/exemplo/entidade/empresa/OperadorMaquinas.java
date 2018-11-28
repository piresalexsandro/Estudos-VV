package br.edu.exemplo.entidade.empresa;

public class OperadorMaquinas extends Funcionario{
	
	private String setor;
	
	public OperadorMaquinas() {
		super();
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public double reajustaSalario() {

		setSalario(getSalario() * 1.10);

		return getSalario();
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " setor=" + setor;
	}

}
