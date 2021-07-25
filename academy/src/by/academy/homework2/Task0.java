package by.academy.homework2;

import java.util.Scanner;

public class Task0 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n, k, i, j, c = 0;
			n = scanner.nextInt();
			k = scanner.nextInt();
			int arr[] = new int[n];
			for (i = 0; i < n; i++)
				arr[i] = scanner.nextInt();
			for (i = 0; i < n - 1; i++)
				for (j = i + 1; j < n; j++)
					if (Math.abs(arr[i] - arr[j]) == k)
						c++;
			System.out.println(c);

		}
	}
}
