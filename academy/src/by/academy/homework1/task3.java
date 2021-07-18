package by.academy.homework1;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
	System.out.println("Введите число: ");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int n = 0;
	if (a >= 1 && a <= 10) {
		while (n < 10) {
			System.out.println(n * a);
			n++;
		}
	} else {
		System.out.println("Ошибка число больше 10");
	}
	scanner.close();
}
}