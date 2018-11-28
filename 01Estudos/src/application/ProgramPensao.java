package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensao;
import java.util.Scanner;

public class ProgramPensao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Pensao[] vect = new Pensao[10];

		System.out.print("Quantos quartos ser�o alugados: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			int x = 1;
			x += i;
			System.out.print("Nome do locatario " + x + ": ");
			String nome = sc.nextLine();
			System.out.print("Email do locatario " + x + ": ");
			String email = sc.nextLine();
			System.out.print("Numero do quarto " + x + ": ");
			int quarto = sc.nextInt();
			vect[quarto -= 1] = new Pensao(nome, email, quarto);
		}
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
