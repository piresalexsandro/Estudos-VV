package entidade;

public class Cliente extends Pessoa {
	private int codCli;
	private Endereco endereco;

	public Cliente() {

	}

	public Cliente(String nome, int idade, String sexo, int codCli, Endereco endereco) {
		this.codCli = codCli;
		this.endereco = endereco;
	}

	public int getCodCli() {
		return codCli;
	}

	public void setCodCli(int codCli) {
		this.codCli = codCli;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome Cliente: " + getNome() + "\n" + "Codigo do Cliente: " + codCli + endereco;
	}

}
