package fp_java.ch05.find;

import java.util.List;
import java.util.Optional;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class findExample {
	
	public static void main(String[] args) {
		List<Dish> menu = DishData.menu;
		
		// 스트림 내부에서 임의의 데이터 가져오기
		Optional<Dish> vegeterianDish = menu.stream()
			.filter(dish -> dish.isVegetarian())
			.findAny();
			
		
		//Optional
		// 데이터가 null일 수도 아닐 수도 있는 특별한 클래스. (결과가 있을수도 있고 없을 수도 있음)
		// orElse : OptionalData가 null 일 대 other의 값을 반환시키도록 하는 메소드
		// 데이터가 별로 없을때는 그냥 첫번째거만ㄴ ㅏ옴?
		Dish dish = vegeterianDish.orElse(null);
		System.out.println(dish);
		
		Dish fatDish =  menu.stream()
			.filter(d -> d.getCalories() > 1000)
			.findFirst() // Optional<Dish>
			.orElse(null); // 데이터가 없다면 null을 반환해라.
		
		System.out.println(fatDish);
		
	}
	
	
}
