package day1.Conditions;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123,rev=0,rem=0;
     while(num!=0) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
     }
	 System.out.println("Reverse Number===========\n "+rev);
 
// System.out.println("Reverse Number===========\n "+num);
	}

}
