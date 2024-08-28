package Int;

public class Principal_Comp {

	public static void main(String[] args) {

		Gamer pcg = new Gamer();
		Home pch = new Home();
		System.out.println("Gamer");
		pcg.ligar();
		pcg.reiniciar();
		pcg.desligar();
		pcg.loadsys();
		pcg.jogar();
		
		System.out.println("Home");
		
		pch.ligar();
		pch.reiniciar();
		pch.desligar();
		pch.loadsys();
		pch.work();
		
		

	}

}
