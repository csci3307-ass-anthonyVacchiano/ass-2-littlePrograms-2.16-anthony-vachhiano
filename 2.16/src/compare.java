import java.util.Scanner;

public class compare {
	public static void main(String[] arg)
	{
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;

		
		System.out.print("enter num1: ");
		num1 = input.nextInt();
		
		System.out.print("enter num2: ");
		num2= input.nextInt();
		
		if (num1 > num2)
			System.out.printf("%d is larger than %d%n", num1, num2);
		if (num1 < num2)
			System.out.printf("%d is smaller than %d%n", num1, num2);
		if (num1 == num2)
			System.out.printf("%d is as equal as %d%n", num1, num2);

	}
}
