import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeMap<Integer,String> t = new TreeMap<Integer,String>();
       t.put(1, "suma");
       t.put(4, null);
       t.put(2, "suma");
       for(Entry<Integer,String> c :t.entrySet()){
    	   System.out.println(c);
       }
	}

}
