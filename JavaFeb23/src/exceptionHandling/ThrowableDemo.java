package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableDemo {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Exception handling does not make any sencse to me!");
		Thread.sleep(3000);
		
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

}
	

