package by.academy.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
	public static boolean equalsWords(String w1, String w2) {
		return wordToMap(w1).equals(wordToMap(w2));
	}

	public static Map<String, Integer> wordToMap(String w) {
		Map<String, Integer> map = new HashMap<>();
		for (String s : w.split("")) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.replace(s, 1 + map.get(s));
			}
		}
		return map;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		System.out.println(equalsWords(a, b));
		scanner.close();
	}
}
