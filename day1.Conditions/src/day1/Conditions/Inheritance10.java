package day1.Conditions;

  class PM {
	  static int a=20;
	  int b=30;
	  PM() {
		  System.out.println("Most Imp Post in India      "); 
	 
	  }
	  PM(int n, int c) {
			this(); 
		  System.out.println("Most Imp Post in India....      "); 
	 
	  }
	  public void M() {
		 
		  System.out.println("Most of problem solved person    ");
	  }
	  void M(int NofMantri) {
		  
		  System.out.println("No of Mantri    ");
	  }
  }
  class CM extends PM {
	  static int d=34;
	  int e=57;
	  CM(int c, float d, int a) {
	  this(11f,15,12);
		  System.out.println("Most Imp Post in Maharstra     ");
	  }
	  CM(float g, int l, int v) {
			 super(13,12);
			  System.out.println("No of amdhar     ");
	  }
	 
	  public void C(char k) {
		  System.out.println("Handal allMaharastra Problem    ");
	  }
	  public void C(long k) {
		  System.out.println("Handal all Problem    ");
	  }
	  
  }
  class Tal extends CM {
	  static int f=44;
	  double marks= 32.4;
	  
	  Tal() {
		 this(12,13,14,15);
		  System.out.println("Most Imp Post in Taluka     "); 
	  }
	 Tal(int NofGrampanchayt, int s, int n, int a) {
		  super(16,12f,13);
		  System.out.println("Many problem in NofGrampanchayt     "); 
	  }
	  public void T(float a) {
		
		  
		  System.out.println("Handal all Village Problem    ");
	  }
	   public void T(float a , int b) {
			
		  System.out.println("Handal all local Problem.....    ");
	  }
  }
public class Inheritance10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(" Number       "+PM.a);
		 System.out.println(" Number       "+CM.d);
		 System.out.println(" Number       "+Tal.f);
		 Tal t1 = new Tal();
		// Tal t2 = new Tal();
		 t1.T(12f);
		 t1.T(12f,12);
		 t1.C('a');
		 t1.C(12l);
		 t1.M();
		 t1.M(12);
		 System.out.println(" Number       "+t1.b);
	     System.out.println(" Number       "+t1.marks);
	     System.out.println(" Number       "+t1.e);
	     
		 
		 
		 
	}

}
