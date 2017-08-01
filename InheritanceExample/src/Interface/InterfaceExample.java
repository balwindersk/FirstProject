package Interface;

public class InterfaceExample implements InterfaceExample1{
int a;
int b;
	public InterfaceExample(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
	
	@Override
	public int add1() {
		// TODO Auto-generated method stub
		return a+b;
	}


	
	public static void main(String[] args){
		InterfaceExample ie = new InterfaceExample(2,3);
	System.out.println(ie.add1());
		System.out.println(InterfaceExample1.hours);
		System.out.println(InterfaceExample1.hrlyrate);
		System.out.println(ie.add());
	}



	
 
}
