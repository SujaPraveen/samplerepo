package aggregation;

public class AggregrationChild1 {
String address;
AggregrationParent1 ref;
public AggregrationChild1(String address,AggregrationParent1 ref)
{
	this.address=address;
	this.ref=ref;
}

public void display()
{
	
	System.out.println(ref.name+" "+ref.n);
	System.out.println(address);
	}

	public static void main(String[] args) {
		
		AggregrationParent1 ap =new AggregrationParent1("Ammu",25);
		AggregrationChild1 ac=new AggregrationChild1("Madhavam",ap);
		ac.display();
	}

}
