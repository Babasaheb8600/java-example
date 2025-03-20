package com.georouting.bean;

import java.security.SecureRandom;

public class RouteService {
    // Method to calculate distance (mock implementation)
    public double distance(String source, String destination) {
        SecureRandom random = new SecureRandom();
        return random.nextDouble(100); // Return a random distance between 0 and 100
    }
}

