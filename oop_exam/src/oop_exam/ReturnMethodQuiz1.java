package oop_exam;

/*
 * 교재 p.168 문제
 */

public class ReturnMethodQuiz1 {

	/** 수행시간(초)를 파라미터로 받아서,  분(Minutes)만 구해 반환시킨다.
	 * @param processTime 수행시간(초)
	 * @return 수행시간(초)를 분(Minutes)으로 변환한 결과
	 */	
	public static int getMinutes(int processTime) {
		int processMinutes=processTime/60;
		return processMinutes;
	}

	public static int getSeconds(int processTime) {
		int processSeconds=processTime%60;
		return processSeconds;
	}

	

	/*
	 * 산술연산자를 이용해 processTime을 분(Minute), 초(Second)를 구한다음 minutes,seconds 변수에 할당하고
	 * 출력해보세요. (메소드 이용) --> 메소드는 하나의 값만 반환시킬 수 있다.!!
	 */
	public static void main(String[] args) {
		int processTime = 245;
		int minutes = 0;
		int seconds = 0;
		
		minutes=getMinutes(processTime);
		seconds=getSeconds(processTime);
		
		System.out.println(processTime+"을 분/초로 변환하면 "+minutes+"분 "+seconds+"초 입니다.");
		
	}

}
