package br.edu.exemplo.entidade.escola;

import br.edu.exemplo.entidade.Pessoa;

public class Professor extends Pessoa {

	private String materia;

	private Aluno aluno;

	public Professor() {

	}

	public Professor(String materia) {
		super();
		this.materia = materia;
	}

	public Professor(String materia, Aluno aluno) {
		super();
		this.materia = materia;
		this.aluno = aluno;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return super.toString() + " materia=" + materia + ", aluno:  " + aluno;
	}
	
	

}
