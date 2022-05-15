package casting;

class Casting2 {
	public static void display(long a) {
		System.out.println("Hi Good Morning");
		
	}

   double Casting3() {
	System.out.println("Live in Pune");
	return 4;
}
}
public class Casting1 {
		public static void main (String[]args){
			Casting2 c1= new Casting2();
			c1.display(123443);
			int res =(int)c1.Casting3();
			System.out.println("  "+c1.Casting3());

}
}
