package oop_exam;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;
	
	int sum;
	double average;
	double courseCredit;
	String grade;
	
	public int getSumAllScores(int java,int python, int cpp, int csharp) {
		int sum=java+python+cpp+csharp;
		return sum;
	}
	
	public double getAverage(int java,int python,int cpp, int csharp) {
		double average=getSumAllScores(java, python, cpp, csharp)/4.0;
		return average;
	}
	public static double getCourseCredit(double average) {
		double courseCredit=(average-55)/10;
		//System.out.println(courseCredit);
		return courseCredit;
	}
	
	// 각 if , else-if 문에서 바로 return 해도 가능
	// 실무코드에서는 else까지 쓰지 않고 else 부분을 return 문으로 작성할 수 있음
	public static String getABCDE(double courseCredit) {
		String grade=null;
		if(courseCredit>=4.1) {
			grade="A+";
		}
		else if(courseCredit>=3.6) {
			grade="A";
		}
		else if(courseCredit>=3.1) {
			grade="B+";
		}
		else if(courseCredit>=2.6) {
			grade="B";
		}
		else if(courseCredit>=1.6) {
			grade="C";
		}
		else if(courseCredit>=0.6) {
			grade="D";
		}
		else if(courseCredit>=0.1) {
			grade="F";
		}
		
		return grade;
	}
}
