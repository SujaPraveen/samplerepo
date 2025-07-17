package abstraction;

public class AbstractChild extends AbstractParent {

	public static void main(String[] args) {
		AbstractChild ac=new AbstractChild();
		ac.display();
        ac.print();
	}

	
	@Override
	public void display() {
		System.out.println("first");
		
	}

	@Override
	public void print() {
		System.out.println("Second");
		
	}

}
