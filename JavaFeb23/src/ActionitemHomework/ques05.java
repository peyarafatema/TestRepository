package ActionitemHomework;

public class ques05 {

	public static void main(String[] args) {

		// Write a program that sums the numbers from 0 to 15 using for while and do
		// while loop

		// using for loop
		int num = 15;
		int sum = 0;
		for (int i = 1; i <= num; i++)
		{
			sum = sum + i;
		}

		System.out.println("sum =" + sum);

		// Using while loop

		int num2 = 15, j = 1, sum2 = 0;
		while (j <= num2) {
			sum2 += j;
			j++;
		}
		System.out.println("sum =" + sum2);

		// Using Do while loop

		int sum3 = 0;
		int a = 0;
		do {
			sum3 += a;
			a++;
		} while (a <= 15);

		System.out.println("sum =" + sum3);

	}

}
