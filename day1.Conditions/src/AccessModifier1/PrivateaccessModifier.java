package AccessModifier1;

import AccessModifier.AccessModifier;

public class PrivateaccessModifier {
	AccessModifier m1 = new AccessModifier();
	System.out.println("private variable: " + m1.num1);
	System.out.println("default variable: " + m1.num2);
	System.out.println("protected variable: " + m1.num3);
	System.out.println("public variable: " + m1.num4);
	m1.Addtion();
	System.out.println("sum of variable: " + m1.sum);
}

}
