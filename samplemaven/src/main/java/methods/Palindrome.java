package methods;

public class Palindrome {
	int a;
	int reversedNumber;
	public void reverse(int n)
	{
		a=n;
		reversedNumber=0;	


	        while (n != 0) 
	{
	            int remainder = n % 10; 
	            reversedNumber = reversedNumber * 10 + remainder;
	            n= n / 10; 
	        
	        }
	}
       public void display()
       {
    	   if(a==reversedNumber)
    
    	   {
    		   System.out.println("Number is plaindrome");
    	   }
    	   else
    	   {
    		   System.out.println("Number is not plaindrome");
    	   }
       }

	public static void main(String[] args) {
		
		Palindrome pp =new Palindrome();
		pp.reverse(121);
		pp.display();
	}

}
