package com.calculator.run;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int operation = scanner.nextInt();
        
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation selected!");
                return;
        }
        
        System.out.println("The result is: " + result);
    }
}

