package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstWord :");
		String firstWord = scanner.nextLine();
		System.out.println("secondWord :");
		String secondWord = scanner.nextLine();

		scanner.close();
		System.out.println(getWord(firstWord, true) + getWord(secondWord, false));
	}

	private static String getWord(String src, boolean isFirst) {
		int middle = src.length() / 2;
		return isFirst ? src.substring(0, middle) : src.substring(middle);

	}
}
