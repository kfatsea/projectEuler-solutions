/* 
Author: Kona Fatsea
Date: 07/02/2025

Solve problem-001 of Euler Project to find the sum of all multiples of 3 and 5
below a given number n using efficient iteration in Java.
*/

import java.util.Scanner;                         



public class EfficientIteration { // Class declaration: the class name should start with an uppercase letter by convention.
    
    public static void main(String[] args) { // Main method - Entry point of the program
        Scanner scanner = new Scanner(System.in); // Initialize the Scanner object to read input from the console
        
        System.out.print("Enter a positive integer: "); // Prompt for input
        int n = scanner.nextInt(); // Read the input number       
        
        // Check if the input is a positive integer
        if (n<=0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Call sumMultiples and store the result
            int result = sumMultiples(n);
            System.out.printf("The sum of multiples of 3 or 5 below %d is: %d\n", n, result); // Output the result
        }
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }

    /**
     * Calculates the sum of all multiples of 3 or 5 below given n.
     * This method uses straightforward iteration, separately summing multiples of 
     * 3 and 5, ensuring multiples of 15 are not double counted. 
     * 
     * @param n The upper limit (exclusive)
     * @return The sum of all multiples of 3 and 5 below n
     */
    static int sumMultiples(int n){
        int iterations = 0;
        int totalSum = 0;

        // Accumulate multiples of 3
        for (int i = 3; i < n; i+= 3){
            totalSum += i;
            iterations++;
        }
        // Accumulate multiples of 5 
        for (int i = 5; i < n; i += 5){
            if (i % 3 != 0){ // Ensure no double-counting
                totalSum += i;
            }
            iterations++;
        }
       
        System.out.println("Number of Iterations: " + iterations);
        return totalSum; 

    } 
}
 

