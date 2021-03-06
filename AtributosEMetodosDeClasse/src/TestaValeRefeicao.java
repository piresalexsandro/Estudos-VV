import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestaValeRefeicao {

	public static void main(String[] args) {
		
		BigDecimal bd = new BigDecimal(BigDecimal.ZERO.toString());
		bd.setScale(2, RoundingMode.HALF_DOWN);
		
		@SuppressWarnings("resource")
		
		// receber o valor digitado
		Scanner valorVrDigitado = new Scanner(System.in);
		System.out.println("Digite o Valor do Vale Refei��o"); // usar v�rgula 
		Funcionario.valorVr = valorVrDigitado.nextDouble();

		// receber o valor da taxa e calcular atravez do metodo.
		Scanner taxaDigitada = new Scanner(System.in);
		System.out.println("Digite a Taxa de Aumento do Vale Refei��o"); // usar v�rgula 
		Double novaTaxa = taxaDigitada.nextDouble();
		Funcionario.aumentaValorVr(novaTaxa);
		
		// formatar o valor
		/*DecimalFormat decimalFormat = new DecimalFormat("######,00");
		decimalFormat.setCurrency(Currency.getInstance(Locale.US));
		System.out.println("Novo valor do Vale Refei��o..: R$ " + decimalFormat.format(Funcionario.valorVr));
		*/
		
		System.out.println("Novo valor do Vale Refei��o..: R$ " + Funcionario.valorVr);
		
		taxaDigitada.close();
	}

}
