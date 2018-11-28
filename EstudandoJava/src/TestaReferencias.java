
public class TestaReferencias {
	public static void main(String[] args){
		Conta c1;
		c1 = new Conta();
		c1.deposita(1000.22);
		System.out.println(c1.saldo);

		Conta c2 = c1;
		c2.deposita(500.33);
		System.out.println(c2.saldo);
	}
}
