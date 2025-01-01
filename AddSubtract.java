import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform addition and subtraction
        int sum = num1 + num2;
        int difference = num1 - num2;

        // Display the results
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        // Close the scanner
        scanner.close();
    }
}
