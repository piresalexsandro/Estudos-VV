package br.edu.exemplo2.entidades;

public class Funcionarios extends Pessoa{
	private int nroRegistro;
	private double salario;
	
	public Funcionarios(){
		
	}

	public double calculaReajuste(){
		return salario * 1.05;
	}
	
	public int getNroRegistro() {
		return nroRegistro;
	}

	public void setNroRegistro(int nroRegistro) {
		this.nroRegistro = nroRegistro;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString(){
		return super.toString() +  "Numero do Registro: " + getNroRegistro() + "/ Salario: " + getSalario() + "/ ";

	}
}
