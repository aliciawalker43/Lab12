
public class UsedCar extends Car {

	
	double milage;

	public UsedCar(String make, String model, int year, double price, double milage) {
		super(make, model, year, price);
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "UsedCar [milage=" + milage + ", make=" + make + ", model=" + model + ", year=" + year + ", price="
				+ price + "]";
	}

	public double getMilage() {
		return milage;
	}

	
	
	
	
}
