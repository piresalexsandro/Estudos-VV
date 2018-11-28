package br.edu.exemplo2.entidades;

public class Secretaria extends Funcionarios{
	
	public Secretaria(){
		
	}
	
	public double calculaReajuste(){
		return getSalario() * 1.10;
	}

	public String toString(){
		return  super.toString();
	}			

}