package day1.Conditions;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int marks=92;
      if(marks<35) {
    	  System.out.println("fail");
      }
      else if (marks>=35 && marks<60) {
    	  System.out.println("Gread D ");
    	  
      }
      else if(marks>=60 && marks<80) {
    	  System.out.println("Gread B ");
      }
      else if (marks>=80 && marks<90) {
    	  System.out.println("Gread A ");
    	 
      }
      else{
    	  System.out.println("Grade A++");
      }
      
	}

}
