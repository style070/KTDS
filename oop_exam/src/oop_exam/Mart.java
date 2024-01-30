package oop_exam;

/**
 * 자판기와 고객이 만나는 마트
 */
public class Mart {

	/**
	 * 함수지향방식으로 개발한 코드
	 * 
	 */
	public static void case1() {
		VendingMachine drinkMachine = new VendingMachine(); // 자판기 생성
		drinkMachine.money = 3000; // 자판기 멤버변수 값 할당.
		drinkMachine.productQuantity = 5;
		
		VendingMachine newVendingMachine = new VendingMachine();

		// 생성자가 만들어진게 없기떄문에 Class명으로 이동
		// 어떠한 생성자가 1개라도 있으면 기본생성자를 만들어 주지 않는다.
		Customer musk = new Customer(0,0); // 고객생성
		musk.wallet = 10000; // 고객 멤버변수 값 할당
		musk.stock = 0;

		// 고객이 자판기에 돈을 넣는다.
		// 고객이 가진돈을 빼주고
		musk.pay(1300);

		// 자판기의 돈을 증가시킨다.
		//drinkMachine.insertMoney();

		// 고객이 자판기의 음료 버튼을 누른다.
		// 자판기의 수량이 하나 줄어들고
		//drinkMachine.pressButton();

		// 고객의 수량이 하나 증가한다.
		musk.addStock();

		System.out.println("자판기의 잔액 : " + drinkMachine.money);
		System.out.println("자판기의 상품 수량 : " + drinkMachine.productQuantity);
		System.out.println("고객의 지갑 잔액 : " + musk.wallet);
		System.out.println("고객의 상품 수량 :" + musk.stock);

	}

	
	/**
	 * 객체지향형으로 개발한 코드
	 * @param args
	 */
	public static void main(String[] args) {
		VendingMachine drinkMachine = new VendingMachine(); // 자판기 생성
		// 아래 코드는 VendingMachine의 생성자에서 대체함.
		//drinkMachine.money = 3000; // 자판기 멤버변수 값 할당.
		//drinkMachine.productQuantity = 5;

		Customer musk = new Customer(200_000,50); // 고객생성
		// 아래 코드는 Customer의 생성자에서 대체함.
		//musk.wallet = 10000; // 고객 멤버변수 값 할당
		//musk.stock = 0;
		
		// 자판기의 돈을 증가시킨다.
		drinkMachine.insertMoney(musk);
		drinkMachine.pressButton(musk);



		System.out.println("자판기의 잔액 : " + drinkMachine.money);
		System.out.println("자판기의 상품 수량 : " + drinkMachine.productQuantity);
		System.out.println("고객의 지갑 잔액 : " + musk.wallet);
		System.out.println("고객의 상품 수량 :" + musk.stock);

	}
}
