package car_dealership;

public class Employee {
	String empname;
	
	
	public void handlecust(Customer cust,boolean finance,Vehicle veh) {
		
		if(finance==true) {
			double loanamt=veh.getPrice()-cust.getCash();
			runcredhistory(cust, loanamt);
		}
		else if(veh.getPrice()<=cust.getCash()) {
			//customer pays in cash
			processtransaction(cust,veh);
		}
		else
			System.out.println("Bring more money");
	}
	public void runcredhistory(Customer cust,double loanamt) {
		System.out.println("Ran credit history for customer.....");
		System.out.println("customer has bee approved to buy the vehicle");
	}
	public void processtransaction(Customer cust, Vehicle veh) {
		System.out.println("Customer has purchased the vehicle "+veh+"for the price :"+veh.getPrice());
	}
	
}
