import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorDeExtrato {
	public void imprimeExtratoBasico(Conta c){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dataAtual = new Date();
		
		System.out.println("Data = " + sdf.format(dataAtual));
		System.out.println("Saldo = " + c.getSaldo());
	}

}
