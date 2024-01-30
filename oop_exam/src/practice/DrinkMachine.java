package practice;

public class DrinkMachine {

	// DrinkProduct 데이터 클래스 인스턴스 생성 및 선언
	private DrinkProduct[] aProductArray;

	// 기본생성자를 통해 데이터 클래스 인스턴스 초기값 할당
	public DrinkProduct[] getaProductArray() {
		return aProductArray;
	}

	public void setaProductArray(DrinkProduct[] aProductArray) {
		this.aProductArray = aProductArray;
	}

	public DrinkMachine() {

		// DrinkProduct 인스턴스 할당
		// 각각의 데이터 클래스 인스턴스 내 값 할당
		this.aProductArray = new DrinkProduct[4];
		this.aProductArray[0] = new DrinkProduct();
		this.aProductArray[0].setDrinkName("박카스");
		this.aProductArray[0].setDrinkPrice(900);
		this.aProductArray[0].setDrinkQuantity(15);

		this.aProductArray[1] = new DrinkProduct();
		this.aProductArray[1].setDrinkName("몬스터");
		this.aProductArray[1].setDrinkPrice(1500);
		this.aProductArray[1].setDrinkQuantity(20);

		this.aProductArray[2] = new DrinkProduct();
		this.aProductArray[2].setDrinkName("핫식스");
		this.aProductArray[2].setDrinkPrice(1300);
		this.aProductArray[2].setDrinkQuantity(10);

		this.aProductArray[3] = new DrinkProduct();
		this.aProductArray[3].setDrinkName("밀키스");
		this.aProductArray[3].setDrinkPrice(1400);
		this.aProductArray[3].setDrinkQuantity(5);

	}

	// order시 DrinkProduct Type의 인스턴스를 반환 할것이므로 메소드 타입을 DrinkProduct 및 2개의 파라미터
	public DrinkProduct order(String drinkName, int drinkQuantity) {
		System.out.println("==============주문시작==============");
		DrinkProduct orderedProduct = new DrinkProduct();
		int i =searchDrinkName(drinkName);
		
		if(aProductArray[i].drinkQuantity - drinkQuantity <0) {
			System.out.println("상품이 품절됐습니다.");
			return null;
		}
		else {
			orderedProduct.drinkName = aProductArray[i].getDrinkName();
			orderedProduct.drinkPrice = aProductArray[i].getDrinkPrice();
			orderedProduct.drinkQuantity = drinkQuantity;
			aProductArray[i].drinkQuantity=aProductArray[i].drinkQuantity-drinkQuantity;
			return orderedProduct;
		}
//		
//		
//		
//		
//
//		
//		
//		// 반환한 DrinkProduct Type의 인스턴스를 저장할 orderedProduct선언
//		DrinkProduct orderedProduct = null;
//		if (drinkName == this.aProductArray.drinkName) {
//			if (this.aProductArray.drinkQuantity - drinkQuantity < 0) {
//				System.out.println("상품이 품절되었습니다.");
//				return null;
//			} else {
//				this.aProductArray.drinkQuantity -= drinkQuantity;
//				orderedProduct = new DrinkProduct();
//				orderedProduct.drinkName = this.aProductArray.drinkName;
//				orderedProduct.drinkPrice = this.aProductArray.drinkPrice;
//				orderedProduct.drinkQuantity = drinkQuantity;
//
//				return orderedProduct;
//			}
//		} else if (drinkName == this.bProductArray.drinkName) {
//			if (this.bProductArray.drinkQuantity - drinkQuantity < 0) {
//				System.out.println("상품이 품절되었습니다.");
//				return null;
//			} else {
//				this.bProductArray.drinkQuantity -= drinkQuantity;
//				orderedProduct = new DrinkProduct();
//				orderedProduct.drinkName = this.bProductArray.drinkName;
//				orderedProduct.drinkPrice = this.bProductArray.drinkPrice;
//				orderedProduct.drinkQuantity = drinkQuantity;
//
//				return orderedProduct;
//			}
//		} else if (drinkName == this.cProductArray.drinkName) {
//			if (this.cProductArray.drinkQuantity - drinkQuantity < 0) {
//				System.out.println("상품이 품절되었습니다.");
//				return null;
//			} else {
//				this.cProductArray.drinkQuantity -= drinkQuantity;
//				orderedProduct = new DrinkProduct();
//				orderedProduct.drinkName = this.cProductArray.drinkName;
//				orderedProduct.drinkPrice = this.cProductArray.drinkPrice;
//				orderedProduct.drinkQuantity = drinkQuantity;
//
//				return orderedProduct;
//			}
//		} else if (drinkName == this.dProductArray.drinkName) {
//			if (this.dProductArray.drinkQuantity - drinkQuantity < 0) {
//				System.out.println("상품이 품절되었습니다.");
//				return null;
//			} else {
//				this.dProductArray.drinkQuantity -= drinkQuantity;
//				orderedProduct = new DrinkProduct();
//				orderedProduct.drinkName = this.dProductArray.drinkName;
//				orderedProduct.drinkPrice = this.dProductArray.drinkPrice;
//				orderedProduct.drinkQuantity = drinkQuantity;
//
//				return orderedProduct;
//			}
//		}
//		return null;
	}

	public void fill(String drinkName, int drinkQuantity) {
		System.out.println("==============재고 채우기==============");
		int i = searchDrinkName(drinkName);
		aProductArray[i].drinkQuantity += drinkQuantity;
//		
//		
//		if (drinkName == this.aProductArray.drinkName) {
//			this.aProductArray.drinkQuantity += drinkQuantity;
//		} else if (drinkName == this.bProductArray.drinkName) {
//			this.bProductArray.drinkQuantity += drinkQuantity;
//		} else if (drinkName == this.cProductArray.drinkName) {
//			this.cProductArray.drinkQuantity += drinkQuantity;
//		} else if (drinkName == this.dProductArray.drinkName) {
//			this.dProductArray.drinkQuantity += drinkQuantity;
//		}
	}

	public void inventory() {
		System.out.println("==============현재 재고==============");
		for(DrinkProduct dp : this.aProductArray) {
			System.out.println(" 상품명 :" + dp.drinkName + ", 재고 :" + dp.drinkQuantity);
		}
		
//		System.out.println("========================== 제품 재고 수량 ==========================");
//		System.out.println(" 상품명 :" + this.aProductArray.drinkName + ", 재고 :" + this.aProductArray.drinkQuantity
//				+ ", 가격 :" + this.aProductArray.drinkPrice);
//		System.out.println(" 상품명 :" + this.bProductArray.drinkName + ", 재고 :" + this.bProductArray.drinkQuantity
//				+ ", 가격 :" + this.bProductArray.drinkPrice);
//		System.out.println(" 상품명 :" + this.cProductArray.drinkName + ", 재고 :" + this.cProductArray.drinkQuantity
//				+ ", 가격 :" + this.cProductArray.drinkPrice);
//		System.out.println(" 상품명 :" + this.dProductArray.drinkName + ", 재고 :" + this.dProductArray.drinkQuantity
//				+ ", 가격 :" + this.dProductArray.drinkPrice);
	}

	// DrinkName을 For문을 이용해서 찾기
	public int searchDrinkName(String drinkName) {
		int i = 0;
		for (i = 0; i < aProductArray.length; i++) {
			if (aProductArray[i].getDrinkName() == drinkName) {
				return i;
			}
		}
		return -1;
	}

}
