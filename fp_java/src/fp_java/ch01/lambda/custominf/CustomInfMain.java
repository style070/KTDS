package fp_java.ch01.lambda.custominf;

public class CustomInfMain {
	public static void main(String[] args) {
		Airline airline = t -> t * Airline.ADULT_FEE;
		int cost = airline.getFee(3) + airline.getChildFee(3);
		System.out.println(cost);

		Calculatable calc = (t, r) -> System.out.println(t + r);
		calc.printAddResult(20, 10);
		calc.printSubResult(20, 10);
		calc.printMulResult(20, 10);
		calc.printDiveResult(20, 10);

	}

}
