package org.example.week5day7part1;

public class E2 {
 public static void main(String[] args) {
    // Declare and initialize the array
    int[] numbers = {65, 57, 58, 65, 74, 77, 75};

    // Variable to hold the sum
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }

    // Print the result
    System.out.println("Sum of array is: " + sum);
}
}