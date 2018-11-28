import java.util.Scanner;

public class SwitchCase {
		public static void main(String[] args){
			float numero1, numero2;
			char operador;
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Escolha sua Operação [+ - * /]");
			operador = entrada.nextLine().charAt(0);
			
			System.out.print("Digite o primeiro numero: ");
			numero1 = entrada.nextFloat();
			System.out.print("Digite o segundo numero: ");
			numero2 = entrada.nextFloat();
			
			/*System.out.print("Escolha sua Operação [+ - * /]");
			operador = entrada.nextLine().charAt(0);*/
			
			System.out.println();
			
			switch(operador){
			case  '+':
				System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
				break;
			case  '-':
				System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
				break;
			case  '*':
				System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
				break;
			case  '/':
				System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
				break;
			default:
				System.out.printf("Voce digitou uma opção invalida !!!!");
				break;
			}
		}
}
