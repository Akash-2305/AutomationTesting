package day1.Conditions;

public class ThisKeyword {
	 int rollnum=234;
   static boolean result;
	double payment=4500;
	char grade;
	ThisKeyword(int rollnum, double payment){
		System.out.println("rollnum : "+rollnum);
		System.out.println("payment : "+payment);
		System.out.println("payment Global : "+this.payment);
		System.out.println("rollnum  Global: "+this.rollnum);
		this.rollnum=rollnum;
		this.payment=payment;
		System.out.println("payment Global : "+this.payment);
		System.out.println("rollnum  Global: "+this.rollnum);
	}

	public static void main(String[] args) {
		int rollnum=45;
		double payment=5000;
		// TODO Auto-generated method stub
		System.out.println("Program Start ");
		System.out.println("rollnum : "+rollnum);
		System.out.println("payment : "+payment);
		System.out.println("result : "+result);
		//System.out.println("payment : "+this.payment);
		//System.out.println("rollnum : "+this.rollnum);
		ThisKeyword g1 = new ThisKeyword(15,2000);
		System.out.println("payment : "+g1.payment);
		System.out.println("grade: "+g1.grade);
		rollnum=57;
		result = true;
		System.out.println("rollnum : "+rollnum);
		System.out.println("result : "+result);
		g1.payment=5477.05;
		g1.grade='B';
		System.out.println("payment : "+g1.payment);
		System.out.println("grade: "+g1.grade);
		double salary = 50000;
		System.out.println("Salary : "+salary);
		int a;
		a=50;
		System.out.println("A : "+a);
		System.out.println("Program end ");
	}

}
