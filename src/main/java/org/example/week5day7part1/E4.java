package org.example.week5day7part1;

public class E4 {
    public static void main(String[] args) {
        // Declare and initialize a 2D array of int
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Variables to sum numbers
        int sumEven = 0;
        int sumOdd = 0;

        // For loop for array processing
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //if the current number is even or odd
                if (numbers[i][j] % 2 == 0) {
                    sumEven += numbers[i][j]; //Even sum
                } else {
                    sumOdd += numbers[i][j]; //Odd sum
                }
            }
        }

        // Print results
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}