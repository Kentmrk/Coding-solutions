package org.example.week5day7part1;

public class E1 {

    public static void main(String[] args) {
        // Array to store temperatures for each day of the week
        int[] temperatures = {65, 57, 58, 65, 74, 77, 75};

        // Variables to store temperatures
        int highest = temperatures[0];
        int lowest = temperatures[0];

        // Loop for find min and max temp
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }

        // Print the results
        System.out.println("Highest temperature of the week: " + highest + "°");
        System.out.println("Lowest temperature of the week: " + lowest + "°");
    }
}