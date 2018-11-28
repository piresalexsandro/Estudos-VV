
public class TestaToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta();
		c.setNumero(15482);
		c.setSaldo(445878.99);
		
		//aqui eu digo que a variavel descricao e to tipo STRING e que e igual ao metodo
		String descricao = c.geraDescricao();
		
		
		System.out.println(c); // pela classe
		System.out.println(c.geraDescricao()); // pelo metodo
		System.out.println(descricao); // pela copia do metodo
	}

}
