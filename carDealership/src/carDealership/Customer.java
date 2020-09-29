package carDealership;

public class Customer {
	
	private String name;
	private String address;
	private double CashInHand;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashInHand() {
		return CashInHand;
	}

	public void setCashInHand(double cashInHand) {
		CashInHand = cashInHand;
	}

	public void PurchaseCar(Vehicle vehicle, Employee emp, boolean finance){
		emp.HandleCustomer(this, finance, vehicle);
		
	}

}
