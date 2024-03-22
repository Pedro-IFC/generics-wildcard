package atv2Generic;

import java.util.ArrayList;
import java.util.List;

public class Livro <T extends Capitulo> {

	List<T> cap = new ArrayList<>();
	
	public void capitulos(T capit) {
		cap.add(capit);
	}
	
	public List<T> mostrarCap(){
		return cap;
	}
	
}
