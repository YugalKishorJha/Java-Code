package model;

public class Car {

	private String name;
	private String companyName;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		return name.equals(((Car) (obj)).name);
	}

	public Car(String name, String companyName, double price) {
		this.name = name;
		this.companyName = companyName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", companyName=" + companyName + ", price=" + price + "]";
	}
	
 @Override
public int hashCode() {
	return this.name.hashCode();
}
}
