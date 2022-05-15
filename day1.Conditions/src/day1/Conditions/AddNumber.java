package day1.Conditions;

public class AddNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=20,b=30,sum;
       sum=a+b;
       System.out.println(" Sum = "+sum);
       AddNumber1(10,15);
       AddNumber2(10,40,2);
       AddNumber3(10.3f,15.5f);

	}
     public static void AddNumber1(int a,int b) {
    	 int sum;
    	 sum=a+b;
    	System.out.println("Sum of two no. = "+sum);
     }
    public static void AddNumber2(int d,int e,int c) {
    	 int total;
    	 total=((d+e)/c);
    	System.out.println("Total = "+total);
     }
    public static void AddNumber3(float a,float b) {
   	 float sum;
   	 sum=a+b;
   	System.out.println("Sum of two no. = "+sum);
    }
}
