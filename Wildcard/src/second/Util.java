package second;

import java.util.List;

public class Util {

	public static <T extends Number> List<T> adicionarNumero(List<T> lista, T numero) {
		try {
			lista.add(numero);
		}catch(Exception e) {
			System.out.println("Erro");
		}
		return lista;
	}
}
