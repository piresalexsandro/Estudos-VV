
public class Manager {

	public String nameManager;
	public double salaryManager;
	
	public void increaseSalary(){
		//salary inreased in XX%
		this.increaseSalary(0.1);
	}
	
	public void increaseSalary(double rate){
		this.salaryManager += this.salaryManager * rate;
	}
}
