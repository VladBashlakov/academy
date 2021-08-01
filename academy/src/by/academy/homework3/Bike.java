package by.academy.homework3;

import java.util.Objects;

public class Bike extends Product {
	private int speed;
	private String color;

	public Bike() {
		super();
	}

	public Bike(String name, double price, int quantity, int speed, String color) {
		super(name, price, quantity);
		this.speed = speed;
		this.color = color;
	}

	public double getWeight() {
		return speed;
	}

	public void setWeight(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, speed);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [weight=");
		builder.append(speed);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

	@Override
	protected double discount() {
		if (speed < 200) {
			return 0.2;
		}
		return 0;
	}
}
