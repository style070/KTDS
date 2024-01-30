package oop_exam;

public class StringMethod {
	public static void main(String[] args) {
		// address에 "서울"이 포함되어있는지 확인
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.contains("서울");
		System.out.println(isSeoul);

		// address가 176으로 끝나는지 확인
		address = "서울특별시 서초구 효령로 176";
		isSeoul = address.endsWith("176");
		System.out.println(isSeoul);

		// name이 ktdsUniversity와 정확히 같은지 비교
		String name = "ktdsuniversity";
		boolean isEqual = name.equals("ktdsUniversity"); // equals 함수는 대소문자 비교함
		System.out.println(isEqual);

		// name이 ktdsUniversity와 같은지 비교 ( 대소문자 비교안함 )
		isEqual = name.equalsIgnoreCase("ktdsUniversity");
		System.out.println(isEqual); // equalsIgnoreCase는 대소문자 비교하지 않음

		// format 바인딩 기능
		String format = "%s에서 교육하는 %s과정";
		String str = String.format(format, "ktdsuniversity", "Java");
		System.out.println(str);

		// format 바인딩 기능 (JAVA 15부터 가능 )
		format = "%s에서 교육하는 %s과정";
		// Since Java15
		str = format.formatted("ktdsuniversity", "Java");
		System.out.println(str);

		// 문자 c의 인덱스(위치)찾기
		// 인덱스는 0,1,2 .. 순으로
		String alphabets = "abcdefg";
		int letterCIndex = alphabets.indexOf('c');
		System.out.println(letterCIndex);

		// 문자 C의 인덱스 (위치) 찾기
		letterCIndex = alphabets.indexOf('C');
		System.out.println(letterCIndex); // 대문자 C가 없으므로 -1 리턴

		// 문자 def의 인덱스(위치) 찾기
		letterCIndex = alphabets.indexOf("def");
		System.out.println(letterCIndex); // def가 시작하는 d의 인덱스 위치 3 리턴

		// str이 비어있거나 공백으로만 이루어져 있는지 확인 (JAVA 11 이상 )
		str = "    ";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);

		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty); // isEmpty()는 문자열의 길이가 0인지 확인 (Null 및 공백도 문자열 길이 1사용 ) 따라서 False

		String message = "안녕하세요";
		name = "홍길동님";
		String helloMessage = String.join(",", message, name);
		System.out.println(helloMessage);

		// message에서 "a"의 마지막 인덱스(위치) 찾기
		message = "abcdefgaijkb";
		int letterALastIndex = message.lastIndexOf("a");
		System.out.println(letterALastIndex);

		// message에서 "jj"의 마지막 인덱스(위치) 찾기
		int letterJJLastIndex = message.lastIndexOf("jj");
		System.out.println(letterJJLastIndex);

		int length = message.length();
		System.out.println(length);

		// 정규 표현식 ^는 [0-9] ( + ) 사이에 있는지 $는 끝맺음
		String phone = "01012341234";
		boolean isNumber = phone.matches("^[0-9]+$");
		System.out.println(isNumber);

		// message에서 홍길동을 ktds로 변경하기
		message = "안녕하세요,홍길동님, 안녕히 가세요, 홍길동님.";
		message = message.replace("홍길동", "ktds");
		System.out.println(message);

		// phone에서 숫자가 아닌 문자를 공백문자("")로 변경하기
		// 정규 표현식 [^0-9]는 0-9까지 포함되지 않으면 replaceAll ""(공백)으로
		phone = "010-1234-1234";
		phone = phone.replaceAll("[^0-9]", "");
		System.out.println(phone);

		// phone을 "-"로 잘라 배열에 할당하기
		phone = "010-1234-1234";
		String[] phoneArea = phone.split("-"); // - 을 구분자로 각 배열에 할
		System.out.println(phoneArea[0]);
		System.out.println(phoneArea[1]);
		System.out.println(phoneArea[2]);

		// phone이 +82로 시작하는지 확인하기
		phone = "+82-010-1234-1234";
		boolean isKoreaNum = phone.startsWith("+82");
		System.out.println(isKoreaNum);

		// datetime에서 2023(연)글자만 잘라내어 할당하기
		String datetime = "2023-05-02 14:56:13";
		String year = datetime.substring(0, 4); // 0에서 3까지 인덱스만 잘라서 year에 할당
		System.out.println(year);

		// datetime에서 14(시)글자만 잘라내어 할당하기
		String hour = datetime.substring(11, 13);
		System.out.println(hour);

		String time = datetime.substring(11); // 10까지 잘라서 뒷부분 출력
		System.out.println(time);

		// datetime에서 앞뒤 공백 모두 제거하기
		datetime = "    2023-05-02 14:56:13    ";
		System.out.println(datetime.length());
		System.out.println(datetime);
		datetime = datetime.trim();
		System.out.println(datetime.length());
		System.out.println(datetime);
		
		//int 타입 1을 문자열로 변경하기 (Overloading)
		String iStr = String.valueOf(1);
		System.out.println(iStr);

		
		
		
	}
}
