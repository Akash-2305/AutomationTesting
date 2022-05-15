package Abstraction;

abstract class RBIBank102 {
	 abstract double getRateOfInterestForHomeLoan();
	//final abstract double getRateOfInterestForHomeLoan();
	//abstract mean must be overridden
	//final means can't be override
}
class SBI102 extends RBIBank102 {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class Abstraction2 {
	public static void main(String args[]) {		
		RBIBank102 s1= new SBI102();
		System.out.println("SBI Rate of Interest is: " + s1.getRateOfInterestForHomeLoan() + " %");
	s1.getRateOfInterestForHomeLoan();
	
	}
}