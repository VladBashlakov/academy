package by.academy.homework3;

public class Application {
	public static void main(String... args) {
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();

		Product[] products = new Product[3];

		products[0] = new Car("BMW", 2000.0, 1, 200, "red");
		products[1] = new Bike("Honda", 1500.0, 1, 240, "black");
		products[2] = new Tractor("MAZ", 750.0, 1, 50, "green");

		deal.setBuyer(buyer);
		deal.setSeller(seller);

		deal.setProducts(products);
		System.out.println("Bill: ");
		for (Product p : deal.getProducts()) {
			System.out.println(p.getName() + " price: " + p.calcPrice());
		}
		System.out.println("------------");
		System.out.println("Full price: " + deal.calcFullPrice());
	}

}