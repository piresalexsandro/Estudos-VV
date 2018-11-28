
public class TestaArray {

	public static void main(String[] args) {
		int[] arrayNro = new int[50];
		//arrayNro[0] = 1540;
		//arrayNro[21] = 1981;
		for(int i = 0; i < 50; i++){
			arrayNro[i] = i;
			if(arrayNro[i] > 0){
				System.out.println(arrayNro[i]);
			}else{
				System.out.println("ZERO");
			}
		}
		
	}

}
