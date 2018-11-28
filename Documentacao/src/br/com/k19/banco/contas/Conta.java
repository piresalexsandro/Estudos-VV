package br.com.k19.banco.contas;

/**
 * Documentação da classe conta
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
	 *  Documentação do atributo numero
	 */
	private int numero;
	
	/**
	 * Documetação do construtor
	 * 
	 * @param numero
	 * 			documentação do atributo numero
	 * 
	 * @throws IllegalArgumentException
	 * 			documentação da situação que gera exception
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
