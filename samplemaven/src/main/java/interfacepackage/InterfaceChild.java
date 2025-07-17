package interfacepackage;

public class InterfaceChild implements InterfaceDisplay {

	public static void main(String[] args) {
		
		InterfaceChild ic=new InterfaceChild();
		ic.display();
		ic.print();
	}

	@Override
	public void display() {
		System.out.println("Interface Parent");
		
	}

	@Override
	public void print() {
		System.out.println("Interface Child");
	}

}
