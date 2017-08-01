package com.inheritance;

public class B implements Collectionofabstractmethods,NewInterface{

	@Override
	public int getpay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sit() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args){
		
		B b = new B();
		
	System.out.println(b.run());
	System.out.println(b.sit());
System.out.println(b.add(2, 3));
b.whereAmI();
System.out.println(b.age);
System.out.println(b.name);
	}

}
