package br.com.udemy.curso;

import java.util.Locale;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter with name of the student: ");
		student.name = sc.nextLine();

		System.out.println("Enter with the first grade: ");
		student.grade1 = sc.nextDouble();

		System.out.println("Enter with the second grade: ");
		student.grade2 = sc.nextDouble();

		System.out.println("Enter with the thirth grade: ");
		student.grade3 = sc.nextDouble();
		
		student.gradeFinal(student.grade1, student.grade2, student.grade3);
		
		System.out.println(student);
		
	}

}
