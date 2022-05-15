package day1.Conditions;

public class IfLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int year=2024;
      if((year%4==0)  || (year%400==0)) {
    	  System.out.println("Enter year is Leap   = "+year);
      }
      else{
    	  System.out.println("Enter yerat is Non Leap  ="+year);
      }
      
      IfLeapYear.checkLeapYear(2000);
      IfLeapYear.checkLeapYear();
      
	}

	static void checkLeapYear (int year) {
		 if((year%4==0) || (year%400==0)) {
	    	  System.out.println("Enter year is Leap  = "+year);
	      }
	      else{
	    	  System.out.println("Enter yerat is Non Leap  ="+year);
	      }
	}
	static void checkLeapYear () {
         int year=2023;
		if((year % 4 == 0)  || (year % 100 == 0)) {
	    	  System.out.println("Enter year is Leap  =  "+year);
	      }
	      else{
	    	  System.out.println("Enter yerat is Non Leap  ="+year);
	      }
	}
}

