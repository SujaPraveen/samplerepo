package methods;

public class VotingEligibility {

	public static boolean display()
	{
		int age=18;
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		
		Boolean t= VotingEligibility.display();
		System.out.println(t);
	}

}
