package AccessModifier1;

import AccessModifier.PublicModifier;

public class ProtectedAccessModifer extends PublicModifier {
	public static void main(String[] args) {
		
		ProtectedAccessModifer p1=new ProtectedAccessModifer();
		System.out.println(p1.accNum);
		System.out.println("Accessing Protected members from another class outside of package");
		p1.displayAccNum();
	}

}
