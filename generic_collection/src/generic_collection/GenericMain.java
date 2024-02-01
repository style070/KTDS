package generic_collection;

public class GenericMain {
	public static void main(String[] args) {
		// 학생성적 Integer 타입으로 데이터 입/출력
		System.out.println("==============학생성적 Integer 타입으로 데이터 입/출력==============");
		//생성자에는 Generic 타입이 생략이 가능하나 Reference Type에는 명시해 주어야함
		ScoreList<Integer> sl1 = new ScoreList<>();
		System.out.println(sl1.toString());
		System.out.println(sl1.size());
		sl1.add(100);
		System.out.println(sl1.toString());
		System.out.println(sl1.size());
		sl1.add(200);
		System.out.println(sl1.toString());
		System.out.println(sl1.size());
		// sl1.get 을했을때 나오는 메소드에 Generic 타입을 명시하지 않으면 Object 타입으로 들어가게됨 -> 문제가 생길 가능성 多 
		// JAVA는 타입에 굉장히 엄격한 언어
		// Generic은 타입을 무조건 명시해 주어야함
		System.out.println(sl1.get(0));
		sl1.add(300);
		sl1.add(400);
		sl1.add(500);
		sl1.toString();
		//get(6)하면 size = 5 index = 6이므로 IndexOutOfBounds가 출력됨
		//sl1.get(6);
		
		
		
		// 학생 성적 String 타입으로 데이터 입/출력
		System.out.println("==============학생성적 String 타입으로 데이터 입/출력==============");
		ScoreList sl2 = new ScoreList<String>();
		System.out.println(sl2.toString());
		System.out.println(sl2.size());
		sl2.add("A+");
		System.out.println(sl2.toString());
		System.out.println(sl2.size());
		sl2.add("B-");
		System.out.println(sl2.toString());
		System.out.println(sl2.size());
		System.out.println(sl2.get(0));
		
		
	}
}
