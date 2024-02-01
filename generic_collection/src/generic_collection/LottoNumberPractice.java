package generic_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoNumberPractice {

	public static List<Integer> getLottoGame(Random random) {
		List<Integer> lottoNumberList = new ArrayList<>();

		int number = 0;
		while (lottoNumberList.size() < 6) {
			number = random.nextInt(45); // 0 ~ 44
			number++; // 1 ~ 45

			if (!lottoNumberList.contains(number)) {
				lottoNumberList.add(number);
			}
		}

		return lottoNumberList;

	}

	public static void main(String[] args) {

		/*
		 * 1 부터 45 중 랜덤한 숫자를 만들어 ArrayList 인스턴스에 넣습니다. 이때, 생성된 난수의 값이 ArrayList 인스턴스에 이미
		 * 존재하는 값이라면, 인스턴스에 넣어서는 안됩니다. 따라서 ArrayList 인스턴스의 값들은 모두 고유한 값이어야 합니다.
		 * ArrayList 내부의 아이템 개수가 6이 될 때까지, 고유한 값들을 넣고 출력하는 코드를 작성하세요.
		 * 
		 * 5게임.
		 */

//		// Case1 . 내가 푼 방식 Math.random()
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		int cnt = 0;
//
//		int randNum;
//		while (cnt<6) {
//			randNum = (int) (Math.random() * 45)+1;
//			if (!list.contains(randNum)) {
//				list.add(randNum);
//				cnt++;
//		
//			}
//		}
//		System.out.println(list);

		Random random = new Random();

		List<List<Integer>> lottoNumberSet = new ArrayList<>();
		/*
		 * [11, 13, 42, 2, 18, 36] [11, 13, 42, 2, 18, 36] [11, 13, 42, 2, 18, 36] [11,
		 * 13, 42, 2, 18, 36] [11, 13, 42, 2, 18, 36]
		 */
		List<Integer> lottoNumberList = null;
		for (int i = 0; i < 5; i++) {
			lottoNumberList = getLottoGame(random);
//			System.out.println(lottoNumberList);
			lottoNumberSet.add(lottoNumberList);
		}

//		System.out.println(lottoNumberSet);
		for (List<Integer> lottoNumbers : lottoNumberSet) {
			System.out.println(lottoNumbers);
		}

	}
}
