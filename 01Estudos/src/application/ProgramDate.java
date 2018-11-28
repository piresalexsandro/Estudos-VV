package application;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class ProgramDate {

	public static void main(String[] args) throws  ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60 * 60 * 5); // equaivaliente das horas em milisegundos
		
		Date y1 = sdf1.parse("18/09/2018");
		Date y2 = sdf1.parse("18/09/2018 15:04:25");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:24:55Z")) ;
		
		//System.out.println("Current Date x1..........: " + x1);
		//System.out.println("Current Date x2..........: " + x2);
		//System.out.println("y1: " + y1);
		//System.out.println("y2: " + y2);
		//System.out.println("sdf1: " + sdf1.format(y1));//imprime no formato quando instanciado
		System.out.println("sdf2.....................: " + sdf2.format(y2));//imprime no formato quando instanciado
		System.out.println("Current Date Format x1...: " + sdf2.format(x1));
		System.out.println("Current Date Format x2...: " + sdf2.format(x2));
		System.out.println("Por milisegundos x3......: " + sdf2.format(x3));
		System.out.println("Horas em milisegundos x4.: " + sdf2.format(x4));// observação hora do Brasil "GMT - 3"
		System.out.println("y1.......................: " + sdf2.format(y2));//imprime no formato quando instanciado
		System.out.println("y2.......................: " + sdf2.format(y2));//imprime no formato quando instanciado
		System.out.println("y3.......................: " + sdf2.format(y3));// hora - 3 pq a maquina e local
		System.out.println("----------------------------------------------");
		System.out.println("sdf3.....................: " + sdf3.format(y2));//imprime no formato quando instanciado
		System.out.println("Current Date Format x1...: " + sdf3.format(x1));
		System.out.println("Current Date Format x2...: " + sdf3.format(x2));
		System.out.println("Por milisegundos x3......: " + sdf3.format(x3));
		System.out.println("Horas em milisegundos x4.: " + sdf3.format(x4));
		System.out.println("y1.......................: " + sdf3.format(y2));
		System.out.println("y2.......................: " + sdf3.format(y2));
		System.out.println("y3.......................: " + sdf3.format(y3));
		
	}

}
