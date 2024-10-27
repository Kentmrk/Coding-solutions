package org.example.week5day7part1;

public class E9 {
    public static void main(String[] args) {
        // Example array of numbers
        int[] temp = {65, 57, 58, 65, 74, 77, 75};

        // Initialize max and min to the first element of the array
        int max = temp[0];
        int min = temp[0];

        // Loop through the array to find max and min
        for (int number : temp) {
            if (number > max) {
                min = max; // Update second largest
                max = number;        // Update largest
            } else if (number > min && number != max) {
                min = number;  // Update second largest if it's different from largest
            }
        }

        // Print the results
        System.out.println("largest number: " + max);
        System.out.println("Second largest number: " + min);
    }
}