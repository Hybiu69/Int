package Int;

public class Onibus extends Veiculos{
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando o BUS");
	}
	@Override
	public void frear() {
		System.out.println("Freando o BUS");
	}
	@Override
	public void virar() {
		System.out.println("Virando o BUS");
	}
	@Override
	public void ligar() {
		System.out.println("Ligando o BUS");
	}
}
