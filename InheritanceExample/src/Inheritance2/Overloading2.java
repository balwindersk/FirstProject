package Inheritance2;

public class Overloading2 {
	public int add(int e,int o){
	  return e+o;
	  
	}
	public int add(int e, int o, int p){
	return e+o+p;
	}
	public int add(int e, int o, int p, int s){
		return e+o+p+s;
		
	}
	public static void main(String[] args){
		
		Overloading2 ov2= new Overloading2();
		System.out.println(ov2.add(1, 1));
		System.out.println(ov2.add(1,2, 1));
		
	}
}
