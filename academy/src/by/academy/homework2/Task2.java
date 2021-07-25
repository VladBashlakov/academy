package by.academy.homework2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task2 {
	public static void main(String[] args) {
		System.out.print("Введите слова через запятую: ");
		Scanner s = new Scanner(System.in);
		String[] words = s.nextLine().replaceAll(" ", "").split(",");
		int minIndex = 0, minLen = getNumMin(words[0]);
		for (int i = 0; i < words.length; i++) {
			if (getNumMin(words[i]) < minLen) {
				minIndex = i;
				minLen = getNumMin(words[i]);
			}
			if (minLen == 1)
				break;
			s.close();

		}
		;
		System.out.print("Слово " + words[minIndex] + ", номер " + (minIndex + 1) + ", разных символов " + minLen);

	}

	public static int getNumMin(String word) {
		int k = word.length();
		Pattern pat1 = Pattern.compile("(.)(?=.*(\\1))");
		Matcher m1 = pat1.matcher(word);
		while (m1.find())
			k--;

		return k;
	}

	public static void p(Object o) {
		System.out.println(o.toString());
	}
}