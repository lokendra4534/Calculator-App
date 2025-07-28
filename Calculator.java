package corejava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("📱 Welcome to Advanced Calculator");
        System.out.println("Available operations: +, -, *, /, %, ^");
        System.out.println("Type 'exit' as operator to quit.");

        while (running) {
            System.out.print("\nEnter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %, ^ or exit): ");
            String op = sc.next();

            if (op.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("✅ Calculator exited.");
                break;
            }

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch(op) {
                case "+": 
                    System.out.println("Result: " + (a + b)); 
                    break;
                case "-": 
                    System.out.println("Result: " + (a - b)); 
                    break;
                case "*": 
                    System.out.println("Result: " + (a * b)); 
                    break;
                case "/": 
                    if (b == 0) 
                        System.out.println("❌ Error: Division by zero!");
                    else 
                        System.out.println("Result: " + (a / b)); 
                    break;
                case "%": 
                    System.out.println("Result: " + (a % b)); 
                    break;
                case "^": 
                    System.out.println("Result: " + Math.pow(a, b)); 
                    break;
                default: 
                    System.out.println("❌ Invalid operator. Try again.");
            }
        }

        sc.close();
    }
}
