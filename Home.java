package Int;

public class Home implements Computador {
	
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
	public void work() {
		System.out.println("Trabalhando");
	}
	@Override
	public void jogar() {
		System.out.println("");
		
	}

}
