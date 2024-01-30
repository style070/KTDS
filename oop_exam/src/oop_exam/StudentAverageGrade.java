package oop_exam;

public class StudentAverageGrade {
	public static void main(String[] args) {
		Student studentA = new Student();
		studentA.java=100;
		studentA.csharp=97;
		studentA.cpp=81;
		studentA.python=99;
		
		int sum=studentA.getSumAllScores();
		double average=studentA.getAverage();
		double courseCredit=studentA.getCourseCredit();
		String grade=studentA.getABCDE();
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+average);
		System.out.println("학점 : "+courseCredit);
		System.out.println("등급 : "+grade);
		
		
		
	}
}
