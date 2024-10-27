package org.example.week5day7part1;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        // Check for numbers less than 2
        if (num <= 1) {
            return false;
        }

        // Check if number is prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not  prime number
            }
        }
        return true; // Is  prime number
    }
}
