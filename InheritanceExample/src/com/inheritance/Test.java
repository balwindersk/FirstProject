package com.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p = new Parent("Science", "Leesburug");
System.out.println(p.schoolName);
System.out.println(p.address);
System.out.println(p.department);

Student1 s1= new Student1("computers", "Leesburg", 200);
s1.setScore(100);
s1.setAddress("1949 Sandbridge way");
System.out.println(s1.schoolName);
System.out.println(s1.getAddress());
System.out.println(s1.getAddress());
System.out.println(s1.getScore());

Student2  s2= new Student2("Physics", "Leesburg", 250);
s2.setScore(200);
System.out.println(s2.department);
System.out.println(s2.address);
	}

}
