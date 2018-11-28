package br.edu.exemplo.main;

import java.time.LocalDate;
import java.time.Month;

import br.edu.exemplo.entidade.empresa.Agenda;
import br.edu.exemplo.entidade.empresa.Gerente;
import br.edu.exemplo.entidade.empresa.OperadorMaquinas;
import br.edu.exemplo.entidade.empresa.Secretaria;
import br.edu.exemplo.entidade.empresa.Telefonista;
import br.edu.exemplo.negocio.Empresa;

public class Exemplo4 {

	public static void main(String[] args) {

		// atribuindo funcionarios a empresa
		Gerente gerente = new Gerente();
		gerente.setNome("Diogo Ferrete");
		gerente.setDataNasc(LocalDate.of(1987, Month.AUGUST, 26));
		gerente.setSexo('M');
		gerente.setNrRegistro(0);
		gerente.setSalario(10000);
		gerente.setArea("TI");
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Erica");
		secretaria.setDataNasc(LocalDate.of(1990, Month.JANUARY, 01));
		secretaria.setSexo('F');
		secretaria.setNrRegistro(0);
		secretaria.setSalario(3000);
		secretaria.setRamal(666);
		
		OperadorMaquinas operadorMaquinas = new OperadorMaquinas();
		operadorMaquinas.setNome("Joaquim da Silva");
		operadorMaquinas.setDataNasc(LocalDate.of(1968, Month.APRIL, 01));
		operadorMaquinas.setSexo('M');
		operadorMaquinas.setNrRegistro(0);
		operadorMaquinas.setSalario(3890.56);
		operadorMaquinas.setSetor("WTC-ODB");
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Fabia");
		telefonista.setDataNasc(LocalDate.of(1990, Month.FEBRUARY, 28));
		telefonista.setSexo('F');
		telefonista.setNrRegistro(0);
		telefonista.setSalario(2500);
		telefonista.setRamal(999);
		
		Agenda compromisso1 = new Agenda();
		compromisso1.setLocal("Via varejo");
		compromisso1.setAssunto("Arquitetura de software");
		compromisso1.setData(LocalDate.of(2016, Month.SEPTEMBER, 6));
		secretaria.getAgenda().add(compromisso1);
		
		Agenda compromisso2 = new Agenda();
		compromisso2.setLocal("Microsoft");
		compromisso2.setAssunto("Brain Storm");
		compromisso2.setData(LocalDate.of(2016, Month.SEPTEMBER, 19));
		secretaria.getAgenda().add(compromisso2);

		Agenda compromisso3 = new Agenda();
		compromisso3.setLocal("T-systems do Brasil");
		compromisso3.setAssunto("Planning");
		compromisso3.setData(LocalDate.of(2016, Month.OCTOBER, 1));
		secretaria.getAgenda().add(compromisso3);
		
		gerente.setSecretaria(secretaria);
		gerente.setTelefonista(telefonista);
		gerente.setOperadorMaquinas(operadorMaquinas);
		
		//estanciando empresa para executar os metodos
		Empresa empresa = new Empresa();

		// metodo para cadastrar funcionario
		System.out.println("****** CADASTRA FUNCIONARIOS ******");
		empresa.cadastraFunc(gerente);
		empresa.cadastraFunc(secretaria);
		empresa.cadastraFunc(telefonista);
		empresa.cadastraFunc(operadorMaquinas);

		// quebra de linha
		System.out.println("\n");

		// metodo para imprimir cada funcionario
		System.out.println("****** IMPRIME FUNCIONARIOS INDIVIDUAL******");
		empresa.imprimeFunc(gerente);
		empresa.imprimeFunc(secretaria);
		empresa.imprimeFunc(telefonista);
		empresa.imprimeFunc(operadorMaquinas);

		// quebra de linha
		System.out.println("\n");

		// principio de polimorfismo, o metodo base esta em funcionario, porem cada um tem seu respectivo percentual 
		System.out.println("****** REAJUSTA SALARIO FUNCIONARIOS ******");
		empresa.reajustaFunc(gerente);
		empresa.reajustaFunc(secretaria);
		empresa.reajustaFunc(telefonista);
		empresa.reajustaFunc(operadorMaquinas);

		// quebra de linha
		System.out.println("\n");

		// metodo para imprimir a lista funcionarios
		System.out.println("****** IMPRIME FUNCIONARIOS CADASTRADOS ******");
		empresa.imprimeFolhaFuncionarios();

		// quebra de linha
		System.out.println("\n");
		
		// metodo para imprimir a agenda do gerente
		System.out.println("****** IMPRIME AGENDA DO GERENTE ******");
		secretaria.imprimeAgenda();

	}
}
