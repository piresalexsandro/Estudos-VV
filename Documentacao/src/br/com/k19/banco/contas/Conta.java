package br.com.k19.banco.contas;

/**
 * Documenta��o da classe conta
 * 
 * @author 2102254255
 * 
 * @author Martin Luther King JR
 * 
 * @author Nelson Mandela
 *
 * @version 1.0
 */

public class Conta {
	/**
	 *  Documenta��o do atributo numero
	 */
	private int numero;
	
	/**
	 * Documeta��o do construtor
	 * 
	 * @param numero
	 * 			documenta��o do atributo numero
	 * 
	 * @throws IllegalArgumentException
	 * 			documenta��o da situa��o que gera exception
	 * 			IllegalArgumentException
	 */
	public Conta(int numero){
		if (numero <  0){
			throw new IllegalArgumentException("numero negativo");
		}
		this.numero = numero;
	}

	public int getNumero(){
		return numero;
	}
}
