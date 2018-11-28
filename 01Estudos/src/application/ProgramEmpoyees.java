package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ProgramEmpoyees {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		Employees[] vect = new Employees[n];
		System.out.println();

		List<Object> list = new ArrayList<>();

		for(int i=0; i<vect.length; i++){
			int en = 1;
			en += i;
			System.out.println("Emplyoee #" + en + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			list.add(vect[i]);
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double perc = sc.nextDouble();
	    
		list.indexOf(id);
		for (int i = 0; i < 10; i++) {
			if (vect[i].getId() == id) {
				vect[i].incrise(vect[i].getSalary(), perc);
				//System.out.println(vect[i]);
			}
		}
		
		
		sc.close();
	}

}
