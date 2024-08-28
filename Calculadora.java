package Int;

public class Calculadora implements Calculo{
	
	@Override
	public double som() {
		System.out.println("somando");
		return 10+10;
	}
	@Override
	public double sub() {
		System.out.println("subtraindo");
		return 99-100;
	}
	@Override
	public double mul() {
		System.out.println("Multiplicando");
		return 100*1;
	}
	@Override
	public int div() {
		System.out.println("Dividindo");
		return 817/3;
	}
	@Override
	public int exp() {
		System.out.println("Elevando");
		return 817*817;
	}
}

