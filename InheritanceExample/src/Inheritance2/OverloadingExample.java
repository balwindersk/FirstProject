package Inheritance2;

public class OverloadingExample {
	
	public int add(int a,int b){
		return a+b;
	}
public int add(int a, int b,int c){
	return a+b+c;
}
public double add (double a ,double b,double c,double d){
	return a+b+c+d;
}

public static void main(String[] args){
	OverloadingExample oa = new OverloadingExample();
	System.out.println(oa.add(1, 1));
	System.out.println(oa.add(1, 1, 1));
	System.out.println(oa.add(1.0, 1.0, 1.0, 1.0));
}
}
