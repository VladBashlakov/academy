package by.academy.homework4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorJava {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("J");
		arrayList.add("A");
		arrayList.add("V");
		arrayList.add("A");

		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(" " + element + " ");
		}

	}

}
