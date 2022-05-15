package Overriding;

class A{
	 void checkPrimeNumber(int num) {
	this.ReverseNumber(23);
	boolean flag=false;
	int a=num/2;
	for(int i=2;i<=a;i++) {
		if(num%i==0) {
			flag = true;
			break;
		}
	}
	if(!flag)
		System.out.println("Number is not a prime: " + num);
		else
		System.out.println("Number is a prime: " + num);
		}
	
	 void ReverseNumber(int A) {
		this.checkLeapYear (2005);
			for(int i=10;i>=0;i--) {
				System.out.println("Reverse Number==========="+i);
			}
		}
	 static void checkLeapYear (int year) {
		 if((year%4==0) || (year%400==0)) {
	    	  System.out.println("Enter year is Leap  = "+year);
	      }
	      else{
	    	  System.out.println("Enter yerat is Non Leap  ="+year);
	      }
	}

	 
}
class C extends A {
	void ReverseNumber() {
	super.checkPrimeNumber(23);
	int num=123,rev=0,rem=0;
    while(num!=0) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
    }
	 System.out.println("Reverse Number===========\n "+rev);


	}
	
}

public class Overriding4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       C c1 = new C();
       c1.ReverseNumber();
	}

}
