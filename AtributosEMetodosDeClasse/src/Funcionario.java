	
public class Funcionario {
	public String nomeFunc;
	public static double valorVr;
	
	static void aumentaValorVr(double taxaAumento){
		Funcionario.valorVr += Funcionario.valorVr * taxaAumento;
	}
}
