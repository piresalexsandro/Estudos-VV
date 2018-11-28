import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

// testando sobreposição de metodos
public class TestManager {

	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(BigDecimal.ZERO.toString());
		bd.setScale(2, RoundingMode.HALF_DOWN);
		
		Manager m1 = new Manager();
		
		m1.nameManager = "Antonio Evaristo de Melo Peixoto";
		m1.salaryManager = 9790.42;
		m1.increaseSalary();
		
		//increase salary in 10%
		System.out.println("The new salary of " + m1.nameManager + " is...: U$" + m1.salaryManager);

		Manager m2 = new Manager();
		
		m2.nameManager = "Clovis de Barros Filho";
		m2.salaryManager = 10987.25;
		m2.increaseSalary(0.15);
		DecimalFormat decimalFormat= new DecimalFormat("######.##");
		decimalFormat.setCurrency(Currency.getInstance(Locale.CHINA));
		//increase salary in 15%
		System.out.println("The new salary of " + m2.nameManager + " is...: U$" + m2.salaryManager);
		System.out.println(decimalFormat.format( m2.salaryManager));
		
	}

}
