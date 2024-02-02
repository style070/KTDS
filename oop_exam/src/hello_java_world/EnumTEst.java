package hello_java_world;

public class EnumTEst {
	public static enum Type{
		ADD("더하기"), SUB("빼기") , MUL("곱하기") , DIV("나누기");
		
		String name;
		Type(String name){
			this.name=name;
		}
		public String getName() {
			return name;
		}
	}
	
	public void calc (Type type, int num1, int num2) {
		System.out.println(type.getName()+"연산을 시작합니다.");
	}
}
