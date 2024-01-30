package hello_java_world;

public class ArtithmaticProblem2 {
	public static void main(String[] args) {
		int processTime = 145;
		int minutes = 0;
		int seconds = 0;
		
		minutes = processTime/60;
		seconds = processTime%60;
		
		System.out.print(minutes+"분"+"");
		System.out.println(seconds+"초"+"입니다.");
		
	}
}
