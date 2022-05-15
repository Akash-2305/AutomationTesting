package Object;

class Demo4 {
	 Demo4(){
		   System.out.println("Trinning class");
		   
	   }
	 void Testing() {
		   System.out.println("Testing class");
	   }
	 void autoTesting() {
		   System.out.println("autoTesting class");
	   }

}
public final class Demo3 {
	static Demo4 d1=new Demo4();
	public static void main (String args[]) {
	Demo3.d1.Testing();
	Demo3.d1.autoTesting();
		
	Demo4 d2=new Demo4();
	d2.Testing();
	d2.autoTesting();
		
	}
}
