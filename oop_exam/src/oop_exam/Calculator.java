package oop_exam;

public class Calculator {

	// 멤버변수 선언 -> 인스턴스가 사용 -> 정의만 클래스에
	int korScore;
	int engScore;
	int mathScore;
	int progScore;
	
	int sumScore;
	int averageScore;
	String grade;
	
	// 멤버변수에 변수가 선언되어 있으므로 파라미터 변수를 굳이 기입할 필요가 없음
	public int getSumScore() {
		sumScore = korScore+engScore+mathScore+progScore;
		return sumScore;
	}
	
	public int getAverageScore() {
		averageScore = sumScore/4;
		return averageScore;
	}
	
	public String getGradeScore() {
		if(averageScore>=95) {
			grade="A+";
		}
		else if(averageScore>=90){
			grade="A";
		}
		else if(averageScore>=85) {
			grade="B+";
		}
		else if(averageScore>=80) {
			grade="B";
		}
		else if(averageScore>=70) {
			grade="C";
		}
		else {
			grade="F";
		}
		return grade;
	}
	
}
