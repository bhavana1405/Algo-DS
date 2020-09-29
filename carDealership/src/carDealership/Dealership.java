package carDealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1= new Customer();
		cust1.setName("Tom");
		cust1.setAddress("1000 gable ln..");
		cust1.setCashInHand(25000);
		
		Vehicle vehicle1= new Vehicle("Honda", "Accord", 10000);
		/*vehicle1.setMake("honda");
		vehicle1.setModel("Accord");
		vehicle1.setPrice(15000);*/
		
		Employee emp= new Employee();		
		cust1.PurchaseCar(vehicle1, emp, true);
		
		//Vehicle car= new Vehicle("BMW", "M3", 20000);
		

	}

}
