package inheritance;

import accessmodifiers.AccessModifier1;

public class AccessModifier3 extends AccessModifier1 {//to display the protected as it 

	public static void main(String[] args) {
		AccessModifier1 am=new AccessModifier1();//imported as we tried to call the methods of another package
		AccessModifier3 am1=new AccessModifier3();
		am.display();
		am1.display2();
	
	}

}
