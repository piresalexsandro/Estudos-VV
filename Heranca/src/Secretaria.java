
public class Secretaria extends Funcionario{
	private int ramal;

	public Secretaria(){
		
	}
	
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		return "Secretaria = " + ramal;
	}
	
}
