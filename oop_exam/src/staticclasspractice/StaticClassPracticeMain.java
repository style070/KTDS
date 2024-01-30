package staticclasspractice;

import oop_exam.Student;

public class StaticClassPracticeMain {
	public static void main(String[] args) {
		int age = 10;
		int java = 90;
		int python = 85;
		int cpp = 80;
		int csharp = 75;
		double average = (java+python+cpp+csharp)/4;
		
		System.out.println(StaticClassPractice.isValidAge(age, 9, 14));
		//System.out.println("총점의 합 : "+Student.getSumAllScores(java, python, cpp, csharp));
		//System.out.println("평균 점수 : "+Student.getAverage(java, python, cpp, csharp));
		System.out.println("학점 : "+Student.getCourseCredit(average));
		System.out.println("영문 학점 : "+Student.getABCDE(Student.getCourseCredit(average)));
		
		
	}
}
