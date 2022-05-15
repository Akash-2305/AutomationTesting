package day1.Conditions;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=53, b=34, c=55;
   if(a>=b && a>=c) {
	   System.out.println("Largest No = "+a);
   }
   else  if(b>=a && b>=c){
	   System.out.println("Largest No = "+b);
   }
   else{
	   System.out.println("Largest No = "+c);
   }
   if((a>=b && a>=c) || (b>=a && b>=c)) {
	   System.out.println("Largest No = "+b+ "Largest No = "+b);
	}
   else{
	   System.out.println("Largest No = "+c);
   }
	}

}
