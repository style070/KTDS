package oop_exam;


/**
 * 배열 실습
 */
public class ArrayExam {
	public static void main(String[] args) {
		int[] scoreArray = new int[7];
	
		scoreArray[3]=4;
		scoreArray[0]=1;
		scoreArray[1]=2;
		scoreArray[2]=3;
		scoreArray[4]=5;
		scoreArray[5]=6;
		scoreArray[6]=7;
		
		System.out.println(scoreArray);
		System.out.println(scoreArray.length);
		
		System.out.println(scoreArray[5]);
		//System.out.println(scoreArray[-1]); //java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 7
		//System.out.println(scoreArray[7]); // java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
		int score= scoreArray[4];
		System.out.println(score);
		System.out.println();
		
		//for (초기값; 반복조건체크; 증감식){ ... }
		//for-each(향상된 for)
		int sum = 0;
		for(int i=0;i<scoreArray.length;i++) {
			System.out.println(scoreArray[i]);
			sum += scoreArray[i];
		}
		System.out.println("for-each");
		for(int score1 : scoreArray) {
			System.out.println(score1);
		}
		System.out.println("===============");
		
		
		
		
		System.out.println(sum);
		System.out.println();
		
		String[] names = new String[3];
		System.out.println(names);
		names[0] = "장민창";
		names[1] = "리모콘";
		
		System.out.println(names);
		String name = names[1];
		System.out.println(name);
		System.out.println();
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		
		
		
		//for-each
		//for (아이템 타입 아이템변수명 : 배열) { ... }
		for (String name2 : names) {
			System.out.println(name2);
		}
		
		
	}
}
