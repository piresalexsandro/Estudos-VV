
public class Multiplos {
	public static void main(String[] arg){
		for (int i = 0; i <= 100; i++){
			int restoDaDivisao = i % 3;
			if (i > 0 && restoDaDivisao == 0){
				System.out.println("Este numero e multiplo de 3 = " +i);
			}
		}
	}

}
