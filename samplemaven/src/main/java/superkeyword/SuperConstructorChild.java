package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild()
	{
		super(1,2);
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		
		SuperConstructorChild sp= new SuperConstructorChild();
	}

}
