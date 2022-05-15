package AccessModifier1;

import AccessModifier.PublicModifier1;

public class AccessPublicModifiers {
	public static void main(String[] args) {
		
		PublicModifier1 p1=new PublicModifier1();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
