package methods;

public class Discount {
	static float c ;
	static float z;
	public static void price(float a, float b)
	{
c = a+b;

	}
public static void check()
{
	if(Discount.c>=5000)
	{
		
		z=(Discount.c*20)/100;
	 
	}
	else
	{
		z=Discount.c;
	}
}
	public static void main(String[] args) {
		Discount.price(3000,3000);
		Discount.check();
		System.out.println("The discounted amount is " + Discount.z);

	}

}
