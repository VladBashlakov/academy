package by.academy.homework6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
	public static void main(String[] args) throws IOException {
		{
			File dir = new File("C:\\Users\\ASUS\\eclipse-workspace");

			if (!dir.exists()) {
				dir.mkdirs();
			}
			try {

				File newFile = new File("C:\\Users\\ASUS\\eclipse-workspace", "result.txt");
				if (!newFile.exists()) {
					newFile.createNewFile();
				}
			} catch (IOException e) {
				System.out.println("Error " + e);
			}

			String INPUT_FILE_PATH = "C:\\Users\\ASUS\\eclipse-workspace\\textDemo.txt";
			String OUTPUT_FILE_PATH = "C:\\Users\\ASUS\\eclipse-workspace\\result.txt";

			File inputFile = new File(INPUT_FILE_PATH);
			if (!inputFile.exists()) {
				inputFile.createNewFile();
			}

			File outputFile = new File(OUTPUT_FILE_PATH);
			if (!outputFile.exists()) {
				outputFile.createNewFile();
			}

			try (FileInputStream fileIn = new FileInputStream(inputFile);
					FileOutputStream fileOut = new FileOutputStream(outputFile)) {
				int a;
				while ((a = fileIn.read()) != -1) {
					System.out.println((char) a);
					if ((char) a == ' ') {
						fileOut.write('.');
					} else {
						fileOut.write(a);
					}
				}
			}
		}
	}
}