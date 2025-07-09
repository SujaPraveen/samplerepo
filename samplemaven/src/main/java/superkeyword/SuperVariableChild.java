package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
int n=3;
public void display()
{
	System.out.println(super.n);
	System.out.println(n);
}
	public static void main(String[] args) {
		
		SuperVariableChild sc=new SuperVariableChild();
		sc.display();
	}

}
