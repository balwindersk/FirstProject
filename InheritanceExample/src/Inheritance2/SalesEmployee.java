package Inheritance2;

public class SalesEmployee extends Parent {
  int profit;
  int annuelSalary;
  
	public SalesEmployee(String name, String department, String employeeId, int profit, int annuelSalary) {
		super(name, department, employeeId);
		// TODO Auto-generated constructor stub
		this.profit=profit;
		this.annuelSalary=annuelSalary;
		
	}

	@Override
	public int getPayCheque() {
		// TODO Auto-generated method stub
		return profit+annuelSalary;
		
	}

}
