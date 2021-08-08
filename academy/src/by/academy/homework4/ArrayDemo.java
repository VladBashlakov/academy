package by.academy.homework4;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		Integer[] arrInt = { 1, 2, 3 };
		Array<Integer> obj = new Array<>(arrInt);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.add(13);
		obj.add(15);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(2);
		obj.removeName(1);
		System.out.println(Arrays.toString(obj.getItems()));
		System.out.println(obj.get(0));
		System.out.println(obj.getLast());
		System.out.println(obj.getFirst());
		System.out.println(obj.getLength());
	}
}
