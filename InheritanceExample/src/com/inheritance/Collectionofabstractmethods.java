package com.inheritance;

public interface Collectionofabstractmethods {

	static int age=20;
	final String name="Dexter";
	int getpay();
	int run();
	int sit();
	default int add(int a,int b){
		return a+b;
	}
}
