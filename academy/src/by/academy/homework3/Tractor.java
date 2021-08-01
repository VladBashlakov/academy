package by.academy.homework3;

import java.util.Objects;

public class Tractor extends Product {

	private int speed;
	private String color;

	public Tractor() {
		super();
	}

	public Tractor(String name, double price, int quantity, int speed, String color) {
		super(name, price, quantity);
		this.speed = speed;
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
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
		Tractor other = (Tractor) obj;
		return Objects.equals(color, other.color) && speed == other.speed;
	}

	@Override
	public String toString() {
		return "Tractor [speed=" + speed + ", color=" + color + "]";
	}

	@Override
	protected double discount() {
		if (speed < 60) {
			return 0.2;
		}
		return 0;
	}

}
