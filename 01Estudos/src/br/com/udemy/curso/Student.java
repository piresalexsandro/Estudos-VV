package br.com.udemy.curso;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double gradeFinal;
	public double missingPoint;  
	
	public void gradeFinal(double n1, double n2, double n3){
		if (n1 > 30){
			System.out.println("Nota do primeiro trimestre maior que 30");
		} else if (n2 > 35){
			System.out.println("Nota do segundo trimestre maior que 35");
		} else if (n3 > 35){
			System.out.println("Nota do terceiro trimestre maior que 35");
		} else{
			this.gradeFinal = n1 + n2 + n3;
		}
	}

	public boolean finalResult(){
		double minimumNote = 60.00;
		boolean retorno = false;
		
		if (this.gradeFinal >= minimumNote){
			retorno = true;
		} else {
			this.missingPoint = this.gradeFinal - minimumNote;
	    }	
	    return retorno;
	}
	
	public String toString(){
		if (finalResult()){
			return "FINAL GRADE = " + String.format("%.2f", this.gradeFinal) + "\n" + "PASS";
	    } else {
			return "FINAL GRADE = " + String.format("%.2f", this.gradeFinal) + "\n" + "FAILED" + "\n" + "MISSING " + String.format("%.2f", this.missingPoint) + " POINTS";
	    }
   }

}
