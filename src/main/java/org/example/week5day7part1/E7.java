package org.example.week5day7part1;

public class E7 {
    public static void main(String[] args) {
        int f = 0, s = 1,n = 10; //Declare numbers
        //use loop to calculate first 8 afrer known numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(f + " "); // Print the current number
            int next = f + s; // Calculate the next number
            f = s;
            s = next;
        }
    }
}
