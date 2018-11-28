
public class TestandoMetodos {
	public static void main(String[] args){
		// instanciando/criando a conta
		Conta minhaConta;
		minhaConta = new Conta();
		
		Cliente cli;
		cli = new Cliente();
		
		// alterando valores da conta
		cli.nome = "Alexsandro Pires";
		minhaConta.saldo = 15261.99;
		//*System.out.println("Dono da conta: " + minhaConta.dono);
		//*System.out.println("Saldo da conta: " + minhaConta.saldo);
		
		//saca 150.88
		minhaConta.saca(150.88);
		System.out.println("Saca - Novo saldo da conta: " + minhaConta.saldo);
		
		// deposita 888.89
		minhaConta.deposita(888.89);
		System.out.println("Deposita - Novo saldo da conta: " + minhaConta.saldo);
		
		// deposita 888.89
		//minhaConta.transfere(2000.00);
		//System.out.println("Transferencia - Novo saldo da conta: " + minhaConta.saldo);

		// sacar com retorno
		minhaConta.sacaretorno(121.25);
		//System.out.println("Retorno da operação: " + minhaConta.sacaretorno);
		if (minhaConta.sacaretorno(121.25)){
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}
	}
}
