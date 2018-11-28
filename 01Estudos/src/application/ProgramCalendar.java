package application;

import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {

	public static void main(String[] args) {
		// manipulação de datas e tempo
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
		Date d = Date.from(Instant.parse("2018-06-25T15:24:55Z")) ;

		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutos da hora.: " + minutes);
		
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Mes da data.....: " + month);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println("data + 4 horas..: " + sdf.format(d));
	}

}
