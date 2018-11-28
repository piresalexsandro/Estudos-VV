package br.edu.exemplo2.entidades;

// uma classe LocalDate dentro da classe Pessoa
// ou seja LocalDate compoe a classe Pessoa
import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String sexo;
	private LocalDate dataNasc;
	
	// construtor vazio
	public Pessoa(){
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String toString(){
		return "Nome: " + getNome() + "/ Sexo: " + getSexo() + 
		       "/ Data de Nascimento: " + getDataNasc() + "/ ";
	}
	
}
