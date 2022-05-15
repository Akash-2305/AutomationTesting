package day1.Conditions;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=0; i<=5; i++) {
    	   System.out.print("  ,  "+i);
       }
       System.out.print("  \n  ");
       for(int i=5; i>=0; i--) {
    	   System.out.print(" ,  "+i);
       }
       System.out.print("  \n  ");
       int counter=0;
       for(char i='a'; i<='p'; i++) {
    	  
    	   System.out.print(" ,"+i);
    	   ++counter;
    	   //System.out.print("  \n  ");
       }
         System.out.println("\n counter = "+counter);
       System.out.print("  \n  ");
       for(char i='g'; i>='a'; i--) {
    	   System.out.print(",  "+i);
       }
       System.out.print("  \n  ");
       for(int i=1; i<=10; i++) {
    		   if( i%2 == 0) {
    	   System.out.print("  Print even No =   "+i);
    	   System.out.print("\n");
    		   }
    	/*	   else {
    			   System.out.print("Print odd No =  "+i);
    		   }
      */ }
      // System.out.print("\n");
       counter=0;
       for(char i='a'; i<='p'; i++) {
    	   if((i=='a')|| (i=='e')||(i=='i')||(i=='o')||(i=='u')) {
    		  System.out.println("Vowel =  "+i);
    		  //counter=counter+1;
    		  ++counter;
    	   }
    	  // System.out.println("   "+counter);
       }
       System.out.println("counter=  "+counter);
       counter=0;
       for(char i='a'; i<='p'; i++) {
    	   if(!((i=='a')|| (i=='e')||(i=='i')||(i=='o')||(i=='u'))) {
    		  System.out.println("Non Vowel =  "+i);
    		  //counter=counter+1;
    		  ++counter;
    	   }
    	  // System.out.println("   "+counter);
       }
       System.out.println("counter=  "+counter);
	}

}
