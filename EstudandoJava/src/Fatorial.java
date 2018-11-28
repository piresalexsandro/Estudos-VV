
public class Fatorial {
	public static void main(String[] args){
		long fatorial=1;
		for (int n = 5; n > 0; n--){
			fatorial = fatorial * n;
			//System.out.print("n = "+ n);
		}
		System.out.print("5! = " + fatorial);
	}
}
