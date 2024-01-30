package oop_exam;

/**
 * if – else if – else 연습 문제에서 아래 메소드 만들고 호출 실습
   과목별 점수를 파라미터로 받아 합계를 구해 반환하는 메소드
   합계와 4를 파라미터로 받아 평균을 구해 반환하는 메소드
   평균을 파라미터로 받아 등급을 반환하는 메소드
   
    // 평균점수 95점 이상: A+
    // 평균점수 90점 이상: A
    // 평균점수 85점 이상: B+
    // 평균점수 80점 이상: B
    // 평균점수 70점 이상: C
    // 평균점수 70점 미만: F
 */


public class ReturnMethodExam3 {
	
	// 과목별 점수를 파라미터로 받아 합계를 구해 반환하는 메소드
	public static int subjectSum(int korScore,int engScore, int mathScore, int progScore) {
		int sum=korScore+engScore+mathScore+progScore;
				
		return sum;
	}
	
	
	// 합계와 4를 파라미터로 받아 평균을 구해 반환하는 메소드
	public static int subjectAverage(int korScore,int engScore, int mathScore, int progScore,int subjectCount) {
		int average=(korScore+engScore+mathScore+progScore)/subjectCount;
				
		return average;
	}
	
	public static String subjectGrade(int average) {
		String grade=null;
		if(average>=95) {
			grade="A+";
		}
		else if(average>=90){
			grade="A";
		}
		else if(average>=85){
			grade="B+";
		}
		else if(average>=80){
			grade="B";
		}
		else if(average>=70) {
			grade="C";
		}
		else {
			grade="F";
		}
		
		
		return grade;
		
	}
	
	
	public static void main(String[] args) {
		int korScore=90;
		int engScore=88;
		int mathScore = 70;
		int progScore = 80;
		int sum = subjectSum(korScore, engScore, mathScore, progScore);
		int average = subjectAverage(korScore, engScore, mathScore, progScore, 4);
		String grade=subjectGrade(average);
		
		System.out.println("4가지 과목의 합은"+sum+"점 이며 "+"평균은 "+average+"이며 "+"학점은"+grade+"입니다.");
			
		
	}
}
