package hello_java_world;

/**
 * Multi Line 주석 Document(주석) 주석 : 코드의 설명을 위한 영역, 코드 실행과는 관계가 업습니다.
 * 
 * JAVA 파일을 실행시키기 위한 코드
 * 
 * @param agrs
 * 
 */

public class HelloJava {
	public static void main(String[] args) {
//		// int형 number 변수를 정의.
//		int number;
//		
//		//number 변수에 값을 할당.
//		number=3;
//		
//		//int number=20;
//		// Single Line 주석
//		System.out.println(number);
//		
//		
//		byte byteNumber=1;
//		byteNumber=2;
//		System.out.println(byteNumber);
//		
//		short shortNumber=10;
//		shortNumber=20;
//		System.out.println(shortNumber);
//		
//		int intNumber=20;
//		intNumber=30;
//		System.out.println(intNumber);
//		
//		long longNumber=3_000_000_000L;
//		longNumber=333333333333L;
//		System.out.println(longNumber);
//		
//		float floatNumber=10.55f;
//		System.out.println(floatNumber);
//		
//		double doubleNumber=11.556;
//		System.out.println(doubleNumber);
//		
//		char letter='A';
//		System.out.println(letter);
//		
//		letter='B';
//		System.out.println(letter);
//		
//		letter='1';
//		System.out.println(letter);
//											// 첫글자는 항상 소문자 calmel 표기법
//		boolean areYouStudent = true;		// boolean 변수는 동사 나머지 Type은 명사
//		System.out.println(areYouStudent);
//		
//		boolean areYouDesigner=false;
//		System.out.println(areYouDesigner);
//		
//		//상수는 할당되는 순간부터 재할당 불가 
//		// 선언만해두고 추후에 할당시 가능
//		// 상수는 항상 모든글자를 대문자로 할당
//		// 단어와 단어는 언더바로 할당
//		final int SPEED_OF_LIGHT = 299_792_458;
//		System.out.println(SPEED_OF_LIGHT);
//		System.out.println(Math.PI);
//		System.out.println(Math.E);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
//		//speedOfLight=10;
//		
//		System.out.println("============= 타입 형변환 ===========");
//		
//		
//		// 묵시적 형변환 byte -> short -> int -> long 순으로 멤리가 큰 형변환은가능함
//		int normalNumber1 = Integer.MAX_VALUE;
//		long bigNumber1 = normalNumber1;
//		System.out.println(normalNumber1);
//		System.out.println(bigNumber1);
//		
//		
//		long bigNumber2 = Long.MAX_VALUE;
//		int normalNumber2 = (int)bigNumber2;
//		System.out.println(bigNumber2);
//		System.out.println(normalNumber2);
//		
//		
//		// 정수 오버플로우로 인한 묵시적 형변환을 통해
//		long longNumber1 = 2147483649L;
//		System.out.println(longNumber1);
//		int normalNumber3 = (int)longNumber1;
//		System.out.println(normalNumber3);
//		System.out.println();
//		
//		// 묵시적 형변환 
//		// int는 4byte float 또한 4byte이므로 크거나 같으므로 묵시적 형변환이 가능함
//		int num=10;
//		float fnum=num;
//		double dnum=num;
//		
//		System.out.println(num);
//		System.out.println(fnum);
//		System.out.println(dnum);

//		float fnum=10.9f;
//		int num=(int)fnum;
//		System.out.println(fnum);
//		System.out.println(num);
//		
//		double dnum = 11.15;
//		num = (int)dnum;
//		System.out.println(dnum);
//		System.out.println(num);

//		//29.37을 29.4로 올림 처리하기
//		double dnum=29.349;
//		double dnum2=dnum*10;
//		System.out.println(dnum2); //293.7
//		
//		dnum2=Math.round(dnum2);   
//		System.out.println(dnum2); // Math.round 함수는 JAVA에서 반올림처리하는 함수 294.0
//		
//		double dnum3 = dnum2/10;
//		System.out.println(dnum3);

//		String numberString="10";
//		byte byteNumber=Byte.parseByte(numberString);
//		System.out.println(byteNumber);
//		
//		numberString = "10000";
//		short shortNumber = Short.parseShort(numberString);
//		System.out.println(byteNumber);
//		
//		numberString = "100000";
//		int intNumber = Integer.parseInt(numberString);
//		System.out.println(intNumber);
//
		int number = 10;
		int addedNumber = number + 3;
		System.out.println(addedNumber);

		int subtractedNumber = number - 3;
		System.out.println(subtractedNumber);

		int devidedNumber = (number/3);
		System.out.println(devidedNumber);

		double devideRemainNumber = number % 3;
		System.out.println(devideRemainNumber);
//		
	}
}
