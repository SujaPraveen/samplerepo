package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set<String> a=new HashSet <String> ();
		a.add("apple");
		a.add("banana");
		a.add("orange");
        System.out.println(a);
        
        Iterator i =a.iterator();// i is the object of iterator and a is the list which we need to iterate
        
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        
        i.remove();
        System.out.println(a);
	}
	
	

}
