package atv1Generic;

public class MainAp {

	public static void main(String[] args) {
		
		InfoAp<Moveis> ia = new InfoAp<>();
		ia.adicionarMoveis(new Moveis("Cama", 3, "Branca"));
		ia.adicionarMoveis(new Moveis("Cadeira",1, "Marrom"));
		System.out.println("Moveis do apartamento: ");
		System.out.println(ia.mostrarMoveis());
		
		ia.adicionarEletro(new Eletrodomestico("Fogão", 1.2, "preto"));
		System.out.println("Eletrodomésticos do apartamento: ");
		System.out.println(ia.mostrarEletros());
		
		ia.adicionarDec(new Decoracao("Papel de parede", 5, "listrado vermelho e branco"));
		System.out.println("Decoração do apartamento: ");
		System.out.println(ia.mostrarDec());
		
	}

}
