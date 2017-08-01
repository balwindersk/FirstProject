package Inheritance2;

public class Overlodading3 {
	
  public int add(int a, int b, int d){
	 return a+b+d;
	 
	  
  }
  public int add(int a, int b, int d, int r){
	  return a+b+d+r;
	  
  }
  
  public int add(int a, int b, int d, int r, int l){
	  return a+b+d+r+l;
	  
  }
  public static void main(String[] args){
	  Overlodading3 ol3= new Overlodading3();
	  System.out.println(ol3.add(1, 2, 3, 4));
	  
  }
}
