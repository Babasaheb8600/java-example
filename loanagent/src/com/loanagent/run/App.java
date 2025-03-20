package com.loanagent.run;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Loan 365!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        double principleAmount = scanner.nextDouble();
        System.out.println("Tenure :");
        int tenure = scanner.nextInt();
        
        double interestAmount = (principleAmount * tenure * 8.65) / 100;
        System.out.println("Interest Amount to be paid : " + interestAmount);
    }
}

