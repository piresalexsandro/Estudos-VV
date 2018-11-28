package main;

//import java.util.Set;

import entidade.Gerente;

public class TestaGerente {

	public static void main(String[] args) {

			Gerente ger = new Gerente();
			ger.setNome("Natanael Abdala Mansur");
			ger.setSalario(1500.10);
			
			ger.aumenteSalario();
			
			System.out.println(ger.toString());
	}
}
