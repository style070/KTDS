package fp_java.ch01.lambda;

public class Main {
	public static void main(String[] args) {
		// (  ) -> code
		// param -> code
		Computable computer1 = new Computable() {
			
			//익명 클래스
			@Override
			public int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 + num2;
			}
		};
		int addResult = computer1.add(10, 20);
		System.out.println(addResult);
		
		// 람다 ( 정석 )
		Computable lambdaComputer = (int num1,int num2) -> num1+num2;
		int labdaResult = lambdaComputer.add(10, 20);
		System.out.println(labdaResult);
		lambdaComputer.prinMessage();
		
		// 람다 ( 실무 )
		Computable labdaComputer2 = (num1,num2) -> num1+num2;
		int lambdaResult2 = labdaComputer2.add(10, 20);
		System.out.println(lambdaResult2);
		labdaComputer2.prinMessage();
		
		// 람다 (여러 줄 코딩)
		Computable lambdaComputer3 = (num1,num2) -> {
			System.out.println(">"+num1);
			System.out.println(">"+num2);
			
			return num1+num2;
			};
		
		int lambdaResult3 = lambdaComputer3.add(10, 30);
		System.out.println(lambdaResult3);
		lambdaComputer3.prinMessage();
		
		
		// =====================
		
		
		Printable printer = new Printable() {
			
			@Override
			public void print() {
				System.out.println("출력합니다.");
			}
		};
		printer.print();
		
		Printable printer2 = () -> System.out.println("출력합니다.");
		
		// ========================
		
		RandomExtractable random = new RandomExtractable() {
			
			@Override
			public double getRandom() {
				
				return Math.random();
			}
		};
		double randomNumber = random.getRandom();
		System.out.println(randomNumber);
		
		RandomExtractable randomNumber1 = () -> random.getRandom();
		double randomNumberResult = randomNumber1.getRandom();
		System.out.println(randomNumberResult);
	}

	
	
	}
