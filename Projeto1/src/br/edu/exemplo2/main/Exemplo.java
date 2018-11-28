package br.edu.exemplo2.main;

// import devido as classes estarem em outro pacote
import java.time.LocalDate;
import br.edu.exemplo2.entidades.Gerente;
import br.edu.exemplo2.entidades.Secretaria;
import br.edu.exemplo2.entidades.Telefonista;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// vai construtor
		//
		Gerente g1 = new Gerente();
		g1.setNome("Alexsandro Pires");
		g1.setSexo("M");
		g1.setDataNasc(LocalDate.of(1980, 01, 30));
		g1.setNroRegistro(30011980);
		g1.setArea("Produção");
		g1.setSalario(12500.00);
		g1.calculaReajuste();
		
		Secretaria s1 = new Secretaria();
		s1.setNome("Sheron Menezes");
		s1.setSexo("F");
		s1.setDataNasc(LocalDate.of(1995, 12, 22));
		s1.setNroRegistro(22121995);
		s1.setSalario(4285.59);
		s1.calculaReajuste();
		// atribuição da secretaria ao gerente
		g1.setSecretaria(s1);
		
		Telefonista t1 = new Telefonista();
		t1.setNome("Cristiane Viana");
		t1.setSexo("F");
		t1.setDataNasc(LocalDate.of(1989, 06, 14));
		t1.setNroRegistro(14061989);
		t1.setRamal(3648);
		t1.calculaReajuste();
		s1.setSalario(1855.60);
		
		System.out.println(g1 + "\n" +"Salario Reajustado: " + g1.calculaReajuste());
		System.out.println("     Secretaria: " + g1.getSecretaria().toString());

	}
	
}
