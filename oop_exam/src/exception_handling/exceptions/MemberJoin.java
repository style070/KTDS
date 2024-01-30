package exception_handling.exceptions;

import java.util.Scanner;

public class MemberJoin {
	public void join() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("ID를 입력하세요");
		String id = keyboard.nextLine();

		if (id != null && (id.equals("system") || id.equals("admin") || id.equals("root"))) {
			throw new InvalidUserIdExceptions(id + "는 사용하실 수 없습니다.");
		}
		// KTDS는 이미 사용중인 ID로 \r\n
		// && (AND) || (or)가 같이사용중 이므로 우선순위에 의해서 &&가 먼저실행되고 ||가 추후 실행됨 유의
		else if (id != null && id.equals("KTDS")) {
			throw new AlreadyUseUserIdExceptions(id + "는 이미 사용중인 ID 입니다.");
		} else if ( id.trim().isEmpty()) { // Dead Code ID는 Null 일수가 없음
			// Enter만 치면 \n\r
			throw new InvalidUserIdExceptions("ID는 필수입력 값입니다.");
		} else if (id != null && id.length() < 8) {
			throw new UserIdLengthExceptions(id + "는 최소 8글자 이상 입력하세요");
		} else {
			System.out.println(id + "로 가입을 완료했습니다.");
		}

	}

	public static void main(String[] args) {
		MemberJoin memberjoin = new MemberJoin();
		memberjoin.join();
	}
}
