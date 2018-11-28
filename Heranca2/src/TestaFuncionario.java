
public class TestaFuncionario {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNomeFunc("Sebastiana Nogueira");
		g.setSalarioFunc(6500.0);
		g.setSenhaGer("@#98&&");
		g.setUsuarioGer("snogue");
		g.valorBonificacao();
		g.calculaBonificacao();
		g.mostraDados();
		System.out.println();
		
		Telefonista t = new Telefonista();
		t.setNomeFunc("Marlene Pires");
		t.setSalarioFunc(1814.0);
		t.setEstacaoDeTrabalho(1809);
		t.valorBonificacao();
		t.calculaBonificacao();
		t.mostraDados();
		System.out.println();
				
		Secretaria s = new Secretaria();
		s.setNomeFunc("Dolores Ventura");
		s.setSalarioFunc(2115.0);
		s.setRamal(1425);
		s.valorBonificacao();
		s.calculaBonificacao();
		s.mostraDados();
		System.out.println();

		/*
		System.out.println("----------------------  Gerente ----------------------");
		System.out.println("Nome Gerente..............: "    + g.getNomeFunc());
		System.out.println("Salario Gerente...........: R$ " + g.getSalarioFunc()); 
		System.out.println("Usuario Gerente...........: "    + g.getUsuarioGer());
		System.out.println();
		
		System.out.println("---------------------- Telefonista -------------------");
		System.out.println("Nome Telefonista..........: "    + t.getNomeFunc());
		System.out.println("Salario Telefonista.......: R$ " + t.getSalarioFunc());
		System.out.println("Estacao de Trabalho.......: "    + t.getEstacaoDeTrabalho());
		System.out.println();
		
		System.out.println("---------------------- Secretaria --------------------");
		System.out.println("Nome Telefonista..........: "    + s.getNomeFunc());
		System.out.println("Salario Telefonista.......: R$ " + s.getSalarioFunc());
		System.out.println("Ramal da Secretaria.......: "    + s.getRamal());
		*/
		
	}

}
