package entidade;

public class Gerente extends Pessoa{
	private double salario;
	private String nome; 

	public Gerente() {
	}

	public void aumenteSalario(){
		this.aumenteSalario(0.1);
	}
	
	public void aumenteSalario(double taxa){
		this.salario += this.salario * taxa;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do Gerente: " + nome + ", Salario atualizado: " + salario;
	}
}
