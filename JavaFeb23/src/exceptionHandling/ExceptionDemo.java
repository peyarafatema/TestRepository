package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Let us figure out an exception");
	try {	
		
		String[] name = {"Prosmart", "Java", "Selenium", "Eclipe"};
		
		System.out.println(name[4]);
		
	} catch(Exception e) {
		System.out.println("Exception occured!" + e.getMessage());
		System.out.println("O my God !! I could handle one.");

	}
       System.out.println("I am out of the catch block now!");
}
	
}
