# Roman Numeral to Decimal Converter

## Overview
This project contains a Java 8 program to convert Roman numerals (represented as strings) to their corresponding decimal values for numbers ranging from 1 to 100. It also allows the user to print all Roman numerals from 1 to 100 with their decimal conversions.

## File: RomanToDecimal.java

### Implementation Details
1. **Map Initialization**:
    - We use a `HashMap` to store the Roman numeral characters and their corresponding decimal values.
    - This map is initialized statically to ensure it's done once and can be used in the conversion method.

2. **Conversion Method (`romanToDecimal`)**:
    - The method takes a Roman numeral as input and iterates through the string from right to left.
    - We use two variables, `decimalValue` to store the final decimal value and `previousValue` to keep track of the last processed Roman numeral value.
    - For each character in the string:
        - If the current value is less than the previous value, it is subtracted from `decimalValue` (to handle cases like IV, IX).
        - Otherwise, it is added to `decimalValue`.
        - `previousValue` is updated to the current value.

3. **Method to Print All Roman Numerals and Their Decimal Values (`printAllRomanNumerals`)**:
    - This method prints all Roman numerals from 1 to 100 along with their decimal conversions.
    - The Roman numerals are stored in an array and iterated over to convert each to its decimal value and print the result.

4. **Main Method**:
    - The `main` method provides a menu for the user to choose between two options: converting a specific Roman numeral to decimal or printing all Roman numerals from 1 to 100 with their decimal conversions.
    - It reads the user's choice and calls the appropriate method or performs the conversion based on the input.

### Justification
- **Map Usage**: Using a `HashMap` allows O(1) time complexity for lookups, making the conversion efficient.
- **Iteration from Right to Left**: This approach simplifies handling of subtractive notation in Roman numerals.
- **Default Value Handling**: The `getOrDefault` method ensures that any non-Roman characters default to 0, preventing potential errors.

## Justification for Changes

### Original Code
The original code had several issues that made it unfeasible for converting Roman numerals to decimal values:

1. **Syntax Error in Package Declaration**:
   - The `public` keyword was incorrectly used with the `package` declaration. Package declarations should not have access modifiers.

2. **Class and File Name Mismatch**:
   - The class `Innerexercise` should have been in a file named `Innerexercise.java`, but there was no proper class for converting Roman numerals.

3. **Lack of Conversion Logic**:
   - The original code only declared some variables for Roman numerals and did not provide any logic for conversion. There were no methods or functions defined to perform the conversion.

4. **Incorrect Use of Static Block**:
   - Static blocks were used inappropriately to declare variables. These blocks are meant for initializing static data and were not utilized correctly in the context.

### Revised Code
The revised code provides a clear and functional implementation for converting Roman numerals to decimal values:

1. **Correct Package Declaration**:
   ```java
   package com.example;
