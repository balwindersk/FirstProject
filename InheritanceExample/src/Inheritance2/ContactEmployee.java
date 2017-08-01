package Inheritance2;

public class ContactEmployee extends Parent{
	int hourlyRate;
	int hoursWorked;
	

	public ContactEmployee(String name, String department, String employeeId,int hourlyRate, int hoursWorked ) {
		super(name, department, employeeId);
		// TODO Auto-generated constructor stub
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}


	@Override
	public int getPayCheque() {
		// TODO Auto-generated method stub
		super.getPayCheque();
		return  hourlyRate * hoursWorked;
		
		
		
	}
	

}
