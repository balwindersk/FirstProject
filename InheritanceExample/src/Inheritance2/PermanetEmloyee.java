package Inheritance2;

public class PermanetEmloyee extends Parent {
	int annuelSalary;
	  int vactionTime;
	  
  public PermanetEmloyee(String name, String department, String employeeId, int annuelSalary, int vactionTime ) {
		super(name, department, employeeId);
		// TODO Auto-generated constructor stub
		this.annuelSalary=annuelSalary;
		this.vactionTime=vactionTime;
	}

@Override
public int getPayCheque() {
	// TODO Auto-generated method stub
	
	return annuelSalary+vactionTime;
	
}


}


