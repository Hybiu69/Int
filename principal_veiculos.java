package Int;

public class principal_veiculos {

	public static void main(String[] args) {
		
		Veiculos_ABS car = new Veiculos_ABS();
		Onibus bus = new Onibus();
		
		System.out.println("Onibus");
		bus.acelerar();
		bus.frear();
		bus.virar();
		bus.ligar();
		
		System.out.println("Carro");
		car.acelerar();
		car.frear();
		car.virar();
		car.ligar();
	}

}
