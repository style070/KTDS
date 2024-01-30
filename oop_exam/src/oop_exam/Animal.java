package oop_exam;

public class Animal {

	//동물의 이름 ( 멤버변수 , 인스턴스 필드 )
	String name;
	
	//동물이 인사하는것.
	public void hello() {
		//메소드(인스턴스메소드)에는 static을 붙이지 않음
		System.out.println(name+"입니다.");
	}
}
