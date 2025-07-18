package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=15;
		if(age>18)
		{
			System.out.println("eligible to vote");
			
		}
		else
		{
			throw new NumberFormatException("Not eligible");
		}
	}

}
