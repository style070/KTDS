package oop_exam;

public class CraneGameMachineMain {
	public static void main(String[] args) {
		CraneGameMachine cgm = new CraneGameMachine();
		cgm.isInsertCoin=false;
		cgm.dolls = 10;

		while (true) {
			if (cgm.dolls > 0) {
				cgm.insertCoin();
				if (cgm.isInsertCoin == false) {
					System.out.println("동전을 넣으세요");
				} else {
					cgm.doGame();
				}
			} else {
				System.out.println("인형이 더이상 없으므로 동전이 반환됩니다.");
				break;
			}

		}

	}
}
