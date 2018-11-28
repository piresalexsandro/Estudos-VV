
public class TestaGeradorDeExtrado {

	public static void main(String[] args) {
		GeradorDeExtrato gde = new GeradorDeExtrato();
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(14500.50);
		
		ContaCorrente cc = new ContaCorrente();
		cc.setLimiteDeCerdito(22551.99);
		
		gde.imprimeExtratoBasico(cp);
		gde.imprimeExtratoBasico(cp);
	}

}
