
public class TestaControleDePonto {

	public static void main(String[] args) {

		ControleDePonto cdp = new ControleDePonto();
		
		Gerentes g = new Gerentes();
		g.setMatricula(145874);

		Telefonista t = new Telefonista();
		t.setMatricula(9458);
		
		//cdp.registraEntrada(g);
		//cdp.registraEntrada(t);

		cdp.registraEntrada(g);
		cdp.registraEntrada(t);
		
		System.out.println();
		
		cdp.registraSaida(g);
		cdp.registraSaida(t);

	}

}
