import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	private int diaDoAniversario;

	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}
	
	public void imprimeExtratoDetalhado(){
		System.out.println("EXTRATO DETALHADO DA CONTA POUPANCA");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("Data..........: " + sdf.format(agora));
		System.out.println("Saldo.........: " + this.getSaldo());
		System.out.println("Aniversario...: " + this.getDiaDoAniversario());
	}
}
