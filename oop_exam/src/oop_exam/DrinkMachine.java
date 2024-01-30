package oop_exam;

public class DrinkMachine {

	// 데이터 클래스 선언은 클래스 내부 생성자 외부에서 선언한다.
	DrinkProduct aProduct;
	DrinkProduct bProduct;
	DrinkProduct cProduct;
	DrinkProduct dProduct;

	// 기본생성자에 박카스,몬스터,핫식스,밀키스에 대한 데이터 클래스 멤버변수 초기화 할당
	public DrinkMachine() {

		
		// 데이터 클래스 할당은 생성자 내부에서
		// 여기서 this는 DrinkProduct 타입의 인스턴스를 의미함
		this.aProduct = new DrinkProduct(); // 핫식스 데이터 클래스
		this.bProduct = new DrinkProduct(); // 핫식스 데이터 클래스
		this.cProduct = new DrinkProduct(); // 핫식스 데이터 클래스
		this.dProduct = new DrinkProduct(); // 밀키스 데이터 클래스
		
		// 각자 생성된 DrinkProduct 인스턴스에 값 할당
		aProduct.drinkName = "박카스";
		aProduct.drinkPrice = 900;
		aProduct.drinkQuantity = 15;
		
		bProduct.drinkName = "몬스터";
		bProduct.drinkPrice = 900;
		bProduct.drinkQuantity = 15;
		
		cProduct.drinkName = "핫식스";
		cProduct.drinkPrice = 1300;
		cProduct.drinkQuantity = 10;
				
		dProduct.drinkName = "밀키스";
		dProduct.drinkPrice = 1400;
		dProduct.drinkQuantity = 5;
	}
	
	
	public DrinkProduct order(String productName,int productQuantity) {
		// 반환할 상품을 담을 비어있는 DrinkProduct 선언
		DrinkProduct orderProduct = null;
		if(productName == aProduct.drinkName) {
			System.out.println("※주문전※ 상품명 : "+aProduct.drinkName+" 재고 : "+aProduct.drinkQuantity+" 가격 : "+aProduct.drinkPrice);
			if(aProduct.drinkQuantity-productQuantity<0) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			else {
				// 여기서 this를 생략해도 되지만 명시적으로 DrinkProduct 타입,클래스 멤버변수임을 명시하기 위해 this 사용
				this.aProduct.drinkQuantity -= productQuantity;
				orderProduct = new DrinkProduct(); // 반환될 내용을 orderProduct에 담아서 Return 하기위해 사용
				orderProduct.drinkName=aProduct.drinkName; // 값할당
				orderProduct.drinkPrice=aProduct.drinkPrice;
				orderProduct.drinkQuantity=productQuantity;
			}
		}
		else if(productName == bProduct.drinkName) {
			System.out.println("※주문전※ 상품명 : "+bProduct.drinkName+" 재고 : "+bProduct.drinkQuantity+" 가격 : "+bProduct.drinkPrice);
			if(bProduct.drinkQuantity-productQuantity<0) {
				System.out.println("상품이 품절되었습니다.");
			}
			else {
				this.bProduct.drinkQuantity -= productQuantity;
				orderProduct = new DrinkProduct();
				orderProduct.drinkName=bProduct.drinkName;
				orderProduct.drinkPrice=bProduct.drinkPrice;
				orderProduct.drinkQuantity=productQuantity;
				
			}
		}
		else if(productName == cProduct.drinkName) {
			System.out.println("※주문전※ 상품명 : "+cProduct.drinkName+" 재고 : "+cProduct.drinkQuantity+" 가격 : "+cProduct.drinkPrice);
			if(cProduct.drinkQuantity-productQuantity<0) {
				System.out.println("상품이 품절되었습니다.");
			}
			else {
				this.cProduct.drinkQuantity -= productQuantity;
				orderProduct = new DrinkProduct();
				orderProduct.drinkName=cProduct.drinkName;
				orderProduct.drinkPrice=cProduct.drinkPrice;
				orderProduct.drinkQuantity=productQuantity;
			}
			
		}
		else if(productName == dProduct.drinkName) {
			System.out.println("※주문전※ 상품명 : "+dProduct.drinkName+" 재고 : "+dProduct.drinkQuantity+" 가격 : "+dProduct.drinkPrice);
			if(dProduct.drinkQuantity-productQuantity<0) {
				System.out.println("상품이 품절되었습니다.");
			}
			else {
				this.dProduct.drinkQuantity -= productQuantity;
				orderProduct = new DrinkProduct();
				orderProduct.drinkName=dProduct.drinkName;
				orderProduct.drinkPrice=dProduct.drinkPrice;
				orderProduct.drinkQuantity=productQuantity;
				
			}
			
		}
		
		return orderProduct;
		
		
		
		
	}

	// 상품 입고 메소드
	public void wareHouse(String productName,int productQuantity) {
		// 사람은 productName과 "박카스" 처럼 인지할 수 있지만
		// 컴퓨터는 인스턴스이름을 매핑하여 비교해줌
		if(productName==aProduct.drinkName) {
			System.out.println("※입고전※ 상품명 : "+aProduct.drinkName+" 재고 : "+aProduct.drinkQuantity+" 가격 : "+aProduct.drinkPrice);
			aProduct.drinkQuantity += productQuantity;
			System.out.println("※입고후※ 상품명 : "+aProduct.drinkName+" 재고 : "+aProduct.drinkQuantity+" 가격 : "+aProduct.drinkPrice);
		}
		else if(productName==bProduct.drinkName) {
			System.out.println("※입고전※ 상품명 : "+bProduct.drinkName+" 재고 : "+bProduct.drinkQuantity+" 가격 : "+bProduct.drinkPrice);
			bProduct.drinkQuantity += productQuantity;
			System.out.println("※입고후※ 상품명 : "+bProduct.drinkName+" 재고 : "+bProduct.drinkQuantity+" 가격 : "+bProduct.drinkPrice);
		}
		else if(productName==cProduct.drinkName) {
			System.out.println("※입고전※ 상품명 : "+cProduct.drinkName+" 재고 : "+cProduct.drinkQuantity+" 가격 : "+cProduct.drinkPrice);
			cProduct.drinkQuantity += productQuantity;
			System.out.println("※입고후※ 상품명 : "+cProduct.drinkName+" 재고 : "+cProduct.drinkQuantity+" 가격 : "+cProduct.drinkPrice);
		}
		else if(productName==dProduct.drinkName) {
			System.out.println("※입고전※ 상품명 : "+dProduct.drinkName+" 재고 : "+dProduct.drinkQuantity+" 가격 : "+dProduct.drinkPrice);
			dProduct.drinkQuantity += productQuantity;
			System.out.println("※입고후※ 상품명 : "+dProduct.drinkName+" 재고 : "+dProduct.drinkQuantity+" 가격 : "+dProduct.drinkPrice);
		}
	}
	
	public void inventory() {
		System.out.println("※잔여재고※ 상품명 : "+aProduct.drinkName+" 재고 : "+aProduct.drinkQuantity+" 가격 : "+aProduct.drinkPrice);
		System.out.println("※잔여재고※ 상품명 : "+bProduct.drinkName+" 재고 : "+bProduct.drinkQuantity+" 가격 : "+bProduct.drinkPrice);
		System.out.println("※잔여재고※ 상품명 : "+cProduct.drinkName+" 재고 : "+cProduct.drinkQuantity+" 가격 : "+cProduct.drinkPrice);
		System.out.println("※잔여재고※ 상품명 : "+dProduct.drinkName+" 재고 : "+dProduct.drinkQuantity+" 가격 : "+dProduct.drinkPrice);
	}

}
