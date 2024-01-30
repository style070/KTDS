package oop_exam;

public class CraneGameMachine {
	boolean isInsertCoin;
	int dolls;

	public void insertCoin() {
		if (dolls <= 0) {
			isInsertCoin = false;
		} else {
			isInsertCoin = true;
			System.out.println("인형뽑기 게임을 시작합니다.");
		}
	}

	public int doGame() {
		if (isInsertCoin == true) {
			int result = (int) (Math.random() * 10 / 5);
			if (result == 1) {
				dolls--;
				isInsertCoin = false;
				System.out.println("인형을 1개 뽑았습니다.");
				System.out.println("잔여인형의 개수는" + dolls + "개 입니다.");
				System.out.println();
				return 1;

			} else {
				isInsertCoin = false;
				System.out.println("인형을 뽑지 못했습니다.");
				System.out.println();
				return 0;
			}
		} else {
			System.out.println("코인을 넣지 않았습니다.");
			return 0;

		}
	}

}
