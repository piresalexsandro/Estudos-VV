
public class Funcionario1 {
	// atributos da classe 
	String nome;
	String dataDeNascimento;
	String rg;
	String admissao;
	int matricula;
	double salario;
	
	// metodos da classe
	void recebeAumento(double bonus){
		this.salario = this.salario + bonus;		
	}
	
	double ganhoAnual(){
		this.salario = this.salario * 12;
		return this.salario;
	}
	
	void mostra(){
		System.out.println("Nome.......: " + this.nome);
		System.out.println("Nascimento.: " + this.dataDeNascimento);
		System.out.println("RG.........: " + this.rg);
		System.out.println("Admissão...: " + this.admissao);
		System.out.println("Matricula..: " + this.matricula);
		System.out.println("Salario....: " + this.salario);
		System.out.println("Ganho Anual: " + ganhoAnual());
		
	}
}
