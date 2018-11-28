package br.edu.exemplo.entidade.empresa;

import java.util.ArrayList;
import java.util.List;

public class Secretaria extends Telefonista {

	private List<Agenda> agenda = new ArrayList<>();

	public Secretaria() {

	}

	@Override
	public double reajustaSalario() {

		setSalario(getSalario() * 1.08);

		return getSalario();
	}

	public Secretaria(List<Agenda> agenda) {
		super();
		this.agenda = agenda;
	}

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}

	public void imprimeAgenda() {
		
		for (Agenda a : agenda) {
			
			System.out.println("Agenda : " + a);
		}
	}

}
