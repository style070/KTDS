package generic_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoNumberPractice {

//	public static List<Integer> getLottoGame(Random random) {
//		// 1게임
//		 ArrayList<Integer> lottoNumberList = new ArrayList<>();
//
//		// 5게임 List안에 List
//		List<List<Integer>> lottoNumberList = new ArrayList<>();
//
//		// 실무코드는 반복문안에 변수를 정의하지 않으며 외부에서 해야한다.
//		int number = 0;
//		while (lottoNumberList.size() < 6) {
//			number = random.nextInt(45); // 0~44
//			number++; // 1~45
//
//			if (!lottoNumberList.contains(number)) {
//				lottoNumberList.add(number);
//			}
//		}
//		
//		List<Integer> lottoNumberList=null;
//		for(int i=0; i<5 i++) {
//			lottoNumberList=getLotto
//		}
//		System.out.println(lottoNumberList);

	}

	public static void main(String[] args) {
		// Case1 . 내가 푼 방식 Math.random()
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;

		int randNum;
		while (cnt<6) {
			randNum = (int) (Math.random() * 45)+1;
			if (!list.contains(randNum)) {
				list.add(randNum);
				cnt++;
		
			}
		}
		System.out.println(list);
		
		
	}
}
