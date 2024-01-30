package oop_exam;


/*
 * if – else if – else 연습 문제에서 아래 메소드 만들고 호출 실습 
   나이를 파라미터로 받아 편도 비행요금을 계산해 반환하는 메소드
   
   // 3인 가족이 100만원으로 비행기를 타고 편도 여행을 가려합니다.
    // 부모님의 나이는 각각 40, 36세이며, 딸의 나이는 11세입니다.
    // 성인의 비행요금은 30만원
    // 아동의 비행요금은 12만원입니다.
    // 3인 가족은 여행을 떠날 수 있을까요?
    // 여행을 떠날 수 있다면 "여행가자!"
    // 여행을 떠날 수 없다면 "다음에가자 ㅠㅠ" 를 출력해보세요.
 */
public class ReturnMethodExam4 {
	
	public static String travelResult(int money,int father,int mother,int daughter,int adultFare, int kidFare) {
		int sum=(father>19?adultFare:kidFare)+(mother>19?adultFare:kidFare)+(daughter>19?adultFare:kidFare);
		String result=null;
		if(sum>money) {
			result="다음에가자 ㅠㅠ";
		}
		else {
			result="여행가자!";
		}
				
		return result;
	}
	
	public static void main(String[] args) {
		int money=1_000_000;
		
		int father=40;
		int mother=36;
		int daughter=11;
		
		int adultOneWafFlightFare=300_000;
		int kidOneWayFlightFare=120_000;
		
		System.out.println(travelResult(money, father, mother, daughter, adultOneWafFlightFare, kidOneWayFlightFare));
		
		
	}
}
