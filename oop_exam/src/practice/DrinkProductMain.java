package practice;

public class DrinkProductMain {
	public static void main(String[] args) {
		DrinkMachine drinkMachineProduct = new DrinkMachine(); // 자판기 인스턴스 생성
		
		DrinkProduct drinkProduct = new DrinkProduct(); // 자판기 인스턴스에서 값을 받아서출력할 DrinkProduct 데이터 클래스 형태의 인스턴스
		
		drinkProduct = drinkMachineProduct.order("박카스", 4);
		System.out.println("주문결과>> 상품명 : "+drinkProduct.drinkName+", 주문량 : "+drinkProduct.drinkQuantity+", 가격 : "+drinkProduct.drinkPrice);
		drinkProduct = drinkMachineProduct.order("몬스터", 4);
		System.out.println("주문결과>> 상품명 : "+drinkProduct.drinkName+", 주문량 : "+drinkProduct.drinkQuantity+", 가격 : "+drinkProduct.drinkPrice);
		drinkProduct = drinkMachineProduct.order("핫식스", 4);
		System.out.println("주문결과>> 상품명 : "+drinkProduct.drinkName+", 주문량 : "+drinkProduct.drinkQuantity+", 가격 : "+drinkProduct.drinkPrice);
		drinkProduct = drinkMachineProduct.order("밀키스", 4);
		System.out.println("주문결과>> 상품명 : "+drinkProduct.drinkName+", 주문량 : "+drinkProduct.drinkQuantity+", 가격 : "+drinkProduct.drinkPrice);

		
		drinkMachineProduct.inventory();
		drinkMachineProduct.fill("박카스", 100);
		drinkMachineProduct.fill("몬스터", 100);
		drinkMachineProduct.fill("핫식스", 100);
		drinkMachineProduct.fill("밀키스", 100);
		drinkMachineProduct.inventory();
		
		
	}
}
