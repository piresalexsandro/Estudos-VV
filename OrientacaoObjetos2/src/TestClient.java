
public class TestClient {
	public static void main(String[] args) {
		Client c1 = new Client();
		c1.nome = "Giulia dos Santos Pires";
		c1.codCli = 20041019;
		System.out.println("Nome do Cliente: " + c1.nome + "\nCodigo do Cliente: " + c1.codCli);
		
		System.out.println();	
		
		Client c2 = new Client();
		c2.nome = "Jaqueline dos Santos Pires";
		c2.codCli = 19810312;
		System.out.println("Nome do Cliente: " + c2.nome + "\nCodigo do Cliente: " + c2.codCli);
	
	}
}
