package day1.Conditions;

public class IfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1=50, num2=40;
     if(!(num1==num2)) {
    	 System.out.println("no. is greater than num2  ");
     }
     else {
    	 System.out.println("no is less than num2  ");
     }
     IfNumbers.checkGreaterLess(100,50);
     IfNumbers.checkGreaterLess1(100,50);
     IfNumbers.checkGreaterLess2(100,50);
     IfNumbers.checkGreaterLess3(100,50);
     IfNumbers.checkGreaterLess4(100,50);
	}
  static void checkGreaterLess(int a, int b) {
	   
	   if(!(a==b)) {
	    	 System.out.println("no. is greater than a  ");
	     }
	     else {
	    	 System.out.println("no is less than b  ");
	     } 
   }
  static void checkGreaterLess1(int a, int b) {
	   
	   if((a>b)) {
	    	 System.out.println("no. is greater than a  ");
	     }
	     else {
	    	 System.out.println("no is less than b  ");
	     } 
  }
  static void checkGreaterLess2(int a, int b) {
	   
	   if((a<b)) {
	    	 System.out.println("no. is greater than a  ");
	     }
	     else {
	    	 System.out.println("no is less than b  ");
	     } 
 }
  static void checkGreaterLess3(int a, int b) {
	   
	   if((a>=b)) {
	    	 System.out.println("no. is greater than a  ");
	     }
	     else {
	    	 System.out.println("no is less than b  ");
	     } 
 }
  static void checkGreaterLess4(int a, int b) {
	   
	   if((a<=b)) {
	    	 System.out.println("no. is greater than a  ");
	     }
	     else {
	    	 System.out.println("no is less than b  ");
	     } 
 }
}
