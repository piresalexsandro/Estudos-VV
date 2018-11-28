package br.edu.exemplo.main;

import java.time.LocalDate;
import java.time.Month;

import br.edu.exemplo.entidade.escola.Aluno;
import br.edu.exemplo.entidade.escola.Professor;

public class Exemplo2 {

	public static void main(String[] args) {

		// Cria professor
		Professor p = new Professor();
		p.setNome("Ferrete");
		p.setDataNasc(LocalDate.of(1987, Month.AUGUST, 26));
		p.setSexo('M');
		p.setMateria("Programação OO");

		// Cria aluno
		Aluno a = new Aluno();
		a.setNome("Ferrete Aluno");
		a.setDataNasc(LocalDate.of(1987, Month.AUGUST, 26));
		a.setSexo('M');
		a.setTurma("POO-1");

		//coloca o aluno criado no aluno esperado pelo professor
		p.setAluno(a);

		//imprime professor aluno
		System.out.println("Professor : " + p);
		System.out.println("Aluno : " + p.getAluno());
	}

}
