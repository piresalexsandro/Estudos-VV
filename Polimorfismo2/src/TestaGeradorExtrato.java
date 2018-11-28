
public class TestaGeradorExtrato {

	public static void main(String[] args) {
		
		GeradorExtrato gerador = new GeradorExtrato();
		
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(1250.99);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(17385.55);
		
		gerador.imprimeExtratoBasico(cp);
		gerador.imprimeExtratoBasico(cc);

	}

}
