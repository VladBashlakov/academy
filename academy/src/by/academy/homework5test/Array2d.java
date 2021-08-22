package by.academy.homework5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Array2d<T> implements Iterator<T> {

	private T[][] array;
	private int i;
	private int j;

	public static void main(String[] args) {

		Integer[][] Array2d = { { 8, 8, 8 }, { 9, 9, 9 }, { 7, 7, 7 } };

		Array2d<Integer> iterator = new Array2d<Integer>(Array2d);
		while (iterator.hasNext()) {
			System.out.print("[" + iterator.next() + "]");
		}
	}

	public Array2d(T[][] array) {
		this.array = array;
	}

	public boolean hasNext() {
		for (int i = this.i; i < array.length; i++) {
			for (int j = this.j; j < array[i].length;) {
				return true;
			}
		}
		return false;
	}

	public T next() {
		if (!hasNext())
			throw new NoSuchElementException();
		T t = array[i][j];
		j++;
		for (int i = this.i; i < array.length; i++) {
			for (int j = (i == this.i ? this.j : 0); j < array[i].length;) {
				this.i = i;
				this.j = j;
				return t;
			}
		}
		return t;
	}
}