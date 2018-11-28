package entities;

public class Pensao {
	private String nome;
	private String email;
	private int quarto;

	public Pensao(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto + 1;
	}

	public String toString() {
		int x = 1;
		this.quarto += x;
		return "Quarto: " + this.quarto + ", Locatario: " + this.nome + ", Email: " + this.email;
	}
}