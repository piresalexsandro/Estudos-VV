public class Funcionario {
	// atributos
	String nome;
	String cpf;
	String rg;
	String departamento;
	Data dataEntrada;
	double salario;
	boolean estaNaEmpresa;
	
	
	void recebeAumento(double valorAumento){
		salario += valorAumento;
	}
	
	double calculaGanhoAnual(){
		double salarioAnual = salario * 12;
		return salarioAnual;
	}
	
	void mostraFuncionario(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Rg: " + this.rg);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data de entrada: " + this.dataEntrada);
		System.out.println("Salario Atual: " + this.salario);
		System.out.println("Esta na Empresa: " + this.estaNaEmpresa);		
		System.out.println("Total Anual: " + this.calculaGanhoAnual());		
	}
}