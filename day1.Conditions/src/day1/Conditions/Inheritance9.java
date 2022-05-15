package day1.Conditions;

//parent class
class Company {
	static int numberofemp=20;
	double salary;
	public void emp() {
	
		System.out.println(" the no of emp in company   ");
		System.out.println("    "+Company.numberofemp);
	}
	Company() {
		//this();
		System.out.println(" Name of company  is  ");
	}
	
	Company(long a) {
		this(14d);
		System.out.println(" Name of company   ");
	}
    Company(double c) {
		
		System.out.println(" Name of company as  ");
	}
	
	//global variable
	//method with method overloading use of this keyword
	//constructor with overloading and use of this()
}
class Department extends Company{
	Department(){
		this(10);
	
	System.out.println(" Number of Department  ");
	}
	Department(int no){
		//super(13);
		System.out.println(" Number = 100   ");
	}
}
//child class of Company
//class Employee extends Company {
	//global variable name as Company name variable
		//method with method overloading use of this & super keyword
		//constructor with overloading and use of this() & super()
//}
public class Inheritance9 {

	public static void main(String[] args) {
		Company c1=new Company();
		Department d1=new Department();
		c1.emp();
		
		
	}

}
