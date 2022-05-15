package casting;

	class Sample2 {
    double test1()
    {
        System.out.println("Running test1");
        return 4;//
    }     
}
public class PrimitiveCasting2 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample2 s=new Sample2();
        int res=(int)s.test1();//
        System.out.println("raturn value="+res);
        System.out.println("Program ends");
         
    }

}
