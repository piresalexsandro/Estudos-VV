import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args){
		boolean continuar=true;
		int opcao;
		do{
			System.out.println("Digite uma Op��o");
			Scanner sc = new Scanner(System.in);
			opcao = sc.nextInt();
			if (opcao == 0){
				continuar = false;
				System.out.println("Esta e a op��o correta, " + opcao + "\nFIM DO PROGRAMA!!!");
			}
            else{
                System.out.printf("\n");
            }			
		} while(continuar);
	}
}