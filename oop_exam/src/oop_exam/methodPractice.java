package oop_exam;

import java.util.Scanner;

public class methodPractice {

	// Q1. a부터 b까지의 합을 구해 출력해보세요
	public static void sumAtoB(int a, int b) {
		int sum = 0;
		for (int i = a; i < b + 1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	// Q2. a부터 b까지의 홀수의 합을 구해 출력해보세요.
	public static void sumOddNum(int a, int b) {
		int sum = 0;
		for (int i = a; i < b + 1; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	// Q3. a부터 b중 c,d,e의 배수만 출력해보세요
	public static void lcm(int a, int b, int c, int d, int e) {
		for (int i = a; i < b + 1; i++) {
			if (i % c == 0 && i % d == 0 && i % e == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	// Q4. star(int a) a의개수만큼 별찍기
	public static void star(int a) {
		for(int i=1;i<a+1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("범위 시작숫자를 입력하세요.");
		int a =sc.nextInt(); // 범위 시작숫자 
		System.out.println("범위 끝숫자를 입력하세요");
		int b =sc.nextInt(); // 범위 끝숫자
		System.out.println("최소공배수에 사용할 첫번째 숫자를 입력하세요.");
		int c =sc.nextInt();
		System.out.println("최소공배수에 사용할 두번째 숫자를 입력하세요");
		int d =sc.nextInt();
		System.out.println("최소공배수에 사용할 세번째 숫자를 입력하세요");
		int e =sc.nextInt();
		System.out.println("별찍기에 사용할 층수를 입력하세요");
		int f = sc.nextInt();		
		
		
		sumAtoB(a, b);
		sumOddNum(a, b);
		lcm(a, b, c, d, e);
		star(f);
		sc.close();

	}
}
