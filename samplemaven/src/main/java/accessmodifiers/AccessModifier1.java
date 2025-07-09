package accessmodifiers;

public class AccessModifier1 {
public void display()
{
	System.out.println("public");
	
}

private void display1()
{
	System.out.println("private");
}

protected void display2()
{
 System.out.println("protected");
}
void display3()
{
	System.out.println("Default");
}
	public static void main(String[] args) {

		AccessModifier1 am =new AccessModifier1();
		am.display();
		am.display1();
		am.display2();
		am.display3();
	}

}
