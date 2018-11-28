
public class Media {
	private static double total;
	private static double media;

	public static void main(String[] args) {
		media=calculaMedia(args);
		System.out.println("Media dos parametros: " + media);
		System.out.println("Total dos parametros: " + total);
	}

	private static double calculaMedia(String[] args) {
		int divisor = 0;
		for (String arg : args) {
			double d = Double.parseDouble(arg);
			total = d+total;
			divisor++;
		}
		return total / divisor;

	}
}
