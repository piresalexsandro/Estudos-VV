package br.edu.exemplo.entidade.zoo;

import br.edu.exemplo.entidade.Animal;

public class Bufalo extends Animal{
	
	private static final String minhaEspecie = "BUFALO";
	
	public Bufalo(){
		super(minhaEspecie, 0, null);
	}
		
	public Bufalo(int qtdPatas, String alimento){
		super(minhaEspecie, qtdPatas, alimento);
	}
	
	@Override
	public String produzirSom() {
		return "mugir !!!";
	}

}
