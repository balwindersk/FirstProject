package com.access;

public class Test {
	public static void main(String[] args){
		
		PrivateExample pe = new PrivateExample();
		pe.setAge(20);
		System.out.println(pe.getAge());
		ProtectedExample pec = new ProtectedExample();
		System.out.println(pec.age);
		
		Default d = new Default();
		System.out.println(d.age);
	}

}
