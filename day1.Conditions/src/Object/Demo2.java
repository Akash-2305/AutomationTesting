package Object;

public class Demo2 {
 public static void main (String args[]) {
	 System.out.println("System user dir"+System.getProperty("user.home"));
	 System.out.println("Current working dir"+System.getProperty("user.dir"));
	 System.clearProperty("user.home");
	 System.out.println(System.getProperty("user.home"));
	 System.setProperty("user.country","India");
	 System.out.println(System.getProperty("user.country"));
	 System.out.println("System time"+System.currentTimeMillis());
	 System.out.println("System time"+System.nanoTime());
 }
}

