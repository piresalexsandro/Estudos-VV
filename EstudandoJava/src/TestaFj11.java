
public class TestaFj11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFj11 p1 = new PessoaFj11();
		p1.nome = "Antonio Gumercindo";	
		p1.anoDenascimento = 1947;
		p1.idadeDaPessoa(2017);
		p1.imprimeIdade();
		
		PessoaFj11 p2 = new PessoaFj11();
		p2.nome = "Felizberto Mendon�a";
		p2.anoDenascimento = 1944;
		p2.idadeDaPessoa(2017);
		p2.imprimeIdade();
		
		PessoaFj11 p3 = new PessoaFj11();
		p3.nome = "Pedro da Silveira";
		p3.anoDenascimento = 1981;
		p3.idadeDaPessoa(2017);
		p3.imprimeIdade();
		
		Porta porta = new Porta();
		porta.aberta = false;
		porta.estaAberta();
		
		System.out.println("a porta esta aberta? " + porta.estaAberta());
	}

}