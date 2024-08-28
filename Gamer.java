package Int;

public class Gamer implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("Ligando");
	}
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("Desligando");
	}
	@Override
	public void loadsys() {
		System.out.println("Carregando Sistema");
	}
	@Override
	public void jogar() {
		System.out.println("Jogando");
	}
	@Override
	public void work() {
		System.out.println("");
	}
	
	

}
