package oop_exam;

public class ReturnMethodExam {
	
	/**
	 * 숫자를 원하는 수만큼 곱한 결과를 반환한다.
	 * @param num 곱할 숫자
	 * @param time 곱할 횟수
	 * @return 숫자를 곱한 결과
	 */
	
	public static int getMultiply(int num, int time) {
		return num * time;
	}
	
	//산술 연산자 연습 문제를 분, 초를 파라미터로 받으면 초를 반환하는 메소드로 만들어 호출하고 결과를 출력해보세요.
	/**
	 * 분과 초를 모두 초로 반환시키는 기능
	 * 5분 50초 : 350초로 반환.
	 * @param min
	 * @param sec
	 * @return
	 */
	public static int timeTosec(int min, int sec) {
		return min*60+sec;
	}
	
	

	public static void main(String[] args) {
		int minuties = 5;
		int seconds=50;
		int time = timeTosec(minuties, seconds);
		
		
		int result = getMultiply(10, 4);
		System.out.println(result);
		System.out.println(time);
		
	}
	
}
