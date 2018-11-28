import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
	
	//public void registraEntrada(){
	public void registraEntrada(Funcionario f ){
		System.out.println(descricaoEntrada(f));
	}
	
  	public String descricaoEntrada(Funcionario f){
  		//Funcionario f = new Funcionario(); << instaciar neste momento faz com que perca o que foi passado
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dataHoje = new Date();
  		return "Entrada..: " + f.getMatricula() + " às " + sdf.format(dataHoje);
  	}	

	public void registraSaida(Funcionario f){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dataHoje = new Date();
		
		System.out.println("Saida..: " + f.getMatricula() + " às " + sdf.format(dataHoje));
	}
	
}
