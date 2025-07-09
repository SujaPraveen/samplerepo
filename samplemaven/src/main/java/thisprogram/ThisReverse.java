package thisprogram;

public class ThisReverse {
	int n ;
	int reversedNumber;
	public ThisReverse(int n)
	{
        this.n=n;
         reversedNumber = 0;

        while (n != 0) 
{
            int remainder = n % 10; 
            reversedNumber = reversedNumber * 10 + remainder;
           n = n / 10; 
        }

	}
	 public ThisReverse()
	 { 
		 this(567);
		 System.out.println("The reverse of a number is" +reversedNumber);
		 
	 }
public static void main(String args[])
{
	ThisReverse pp =new ThisReverse();	
}
}
