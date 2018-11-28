package br.edu.exemplo2.entidades;

public class Gerente extends Funcionarios{
	private String area;
	// atravez da linha abaixo o gerente tem uma secretaria
	private Secretaria secretaria;

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public double calculaReajuste(){
		return getSalario() * 1.15;
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
	
	public String toString(){
		return  super.toString() + "Area: " + area;
	}		
	
}
