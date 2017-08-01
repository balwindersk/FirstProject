package com.inheritance;

public class TestAbstract extends AbstractMethod{

	@Override
	void add() {
		// TODO Auto-generated method stub}
		System.out.println("iam in add");
	}
	

	@Override
	void substraction() {
		// TODO Auto-generated method stub
		System.out.println("iam in substraction");
	}

	@Override
	void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("iam in multliplication");
	}
public static void main(String args[]){
	TestAbstract t = new TestAbstract();
			t.add();
	t.multiplication();
	t.substraction();
}
}
