package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1=new Customer();
		cust1.setName("Tom");
		cust1.setAdd("paris");
		cust1.setCash(2000);
		
		Vehicle veh=new Vehicle("Benz","xls",1000);
		
		
		Employee emp=new Employee();
		
		cust1.purchasecar(veh,emp, false);
		
		
	}

}
