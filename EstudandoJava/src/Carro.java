
public class Carro {
	String cor;
	String modelo;
	double velocAtual;
	double velocMax;
	Motor motor;
	
	// metodos
	// liga o carro	
	void liga(){
		System.out.println("O carro esta ligado !");
	}
	
	// acelera ate certa velocidade
	void acelera(double quantidade){
		double velocNova = this.velocAtual + quantidade;
		this.velocAtual = velocNova;
	}
	
	// devolve que marcha o carro esta "***********NAO TEM VOID***********"
	int pegaMarcha(){
		if (this.velocAtual == 0){
			return -1;
		}
		if (this.velocAtual >= 0 && this.velocAtual < 40){
			return 1;
		}
		if (this.velocAtual >= 40 && this.velocAtual < 80){
			return 2;
		}
		return 3;
	}
	
	
	
}
