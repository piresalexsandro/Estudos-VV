  package br.edu.exemplo2.main;

import java.time.LocalDate;

import br.edu.exemplo2.entidades.Empresa;
import br.edu.exemplo2.entidades.Gerente;

public class Exemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e = new Empresa();
		
		Gerente g1 = new Gerente();
		g1.setNome("Carlos de Andrade");
		g1.setSexo("M");
		g1.setDataNasc(LocalDate.of(1981, 04, 25));
		g1.setNroRegistro(19810425);
		g1.setArea("Negocios");
		g1.setSalario(13880.00);
		g1.calculaReajuste();
		
		System.out.println(g1);
		
	}

}
