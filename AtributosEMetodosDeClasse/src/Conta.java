
public class Conta {
	//public int contador;
	public int nroConta;
	public static int contador;
	
	public Conta(){
		//this.contador ++;
		Conta.contador ++;
		this.nroConta = Conta.contador * 457 + 1500;
	}
		
	public static void zeraContador() {
		System.out.println("Total de contas....: " + Conta.contador);
		System.out.println("Zerando o contador de Contas");
		Conta.contador = 0;
	}
}
