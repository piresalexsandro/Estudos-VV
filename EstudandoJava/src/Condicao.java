
/**
 * @author 2102254255
 *
 */
public class Condicao {
	public static void main(String[] args){
		int idadeInformada = 15;
		boolean amigoDoDono = true;
		
		if (idadeInformada < 18){
			System.out.println("1) Nao pode entrar e menor de idade !!");
		}else{ 
			System.out.println("1) Sim pode entrar e maior de idade !!");
		} 
			
		
		/* ----------------------------  amigo do dono -------------------------------- */
		
		if (idadeInformada < 18){
			if (amigoDoDono){
				System.out.println("2) Sim pode entrar o mlk é amigo do dono !!");
			}else{
				System.out.println("2) Nao pode entrar e menor de idade !!");
			}
		}else{ 
			System.out.println("2) Sim pode entrar e maior de idade !!");
		} 
		
		/*------------------------------ AND --------------------------------------*/
		if (idadeInformada < 18 && amigoDoDono == false){
			System.out.println("3) Sim pode entrar e maior de idade E (OU) e amigo do dono!!");
		}else{ 
			System.out.println("3) Nao pode entrar e menor de idade E (OU) nao e amigo do dono !!");
		}
		
		/*--------------------------- OR ------------------------------------------*/
		if (idadeInformada > 18 || amigoDoDono){
			System.out.println("4) Sim pode entrar e maior de idade OU e amigo do dono!!");
		}else{ 
			System.out.println("4) Nao pode entrar e menor de idade OU nao e amigo do dono !!");
		}
		
		/*-------- OR e mudando a variavel booleana de true para false ---------*/
		if (idadeInformada > 18 || !amigoDoDono){
			System.out.println("5) Sim pode entrar e maior de idade OU e amigo do dono!!");
		}else{ 
			System.out.println("5) Nao pode entrar e menor de idade OU nao e amigo do dono !!");
		}
		
		/*----------- transformando de true para false a variavel booleana -------------*/
		if (idadeInformada < 18 && !amigoDoDono){
			System.out.println("6) Sim pode entrar e maior de idade OU e amigo do dono!!");
		}else{ 
			System.out.println("6) Nao pode entrar e menor de idade E nao e amigo do dono !!");
		}
		
		char x = 'X';
		char y = 'Y';
		if  (x != y){
			System.out.println("7) X e diferente de Y");
		}
		
		int a = 'W';
		int b = 'W';
		if  (a == b){
			System.out.println("8) A e diferente de B");
		}
	}
}
