package oop_exam;

public class Zoo {
	public static void main(String[] args) {

		
		// Animal 타입의 변수(인스턴스)를 만들어 활용
		// 변수를 만드는 문법
		// 자료형 변수의이름 = 값 ;
		// 
		// 인스턴스를 만드는 문법
		// 자료형 인스턴스의이름 = new 자료형();
		Animal 팬더 = new Animal();
		팬더.name="푸바오";
		팬더.hello();
		
		Animal 랫서팬더 = new Animal();
		랫서팬더.name="푸바오친구";
		랫서팬더.hello();
		
		}
}
