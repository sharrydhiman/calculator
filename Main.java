// Calculator.java

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Provide your information in the comments
    // Name: [Your Name]
    // PRN: [Your PRN]
    // Batch: [Your Batch]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exit");
            System.out.println("Enter your choice (1-6): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    try {
                        divide();
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    squareRoot();
                    break;
                case 6:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }

        } while (true);
    }

    // Function to perform addition
    private static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    // Function to perform subtraction
    private static void subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    // Function to perform multiplication
    private static void multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    // Function to perform division
    private static void divide() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        double numerator = scanner.nextDouble();
        System.out.println("Enter the denominator: ");
        double denominator = scanner.nextDouble();

        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        double result = numerator / denominator;
        System.out.println("Result: " + result);
    }

    // Function to calculate square root
    private static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
        } else {
            double result = Math.sqrt(num);
            System.out.println("Square root: " + result);
        }
    }
}
