package atv1Generic;

import java.util.ArrayList;
import java.util.List;

public class InfoAp <T extends Moveis>{
	
	List<T> apartMov = new ArrayList<>();
	List<T> apartElec = new ArrayList<>();
	List<T> apartDec = new ArrayList<>();
	
	public void adicionarMoveis(T mov) {
		apartMov.add(mov);
	}
	
	public List<T> mostrarMoveis(){
		return apartMov;
	}
	
	public void adicionarEletro(T ele) {
		apartElec.add(ele);
	}
	public List<T> mostrarEletros(){
		return apartElec;
	}
	
	public void adicionarDec(T dec) {
		apartDec.add(dec);
	}
	public List<T> mostrarDec(){
		return apartDec;
	}
 
}
