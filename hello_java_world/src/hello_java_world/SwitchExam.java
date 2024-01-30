package hello_java_world;

public class SwitchExam {
	public static void main(String[] args) {
//		//Java 1.7이상부터 int 형태의 정수뿐만 아닌 String 형태 문자열도 가능함
//		int value=0;
//		
//		//switch (상태값){}
//		//상태값 : 숫자 혹은 문자열.
//		switch(value) {
//			//현재 상태값(value)의 값이 0이라면 여기부터 시작.
//			//case 0: 이하 실행할 구문이 없다면 case 0또는 1로 판단함.
//			case 0:
//				System.out.println("현재 상태값은 0입니다.");
//			//현재 상태값(value)의 값이 1이라면 여기부터 시작.
//			case 1:
//				System.out.println("현재 상태값은 1입니다.");	
//			case 2:
//				System.out.println("현재 상태값은 2입니다.");
//			//현재 상태값(value)의 값이 0, 1, 2 모두 아니거나 
//			// 모든 흐름이 종료되었을때 가장 마지막에 실행되는 영역.
//			// 앞의 case에서 break; 호출시 default는 호출되지 않음
//			default:
//				System.out.println("흐름이 종료되었습니다.");
//				
//		}
//		
//		String status="뚜껑을 연다.";
//		
//		switch(status) {
//			case "뚜껑을 연다.":
//				System.out.println("밥솥을 꺼내세요.");
//			case "밥솥을 꺼낸다.":
//				System.out.println("쌀을 꺼내세요");
//			case "쌀을 꺼낸다.":
//				System.out.println("밥솥에 쌀을 부으세요.");
//			case "밥솥에 쌀을 붓는다.":
//				System.out.println("물을 부으세요.");
//				
//				
		String memberId = "admin";
		int memberGrade=switch(memberId) {
		case"admin","root"->1;
		case"sysopr"->2;
		default->3;
		};
		System.out.println(memberId);
		System.out.println(memberGrade);
	}
}
