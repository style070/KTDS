package hello_java_world;

public class ifExam2 {
	public static void main(String[] args) {

		/*
		 * 1. 만약, 나이가 15세 이상이고, 19세 미만이면 "엔드게임"영화를 관람할 수 있다.
		 */
		int age =10;
		
		if(age>=15&&age<19) {
			System.out.println("엔드게임 영화관람 가능");
		}
		else {
			System.out.println("엔드게임 영화관람 불가능");
		}
		
		
		/*
		 * 2. 만약, 지금 시간이 오후 1시(13시)가 지났고
		 * 내체크카드에 8000원 보다 많은 돈이 있다면
		 * 식당에서 점심식사를 할 수 있다.
		 * 그렇지 않다면 편의점에서 라면을 사먹을 수 있다.
		 */
		
		int hour=13;
		int creditCard=6000;
		
		if (hour>=13&&creditCard>8000) {
			System.out.println("식당에서 점심식사 가능.");
		}
		else {
			System.out.println("편의점에서 라면먹으세요.");
		}

		/*
		 * 3. 만약 나이가 19세 이상이면
		 * "범죄도시1" 영화를 관람할 수 있고
		 * 나이가 15세 이상이고 19세 미만이면
		 * "엔드게임"영화를 관람할 수 있고
		 * 나이가 12세이상이고 15세 미만이면
		 * "해리포터"영화를 관람할 수 있고
		 * 그렇지 않다면 "뽀로로 극장판 공룡섬 대모험"을 관람할 수 있다.
		 */

		int age2=14;
		if(age2>=19) {
			System.out.println("범죄도시1 영화 관람 가능");
		}
		else if(age2>=15) {
			System.out.println("엔드게임 영화관람 가능");
		}
		else if(age2>=12) {
			System.out.println("뽀로로 극장판 공룡섬 대모험 관람가능");
		}
		else {
			System.out.println("영화 관람 불가능");
		}
		
		
	}
}
