
public class TesteDuasContas {
	public static void main(String[] args){
		// instanciando o objeto joaoConta do tipo Conta
		Conta joaoConta;
		joaoConta = new Conta();
		// instanciando o objeto joaoCli do tipo Cliente
		Cliente joaoCli;
		joaoCli = new Cliente();
		joaoConta.titular = joaoCli; 
		
		// atributos da classe cliente
		joaoCli.nome = "João Pedro";
		joaoCli.sobrenome = " dos Santos Pires";
		joaoCli.cpf = "456.789.123.51";
	
		// atritutos da classe conta
		System.out.println("CONTA 1 Cliente: " + joaoCli.nome + joaoCli.sobrenome + " - CPF: " + joaoCli.cpf);
		joaoConta = new Conta();
		joaoConta.numero = 17012001;
		joaoConta.saldo = 13525.69;
		joaoConta.limite = 18694.50;
		
		// metodos para o objeto joaoConta
		joaoConta.saca(1255.36);
		System.out.println("Saldo da conta do João após o saque: "  + joaoConta.saldo);
		joaoConta.saldoTotal(0);
		System.out.println("Valor disponivel para saque: "  + joaoConta.disponivel);

		
		System.out.println();

		
		// instanciando o objeto giuliaConta do tipo Conta
		Conta giuliaConta;
		giuliaConta = new Conta();
		// instanciando o objeto giuliaCli do tipo Cliente
		Cliente giuliaCli;
		giuliaCli = new Cliente();
		giuliaConta.titular = giuliaCli;
		
		// atributos da classe cliente
		giuliaCli.nome = "Giulia ";
		giuliaCli.sobrenome = "dos Santos Pires";
		giuliaCli.cpf = "123.456.789.10";
		
		System.out.println("CONTA 2 Cliente: " + giuliaCli.nome + giuliaCli.sobrenome + " - CPF: " + giuliaCli.cpf);
		
		// atributos da classe conta 2
		giuliaConta.numero = 19102004;
		giuliaConta.saldo = 5641.55;
		giuliaConta.limite = 11545.51;

		// metodos para o objeto giuliaConta
		giuliaConta.saca(385.68);
		System.out.println("Saldo da conta da Giulia após o saque: "  + giuliaConta.saldo);
		giuliaConta.saldoTotal(0);
		System.out.println("Valor disponivel para saque: "  + giuliaConta.disponivel);
		
		//metodo tranferir valores entre contas
		System.out.println();
		System.out.println("TRANSFERENCIA DE VALORES");
		joaoConta.transferePara(giuliaConta, 100);
		System.out.println("Giulia - Saldo + Valor transferido: "  + giuliaConta.saldo);
		System.out.println("Joao - Saldo - Valor transferido: "  + joaoConta.saldo);
	}
}
