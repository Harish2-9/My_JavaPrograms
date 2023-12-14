package car_dealership;

public class Customer {
	private String name;
	private String add;
	private double cash;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		add+="Bangalore";
		this.add = add;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		cash+=500;
		this.cash = cash;
	}

	public void purchasecar(Vehicle veh ,Employee emp,boolean finance) {
		emp.handlecust(this, finance, veh);
	}
}
