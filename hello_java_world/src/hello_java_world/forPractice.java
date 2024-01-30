package hello_java_world;

public class forPractice {
	public static void main(String[] args) {
		System.out.println("Q1 : 1부터100까지의 합을 구해 출력해보세요");
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합은" + sum + "입니다.");

		System.out.println();
		System.out.println("Q2 : 1부터 100중 홀수의 합을 구해 출력해보세요");
		sum = 0;
		for (int i = 1; i < 101; i += 2) {
			sum += i;
		}
		System.out.println("1~100까지의 홀수합은" + sum + "입니다.");

		System.out.println();
		System.out.println("Q3 : 1부터 100중 3,5,6의 배수만 출력해보세요");
		sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 
				&& i % 5 == 0 
				&& i % 6 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		System.out.println();
		System.out.println("Q4 : 별찍기 1~5");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
