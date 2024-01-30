package oop_exam;

public class Car {
	/**
	 * 인스턴스를 만든 개수.
	 */
	public static int instanceCount = 0;
	
	private String name;
	
	public Car(String name) {
		Car.instanceCount += 1;
		this.name = name;
	}
	
	//Getter
	public String getName() {
		return this.name;
	}
	
}
