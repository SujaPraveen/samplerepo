package collections;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> a=new HashSet <String> ();
		a.add("apple");
		a.add("banana");
		a.add("orange");
		
		System.out.println("the set is" +a);
		
		Set <String> b=new HashSet <String>();
		b.add("watermelon");
		b.add("pineapple");
		
		System.out.println("the new set is" +b);
		
		a.addAll(b);
		System.out.println("the combined set is" +a);
		
		System.out.println("The list a contains all vales of b" + a.containsAll(b));
		
		System.out.println("The list b contains all vales of a" + b.containsAll(a));
		
		System.out.println("The list is empty or not " + a.isEmpty());
		System.out.println("Remove pineaapple" + a.remove("pineapple"));
		System.out.println("The size of the set is " + a.size());
		System.out.println("Remove all list of b from a " + a.removeAll(b));
		a.clear();
		
		System.out.println( a);
		
	}

}
