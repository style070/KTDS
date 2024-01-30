package exception_handling;

public class IfNumberFormatException {
	public static void main(String[] args) {
		String numString="123";
		int num=Integer.parseInt(numString);
		System.out.println(num);
		
		numString="ABC";
		num=Integer.parseInt(numString);
		System.out.println(num);
	}
}
