package Abstraction;
abstract class Demo3 {
	abstract void print();//abstract method/incomplete method
	void display() {// normal or non-abstract or concrete method or complete method
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo {
	void display() {
		System.out.println("I am a non-abstract method display()..");
	}
	void display2() {
		System.out.println("I am a non-abstract method display2()..");
	}
	abstract void print0();
}
abstract class Demo2 {
	
	abstract void print1();
	abstract void print2();
}
class D extends Demo2 {
	
	 void print1(){
		System.out.println("I am a abstract method display2()..");
	}
	 void print2() {
		System.out.println("I am a abstract method display3()..");
	}
}
class E extends Demo {
void print0() {
	System.out.println("I am a abstract method display0()..");
}
}
class F extends Demo3 {
	void print() {
		System.out.println("I am a abstract method print()..");
}
}
public class Abstraction5 {
	public static void main(String[] args) {
		Demo3 a1= new F();
		a1.print();
		a1.display();
		Demo a2 = new E();
		a2.print0();
		a2.display();
		a2.display2();
		Demo2 a3 = new D();
		a3.print1();
		a3.print2();
		// TODO Auto-generated method stub

	}
}
/**
 * class declared with Abstract keyword known as abstract class, 0 to 100% abstract
 * it will have
 * 			- abstract method ----> method declared with abstract keyword without body
 * 			- non-abstract method --> normal method/concrete method
 * 			- constructor
 *  		- static method
 *  		- global variable
 *  Abstract class object can't be create as its incomplete class
 *  
 *  if any class contains even one abstract method dn that class should be declared as abstract class
 *  
 *  when an abstract class is getting inherited by a sub class, dn there will a contract between these classes thats
 *  subclass needs to override all the abstract method of abstract class(super class) otherwise subclass becomes
 *  abstract class
 */ 



