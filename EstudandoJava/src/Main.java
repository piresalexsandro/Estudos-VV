
public class Main {

	public static void main(String[] args) {
		
		Endereco e = new Endereco();
		e.setDescricao("Rua teste");
		Pessoa p = new Pessoa("Teste", e);
		System.out.println(p.getNome() + " " + p.getEndereco().getDescricao());
	}
	
}
