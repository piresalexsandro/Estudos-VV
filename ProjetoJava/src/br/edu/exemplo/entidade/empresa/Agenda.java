package br.edu.exemplo.entidade.empresa;

import java.time.LocalDate;

public class Agenda {

	private String local;

	private String assunto;

	private LocalDate data;

	public Agenda() {

	}

	public Agenda(String local, String assunto, LocalDate data) {
		this.local = local;
		this.assunto = assunto;
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Agenda [local=" + local + ", assunto=" + assunto + ", data="
				+ data + "]";
	}

}
