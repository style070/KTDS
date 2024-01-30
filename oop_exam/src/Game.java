

import java.util.Scanner;

public class Game {
	
	public static void startGame() {
		// Ctrl + Shift + O 자동 Import
				// 키보드의 입력을 변수로 받아올 수 있도록 도와주는 코드.
				Scanner sc = new Scanner(System.in);

				// 난수를 생성 ( 0.00000)
				double randomNumber = Math.random();

				// 난수를 0~99사이의 int형 정수로 변환
				int answer = (int) (randomNumber * 100);

				// 사용자가 입력하는 값을 할당받을 변수를 선언.
				int value = 0;
				
				// 사용자에게 숫자를 입력하라고 알려준다.
				System.out.println("숫자를 입력하세요.");

				while (answer != value) {
					// 사용자가 keyboard 변수를 이용해 숫자를 입력한 후
					// 엔터를 입력하면 value 변수에 값이 할당된다.
					value = sc.nextInt();

					// 컴퓨터가 만든 난수와 사용자가 입력한 숫자가 일치하는지 확인하고
					// 일치한다면 "정답입니다"를 출력
					if (answer == value) {
						System.out.println("정답입니다.");
						break;
					}

					// 컴퓨터가 만든 난수와 사용자가 입력한 숫자를 비교했을때
					// 사용자가 입력한 값이 더 작다면 "up!"을 출력한다.
					else if (answer > value) {
						System.out.println("up!");
					}
					// 컴퓨터가 만든 난수와 사용자가 입력한 숫자를 비교했을 때
					// 일치하지도 않고 사용자가 입력한 값이 더 작지도 않다면
					// "Down!"을 출력한다.
					else {
						System.out.println("down!");
					}
				}
	sc.close();
	}
	
	
	public static void main(String[] args) {
		// 기존에 메인에 존재하던 코드를 메소드로 변경하여 Main 함수에서는 해당 함수로 호출하여 사용
		startGame();
		startGame();
		startGame();
		startGame();
		}

}
