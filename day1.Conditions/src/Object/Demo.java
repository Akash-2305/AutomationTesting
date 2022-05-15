package Object;
class Sample{
	int a=10;
	void display() {
		System.out.println("Sample java Program");
		
		
	}
}
public class Demo extends Sample {
	public static void main(String[] args) {
		Sample s=new Demo();
		Sample s1=new Sample();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s1);
		System.out.println(s1.toString());
	}

}
