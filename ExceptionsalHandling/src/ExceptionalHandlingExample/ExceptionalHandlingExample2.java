package ExceptionalHandlingExample;

public class ExceptionalHandlingExample2 {
 public static void main(String[] args){
	 int a=1;
	 int b=0;
	 
	 
	  try{
	
	  int [] d=new int [2];
		 d[0]=1;
		 d[1]=2;
		 d[3]=4;
		  int c = a/b;
		 
			 }
	  catch(ArrayIndexOutOfBoundsException e){
		  System.out.println("iam array out of bound");
				 
			 }
	  try{
		  int c = a/b;
	  }
	  catch(ArithmeticException e){
		  System.out.println("please dont divide by zero");
	  
	  }
	  finally{
		  System.out.println("i execute no matter exception handled or not");
	  }
	  
 }
}
