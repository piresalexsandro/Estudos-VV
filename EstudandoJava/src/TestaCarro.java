
public class TestaCarro {
	public static void main(String[] args){
		// instancias
		Carro fusca;
		fusca = new Carro();
		
		Motor fuscaMotor;
		fuscaMotor = new Motor();
		fusca.motor = fuscaMotor;
		
		// atributos
		fusca.cor = "Vermelho";
		fusca.modelo = "Fusca 1967";
		fusca.velocAtual = 20.00;
		fusca.velocMax = 180.00;
		
		fusca.motor.potencia = 1500;
		fusca.motor.tipo = "Alto Progressivo";
		
		// metodos
		fusca.liga();

		System.out.println("Potencia do motor: " + fusca.motor.potencia);
		System.out.println("Tipo do motor....: " + fusca.motor.tipo);
		
		fusca.acelera(70.00);
		System.out.println("Velocidade atual.: " + fusca.velocAtual);
		
		fusca.pegaMarcha();
		if (fusca.pegaMarcha() == -1){
			System.out.println("Posição do cambio: Neutro");
		} else {
			if (fusca.pegaMarcha() == 1){
				System.out.println("Posição do cambio: Primeira");
			} else {
				if (fusca.pegaMarcha() == 2){
					System.out.println("Posição do cambio: Segunda");
				} else {
					System.out.println("Posição do cambio: Terceira");
   			    }
			}
		}
		
	}
}
