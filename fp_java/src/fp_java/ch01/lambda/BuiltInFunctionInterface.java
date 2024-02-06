package fp_java.ch01.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionInterface {

	
	public static void main(String[] args) {
		
		Predicate<Integer> pp = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t>=19;
			}
		};
		
		
		//Predicate
		Predicate<Integer> p = (t) -> t>=19;
		System.out.println(pp.test(20));
		boolean isAdult2 = p.test(18);
		System.out.println(isAdult2);
		
		//Consumer
		Consumer<String> c = t -> System.out.println(t);;
		c.accept("반갑습니다.");
		
		//Function
		Function<Boolean,String> f = (t) -> t?"yes":"no";
		String result = f.apply(true);
		String result1 = f.apply(false);
		
		System.out.println(result);
		System.out.println(result1);
		
	}
}
