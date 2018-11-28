// metodos contrutores e ENCAPSULAMENTO
package br.edu.exemplo;

public class Exemplo2 {

	public static void main(String[] args) {
		// XPTO e a matricula e nao pode ser alterada
		Professor p1 = new Professor("Martin Luther King", "M", 35, "XPTO12542", "HISTORIA");
		
		System.out.println(p1.toString());
	}
}
