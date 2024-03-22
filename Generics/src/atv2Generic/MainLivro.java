package atv2Generic;

public class MainLivro {

	public static void main(String[] args) {

		Livro<Capitulo> livro = new Livro<>();
		livro.capitulos(new Capitulo("O Corvo", 186));
		System.out.println(livro.mostrarCap());
		

	}

}
