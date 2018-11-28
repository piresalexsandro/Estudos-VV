package br.edu.exemplo.entidade.escola;

import br.edu.exemplo.entidade.Pessoa;

public class Aluno extends Pessoa {

	private String turma;

	public Aluno() {

	}

	public Aluno(String turma) {
		super();
		this.turma = turma;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return super.toString() + " turma=" + turma;
	}
	
	

}
