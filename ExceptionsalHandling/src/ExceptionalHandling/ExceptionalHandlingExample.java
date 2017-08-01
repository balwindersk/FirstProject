package ExceptionalHandling;

public class ExceptionalHandlingExample {
	public static void main(String[] args){
		int a=1;
		int b=0;
		try{
		int c = a/b;
		}
		catch(ArithmeticException e){
		System.out.println("please dont divide by zero");
		
		}
		
	}

}
