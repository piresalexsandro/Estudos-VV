import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorExtrato {
	public void imprimeExtratoBasico(Conta c){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
		Date dataHoje = new Date();
		
		System.out.println("DATA......: " + sdf.format(dataHoje));
		System.out.println("SALDO.....: " + c.getSaldo());
		System.out.println();
	}
}
 