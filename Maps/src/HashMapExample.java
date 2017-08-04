import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(null, null);
		h.put(1, "suma");
	h.put(1, "raj");
		
		for(HashMap.Entry<Integer, String> x:h.entrySet()){  
			System.out.println(x);
		
		
		
		}

		/*for(Integer y:h.keySet()){  
			System.out.println(y);
		
		
		
		}*/
	/*
		for(String x:h.values()){  
			System.out.println(x);
		
		}*/
	
		/* Iterator it = h.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		}*/

	}

}
