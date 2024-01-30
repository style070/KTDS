package oop_exam;

public class Hello {
	/*
	 * 클래스 파일을 실행시키는 메인 메소드
	 * @parm agrs(파라미터)
	 */
	
	//메소드 이름은 보통 동사로 시작 , 카멜 표기법이용
		public static void sayHello() {
			/*
			 * 안녕하세요를 출력하는 메소드(정의)
			 */
			System.out.println("sayHello 메소드 호출입니다.");
		}
		
		/*
		 * 이름을 파라미터로 전달하면,"이름씨,안녕하세요"를 출력한다.
		 * @param name 출력하고 싶은 이름
		 */
		public static void printHello(String str) {
			System.out.println(str+"씨 안녕하세요");
			
		}
	
	public static void main(String[] args) {
		// Tip : Ctrl+Alt+방향키 방향대로 해당 행 복사
		// 메소드 내에서는 다른 메소드를 만들 수 없음
		sayHello();
		sayHello();
		sayHello();
		sayHello();
		printHello("김재홍");
		printHello("김재홍");
		printHello("김재홍");
		printHello("김재홍");
		
		
	}
	
}
