package polymorphism;

public class PolyChild extends PolyParent{
	public void add(int a , int b)
	{
		 super.add(3,4);
		int c=a-b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		PolyChild pc =new PolyChild();
		pc.add(2, 1);
	}

}
