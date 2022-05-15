package AccessModifier;

public class AccessModifier {

	private int num1 = 10;
	int num2 = 20,sum;
	protected int num3 = 30;
	public int num4 = 40;
	private int Addtion() {
		sum=num2+num3+num4;
		return sum;
		
	}

	public static void main(String[] args) {

		AccessModifier m1 = new AccessModifier();
		System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
		m1.Addtion();
		System.out.println("sum of variable: " + m1.sum);
	}
}
class Modifiers {
	public static void main(String[] args) {

		AccessModifier m1 = new AccessModifier();
		//System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);	
		//m1.Addtion();
	}
}