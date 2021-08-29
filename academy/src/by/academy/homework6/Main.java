package by.academy.homework6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("U1", "1U", 57));
		users.add(new User("U2", "2U", 25));
		users.add(new User("U3", "3U", 97));
		users.add(new User("U4", "4U", 14));
		users.add(new User("U5", "5U", 3));
		users.add(new User("U6", "6U", 16));
		users.add(new User("U7", "7U", 21));
		users.add(new User("U8", "8U", 13));
		users.add(new User("U9", "9U", 123));
		users.add(new User("U10", "10U", 143));
		users.add(new User("U11", "11U", 713));

		for (User user : users) {
			File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\academy\\" + user.getName() + "_"
					+ user.getLastName() + ".txt");
			try {
				if (!file.exists()) {
					file.createNewFile();
					file.mkdirs();
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
			for (User U : users) {
				try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
					for (User U1 : users) {
						User i = new User(null, null, 0);
						oos.writeObject(i);
					}
				} catch (Exception ex) {
					System.err.println(ex.getMessage());
				}
			}
		}
	}
}