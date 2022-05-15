package casting;

 class PrimitiveCasting5 {
	   void test1(double d)//
	    {
	        System.out.println("d value="+d);
	    }
//	    void test1(int k)
//	    {
//	        System.out.println("k value="+k);
//	    }
	}
	public class Sample {
	    public static void main(String[] args) {
	        System.out.println("Program starts");
	        PrimitiveCasting5 s=new PrimitiveCasting5();
	        s.test1(7);
	        System.out.println("Program ends");         
	    }
}
