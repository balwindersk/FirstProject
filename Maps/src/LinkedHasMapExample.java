import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHasMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> li = new LinkedHashMap<Integer,String> ();
		li.put(null, "suma");
		li.put(1, null);
		li.put(2,null);
		for(Entry<Integer, String>  d :li.entrySet()){
			System.out.println(d);
		}
	}

}
