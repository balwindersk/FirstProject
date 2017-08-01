package com.inheritance;

public class AbstractExample3 extends AbstractExample2{

	public AbstractExample3(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	int age() {
		// TODO Auto-generated method stub
		return 0;
	}
public static void main(String[]args){
	AbstractExample3 ae = new AbstractExample3(2);
	System.out.println(ae.age());
	System.out.println(ae.age);
	
	
}
}
