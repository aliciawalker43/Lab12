import java.util.Scanner;

public class CarApp {

	public static Scanner scnr= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int carsAmount=0;
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering?");	
		
		try {  carsAmount= scnr.nextInt();
				}catch(NumberFormatException ex) {
					System.out.println("invalid number choose again.");
				}
		
		//try to get the number to change
		 Car cars=new Car();
		
		 for (int i =0; i< carsAmount; i++) {
			 int num= (i+1);
		System.out.println("Enter car #"+ num +"Make: ");
		        cars.setMake(scnr.next());
		System.out.println("Enter car #"+ num + "Model: ");
		        cars.setModel(scnr.next());
		System.out.println("Enter car #"+ num + "Year: ");
		        cars.setYear(scnr.nextInt());
		System.out.println("Enter car #"+ num + " Price: ");
		        cars.setPrice(scnr.nextDouble());
		 }
		        
		
		        System.out.println("Current Inventory:");
		        System.out.println(cars);
	}
}
