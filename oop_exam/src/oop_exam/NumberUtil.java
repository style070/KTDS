package oop_exam;

/**
 * 숫자와 관련된 유틸리티
 */

public class NumberUtil {
	/**
	 * 문자를 숫자로 변경한다
	 * @param str 숫자형태의 문자열
	 * @return 문자를 숫자로 변경한 결과(숫자형태의 문자가 아니라면, NumberFormatException에러가 발생한다.
	 */
	public static int convertToInt(String str) {
		if (str.matches("^[0-9]+$")) {
			int number = Integer.parseInt(str);
			return number;
		}
		return 0;
				
	}
	
	/**
	 * 문자를 숫자로 변경한다
	 * @param str 숫자형태의 문자열
	 * @param defaultValue str이 숫자형태의 문자가 아닐 때 , 반환될 값
	 * @return 문자를 숫자로 변경한 결과
	 */
	public static int convertToInt(String str,int defaultValue) {
		
		
				
		
		int number = 0;
		
		// try-catch 문을 사용하여 str 값이 ParseInt 할 수 없는 NumberFormatException 발생시 defaultValue를 리턴
		try {
			number = Integer.parseInt(str);
		}
		catch(NumberFormatException nfe){
			return defaultValue;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		// Index Num 0,1,2 [3] 
		// ArrayIndexOutOfBoundsException
//		int[] scoreArray = new int[3];
//		System.out.println(scoreArray[3]);
		
		// NullPointerException
		String address = null;
		System.out.println(address.contains("서울"));
		
		// NumberFormatException 
		//String name = "김재홍";
		//if(name.matches("^[0-9]+$")) {
		//	int number = NumberUtil.convertToInt(name);
		//}
//		
//		String str = "10000";
//		int number = NumberUtil.convertToInt("123456");
//		System.out.println(number);
//		
//		str="이름";
//		//java.lang.NumberFormatException: For input string: "이름"
//		number=NumberUtil.convertToInt(str,-1);
//		System.out.println(number);
		
	}
}
