package hello_java_world;

public class OperatorExam {
	public static void main(String[] args) {
//		boolean not = !true; 
//		System.out.println(not); // false
//		
//		not = !false;
//		System.out.println(not); //true

//		int a = 10;
//		boolean is11To19=a>10 && a<20; 
//		System.out.println(is11To19); //false
//		
//		int b = 345795;
//		//변수 b는 짝수인가?
//		boolean isEven=b%2==0; 
//		System.out.println(isEven); //false
//		
//		int c = -345796;
//		//변수 c는 0보다 큰 짝수인가?
//		boolean isEven2 = c>0 && c%2 ==0; 
//		System.out.println(isEven2); //false
//		

		int d = 35;
		//변수 d의 값은 2또는 5의 배수인가?
		//컴퓨터는 연산을 수행해야 True/false 값을 알 수 있기 때문에 산술연산에 대한 논리연산은 Dead Code가 생기지 않는다.
		boolean isMultiple2Or5 = d%2==0 || d%5==0;
		System.out.println(isMultiple2Or5);
		
		int son=7;
		int parent=40;
		//son은 부모님과 함께 12세 이상 관람과의 영화를 볼 수 있나?
		boolean isAvailable = son>=12 ||parent >= 12;
		System.out.println(isAvailable);
		

	}
}
