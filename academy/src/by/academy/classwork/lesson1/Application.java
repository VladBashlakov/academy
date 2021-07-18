package by.academy.classwork.lesson1;

public class Application {
	public static void main(String... args) {
		Cat Tom = new Cat();
		Tom.age = 4;
		Tom.nickname = "Том";

		Cat n = new Cat();
		n.age = 6;

		Tom.eat();
		Tom.sleep();
		Tom.walk();

		n.grow();
		n.grow();
		n.grow();
		System.out.println(n.age);

	}

}
