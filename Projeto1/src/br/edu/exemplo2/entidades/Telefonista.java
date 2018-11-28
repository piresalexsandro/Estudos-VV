package br.edu.exemplo2.entidades;

public class Telefonista extends Funcionarios{
	int ramal;

	public Telefonista(){
		
	}
	
	public int getRamal(){
		return ramal;
	}
	
	public int setRamal(int ramal){
		return this.ramal = ramal;
	}
	
	public String toString(){
		return "Ramal: " + getRamal();
	}	
	
}
