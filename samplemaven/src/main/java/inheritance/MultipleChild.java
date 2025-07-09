package inheritance;

public class MultipleChild extends MultipleParent{
	public void display2()
	{
		System.out.println("3rd generation-child");
	}

	public static void main(String[] args) {
		MultipleChild mp=new MultipleChild();
		mp.display();
		mp.display1();
		mp.display2();
		
	}

}
