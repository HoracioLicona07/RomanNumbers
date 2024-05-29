package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToDecimal {

    // Map to store the Roman numeral characters and their corresponding decimal values
    private static final Map<Character, Integer> romanToDecimalMap = new HashMap<>();

    // Static block to initialize the Roman numeral map
    static {
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
    }

    // Method to convert Roman numeral string to a decimal integer
    public static int romanToDecimal(String roman) {
        int decimalValue = 0; // Variable to store the final decimal value
        int previousValue = 0; // Variable to store the value of the previous Roman numeral character

        // Loop through the Roman numeral string from right to left
        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i); // Get the current character in the string
            int currentValue = romanToDecimalMap.getOrDefault(currentChar, 0); // Get the decimal value of the current character

            // If the current value is less than the previous value, subtract it from the total
            if (currentValue < previousValue) {
                decimalValue -= currentValue;
            } else {
                // Otherwise, add it to the total
                decimalValue += currentValue;
            }

            // Update the previous value to the current value
            previousValue = currentValue;
        }

        return decimalValue; // Return the final decimal value
    }

    // Method to print all Roman numerals from 1 to 100 with their decimal conversions
    public static void printAllRomanNumerals() {
        // Array of Roman numerals from 1 to 100
        String[] romanNumerals = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };

        // Loop through the array and print the decimal value for each Roman numeral
        for (String roman : romanNumerals) {
            int decimal = romanToDecimal(roman); // Convert Roman numeral to decimal
            System.out.println("The decimal value of " + roman + " is " + decimal); // Print the result
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Display menu options to the user
        System.out.println("Choose an option:");
        System.out.println("1. Convert a Roman numeral to decimal");
        System.out.println("2. Print all Roman numerals from 1 to 100 with their decimal conversions");

        int choice = scanner.nextInt(); // Read the user's choice
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                // Option 1: Convert a Roman numeral to decimal
                System.out.print("Enter a Roman numeral: ");
                String roman = scanner.nextLine(); // Read the Roman numeral from the user
                int decimal = romanToDecimal(roman); // Convert Roman numeral to decimal
                System.out.println("The decimal value of " + roman + " is " + decimal); // Print the result
                break;
            case 2:
                // Option 2: Print all Roman numerals from 1 to 100 with their decimal conversions
                printAllRomanNumerals();
                break;
            default:
                // Invalid choice
                System.out.println("Invalid choice. Please select option 1 or 2.");
                break;
        }

        scanner.close(); // Close the Scanner
    }
}
