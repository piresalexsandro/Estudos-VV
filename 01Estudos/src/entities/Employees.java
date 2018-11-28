package entities;

public class Employees {
	private int id;
	private String name;
	private double salary;
	
	public Employees(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

/*	public void setSalary() {
		this.salary = salary;
	}*/
	
	public void incrise(double salary, double perc) {
		this.salary += salary * perc;
	}
	
	public String toString(){
		return "xxxxx";
	}
	
}