package carDealership;

public class Employee {
public void HandleCustomer(Customer cust, boolean finance, Vehicle vehicle)
{
		if (finance==true) {
			
			double loanAmount= vehicle.getPrice()-cust.getCashInHand();
			runCreditHistory(cust, loanAmount);
			
		} else if (vehicle.getPrice()<= cust.getCashInHand()) {
			// customer pays in cash
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Customer needs more money to but the vehicle"+ vehicle);
		}
}

public void runCreditHistory(Customer cust, double loanAmount) {
	System.out.println("Ran cust credit history");
	System.out.println("Cust approved to purchase the vehicle");
}

public void processTransaction(Customer cust, Vehicle vehicle) {
	System.out.println("Customer has purchased the vehicle: "+ vehicle +"for the price"+ vehicle.getPrice());
	
}
}
