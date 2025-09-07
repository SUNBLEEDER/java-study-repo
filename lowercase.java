import java.util.Scanner;

public class lowercase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input from the user
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		// Multiply the numbers
		double result = num1 * num2;

		// Display the result
		System.out.println("The result of multiplication is: " + result);

		scanner.close();
	}
}
