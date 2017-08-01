package Inheritance2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated metnull)hod stub
Parent p= new Parent ("Balwinder","IT", "123nn");
System.out.println(p.name);
System.out.println(p.getPayCheque());
System.out.println("-----------------------------");
ContactEmployee CE= new ContactEmployee ("Vishal", "Dev", "234ll",40,100);
System.out.println(CE.name);
System.out.println(CE.getPayCheque());
System.out.println("--------");
PermanetEmloyee PE= new PermanetEmloyee ("Kumar", "HR", "345kk", 88000, 4);
System.out.println(PE.getPayCheque());
System.out.println(PE.name);
System.out.println("--------");
SalesEmployee SE= new SalesEmployee ("Ram", " HRR", "234oo", 95000, 20000);
System.out.println(SE.getPayCheque());

	}

}
