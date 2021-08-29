package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File dir = new File("C:\\Users\\ASUS\\eclipse-workspace\\academy\\task4");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		int length = 0;
		String text;
		for (int countFile = 1; countFile < 101; countFile++) {
			File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\academy\\task4", countFile + ".txt ");
			if (!file.exists()) {
				try (BufferedReader bufferRider = new BufferedReader(
						new FileReader("C:\\Users\\ASUS\\eclipse-workspace\\textDemo.txt"));
						BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
								"C:\\Users\\ASUS\\eclipse-workspace\\academy\\task4\\result.txt", true))) {
					StringBuilder stringBuilder = new StringBuilder();
					while ((text = bufferRider.readLine()) != null) {
						length += text.length();
						stringBuilder.append(text);
					}
					for (int i = 1; i < 101; i++) {
						file = new File("C:\\Users\\ASUS\\eclipse-workspace\\academy\\task4\\" + (i) + ".txt");
						try (BufferedWriter nextBufferedWriter = new BufferedWriter(new FileWriter(file))) {
							nextBufferedWriter.write(stringBuilder.substring(0, (int) (Math.random() * length)));
						}
						bufferedWriter.write("Файл: " + file.getName() + " Размер " + file.length() + " символов");
						bufferedWriter.newLine();
					}
				} catch (IOException e) {
					System.err.println("Error " + e);
				}
			}
		}
	}
}
