package oop_exam;

/**
 * 자판기를 이용하는 고객
 */
public class Customer {
	/**
	 * 고객이 가진돈
	 */
	int money;

	/**
	 * 고객이 가진 상품의 수량
	 */
	int stock;

	/**
	 * 지출한다.
	 */

	/**
	 * 고객의 잔고 ( 지갑 )
	 */
	int wallet;
	
	/**
	 * Customer 생성자
	 */
	// this는 생성자가 만들어준 인스턴드
	// 생성자의 인스턴스에 파라미터로 받은 인스턴스를 넣어줘라 라는 의미
	public Customer(int wallet, int stock) {
		this.wallet = wallet;
		this.stock = stock;
	}

	public void pay(int price) {
		if (this.wallet - price <= 0) {
			return; // 고객이 가진돈 - 상품 가격이 작으면 돈이 부족하므로 아무것도 하지 않도록 return;
		}
		this.wallet -= price;
	}

	/**
	 * 상품이 하나 증가한다.
	 */
	public void addStock() {
		this.stock++;
	}

}
