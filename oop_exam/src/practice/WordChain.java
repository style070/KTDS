package practice;

import java.util.Scanner;

public class WordChain {

	// if문 축약 코드
	public static void case1() {
		Scanner sc = new Scanner(System.in);
		// 시작단어 할당
		String startWord = "자전거";
		int cnt = 1;

		while (true) {
			// 다음단어 입력

			String nextWord = sc.nextLine();

			// 다음단어 공백제거
			nextWord = nextWord.trim();

			// 다음 단어의 길이가 3글자 이상인가?
			if (nextWord.length() < 3) {
				break;
			}
			// 시작단어의 마지막 글자 추출
			// String lastLetter = startWord.substring(startWord.length()-1) 도 가능함
			String lastChar = startWord.substring(startWord.length() - 1); // substring (startWord.length()-1) // 3글자
																			// 2번째 인덱스(마지막글자) 출력
			// 다음 단어가 시작 단어의 마지막 글자로 시작하는가?
			if (nextWord.substring(0, 1).equals(lastChar)) {
				startWord = nextWord;
				cnt++;
			} else {
				break;
			}

		}
		System.out.println("끝말잇기 게임 종료");
		System.out.println("이어나간 단어의 수 : " + cnt);

	}

	public static void case2() {
		Scanner sc = new Scanner(System.in);
		// 시작단어 할당
		String startWord = "자전거";
		int cnt = 1;

		while (true) {
			// 다음단어 입력

			String nextWord = sc.nextLine();

			// 다음단어 공백제거
			nextWord = nextWord.trim();

			// 다음 단어의 길이가 3글자 이상인가?
			if (nextWord.length() >= 3) {
				// 시작단어의 마지막 글자 추출
				// String lastLetter = startWord.substring(startWord.length()-1) 도 가능함
				String lastChar = startWord.substring(startWord.length() - 1); // substring (startWord.length()-1) //
																				// 3글자 2번째 인덱스(마지막글자) 출력
				// 다음 단어가 시작 단어의 마지막 글자로 시작하는가?
				if (nextWord.substring(0, 1).equals(lastChar)) {
					startWord = nextWord;
					cnt++;
				} else {
					break;
				}

			} else {
				break;
			}

		}

		System.out.println("끝말잇기 게임 종료");
		System.out.println("이어나간 단어의 수 : " + cnt);

	}




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 시작단어 할당
		String startWord = "자전거";
		int cnt = 1;

		while (true) {
			// 다음단어 입력

			String nextWord = sc.nextLine();

			// 다음단어 공백제거
			nextWord = nextWord.trim();

			// 다음 단어의 길이가 3글자 이상인가?
			if (nextWord.length() >= 3) {
				// 시작단어의 마지막 글자 추출
				// String lastLetter = startWord.substring(startWord.length()-1) 도 가능함
				String lastChar = startWord.substring(startWord.length() - 1); // substring (startWord.length()-1) //
																				// 3글자 2번째 인덱스(마지막글자) 출력
				// 다음 단어가 시작 단어의 마지막 글자로 시작하는가?
				if (nextWord.substring(0, 1).equals(lastChar)) {
					startWord = nextWord;
					cnt++;
				} else {
					break;
				}

			} else {
				break;
			}

		}

		System.out.println("끝말잇기 게임 종료");
		System.out.println("이어나간 단어의 수 : " + cnt);

	}
}
