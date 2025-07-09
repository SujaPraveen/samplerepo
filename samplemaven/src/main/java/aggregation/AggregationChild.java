package aggregation;

public class AggregationChild {
String city;
String state;
AggregationParent ref;
public AggregationChild(String city,String state,AggregationParent ref)
{
	this.city=city;
	this.state=state;
	this.ref=ref;
}

public void display()
{
	System.out.println(city+" "+state);
	System.out.println(ref.name+" "+ref.rollno+" "+ref.Address);
	}

	public static void main(String[] args) {
		AggregationParent  Ap1 =new AggregationParent("ammu",19,"Madhavam");
		
		AggregationChild Ap2=new AggregationChild("tvm","Kerala",Ap1);
				Ap2.display();

	}

}
