package interfacepackage;

public class mutlicalsschild implements multiinterfcaeparent,multiinterfaceparent2{
	

	public static void main(String[] args) {
	
		mutlicalsschild mc=new mutlicalsschild();
		mc.show();
		mc.print();
		System.out.println("Child class");
	}

	public void show()
	{
		System.out.println("Parent1");
	}
	
	public void print()
	{
		System.out.println("Parent2");
	}
}
