/*----------------------------------------------------------------
# Author: Makhtar Sylla
# Date: 05/01/2024
# Class: CSC320
----------------------------------------------------------------
# Program Name:  Implementing Recursion to Provide a Sum
# Program Inputs: five numvers
# Program Outputs: sum of thne five numbers inputted using recusion

-----------------------------------------------------------------*/

import java.util.Scanner;

public class CTA5_Recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Prompt user to enter five numbers
        System.out.println("\n"+"Please enter five numbers:");

        // Read the numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Calculate the sum of the numbers using recursion
        int sum = sumOfNumbers(numbers, 5);
        
        // Display the sum
        System.out.println("The sum of the five numbers is: " + sum);
        
    }

    // Recursive method to calculate the sum of numbers
    public static int sumOfNumbers(int[] numbers, int n) {
        // Base case: if no numbers left to add, return 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: sum the last number and the sum of the remaining numbers
        return numbers[n - 1] + sumOfNumbers(numbers, n - 1);
    }
}