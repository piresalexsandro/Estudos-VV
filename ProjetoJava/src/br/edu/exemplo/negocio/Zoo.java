package br.edu.exemplo.negocio;

import java.util.ArrayList;
import java.util.List;

import br.edu.exemplo.entidade.Animal;

public class Zoo {
	
	List<Animal> animals = new ArrayList<>();

	//Animal e a classe que esta sendo esperada o 'a' e o apelido para esta classe
	public void cutucarAnimal(Animal a) {
		System.out.println("Som do animal quando cutucado: " + a.produzirSom());
		
	}
	
	// void pq imprmime na propria classe ou seja nao retorna
	public void alimentarAnimal(Animal a){
		System.out.println("O " + a.getNome() + " é alimentado com " + a.getAlimento() + ".");
		
	}
	
	public void cadastrarAnimal(Animal a){
		animals.add(a);
		System.out.println("Animal cadastrado: " + a.getNome());
		
	}
	
}
