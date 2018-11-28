package br.edu.exemplo;

public class Aluno extends Pessoa{
	private String matricula;
	private String serie;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}	
	public String toString(){
		return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Sexo: " + getSexo() + ", Matricula: " + matricula + ", Serie: " + serie;
	}
	
}
