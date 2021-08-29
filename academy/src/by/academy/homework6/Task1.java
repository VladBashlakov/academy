package by.academy.homework6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			File academy = new File("C:\\Users\\ASUS\\eclipse-workspace\\academy\\");
			if (!academy.exists()) {
				academy.mkdirs();
			}
			File newFile = new File("C:\\Users\\ASUS\\eclipse-workspace\\academy\\", "newFile.txt");
			if (!newFile.exists()) {
				newFile.createNewFile();
			}
			PrintWriter pw = new PrintWriter(newFile);

			boolean stop = false;
			while (!stop) {
				String text = scanner.nextLine();
				if (text.equals("stop")) {
					stop = true;
					break;
				}
				pw.println(text);
			}
			pw.close();

		} catch (IOException e) {
			System.out.println("Error " + e);
		}
		scanner.close();
	}
}
