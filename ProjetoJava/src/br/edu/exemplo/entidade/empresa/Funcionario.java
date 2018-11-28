package br.edu.exemplo.entidade.empresa;

import br.edu.exemplo.entidade.Pessoa;

public class Funcionario extends Pessoa {

	private long nrRegistro;

	private double salario;

	public Funcionario() {

	}

	public Funcionario(long nrRegistro, double salario) {
		super();
		this.nrRegistro = nrRegistro;
		this.salario = salario;
	}
	
	public double reajustaSalario(){
		
		salario = salario * 1.05;
		
		return salario;
	}

	public long getNrRegistro() {
		return nrRegistro;
	}

	public void setNrRegistro(long nrRegistro) {
		this.nrRegistro = nrRegistro;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + " nrRegistro=" + nrRegistro + ", salario=" + salario;
	}
	
}
