package br.edu.exemplo.entidade;

import java.time.LocalDate;

public class Pessoa {

	private String nome;

	private LocalDate dataNasc;

	private char sexo;

	//Construtor padr�o, possibilita a cria��o de um objeto sem maiores informa��es.
	public Pessoa() {
		
	}

	//Construtor opcional, cria um objeto com determinadas informa��es (ou particularidades) j� definidas.
	public Pessoa(String nome, LocalDate dataNasc, char sexo) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", dataNasc=" + dataNasc + ", sexo="
				+ sexo ;
	}
	
	

}
