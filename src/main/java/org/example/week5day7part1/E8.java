package org.example.week5day7part1;

public class E8 {
    public static void main(String[] args) {
        // Example array of numbers
        int[] temp = {65, 57, 58, 65, 74, 77, 75};

        // Initialize max and min to the first element of the array
        int max = temp[0];
        int min = temp[0];

        // Loop through the array to find max and min
        for (int numbers : temp) {
            if (numbers > max) {
                max = numbers; // Update max
            }
            if (numbers < min) {
                min = numbers; // Update min
            }
        }

        // Print the results
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}