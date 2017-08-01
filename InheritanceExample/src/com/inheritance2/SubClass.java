package com.inheritance2;

public class SubClass extends Childclass{

	public SubClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method();
		System.out.println("Iam in a subclass");
	}
	public static void main(String[] args){
		Parent p = new Parent("Balwinder");
		System.out.println(p.name);
		p.method();
		System.out.println("-------");
		Childclass c = new Childclass("Ballu");
	System.out.println(c.name);
	c.method();
	System.out.println("------");
	SubClass sb = new SubClass("Ballu1");
			System.out.println(sb.name);
	sb.method();
	
	
		
	}
	

}
