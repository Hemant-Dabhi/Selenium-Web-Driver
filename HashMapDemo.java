import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*Key and Value
 * Data is accessed with the help of KEY and we get VALUE.
 * HashMap does not have any method named Iterator, because information is in Key and Value format.
 * Parameter of Angular Bracket can only be CLASS.
 * 
 * */
public class HashMapDemo {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(101,"Jigar");
	hm.put(110,"Hemant");
	hm.put(109, "Rutu");
	hm.put(190,"Jay");
	hm.put(11,"Sunil");
	hm.put(101,"Harnish");
	
	System.out.println(hm);
	System.out.println(hm.get(109));
	System.out.println(hm.isEmpty());
	System.out.println(hm.remove(110));
	System.out.println(hm.replace(11,"Jigar"));
	System.out.println(hm.size());
	System.out.println(hm.entrySet());
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	
	Set set=hm.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
