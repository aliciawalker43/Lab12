
public class Car {

	
	
	String make;
	String model;
	int year;
	double price;
	
	
	
	//Constructors
	
	
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Car(String make) {
		super();
		this.make = make;
		
	}
	public Car(double price) {
		super();
		this.price = price;
	}
	
	
	public Car(int year) {
		super();
		this.year = year;
	}
	
	public Car() {
		super();
	}
	
	
	//Getters and setters
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
}



