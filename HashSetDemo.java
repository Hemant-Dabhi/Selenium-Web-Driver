/* HashSet
 * If I enter a number to be entered, it will go to hashing function and KEY will 
 * be generated, based on the key, the data will be stored.
 * So insertion order is not fixed.
 * Data duplication is not possible.  
 * 
 * 
 * */


import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(10);
	hs.add("tops");
	hs.add('t');
	hs.add(null);
	hs.add(true);
	hs.add(10.10);
	hs.add(10);
	hs.add(5);
	
	System.out.println(hs);
	
}
}
