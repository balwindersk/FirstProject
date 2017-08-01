package com.inheritance;

public abstract class AbstractExample2 {
   
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
  abstract int age();

public AbstractExample2(int age) {
	super();
	this.age = age;
}
  
  
	
}
