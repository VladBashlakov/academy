package by.academy.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DeleteDuplicates {

	public static <T> Collection<T> deleteDuplicates(Collection<T> collection) {
		Set<T> newCollection = new HashSet<T>(collection);

		collection.clear();
		collection.addAll(newCollection);

		return collection;
	}

	public static void main(String[] args) {

		Scanner count = new Scanner(System.in);
		Scanner numbers = new Scanner(System.in);

		System.out.println("Пожалуйста, введите кол-во символов:");
		Integer[] array = new Integer[count.nextInt()];

		System.out.println("Пожалуйста, введите символы для заполнения: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = numbers.nextInt();
		}

		System.out.print("Числа на проверку: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		List<Integer> box = new ArrayList<>(Arrays.asList(array));
		deleteDuplicates(box);
		System.out.println("Числа после удаления дубликатов " + box.toString());

		count.close();
		numbers.close();
	}
}
