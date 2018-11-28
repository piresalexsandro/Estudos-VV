package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class TestaContaBancaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria cb1 = new ContaBancaria();
		
		System.out.println("Enter account number: ");
		cb1.setNumeroDaConta(sc.nextInt());
		
		System.out.println("Enter account holder: ");
		cb1.setNomeDoCliente(sc.nextLine());
		
		System.out.println("Is there na initial deposit (y/n)? ");
		if (sc.nextLine() == "y"){
			System.out.println("Enter initial deposit value: ");
			cb1.Deposito(sc.nextDouble());
			System.out.println("Account data" + cb1);
			System.out.println();
		};
		
		System.out.println("Enter a deposit value: ");
		cb1.Deposito(sc.nextDouble());
		System.out.println("Update account data" + cb1);
		System.out.println();
		
        System.out.println("Enter a withdraw value: ");
		cb1.Saque(sc.nextDouble());
		System.out.println("Update account data:" + cb1);
			
//		ContaBancaria cb1 = new ContaBancaria(numeroDaConta, nomeDoCliente, valorDoDeposito, valorDoSaque, temDepositoIncial);
		
	}

}
