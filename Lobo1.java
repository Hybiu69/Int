package Int;

public class Lobo1 implements Animal {
	
	@Override
	public void dormir() {
		System.out.println("Dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("Caminhar");
	}
	@Override
	public void correr() {
		System.out.println("Correndo");
	}
	@Override
	public void som() {
		System.out.println("Uivando");
	}
}