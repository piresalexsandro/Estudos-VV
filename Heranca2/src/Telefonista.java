
public class Telefonista extends Funcionario {
	
	private int estacaoDeTrabalho;

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}

	public double valorBonificacao(){
		double valorBonificacao = getSalarioFunc() * 0.1;
		 return valorBonificacao; 
	}
	
	public void mostraDados(){
		System.out.println("Nome Telefonista..........: "    + getNomeFunc());
		System.out.println("Salario Telefonista.......: R$ " + getSalarioFunc());
		System.out.println("Ramal da Secretaria.......: "    + getEstacaoDeTrabalho());
		System.out.println("Valor da Bonificacao......: R$ " + valorBonificacao()); 
	}
}
