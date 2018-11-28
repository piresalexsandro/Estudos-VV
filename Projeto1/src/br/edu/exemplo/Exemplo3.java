package br.edu.exemplo;

public class Exemplo3 {

	public static void main(String[] args) {
		Professor p1 = new Professor();
		p1.setNome("Nelson Mandela"); 
		p1.setSexo("M"); 
		p1.setIdade(76); 
		p1.setMatricula("afric2015"); 
		p1.setMateria("Historia");
		
		Aluno a1 = new Aluno();
		a1.setNome("Maria Sebastiana"); 
		a1.setSexo("F"); 
		a1.setIdade(28); 
		a1.setMatricula("rugh1809"); 
		a1.setSerie("3º Semestre");
		
		Aluno a2 = new Aluno();
		a2.setNome("Maria da Conceição"); 
		a2.setSexo("F"); 
		a2.setIdade(31); 
		a2.setMatricula("thif2611"); 
		a2.setSerie("3º Semestre");
		
		Aluno a3 = new Aluno();
		a3.setNome("Benedito Silva"); 
		a3.setSexo("M"); 
		a3.setIdade(34); 
		a3.setMatricula("ben4581"); 
		a3.setSerie("3º Semestre");
		
		//colocando o aluno dentro do professor / observar na classe professor
		p1.setAluno(a1);
		p1.setAluno(a2);
		p1.setAluno(a3);
		
		System.out.println(p1);
		System.out.println("    Aluno: " + p1.getAluno().toString());
		//System.out.println("    Aluno: " + a2);
		//System.out.println("    Aluno: " + a3);
	}
	
	
}
