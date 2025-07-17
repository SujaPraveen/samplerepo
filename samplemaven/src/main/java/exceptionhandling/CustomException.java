package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {// declare exception keyword used throws
		// TODO Auto-generated method stub
		
		int age=15;
		if(age>18)
		{
			System.out.println("eligible to vote");
			
		}
		else
		{
			throw new VotingException("Not eligible");
		}

	}

}
