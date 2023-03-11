package methodDemo;

public class TestCalculator {

	public static void main(String[] args) {
		
		
		//created an object of calculator class
		calculator calc = new calculator();
		System.out.println("Addition of a and b is: " +calc.doAdd(25, 12));
		System.out.println("subtraction of a and b is: " +calc.doSub(25, 12));

		
		System.out.println(calc.doAdd(23, 45));
		System.out.println(calc.doSub(23, 45));
		System.out.println(calc.concatStr("Hello!", "I am concatination two strings!!"));
		
		TestCalculator obj = new TestCalculator();

	}
	
	public int doMul(int a , int b) {
		int c = a * b;
		return c;
	}
	

}
