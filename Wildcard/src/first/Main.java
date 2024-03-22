package first;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Str");
		list2.add("char");
		list2.add("Yea");
		
		Util.imprimirLista(list1);
		System.out.println("==========================");
		Util.imprimirLista(list2);
	}
	

}
