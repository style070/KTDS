package oop_exam;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class WordChainPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문자열비교
		String str1 = "한글"; //Reference Type(메모리주소)
		String str2 = "한글"; //Reference Type(메모리주소)
		// str1 == str2 <= 메모리 주소가 같은가?
		// IDE에서 자동으로 동일한 텍스트는 동일한 메모리 주소공간 id=23 으로 할당
		// 하드코딩한 값은 메모리주소가 같음
		
		
		//사용자가 입력을 받는 데이터는 다른 메모리 주소 공간에 저장
		System.out.println(str1 == str2);
		
		String str3= sc.nextLine();
		String str4= sc.nextLine();
		
		//문자열(Reference Type) 비교는 반드시 equals() 로 비교해야함
		System.out.println(str3 == str4); // 메모리 주소를 비교하므로 False가나옴
		System.out.println(str3.equals(str4)); // String의 값을 비교하므로 True가 나옴
		
		
		
		
	}
}
