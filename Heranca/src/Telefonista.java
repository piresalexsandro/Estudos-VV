
public class Telefonista extends Funcionario{
	private int estacaoTrabalho;

	public Telefonista() {
	}

	public Telefonista(int estacaoTrabalho) {
		super();
		this.estacaoTrabalho = estacaoTrabalho;
	}

	public int getEstacaoTrabalho() {
		return estacaoTrabalho;
	}

	public void setEstacaoTrabalho(int estacaoTrabalho) {
		this.estacaoTrabalho = estacaoTrabalho;
	}
	
	@Override
	public String toString() {
		return "Telefonista = " + estacaoTrabalho;
	}
	
}
