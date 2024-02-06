package fp_java.ch01.annoymousclass;

public class Main {
	
	
	//nested class / 클래스 내부 클래스
	//바깥 클래스는 반드시 public / 내부 클래스는 private public protected도 가능함
	//클래스 내부에 정의된 클래스로 정의하면 $ 표시가 나옴 Main$SubMain ( Main 내부에 존재하는 SubMain 클래스 ) 
	//
	public static class SubMain {
		
	}
	
	
	public static void main(String[] args) {
		
		SubMain subMain = new Main.SubMain();
		Main main = new Main();
		System.out.println(subMain);
		System.out.println(main);
		
		Computable computer1 = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		Computable computer2 = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		Computable computer3 = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(computer1);
		System.out.println(computer2);
		System.out.println(computer3);
	}

}
