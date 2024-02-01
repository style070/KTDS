package generic_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable.PrintMode;

public class CollectionExample {
	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>();

		System.out.println(" ========== List 사용 실습 1 (List)에 데이터추가");
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);

		System.out.println(scoreList);
		System.out.println(scoreList.size());

		System.out.println(" ========== List 사용 실습 2 (List)에 데이터추가");

		int score = scoreList.get(0);
		System.out.println(score);

		score = scoreList.get(1);
		System.out.println(score);

		score = scoreList.get(2);
		System.out.println(score);

		score = scoreList.get(3);
		System.out.println(score);

		score = scoreList.get(4);
		System.out.println(score);

		// score = scoreList.get(5);
		// System.out.println(score);

		System.out.println(" ========== List 사용 실습 3 (List 반복 데이터 조회");
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);

		System.out.println(scoreList);
		System.out.println(scoreList.size());

		for (int i = 0; i < scoreList.size(); i++) {
			score = scoreList.get(i);
			System.out.println(score);
		}

		System.out.println("List 사용 실습 4 (List 데이터 삭제)");
		scoreList.remove(3);

		System.out.println(scoreList);
		System.out.println(scoreList.size());

		System.out.println("List 사용 실습 5 ( List 데이터 모두 삭제 )");
		scoreList.clear();
		System.out.println(scoreList);
		System.out.println(scoreList.size());

		System.out.println("List 사용 실습 6 ( List가 비어있는지 확인");
		System.out.println(scoreList.isEmpty());
		System.out.println(scoreList);
		System.out.println(scoreList.size());

		System.out.println("List 사용 실습 7 ( 값 존재 여부 확인 )");
		if (!scoreList.contains(90)) {
			scoreList.add(90);
		}
		System.out.println(scoreList);
		System.out.println(scoreList.size());

		System.out.println("List 사용 실습 8 (리스트 복사)");

		scoreList.add(100);
		scoreList.add(200);
		scoreList.add(300);
		scoreList.add(400);

		List<Integer> scoreList2 = new ArrayList<Integer>();
		scoreList2.addAll(scoreList);

		System.out.println(System.identityHashCode(scoreList.get(1)));
		System.out.println(scoreList);
		System.out.println(scoreList.size());

		System.out.println(System.identityHashCode(scoreList2.get(1)));
		System.out.println(scoreList2);
		System.out.println(scoreList2.size());

		System.out.println("Map 사용 실습 1 (Map에 데이터 추가");
		Map<String, Integer> priceMap = new HashMap<>();

		priceMap.put("Apple Mackbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);

		System.out.println(priceMap);
		System.out.println(priceMap.size());

		priceMap.put("LG Gram", 1_800_000);
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		System.out.println("Map 사용 실습 2 (Map 데이터 조회)");

		int applePrice = priceMap.get("Apple Mackbook Pro");
		System.out.println(applePrice);

		// java.lang.NullPointerException
		// applePrice = priceMap.get("apple mackbook pro");
		// System.out.println(applePrice);

		System.out.println("Map 사용 실습 3 (Map에 데이터 삭제");
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		priceMap.remove("Apple Mackbook Pro");
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		System.out.println("Map 사용 실습 4 ( Map 데이터 모두 삭제 )");
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		priceMap.clear();

		System.out.println(priceMap);
		System.out.println(priceMap.size());

		System.out.println("Map 사용 실습 5 ( Map 데이터 모두 삭제 )");

		priceMap.put("Apple Mackbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);

		System.out.println(priceMap.isEmpty());
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		priceMap.clear();

		System.out.println(priceMap.isEmpty());
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		System.out.println("Map 사용 실습 6 ( Map에 동일한 key가 있는지 확인 )");

		priceMap.put("Apple Mackbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		//priceMap.put("LG Gram", 1_700_000);
		
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		
		if(!priceMap.containsKey("LG Gram")) {
			priceMap.put("LG Gram", 1_600_000);
		}
		
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		

		
		System.out.println("Map 사용 실습 7 ( Map에 동일한 Value가 있는지 확인 )");
		
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		
		if(priceMap.containsValue(1_600_000)) {
			priceMap.put("LG Gram", 9_999_999);
		}
		
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		
		
		System.out.println("Map 사용 실습 7 ( Map 복사 )");
		Map<String,Integer> priceMap2 = new HashMap<String, Integer>();
		priceMap2.putAll(priceMap);
		
		System.out.println(System.identityHashCode(priceMap));
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		
		System.out.println(System.identityHashCode(priceMap2));
		System.out.println(priceMap2);
		System.out.println(priceMap.size());
		
		
		
	}
}
