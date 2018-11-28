package br.edu.exemplo.entidade.zoo;

import br.edu.exemplo.entidade.Animal;

public class Urso extends Animal{
	
	private static final String minhaEspecie = "URSO";
	
	public Urso(){
		super(minhaEspecie, 0, null);
	}
		
	public Urso(int qtdPatas, String alimento){
		super(minhaEspecie, qtdPatas, alimento);
	}
	
	@Override
	public String produzirSom(){
		return "som do urso !!!";
	}
	


}
