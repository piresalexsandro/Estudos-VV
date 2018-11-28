
public class Funcionario {
	private String nomeFunc;
	private double salarioFunc;
	private double valorBonificado;
	
	public double getValorBonificado() {
		return valorBonificado;
	}
	public void setValorBonificado(double valorBonificado) {
		this.valorBonificado = valorBonificado;
	}
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	public double calculaBonificacao(){
		 return this.salarioFunc += salarioFunc * 0.1; 
	}
	
	public double valorBonificacao(){
		double valorBonificacao = this.salarioFunc * 0.1;
		 return valorBonificacao; 
	}
	
	public void mostraDados(){
		System.out.println("Nome Gerente..............: "    + getNomeFunc());
		System.out.println("Salario Gerente...........: R$ " + getSalarioFunc()); 
		System.out.println("Valor da Bonificacao......: R$ " + valorBonificacao()); 
	}
	
}
