package fp_java.ch02.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class StreamExample {
	public static void main(String[] args) {
		List<Dish> menu = DishData.menu;
		
		List<String> lowCaloricDischesName =
				// List<Dish> -> Stream<Dish>로 변경
				menu.stream()
				// menu를 병렬로 처리하는 Stream
				// menu.parallelStream()
				// 데이터 걸러냄
				// filter(Predicate<Dish>)
				// Predicate -> dish를 파라미터로 받아서
				// 				boolean으로 반환
				//				ture가 반환된 것만 새로운 Stream으로 생성된다.
				// filter가 반환한 새로운 Stream임
				.filter(dish -> dish.getCalories()<400)
				// 데이터 오름차순 정렬(칼로리 기준) 데이터 기준만주면 오름차순 정렬
				// Stream은 JAVA 1.8이상 Comparator는 JAVA 1.2이상
				// List를 정렬할때 부터 사용했음
				// sorted(Comparator<Dish>)
				// Comparator -> compare(Dish , Dish)
				//					--> dish1.getCalories() - dish2.getCalories()
				//					  -> 오름차순.
				//					--> dish2.getCalories() - dish1.getCalories()
				//					  -> 내림차순
				// 					--> Comparator.comparing(Dish::getCalories)
				//					  -> 오름차순
				.sorted(Comparator.comparing(Dish::getCalories))
//				.sorted(Comparator.comparing(dish -> dish.getCalories()))
//				.sorted()dish1, dish2) -> dish1.getCalories() - dish.getCalories())
				// 데이터 변경 ( Dish -> Name )
				// map(Function<Dish, 반환되는 타입>
				// 반환되는 타입이 filter , sorted(Dish)에서 String으로 변경된다.
				//.map(dish -> dish.getName)
				.map(Dish::getName)
				
				// 현재까지 처리된 Stream 데이터에서 상위 2개는 제외한다.
				.skip(2)
				
				// 현재까지 처리된 Stream 데이터에서 가장 상위 3개만 가져옴
				.limit(3)
				
				// List로 변경 ( Stream의 마무리 )
				// 최종함수 : Stream을 일반 클래스 혹은 Primitive Type으로 반환
				// Collectors.toList() -> Stream을 List로 변경.
				// 이때,Stream의 제네릭이 List에도 동일하게 전달.
				// Stream<String> --> List<String>
				.collect(Collectors.toList());
		//병렬ParallelStream 처리후 다시 sort해주어야함
		//stream
		//sort
		//collect
		
		lowCaloricDischesName
		// Stream 혹은 List의 데이터를 반복하며 Lambda를 수행.
		// forEach(Consumer<String>
		// Consumer -> String을 파라미터로 받아 VOID를 반환.
		.forEach(System.out::println);
		//.forEach(menuName -> System.out.println(menuName))
				
		
	}
}
