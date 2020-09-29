import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyhashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer>m = new HashMap<String, Integer>();
m.put("gfg", 10);
m.put("ide", 15);
m.put("courses", 20);
System.out.println(m);
for(Map.Entry<String, Integer> e: m.entrySet())
	System.out.println(e.getKey()+ " "+ e.getValue());
	

	}

}
