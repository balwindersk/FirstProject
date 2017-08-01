package ExceptionalHandlingExample;

import java.util.Scanner;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newExample n = new newExample(0, 0);
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a vlaue");
		n.setA(sc.nextInt());
		System.out.println("please enter b value");


		if(n.getB()==0){
			System.out.println("Please enter valid number");
		
		}
		else{
		int c = n.getA()/n.getB();
		System.out.println(c);
	}

	}
}
