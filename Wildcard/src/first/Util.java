package first;

import java.util.List;

public class Util  {
	public static boolean imprimirLista(List<?> lista) {
		try {
			for(Object item: lista) {
				System.out.println(item.toString());
			}
		}catch(Exception e) {
			System.out.println("Erro");
			return false;
		}
		return true;
	}
}
