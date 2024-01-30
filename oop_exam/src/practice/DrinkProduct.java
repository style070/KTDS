package practice;

//데이터 클래스 정의
public class DrinkProduct {
	
	
	
	String drinkName;
	int drinkPrice;
	int drinkQuantity;
	
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	public int getDrinkPrice() {
		return drinkPrice;
	}
	public void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}
	public int getDrinkQuantity() {
		return drinkQuantity;
	}
	public void setDrinkQuantity(int drinkQuantity) {
		this.drinkQuantity = drinkQuantity;
	}
	
	//Object에 있던 toString Override 및 재사용
		@Override
		public String toString() {
			
			String superToStringResult = super.toString();
			System.out.println(superToStringResult);
			
			StringBuffer sb = new StringBuffer();
			sb.append("제품명 : "+this.drinkName);
			sb.append(", 가격 : "+this.drinkPrice);
			sb.append(", 재고 : "+this.drinkQuantity);
			// TODO Auto-generated method stub
			return sb.toString();
		}
		
		/**
		 * Product p = new Product();
		 * if(p.equals("박카스")){...}
		 */
		
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if(obj instanceof String) {
				return this.drinkName.equals((String)obj);
			}
			
			
			return super.equals(obj);
		}
	
}
