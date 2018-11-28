package br.edu.exemplo;

public class Professor extends Pessoa{
	private String matricula;
	private String materia;
	// fazendo com que aluno esteja dentro do professor
	private Aluno aluno;
	
		
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// tem que criar getters and setter de aluno alem do professor
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	// publico, tipo de retorno String, nome do metodo(toString), (parametros)
	public String toString(){
		return "Professor: Nome: " + getNome() + ", Idade: " + getIdade() + ", Sexo: " + getSexo() + 
			   ", Matricula: " + matricula + ", Materia: " + materia; // + "\n    Aluno: " + aluno ;  
	}
	
	
	
	
	
}
