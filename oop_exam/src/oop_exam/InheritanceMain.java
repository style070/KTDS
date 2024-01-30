package oop_exam;

public class InheritanceMain {
	public static void main(String[] args) {
		Vehicle car = new Vehicle(0);
		SportsCar sportsCar = new SportsCar(0);
		BatMobile batMobileCar = new BatMobile(0);
		Electronic electroniCar = new Electronic(0);

		//Vehicle Method / Member Filed
		car.startEngine();
		car.vehicleModelName="일반자동차";
		
		//SportsCar
		sportsCar.vehicleModelName = "스포츠카";
		sportsCar.battery = 100;
		sportsCar.startEngine();
		sportsCar.batteryCheck();
		
		//BatMobileCar
		batMobileCar.vehicleModelName="배트모빌카";
		batMobileCar.battery=90;
		batMobileCar.turboMode();
		
		//ElectronicCar
		electroniCar.vehicleModelName="전기차";
		electroniCar.battery=80;
		electroniCar.startEngine();
		electroniCar.BatteryCheck();
		
		
		
		
		
	}
	
	
}
