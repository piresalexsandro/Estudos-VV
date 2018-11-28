import java.util.Scanner;

public class ReceberDadosTeclado {
	public static void main(String[] args) {
		Scanner lerNro = new Scanner(System.in);
		System.out.println("Entre com o Numero....: ");
		int nroDigitado = lerNro.nextInt();
		System.out.println("O Numero digitado foi.: " + nroDigitado);
		lerNro.close();
	}
}
