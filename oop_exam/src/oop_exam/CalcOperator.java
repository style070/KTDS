package oop_exam;

public class CalcOperator {
	public int get(CalcType type,int num1, int num2) {
		
		// Enum이 값을 가지면 해당 Enum에 대한 설명을 볼 수 있는 장점
		System.out.println(type.getSymbol()+"을 합니다.");
		
		if(type==CalcType.ADD) {
			return num1+num2;
		}else if(type==CalcType.SUB) {
			return num1-num2;
		}else if(type==CalcType.MUL) {
			return num1*num2;
		}else if(type==CalcType.DIV) {
			return num1/num2;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		CalcOperator calc = new CalcOperator();
		// 주석을 아무리달아도 의미를 알수가 없음..
		int gender=2;
		
		int result1 = calc.get(CalcType.ADD, 10, 5);
		System.out.println(result1);
		
		int result2 = calc.get(CalcType.SUB, 10, 5);
		System.out.println(result2);
		
		int result3 = calc.get(CalcType.MUL, 10, 5);
		System.out.println(result3);
		
		int result4 = calc.get(CalcType.DIV, 10, 5);
		System.out.println(result4);
	}
}
