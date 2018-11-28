package br.edu.exemplo.entidade.zoo;

import br.edu.exemplo.entidade.Animal;

public class Leao  extends Animal{
	
	private static final String minhaEspecie = "LEAO";
	
	public Leao(){
		super(minhaEspecie, 0, null);
	}
		
	public Leao(int qtdPatas, String alimento){
		super(minhaEspecie, qtdPatas, alimento);
	}
	
	@Override
	public String produzirSom(){
		return "rugir !!!";
	}
	
}
