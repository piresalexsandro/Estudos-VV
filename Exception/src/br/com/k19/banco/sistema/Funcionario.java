package br.com.k19.banco.sistema;

public class Funcionario {
	private double salario = 4556.99;
	
	public void aumentaSalario(double valorAumento){
		if (valorAumento > 0){
		this.salario += valorAumento;
		System.out.println("Salario atual e de R$ " + this.salario);
		} else {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		}
	}
}
