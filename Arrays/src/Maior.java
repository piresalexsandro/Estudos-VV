
public class Maior {

	private static double maior;
	
	public static void main(String[] args) {
		maior = obterMaior(args);
		System.out.println("Maior paramentro passado: " + maior);
	}
	
	private static double obterMaior(String[] args) {
		for (String arg : args) {
			Double lido = Double.parseDouble(arg);
			if (lido >= maior){
				maior = lido;
			}
	                              
		}
		return maior;
	}

}
