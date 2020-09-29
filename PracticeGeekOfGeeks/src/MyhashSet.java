import java.util.HashSet;
import java.util.Iterator;

public class MyhashSet {

	public static void main(String[] args) {
		HashSet<String> h= new HashSet<String>();
		h.add("gfg");
		h.add("courses");
		h.add("ids");
		System.out.println(h);
		
		System.out.println(h.contains("ide"));
		Iterator<String> i= h.iterator();
	//	while(i.hasNext()) {
		//	System.out.print(i.next()+ " ");
		//}
			for (String s:h)
				System.out.print(s+ " ");
		

	}

}
