package by.academy.homework1;

public class task4 {
	public static void main(String[] args) {

		int i = 0;
		int x = (int) Math.pow(2, i);
		while (x <= 1000000) {
			System.out.println("2 в степени " + i + " = " + x);
			i++;
			x = (int) Math.pow(2, i);
		}
	}
}