package inheritance;

public class SingleChild extends SingleParent{
	public void print()
	{
		System.out.println("From the child class");
	}

	public static void main(String[] args) {
		SingleChild cs =new SingleChild();
		cs.print();
		cs.display();
		

	}

}
