package day1.Conditions;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=23,b=30;
       System.out.println("*****after swap*******");
       System.out.println("a = "+a);
       System.out.println("b = "+b);
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("***********Befor swap**********");
       System.out.println("a = "+a);
       System.out.println("b = "+b);
	}

}
