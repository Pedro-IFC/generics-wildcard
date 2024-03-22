package second;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		System.out.println(Util.adicionarNumero(list1, 2).toString());
		/*
		 * System.out.println(Util.adicionarNumero(list1, 2.5).toString());
		 * System.out.println(Util.adicionarNumero(list1, "A").toString());
		 * List<String> list2 = new ArrayList<String>();
		 * System.out.println(Util.adicionarNumero(list2, 2).toString());
		 */
	}

}
