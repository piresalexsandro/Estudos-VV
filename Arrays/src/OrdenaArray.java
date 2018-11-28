import java.util.Arrays;

public class OrdenaArray {

	public static void main(String[] args) {
		String[] nomes = new String[]{"Julio Maria", "Frederico Fernando", "Armando Nogueira", "Sandoval Pereira", "Bianca Basilio"};	
		Arrays.sort(nomes);
		for(String nome : nomes){
			System.out.println(nome);
		}
	}

}
