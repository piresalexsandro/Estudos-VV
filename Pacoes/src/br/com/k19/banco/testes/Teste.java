package br.com.k19.banco.testes;

import br.com.k19.banco.sistema.Conta;

public class Teste {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.deposita(1542.99);
		c.toString();
		//System.out.println(c.getSaldo());
	}

}
