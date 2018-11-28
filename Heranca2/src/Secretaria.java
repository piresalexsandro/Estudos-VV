
public class Secretaria extends Funcionario{

	private int ramal;

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public double valorBonificacao(){
		double valorBonificacao = getSalarioFunc() * 0.1;
		 return valorBonificacao; 
	}
	
	public void mostraDados(){
		System.out.println("Nome Telefonista..........: "    + getNomeFunc());
		System.out.println("Salario Telefonista.......: R$ " + getSalarioFunc());
		System.out.println("Ramal da Secretaria.......: "    + getRamal());
		System.out.println("Valor da Bonificacao......: R$ " + valorBonificacao()); 
	}
}
