package br.edu.exemplo.entidade.zoo;

import br.edu.exemplo.entidade.Animal;

public class Elefante  extends Animal{
	
	private static final String minhaEspecie = "ELEFANTE";
	
	public Elefante(){
		super(minhaEspecie, 0, null);
	}
		
	public Elefante(int qtdPatas, String alimento){
		super(minhaEspecie, qtdPatas, alimento);
	}
	
	@Override
	public String produzirSom(){
		return "bramir !!!";
	}
	
}
