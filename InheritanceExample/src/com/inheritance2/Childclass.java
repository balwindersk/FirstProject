package com.inheritance2;

public class Childclass extends Parent{

	public Childclass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method();
		System.out.println("Iam in a child class");
	}
	

}
