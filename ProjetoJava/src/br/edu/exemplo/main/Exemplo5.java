package br.edu.exemplo.main;

import br.edu.exemplo.entidade.zoo.Leao;
import br.edu.exemplo.entidade.zoo.Urso;
import br.edu.exemplo.entidade.zoo.Elefante;
import br.edu.exemplo.entidade.zoo.Bufalo;
import br.edu.exemplo.negocio.Zoo;

public class Exemplo5 {

	public static void main(String[] args) {

		Bufalo bufalo = new Bufalo(4, "folhas");
		
		Leao leao = new Leao(4, "carne");
		
		Elefante elefante = new Elefante(4, "ervas e frutas");
		
		Urso urso = new Urso(4, "carne, folhas e peixes");
		
		Zoo zoo = new Zoo();

		System.out.println("******************  ANIMAL QUE FOI CUTUCADO *****************");
		
		zoo.cutucarAnimal(bufalo); 
		zoo.cutucarAnimal(elefante);
		zoo.cutucarAnimal(leao);
		zoo.cutucarAnimal(urso);
		
		System.out.println("\n");
		System.out.println("****************** QUAL O ALIMENTO DO ANIMAL ****************");
		
		zoo.alimentarAnimal(bufalo);
		zoo.alimentarAnimal(elefante);
		zoo.alimentarAnimal(leao);
		zoo.alimentarAnimal(urso);
		
		System.out.println("\n");
		System.out.println("********************** CADASTRAR ANIMAL **********************");
		
		zoo.cadastrarAnimal(bufalo);
		zoo.cadastrarAnimal(elefante);
		zoo.cadastrarAnimal(leao);
		zoo.cadastrarAnimal(urso);
		
	}
}
