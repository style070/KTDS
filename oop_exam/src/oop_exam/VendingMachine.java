package oop_exam;

/**
 * 자판기.
 */
public class VendingMachine {

	// 상수 자리
	final int PRICE = 1300;

	// 멤버변수 자리
	/**
	 * 상품 수량
	 */
	int productQuantity;

	/**
	 * 돈
	 */
	int money;

	// 생성자 자리.
	/**
	 * VendingMachine의 인스턴스를 생성할 때 호출된다.
	 */
	public VendingMachine() {
		/**
		 * 1. 멤버변수 초기화(멤버변수에 기본 값을 별도로 할당을 하기 위해서) 
		 *  Reference Type 위주로 초기화 
		 *   배열 / 컬렉션 등.. 
		 * 2. 인스턴스 생성과 동시에 다른 메소드를 호출하기 위해서 사용
		 *  → ex) 인스턴스를 생성함과 동시에 insertMoney 메소드를 호출하기 위해서
		 */
		System.out.println("자판기 인스턴스를 만들었습니다!");
		money=100000;
		productQuantity=10;
	}

	/**
	 * 돈을 넣는다.
	 * 
	 * @param customer 돈을 넣은 고객
	 */
	public void insertMoney(Customer customer) {
		money += this.PRICE;
		customer.pay(this.PRICE);
	}

	/**
	 * 버튼을 누른다.
	 * 
	 * @param customer 버튼을 누른 고객
	 */
	public void pressButton(Customer customer) {
		if (this.productQuantity <= 0) {
			return; // 수량이 아무것도 없다면 메소드 즉시 종료
		}
		this.productQuantity--;
		customer.addStock();

	}

}
