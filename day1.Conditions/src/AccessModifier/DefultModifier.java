package AccessModifier;
public class DefultModifier {

	int accNum=12345;
	void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		DefultModifier p1=new DefultModifier();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessDefaultMembers {

	public static void main(String[] args) {
		
		DefultModifier p1=new DefultModifier();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

