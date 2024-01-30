package oop_exam;

public class DrinkMachineMain {
	public static void main(String[] args) {
		DrinkMachine drinkMachine = new DrinkMachine(); // DrinkMachine 인스턴스 생성
		
		
		// 박카스 초과 주문 및 각 주문 요청
		System.out.println("주문요청입니다.");
		
		// 주문의 결과로 데이터클래스 (DrinkProduct) 타입으로 받아서 객체의 멤버변수에 접근하여 출력하도록함
		DrinkProduct orderProduct = drinkMachine.order("박카스", 5);
		System.out.println(">> 주문결과 : "+orderProduct.drinkName+","+orderProduct.drinkPrice+","+orderProduct.drinkQuantity);
		
		orderProduct = drinkMachine.order("몬스터", 5);
		System.out.println(">> 주문결과 : "+orderProduct.drinkName+","+orderProduct.drinkPrice+","+orderProduct.drinkQuantity);
		
		
		
		// 30개씩 입고
		System.out.println("30개씩 입고합니다.");
		drinkMachine.wareHouse("박카스", 30);
		drinkMachine.wareHouse("몬스터", 30);
		drinkMachine.wareHouse("핫식스", 30);
		drinkMachine.wareHouse("밀키스", 30);
		System.out.println();
		
		// 재고출력
		System.out.println("재고 출력입니다.");
		drinkMachine.inventory();
		System.out.println();
		
		
	}
}
