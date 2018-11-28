
public class BalançoTrimestral {
	public static void main(String[] args){
		int gastosJaneiro = 14500;
		int gastosFevereiro = 23800;
		int gastosMarco = 18650;
		int totalTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Total gastos no primeiro trimestre de 2016: " + (totalTrimestre));
		int mediaMensal = totalTrimestre / 3;
		System.out.println("Media mensal para o primeiro trimestre de 2016: " + (mediaMensal));
	}

}
