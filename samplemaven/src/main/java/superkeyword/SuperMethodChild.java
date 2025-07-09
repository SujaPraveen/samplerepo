package superkeyword;

public class SuperMethodChild extends SuperMethodParent{

	public void display()
	{
		super.print();
		System.out.println("Child Method");
	}
	public static void main(String[] args) {
		
		SuperMethodChild sm =new SuperMethodChild();
		sm.display();
	}

}
