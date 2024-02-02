package oop_exam;

public enum CalcType {
	// ADD , SUB , MUL , DIV 자체도 인스턴스이므로 생성자를 호출하는 형식이됨
	ADD("+"),SUB("-"),MUL("*"),DIV("/");
	
	private String symbol;
	
	// public으로 만들면 누군가가 접근해서 enum을 추가할 수 있으므로
	// Enum의 생성자에는 public을 사용하지 않는다
	CalcType(String str) {
		this.symbol = str;
	}
	
	
	// Enum도 멤버변수를 가지게 할 수 있으며 getter사용
	public String getSymbol() {
		return this.symbol;
	}
	
}
