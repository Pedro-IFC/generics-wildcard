package third;

import java.util.List;

public class Calculadora {

	public static Float calcularMedia(List<? extends Number> lista) {
		Float media = 0f;
		int i=0;
		try {
			for(Number item : lista) {
				media+=item.floatValue();
				i++;
			}
		}catch(Exception e) {
			System.out.println("Erro");
		}
		return (i>0)? (media/i) : -1;
	}
}
