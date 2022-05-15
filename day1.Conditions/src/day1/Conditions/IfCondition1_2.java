package day1.Conditions;

public class IfCondition1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=65;
      if(num%2==0) {
       System.out.println("Number is Even");
      }
        else {
    	   System.out.println("Number is Odd");
        }
    	   IfCondition1_2.checkEvenOddNumber1();
    	  IfCondition1_2.checkEvenOddNumber(705);
    	checkEvenOddNumber(711);
    	checkEvenOddNumber(10);
    	checkEvenOddNumber(7);
    	checkEvenOddNumber(8);
       }
      
	
 static void checkEvenOddNumber(int number) {
	 if(number%2==0) {
  	   System.out.println("Number is Even");
     }
     else {
    	 System.out.println("Number is old");
     } 

	
 }
 static void checkEvenOddNumber1() {
	 int a=14;
	 if(a%2==0) {
  	   System.out.println("Number is Even =  "+a);
     }
     else {
  	   System.out.println("Number is Odd  =  "+a);
     } 

	
 }
}
