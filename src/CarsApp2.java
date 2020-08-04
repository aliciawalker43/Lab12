import java.util.ArrayList;
import java.util.Scanner;
import java.util.Formatter;

public class CarsApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scnr= new Scanner(System.in);
		ArrayList<Car> allCars= new ArrayList();
		
		
		UsedCar car1= new UsedCar ("Dodge","Dakota",1994, 3000, 201567);
		
		UsedCar  car2= new UsedCar ("Ford","Explorer", 2001, 4500, 147345);
		
		UsedCar car3= new UsedCar("Jeep","Cherokee",2003, 5000, 102445 );
        
		Car car4= new Car("Volkswagon","Tiguan",2019, 23000);
		
		Car car5= new Car(" Cadillac", "Escalade", 2020, 45000);
		
		Car car6= new Car( "Audi"," A8",2020, 75000);
		
		System.out.println("Inventory");
		
		allCars.add(car1);
		allCars.add(car2);
		allCars.add(car3);
		allCars.add(car4);
		allCars.add(car5);
		allCars.add(car6);
	
		
		//.getMake();
		//.getModel()
		
	
		
		// loop to print list menu
		for(Car list: allCars) {
			System.out.println(list);
			
		}
		
		System.out.println("\n");
		System.out.println("Which car would you like to select? "
				+ "Choose number 1-6 ");
		      int userPick= scnr.nextInt();
		
		      Car buy= null;
		      switch (userPick) { 
		      case 1:
		    	  System.out.println(car1);
		    	  buy = car1;
		    	  break;
		      case 2:
		    	  System.out.println(car2);
		    	  buy= car2;
		    	  break;
		      case 3:
		    	  System.out.println(car3);
		    	  buy = car3;
		    	  break;
		      case 4:
		    	  System.out.println(car4);
		    	  buy = car4;
		    	  break;
		      case 5:
		    	  System.out.println(car5);
		    	  buy = car5;
		    	  break;
		      case 6:
		    	  System.out.println(car6);
		    	  buy = car6;
		    	  break;
		    	  
		      //System.out.println();
	
		      }
		      System.out.println(" Are you interested in buying?");
		      String yesNo= scnr.next();
		      
		      if (yesNo.startsWith("y")){
		    	  allCars.remove(buy);
		    	  for(Car list: allCars) {
					System.out.println(list);
		    	}
             }
	}	      
}