package br.edu.exemplo.entidade;

public class Animal {

	private String nome;

	private String alimento;

	private int qtdPatas;


	public Animal() {

	}

	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public Animal(String nome,  int qtdPatas, String alimento) {
		super();
		this.nome = nome;
		this.alimento = alimento;
		this.qtdPatas = qtdPatas;
	}


	public String produzirSom() {
		return "BOO";
	}

	public String getAlimento() {
		return alimento;
	}

	public String setAlimento(String alimento) {
		return this.alimento = alimento;
	}

	public int getQtdPatas() {
		return qtdPatas;
	}

	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}

	public String getNome() {
		return nome;
	}

	/*public String setNome(String nome) {
		return this.nome = nome;
	}*/

}
