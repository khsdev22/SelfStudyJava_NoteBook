package sec04.exam06;

public class CalculatorExample {
	
	public static void main(String args) {
		Calculator myCalcu = new Calculator();
		
		double result1 = myCalcu.areaRectangle(10);
		

		System.out.println("정사각형의 넓이 : " + result1 + "cm^2");
		
		double result2 = myCalcu.areaRectangle(10, 50);
		
		System.out.println("직사각형의 넓이 : " + result2 + "cm^2");
	}

}
