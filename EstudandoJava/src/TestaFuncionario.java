public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.ano = 2017;
		data.mes = 9;
		data.dia = 18;
		Funcionario f1 = new Funcionario();
		f1.nome = "Martin Luther King";
		f1.rg = "289945568";
		f1.cpf = "22947581294";
		f1.dataEntrada = data;
		f1.departamento = "Tecnologia da Informação";
		f1.salario = 8500;
		f1.estaNaEmpresa = true;
		
		f1.recebeAumento(600);
		//f1.calculaGanhoAnual();
		f1.mostraFuncionario();
		System.out.println();
		
		Funcionario f2 = new Funcionario();
		Funcionario f3 = f2;
		f2.nome = "Maria Carmosina Pires";
		f2.rg = "5548521546";
		f2.cpf = "15458726548";
		f2.dataEntrada = data;
		f2.departamento = "Analista de Negocios";
		f2.salario = 12400;
		f2.estaNaEmpresa = true;
		
		f2.recebeAumento(800);
		//f1.calculaGanhoAnual();
		f2.mostraFuncionario();
		System.out.println();

		f3.recebeAumento(399);
		f3.mostraFuncionario();
		System.out.println();
		
		if (f3 == f2){
			System.out.println("f2 e f3, contas iguais, a saber estao no mesmo endereço de memoria");
		}
		
		
	}
}
