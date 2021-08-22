package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BestGrade {

	public static void main(String[] args) {

		System.out.println("Пожалуйста, введите кол-во оценок: ");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		scanner.close();

		ArrayList<Integer> grade = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			grade.add(i, (int) (Math.random() * 10 + 1));
		}
		System.out.println("Полученные оценки: " + grade);
		Integer maxGrade = searchMaxGrade(grade);
		System.out.println("Максимальная оценка: " + maxGrade + ";");
	}

	private static Integer searchMaxGrade(List<Integer> grade) {

		Iterator<Integer> iterator = grade.iterator();
		Integer maxGrade = iterator.next();
		Integer testGrade = null;

		while (iterator.hasNext()) {
			testGrade = iterator.next();
			if (testGrade > maxGrade) {
				maxGrade = testGrade;
			}
		}
		return maxGrade;
	}

}
