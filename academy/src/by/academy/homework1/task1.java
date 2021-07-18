package by.academy.homework1;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			System.out.println("Введите сумму покупки: ");
			int a = scanner.nextInt();
			System.out.println("Введите возраст покупателя: ");
			int b = scanner.nextInt();
			System.out.println("Сумма покупки с учетом скидки: ");
			if (a < 100)
				System.out.println(a - a * 0.05);
			else if (a >= 100 && a < 200)
				System.out.println(a - a * 0.07);
			else if (a >= 200 && a < 300 && b > 18)
				System.out.println(a - a * (0.12 + 0.04));
			else if (a >= 200 && a < 300 && b < 18)
				System.out.println(a - a * (0.12 - 0.03));
			else if (a >= 300 && a < 400)
				System.out.println(a - a * 0.15);
			else if (a >= 400)
				System.out.println(a - a * 0.20);
			else if (a >= 200 && a < 300 && b > 18)
				System.out.println(a - a * (0.12 + 0.04));
			scanner.close();
	 }
}
