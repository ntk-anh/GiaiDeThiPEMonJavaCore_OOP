package Q2;

public class Computer {
	private String name;
	private String color;
	private double price;

	public Computer() {

	}

	public Computer(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return name + "\t" + price + "\t" + color;
	}
}