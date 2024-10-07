package com.pluralsight;

import java.util.Scanner;

public class StringPermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string to find its permutations: ");
        String input = scanner.nextLine();

        // Step 2: Generate and display permutations
        System.out.println("Permutations of the string are:");
        findPermutations(input, "");
    }

    // Step 3: Recursive method to find permutations
    public static void findPermutations(String str, String prefix) {
        if (str.isEmpty()) {
            // Base case: If the string is empty, print the prefix
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                // Choose the character at index i
                char ch = str.charAt(i);

                // Form the remaining string after removing the character at index i
                String remaining = str.substring(0, i) + str.substring(i + 1);

                // Recurse with the remaining string and the prefix updated with the chosen character
                findPermutations(remaining, prefix + ch);
            }
        }
    }
}