
public class ControlandoLoops {
	public static void main(String[] args){
		int x = 45;
		for (int i = 20; i < x; i++){
			//System.out.println("i = " + 1);
			if (i % 19 == 0){
				System.out.println("Achei um n�mero divis�vel por 19 entre x e y = " + i);
				break;
			}
		}
		System.out.println();
		for (int i = 0; i < 100; i++){
			if  (i > 10 && i <= 90){
				continue;
			}else{
     			System.out.println(i);
			}
		}
	}

}
