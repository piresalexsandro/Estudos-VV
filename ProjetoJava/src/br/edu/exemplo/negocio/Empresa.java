package br.edu.exemplo.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.edu.exemplo.entidade.empresa.Funcionario;

public class Empresa {

	List<Funcionario> funcionarios = new ArrayList<>();
	//List<Agenda> agenda = new ArrayList<>();

	public void imprimeFunc(Funcionario f) {

		// imprime funcionario
		System.out.println("Funcionario : " + f);
	}

	public void reajustaFunc(Funcionario f) {

		//imprime nome funcionario
		System.out.println("Funcionario : " + f.getNome());
		
		// imprime salario antes do calculo
		System.out.println("salario antigo : " + f.getSalario());

		// reajusta o salario e imprime salario novo
		System.out.println("salario reajustado : " + f.reajustaSalario());
	}

	public void cadastraFunc(Funcionario f) {

		// cria e atribue ao funcionario um numero de registro
		f.setNrRegistro(geraNumeroRegistro());

		// adiciona o novo funcionario na lista de funcionarios
		funcionarios.add(f);

		// imprime o novo funcionario
		System.out.println("Funcionario cadastrado : " + f.getNome()
				+ " / registro: " + f.getNrRegistro());
	}
	
	public void imprimeFolhaFuncionarios() {
		
		for (Funcionario f : funcionarios) {
			
			System.out.println("Funcionario : " + f);
		}
	}

	/**
	 * Cria um numero aleatório que será usado como registro
	 * 
	 * @return
	 */
	private long geraNumeroRegistro() {
		return new Random().nextInt(9999);
	}

	// metodos que imprimem listas
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
