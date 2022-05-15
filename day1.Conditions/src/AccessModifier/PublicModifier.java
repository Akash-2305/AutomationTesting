package AccessModifier;
public class PublicModifier {

	protected int accNum=12345;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		PublicModifier p1=new PublicModifier();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessProtectedMembers {

	public static void main(String[] args) {
		
		PublicModifier p1=new PublicModifier();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

