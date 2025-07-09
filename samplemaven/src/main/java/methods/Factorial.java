package methods;

public class Factorial {
	public static void fact(int n)
	{
		int i =1;
		int factor=1;
		for (i=1;i<=n;i++)
		{
			factor=factor*i;
		}
		System.out.println("Factorial of " + n + " is "
                + factor);
	}

	public static void main(String[] args) {
	Factorial.fact(6);

	}

}
