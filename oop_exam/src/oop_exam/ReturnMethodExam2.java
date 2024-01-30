package oop_exam;

/**
 * P.169 산술 연산자 연습 문제를 섭씨를 파라미터로 받아 화씨를 반환하는 메소드로 만들어 호출하고 결과를 출력해보세요.
 * 
 * 
 *          * 섭씨온도를 나타내는 celsius 변수와
 *          * 화씨온도를 나타내는 fahrenheit 변수가 있습니다.
 *          * celsius 변수에는 30 이 할당되어 있습니다. 
 *          * 섭씨 30도를 화씨온도로 변경하면        
 *          * 화씨 86도가 됩니다.          
 *          * 섭씨온도를 화씨온도로 변경해 
 *          * fahrenheit 변수에 할당하고 
 *          * 출력해보세요. 
 *          * 변경공식: (섭씨 × 9/5) + 32 = 화씨          
 */

public class ReturnMethodExam2 {
	/**
	 * 섭씨를 파라미터로 전달하면 화씨로 변경하여 반환함.
	 * 
	 * @param celsius 섭씨
	 * @return 섭씨를 화씨로 변경한 결과
	 */
	public static int celToFah(int celcius) {
		int temp = (celcius * 9 / 5) + 32;
		return temp;
	}

	public static void main(String[] args) {
		int celcius = 30;
		int fahrenheit = celToFah(celcius);;
		
		System.out.println("섭씨 " + celcius + "도 를 화씨로 변경하면 " + fahrenheit + "도 입니다.");

	}
}
