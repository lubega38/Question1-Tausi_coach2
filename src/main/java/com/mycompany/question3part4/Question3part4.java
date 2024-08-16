/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question3part4;

/**
 *
 * @author ST.EDWARDS
 */
public class Question3part4 {

    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance from Kabale to Kampala in Km
        double speedMetersPerSecond = 225.5; // Speed of the second coach in meters/second

        // Convert speed to Km/hr
        double speedKmPerHour = speedMetersPerSecond * 3.6;

        // Calculate travel time in hours
        double travelTimeHours = totalDistance / speedKmPerHour;

        // Calculate arrival time in hours
        double departureTime = 9.00; // Departure time at 09:00 hrs
        double arrivalTime = departureTime + travelTimeHours;

        System.out.println("Approximate arrival time in hours: " + arrivalTime + " hrs");
    }
}
