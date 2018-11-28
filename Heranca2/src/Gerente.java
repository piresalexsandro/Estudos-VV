
public class Gerente extends Funcionario {
	private String usuarioGer;
	private String senhaGer;
	

	@Override
	public double valorBonificacao(){
		return this.getValorBonificado();
	}
	
	public double calculaBonificacao(){
		// CRIAR ATRIBUTO PARA RECEBER O SALARIO + O CALCULCULO E SETAR ESTE NO RETURN
		double salarioBonificado = this.getSalarioFunc() * 0.6 + 100;
		salarioBonificado += this.getSalarioFunc();
		
		// aproveitar a escrita do metodo para receber o valor da bonificação sobre o salario
		double valorBonificacao = salarioBonificado - this.getSalarioFunc();
		setValorBonificado(valorBonificacao);
		
		setSalarioFunc(salarioBonificado);
		return this.getSalarioFunc();
	}

	public void mostraDados(){
		System.out.println("Nome Gerente..............: "    + getNomeFunc());
		System.out.println("Salario Gerente...........: R$ " + getSalarioFunc()); 
		System.out.println("Valor da Bonificacao......: R$ " + getValorBonificado()); 
		System.out.println("Usuario Gerente...........: "    + getUsuarioGer());
	}

	public String getUsuarioGer() {
		return usuarioGer;
	}
	public void setUsuarioGer(String usuarioGer) {
		this.usuarioGer = usuarioGer;
	}
	
	public String getSenhaGer() {
		return senhaGer;
	}
	
	public void setSenhaGer(String senhaGer) {
		this.senhaGer = senhaGer;
	}
	
	
}
