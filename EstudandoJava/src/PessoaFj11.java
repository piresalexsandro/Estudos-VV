
public class PessoaFj11 {
		String nome;
		int anoDenascimento;
		int idade;
		
		void idadeDaPessoa(int anoCorrente){
			this.idade = anoCorrente - this.anoDenascimento;
		}
		
		void imprimeIdade(){
			System.out.println("O " + this.nome + ", tem " + this.idade + " anos de idade.");
		}
}