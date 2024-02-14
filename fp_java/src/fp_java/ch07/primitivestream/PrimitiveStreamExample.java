package fp_java.ch07.primitivestream;

import java.util.List;
import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class PrimitiveStreamExample {
	public static void main(String[] args) {
		List<Dish> menu = DishData.menu;
		
		//일반 스트림으로 모든 메뉴들의 칼로리 총 합을 구해보기
		int calories = menu.stream()	//Stream<Dish>
//			.map((dish) -> dish.getCalories()) // Stream<Integer>
			.map(Dish::getCalories) // Stream<Integer>
			.reduce(0,(sumCalories,calory) -> sumCalories + calory);
		
		System.out.println(calories);
		
		
		// Primitive Stream으로 모든 메뉴들의 칼로리 총 합을 구해보기
		calories=menu.stream() // Stream<Dish>
//			.mapToInt((dish) -> dish.getCalories()) // IntStream
			.mapToInt(Dish :: getCalories) // IntStream 
			// Primitive Stream을 사용하면 리듀싱 관련 메소드를 제공한다. 
			.sum();
		
		System.out.println(calories);
		
		//Primitive 스트림으로 채식 메뉴들의 칼로리 총 합을 구해보기
		calories = menu.stream()
						.filter(Dish :: isVegetarian)
						.mapToInt(Dish :: getCalories)
						.sum();
		
		System.out.println(calories);
						
		// Primitive으로 채식 메뉴들의 평균 칼로리를 구해보기
		double averageCalories = menu.stream()
									.filter(Dish :: isVegetarian)
									.mapToInt(Dish :: getCalories)
									.average()
									.orElse(0);
		System.out.println(averageCalories);
		
		
						
			
				
	}
}
