package day1.Conditions;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char i='Y';
		int ascii=i;
		if ((i>=97) && (i<=123)) {
			
			System.out.println("Lower case = "+i+"\nAscii value =  "+ascii);
		}
		else if (i>=65 && i<=90) {
			System.out.println("Upper case = "+i+"\nAscii value =  "+ascii);
		}
		/*else {
			System.out.println("Number = "+ascii);
		}
	*/}
}
