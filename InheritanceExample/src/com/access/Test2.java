package com.access;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateExample pe = new PrivateExample();
		pe.setAge(10);
		System.out.println(pe.getAge());
		ProtectedExample2 PE2= new ProtectedExample2();
		System.out.println(PE2.age);
		DefaultExample DE= new DefaultExample();
		System.out.println(DE.age);
		
	}
	
	
	
}
