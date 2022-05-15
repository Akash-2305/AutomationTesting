package Overriding;
class Parent3 {
	// Can't be overridden
	 void show() {
		System.out.println("I am final method of Parents class");
	}
}
class Child3 extends Parent3 {
	// This would produce error
	void show() {
		System.out.println("I am show method of child3 class");
	}
}
// Driver class
public class Ovrriding {
	public static void main(String[] args) {

	}
}

