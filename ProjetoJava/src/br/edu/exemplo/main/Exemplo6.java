package br.edu.exemplo.main;

import java.util.Scanner;

import br.edu.exemplo.entidade.Impressora;

public class Exemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Impressora imp = new Impressora();
		Scanner scan = new Scanner(System.in);

		System.out.println("******************* EXEMPLO IF *******************");
		System.out.println("Digite o preco ");

		int preco = scan.nextInt();

		if (preco < 0) {
			System.out.println("O pre�o do produto n�o pode ser negativo " + preco);
		} else {
			System.out.println("Produto cadastrado com sucesso " + preco);
		}

		System.out.println('\n');
		System.out.println("******************* EXEMPLO FOR *******************");
		System.out.println("Digite quantas vezes o seu nome deve ser impresso: ");

		int qtdeVezes = scan.nextInt();

		for (int contador = 0; contador < qtdeVezes; contador++) {
			imp.imprimirVariavel(qtdeVezes, contador);
		}

		System.out.println('\n');
		System.out.println("****************** EXEMPLO WHILE ******************");
		int contador = 0;

		while (contador < 30) {
			int resto = contador % 4;
			if (resto == 0) {
				System.out.println("***PI");
			} else {
				System.out.println(contador);
			}
			contador++;
		}

		System.out.println('\n');
		System.out.println("****************** IMPRIME TRIANGULO ******************");
		for (int ast1 = 1; ast1 <= 5; ast1++) {
			System.out.println("*");
			if (ast1 != 5) {
				for (int ast2 = 0; ast2 < ast1; ast2++) {
					System.out.print("*");
				}
			}
		}

	}

}