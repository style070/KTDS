package generic_collection;

public class DynamicArray {
	public static void main(String[] args) {
		int[] scoreArray = new int[10];
		scoreArray[0]=100;
		scoreArray[1]=90;
		scoreArray[2]=80;
		scoreArray[3]=70;
		scoreArray[4]=60;
		scoreArray[5]=50;
		scoreArray[6]=40;
		scoreArray[7]=30;
		scoreArray[8]=20;
		scoreArray[9]=10;
		
		
		//scoreArray에 값 하나를 더 넣으려면 어덯게 해야하나?
		//학급의 학생이 10명이 있었따.
		// 선생은 10명의 학생 점수를 관리하고 있었다.
		// int[] scoreArray = new int[10];
		// 학기가 종료되기 전에 1명의 학생일 전학을 왔다.
		// 11명의 학생 점수를 관리해야한다.
		
		int[] scoreArray2 = new int[scoreArray.length+1];
//		for(int i=0; i<scoreArray.length;i++) {
//			scoreArray2[i] = scoreArray[i];
//		}
		
		//상기 for문을 대신할 한줄짜리 명령
		System.arraycopy(scoreArray, 0, scoreArray2, 0, scoreArray.length); 
		
		for (int score : scoreArray2) {
			System.out.println(score);
		}
		
		//배열은 Reference Type으로 메모리주소를 들고 다니므로 scoreArray2는 scoreArray의 주소값을 복사해서 1칸할당
		//scoreArray2 = scoreArray;
		//System.out.println(scoreArray2.length);
		
//		scoreArray2[0] = scoreArray[0];
//		System.out.println(scoreArray2.length);
//		System.out.println(scoreArray[0]);
//		System.out.println(scoreArray2[0]);
//		
//		scoreArray2[0] = 200;
//		System.out.println(scoreArray[0]);
//		System.out.println(scoreArray2[0]);
		
	}
}
