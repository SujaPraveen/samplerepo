package collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollections {

	public static void main(String[] args) {
		List<String> a= new ArrayList <String>();
		
  a.add("green");
  a.add("red");
  a.add("green");
  a.add("orange");
  a.add("voilet");
  a.add("black");
  a.add("white");
  
  System.out.println("The generic list is "+a);
  
  String s= a.get(2);
  System.out.println("The color in the second position is " +s);
  
  a.set(1,"brown");
  System.out.println("The generic list after replacing color brown " +a);
  
  System.out.println("The index of color red is " +a.indexOf("red"));
  System.out.println("The last index of color green is "+a.lastIndexOf("green"));
  
  a.remove(2);
  System.out.println("The list after removing the color green " +a);
  
  System.out.println("The list contains black color or not  " +a.contains("black"));
  
  System.out.println("The list is empty  "+a.isEmpty());
  System.out.println("The size of generic list is "+a.size());
	}

}
