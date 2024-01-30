package hello_java_world;

public class CompareOperator {
	public static void main(String[] args) {
		
//		// 비교연산자의 결과는 항상 boolean(true/false).
//		int num1=10;
//		int num2 = 5;
//		
//		boolean isEquals = num1 == num2; // false
//		boolean isNum1GreaterThanNum2= num1 > num2; //true
//		boolean isNum1GreaterOrEqualsThanNum2= num1 >= num2; // true
//		boolean isNum1LessThanNum2 = num1<num2; //false
//		boolean isNum1LessOrEqualsThanNum2 = num1 <= num2; //false
//		boolean isNotEquals =num1 != num2; // true
//		
//		System.out.println(isEquals);
//		System.out.println(isNum1GreaterThanNum2);
//		System.out.println(isNum1GreaterOrEqualsThanNum2);
//		System.out.println(isNum1LessThanNum2);
//		System.out.println(isNum1LessOrEqualsThanNum2);
//		System.out.println(isNotEquals);
		
		
		//&&(and)연산을 할때에는 false가 될 수 있는 항을 첫번째에 쓰면
		//||(or)연산을 할때에는 true가 될 수 있는 항을 첫번째
		//뒷부분 코드를 볼 필요가 없기때문에 "dead Code"가 되며 효율이 좋음 ( 1초라도 빨라짐 )
		boolean and = true && true;
		System.out.println(and);
		
		and = true && false;
		System.out.println(and);
		
		and = false&& true;
		System.out.println(and);
		
		and = false && true;
		System.out.println(and);
		
		boolean or = true ||true;
		System.out.println(or);
		
		or = true ||false;
		System.out.println(or);
		
		or = false ||true;
		System.out.println(or);
		
		or = false ||false;
		System.out.println(or);
	}
}
