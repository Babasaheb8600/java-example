package com.cabrentals.run;

import com.georouting.bean.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.println("Source : ");
        String source = scanner.nextLine();
        
        System.out.println("Destination : ");
        String destination = scanner.nextLine();
        
        // Create RouteService object from the library
        RouteService routeService = new RouteService();
        
        // Calculate distance
        double distance = routeService.distance(source, destination);
        
        // Estimate trip amount based on the distance
        double estimatedTripAmount = distance * 8.25; // $8.25 per unit distance
        
        // Output the result
        System.out.println("Estimated trip amount: " + estimatedTripAmount);
    }
}

