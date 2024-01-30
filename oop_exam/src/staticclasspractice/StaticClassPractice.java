package staticclasspractice;

public class StaticClassPractice {

	public static boolean isValidAge(int age, int min, int max) {
		// Q1.isValidAge(int age, int min, int max) 클래스 메소드를 만들고age의 값이 min보다 크고 max 보다 작으면 true를, 아니면 false를 반환하도록 작성하고 호출해보세요.
		// 굳이 if,else를 써서 하지말고 return 바로 때려도됨
//		if(age>min && age<max) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return age > min && age < max;
	}
	
	
		
	

}
