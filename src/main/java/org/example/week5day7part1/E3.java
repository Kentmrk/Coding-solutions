package org.example.week5day7part1;

public class E3 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Even numbers in the array:");

        // Use nested loops to operate with 2d array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                // Check if the current number is even and print it
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}
