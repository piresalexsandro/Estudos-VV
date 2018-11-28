package main;

import entidade.Agencia;
import entidade.CartaoCredito;
import entidade.Cliente;
import entidade.Conta;
import entidade.Endereco;

public class Executora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco end1 = new Endereco("Av. Paulista", "1548 - 15º and - Bl 4", "Jardins", "SP", "03421-658");

		Cliente cli1 = new Cliente("Antonio da Silva", 35, "M", 151112, end1);

		Conta ct1 = new Conta(15481.99, 81079, 2458.86, cli1);

		CartaoCredito cc1 = new CartaoCredito("5411152190178537", "04/2020", cli1);

		Agencia ag1 = new Agencia(3098, ct1, cli1);

		System.out.println(ag1);

		ct1.imprimeExtrato(15);
	}

}
