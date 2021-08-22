package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedTest {
	public static void main(String[] args) {

		ArrayList<Double> arrayList = new ArrayList<>();
		LinkedList<Double> linkedList = new LinkedList<>();
		final int N = 1000000;
		final int M = 1000;
		for (int i = 0; i < N; i++) {
			arrayList.add(Math.random());
			linkedList.add(Math.random());
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			arrayList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println("Время выполнения у arrayList: " + (System.currentTimeMillis() - startTime) + " мс.");

		startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			linkedList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println("Время выполнения у linkedList: " + (System.currentTimeMillis() - startTime) + " мс.");
	}
}
