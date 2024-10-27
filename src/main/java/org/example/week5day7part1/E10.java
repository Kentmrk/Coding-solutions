package org.example.week5day7part1;

public class E10 {
    public static void main(String[] args) {
        // Example array of strings
        String[] strings = {"dog", "cat", "deer", "dog", "crocodile", "cat", "sparrow"};

        // Outer loop element
        for (int i = 0; i < strings.length; i++) {
            boolean isDuplicate = false;

            // Inner loop compares elements
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print the duplicate only if it's the first occurrence
            if (isDuplicate) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (strings[k].equals(strings[i])) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.println(strings[i]);
                }
            }
        }
     }
}
