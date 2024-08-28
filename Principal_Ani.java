package somativaPOO;

public class Principal_Ani {

	public static void main(String[] args) {
		Lobo lobo = new Lobo();
		Leao leao = new Leao();
		Tigre tigre = new Tigre();
		Cachorro cachorro = new Cachorro();
		Galo galo = new Galo();

		System.out.println("Lobo");
		lobo.setNome("Lycanrock");
		lobo.setSexo("Masculino");
		lobo.setRaca("Lobo-Cinzento");
		System.out.println(lobo.getNome());
		System.out.println(lobo.getSexo());
		System.out.println(lobo.getRaca());
		lobo.dormir();
		lobo.correr();
		lobo.caminhar();
		lobo.som();

		System.out.println("");

		System.out.println("Leão");
		leao.setNome("Littleo");
		leao.setSexo("Masculino");
		leao.setRaca("Leão-Albino");
		System.out.println(leao.getNome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getRaca());
		leao.dormir();
		leao.correr();
		leao.caminhar();
		leao.som();

		System.out.println("");

		System.out.println("Tigre");
		tigre.setNome("Raikou");
		tigre.setSexo("Masculino");
		tigre.setRaca("Tigre-Siberiano");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getSexo());
		System.out.println(tigre.getRaca());	
		tigre.dormir();
		tigre.correr();
		tigre.caminhar();
		tigre.som();

		System.out.println("");

		System.out.println("Cachorro");
		cachorro.setNome("Entei");
		cachorro.setSexo("Masculino");
		cachorro.setRaca("Pastor Alemão");
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getSexo());
		System.out.println(cachorro.getRaca());	
		cachorro.dormir();
		cachorro.correr();
		cachorro.caminhar();
		cachorro.som();
		
		System.out.println("");

		System.out.println("Galo");
		galo.setNome("Torchic");
		galo.setSexo("Masculino");
		galo.setRaca("Galinha");
		System.out.println(galo.getNome());
		System.out.println(galo.getSexo());
		System.out.println(galo.getRaca());	
		galo.dormir();
		galo.correr();
		galo.caminhar();
		galo.som();

		System.out.println("");

	}

}
