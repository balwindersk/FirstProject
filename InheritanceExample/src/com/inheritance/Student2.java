package com.inheritance;

public class Student2 extends Parent {
	int score;

	public Student2(String department, String address,int score) {
		super(department, address);
		this.score = score;
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

}
