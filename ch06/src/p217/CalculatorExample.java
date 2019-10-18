package p217;

public class CalculatorExample {

	public static void main(String[] args) {
		
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		
		myCalc.powerOff();
		
		
		
		
		
	}
	
	
}
