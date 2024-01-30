package hello_java_world;



import javax.xml.crypto.Data;

public class IfExam1 {
	public static void main(String[] args) {

//		int number = 5;
//
//		if (number == 5) {
//			// number가 5와 같을 경우 실행될 코드
//			System.out.println("숫자가 5와 같습니다.");
//		} 
//		else {
//			// number가 5가 아닐 경우 실행될 코드
//			System.out.println("숫자가 5가 아닙니다.");
//		}

//		int number=7;
//		if(number==5) {
//			// number 5와 같을 경우 실행될 코드.
//			int number2=1;
//			System.out.println(number);
//			System.out.println(number2);			
//		}
//		else if(number==7) {
//			// number 7과 같을 경우 실행될 코드.
//			System.out.println("숫자 7과 같습니다.");
//		}
//		else {
//			///number가 5,7이 아닌경우 실행될 코드
//			int number2=2;
//			System.out.println(number);
//			System.out.println(number2);
//		}
//		System.out.println(number);
//		//System.out.println(number2);

//		//double 타입의 난수
//		double randomNumber = Math.random();  // 0.0~0.9999 까지 랜덤출력
//		System.out.println(randomNumber);
//		
//		//double 타입의 난수를 정수로 변환 0~99
//		int answer = (int)(randomNumber*100); // 0~99 까지 
//		int value=60;
//		System.out.println(answer);
//		if(answer==value) {
//			System.out.println("정답입니다");
//		}
//		else if (answer > value) {
//			System.out.println("UP!");
//		}
//		else {
//			System.out.println("DOWN");
//		}

		System.out.println("if-else if-else 연습문제 1");
		
		
		int korScore = 92;
		int engScore = 88;
		int mathScore = 70;
		int progScroe = 80;

		int sum = 0;
		int average = 0;

		sum = korScore + engScore + mathScore + progScroe;
		average = sum / 4;
		
		System.out.println("평균은"+average+"점 입니다.");
		if (average >= 95) {
			System.out.println("A+ 학점입니다.");
		} else if (average >= 90) {
			System.out.println("A 학점입니다.");
		} else if (average >= 85) {
			System.out.println("B+ 학점입니다.");
		} else if (average >= 80) {
			System.out.println("B 학점입니다.");
		} else if (average >= 70) {
			System.out.println("C 학점입니다.");
		} else {
			System.out.println("F 학점입니다.");
		}

		System.out.println();
		System.out.println("if-else if-else 연습문제 2");
		

		int money = 1_000_000;

		int father = 40;
		int mother = 36;
		int daughter = 11;

		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int travelCost=0;
//		//case 1( 단순 if,else 사용)
//		
//		if(father>=19) {
//			travelCost+=adultOneWayFlightFare;
//		}
//		else {
//			travelCost+=kidOneWayFlightFare;
//		}
//		if(mother>=19) {
//			travelCost+=adultOneWayFlightFare;
//		}
//		else {
//			travelCost+=kidOneWayFlightFare;
//		}
//		if(daughter>=19) {
//			travelCost+=adultOneWayFlightFare;
//		}
//		else {
//			travelCost+=kidOneWayFlightFare;
//		}
		//case2 adult++ , kid++ 해서 카운팅하는방식
		
		
		//case3 삼항연산자 사용
		// 삼항연산자 코드는 if로변경후 처리가 되기때문에 loss가 발생하긴함 그래도 삼항연산자 쓰면 코드가 줄어들기 때문에 ㅆㄱㄴ
		travelCost=(father>=19?adultOneWayFlightFare:kidOneWayFlightFare)+(mother>=19?adultOneWayFlightFare:kidOneWayFlightFare)+(daughter>=19?adultOneWayFlightFare:kidOneWayFlightFare);

		System.out.println(travelCost+"원 있습니다.");
		if(travelCost<=money) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에가자 ㅠㅠ");
		}
		
		
		
		

	}
}
