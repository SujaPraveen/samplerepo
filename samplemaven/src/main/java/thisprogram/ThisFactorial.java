package thisprogram;

public class ThisFactorial {
	int n;
	int factor;
 public ThisFactorial(int n )
 
	{
	 this.n=n;
	 
		int i =1;
		int factor=1;
		for (i=1;i<=n;i++)
		{
			factor=factor*i;
		}
	}
 
public ThisFactorial()
{
	this(9);
	System.out.println("Factorial of " + n + " is "
                + factor);
}
	public static void main(String[] args) {
		
		ThisFactorial fp=new ThisFactorial();
	}

}
