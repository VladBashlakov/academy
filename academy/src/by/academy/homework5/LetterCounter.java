package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCounter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Пожалуйста, введите строку: ");
		String text = scanner.nextLine();
		scanner.close();

		Map<Character, Integer> stringBox = new HashMap<>();

		for (Character letter : text.toCharArray()) {
			stringBox.put(letter, stringBox.getOrDefault(letter, 0) + 1);
		}

		for (Character key : stringBox.keySet()) {
			System.out.println(" Буква " + key + " : " + "напечатана " + stringBox.get(key) + " раз;");
		}

	}
}
