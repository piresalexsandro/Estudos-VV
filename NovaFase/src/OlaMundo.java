
public class OlaMundo {
	public static void main(String[] args){
		String dataDeNascimento = "18/09/1981";

		System.out.println("Ola mundoooo!!");
		System.out.println();

		System.out.println("Data de nascimento: "+ dataDeNascimento);
		System.out.println();

		int soma = 1 + 1;
		System.out.println("Soma = " + soma);
		int subtracao = 10 - 4;
		System.out.println("Subtracao = " + subtracao);
		int multiplicacao = 3 * 12;
		System.out.println("Multiplicacao = " + multiplicacao);
		int divisao = 36 / 4;
		System.out.println("Divisao = " + divisao);
		System.out.println();
		
		int x = 7;
		//observando que a partir do primeiro resultado e feito o restante caso queira
		// trabalhar sempre com x valendo 7 devemos iniciar a variavel.
		x = x + 3;
		System.out.println("Resultado de x: "+ x);
		x = x - 2;
		System.out.println("Resultado de x: "+ x);
		x = x * 3;
		System.out.println("Resultado de x: "+ x);
		x = x / (6 - 2 + (3*5)/(16-1));
		System.out.println("Resultado de x: "+ x);
		System.out.println();
		
		//Os operadores de atribuição são
		int valor = 1;
		System.out.println("Valor: "+ valor);
		valor += 2;
		System.out.println("Resultado de valor: "+ valor);
		valor -= 1;
		System.out.println("Resultado de valor: "+ valor);
		valor *= 4;
		System.out.println("Resultado de valor: "+ valor);
		valor /= 2;
		System.out.println("Resultado de valor: "+ valor);
		System.out.println();
				
		boolean t = false;
		t = valor ==  4;
		System.out.println("Valor e igual a 4? "+ t);
		t = valor !=  5;
		System.out.println("Valor e igual diferente de 5? "+ t);
		t = valor >=  1;
		System.out.println("Valor e maior ou igual a 1? "+ t);
		t = valor <=  1;
		System.out.println("Valor e menor ou igual a 1? "+ t);
		System.out.println();
		
		
		// operadores logicos: “E” lógico &&   -   “OU” lógico ||
		int valorTeste = 30;
		boolean teste = false;
		teste = valorTeste < 40 && valorTeste > 20;
		System.out.println("Resultado do teste 1 é "+ teste + ", pois o valor testado e igual a "+ valorTeste + ".");
		
		teste = valorTeste < 40 && valorTeste > 30;
		System.out.println("Resultado do teste 2 é "+ teste + ", pois o valor testado e igual a "+ valorTeste + ".");

		teste = valorTeste > 30 || valorTeste > 20;
		System.out.println("Resultado do teste 3 é "+ teste + ", pois o valor testado e igual a "+ valorTeste + ".");
		
		teste = valorTeste > 30 || valorTeste < 20;
		System.out.println("Resultado do teste 4 é "+ teste + ", pois o valor testado e igual a "+ valorTeste + ".");
		
		teste = valorTeste > 50 && valorTeste == 30;
		System.out.println("Resultado do teste 5 é "+ teste + ", pois o valor testado e igual a "+ valorTeste + ".");
		System.out.println();
		
		//if e else
		if (valorTeste == 90){
			System.out.println("O valor teste é igual a "+ valorTeste + ".");
		}else{
			System.out.println("O valor teste diferente de "+ valorTeste + ".");
		}
		System.out.println();
		
		
		//while
		int contadorWhile = 0;
			while (contadorWhile <= 20){
				if (contadorWhile > 0){
					System.out.println("Testado 'while' repetição nº "+ contadorWhile);
				}
				contadorWhile ++;
			}
		System.out.println();
		
		// FOR
		for (int contadorFor = 0; contadorFor < 15; contadorFor ++){
			//if (contadorFor > 0 && contadorFor <= 15){
				System.out.println("Testado 'for' repetição nº "+ contadorFor);
			//}
		}
		
	}
}
