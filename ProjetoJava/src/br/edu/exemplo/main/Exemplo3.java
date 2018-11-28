package br.edu.exemplo.main;

import java.time.LocalDate;
import java.time.Month;

import br.edu.exemplo.entidade.empresa.Agenda;
import br.edu.exemplo.entidade.empresa.Gerente;
import br.edu.exemplo.entidade.empresa.Secretaria;
import br.edu.exemplo.entidade.empresa.Telefonista;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Diogo Ferrete");
		g.setDataNasc(LocalDate.of(1987, Month.AUGUST, 26));
		g.setSexo('M');
		g.setNrRegistro(102030);
		g.setSalario(10000);
		g.setArea("TI");
		
		Secretaria s = new Secretaria();
		s.setNome("Erica");
		s.setDataNasc(LocalDate.of(1990, Month.JANUARY, 01));
		s.setSexo('F');
		s.setNrRegistro(987654);
		s.setSalario(3000);
		s.setRamal(666);
		
		Telefonista t = new Telefonista();
		t.setNome("Fabia");
		t.setDataNasc(LocalDate.of(1990, Month.FEBRUARY, 28));
		t.setSexo('F');
		t.setNrRegistro(654321);
		t.setSalario(2500);
		t.setRamal(999);
		
		Agenda a = new Agenda();
		a.setLocal("Via varejo");
		a.setAssunto("Arquitetura de software");
		a.setData(LocalDate.of(2016, Month.SEPTEMBER, 6));
		
		s.getAgenda().add(a);
		
		g.setSecretaria(s);
		g.setTelefonista(t);
		
		System.out.println("Gerente : " + g);
		System.out.println("Secretaria : " + g.getSecretaria());
		System.out.println("Telefonista : " + g.getTelefonista());

	}

}
